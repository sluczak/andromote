package pl.fester3k.androcode.deviceManagement.action.phone;

import java.util.Locale;
import java.util.concurrent.Executor;

import pl.fester3k.androcode.datatypes.ActionParams;
import pl.fester3k.androcode.datatypes.ActionParams.TTS;
import pl.fester3k.androcode.datatypes.ActionResult;
import pl.fester3k.androcode.deviceManagement.action.BaseDeviceAction;
import android.annotation.TargetApi;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Build;
import android.speech.tts.TextToSpeech;
import android.speech.tts.UtteranceProgressListener;

@TargetApi(Build.VERSION_CODES.ICE_CREAM_SANDWICH_MR1)
public class TextToSpeechAction extends BaseDeviceAction implements TextToSpeech.OnInitListener {
	private TextToSpeech textToSpeech;
	private boolean readyToTalk = false;

	public TextToSpeechAction(Context context) {
		super(context);		
		textToSpeech = new TextToSpeech(context, this);
	}

	@Override
	public Object run() {
		if(params.containsKey(ActionParams.TTS.TEXT.toString())) {
			String text = (String) params.get(ActionParams.TTS.TEXT.toString());
			logger.info("TTS is speaking: " + text);

			TTSTask task = new TTSTask(text);
			task.executeOnExecutor(AsyncTask.SERIAL_EXECUTOR);
		}
		return ActionResult.COMPLETED;
	}

	@Override
	public void onInit(int status) {
		if(status == TextToSpeech.SUCCESS) {
			readyToTalk = true;
			
			textToSpeech.setOnUtteranceProgressListener(new UtteranceProgressListener() {
				@Override
				public void onStart(String utteranceId) {

				}

				@Override
				public void onError(String utteranceId) {

				}

				@Override
				public void onDone(String utteranceId) {

				}
			});
		}
	}

	@Override
	public void cleanup() {
		TTSCleanupTask task = new TTSCleanupTask();
		task.executeOnExecutor(AsyncTask.SERIAL_EXECUTOR);
		super.cleanup();
	}
	private class TTSCleanupTask extends AsyncTask<Void, Void, Void> {

		@Override
		protected Void doInBackground(Void... params) {
			while(textToSpeech.isSpeaking()) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			textToSpeech.stop();
			textToSpeech.shutdown();	
			return null;
		}

	}

	private class TTSTask extends AsyncTask<Void, Void, Void> {
		private final String text;
		public TTSTask(String text) {
			this.text = text;
		}
		@Override
		protected Void doInBackground(Void... args) {
			while(!readyToTalk) {
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			textToSpeech.setLanguage(Locale.getDefault());
			textToSpeech.speak(text, TextToSpeech.QUEUE_ADD, null);

			return null;
		}

	}

}


