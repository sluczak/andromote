package pl.fester3k.antlr.scopeManagement;

import lombok.Getter;
import lombok.Setter;

/***
 * Excerpted from "Language Implementation Patterns",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpdsl for more book information.
***/
public class Symbol { // A generic programming language symbol
	public enum Type {
		tVOID, tINT, tFLOAT, tBOOLEAN, tSTRING, tDEVICE, tINVALID;
	}
	
	@Getter
	protected String name;      // All symbols at least have a name
	
	@Getter
    protected Type type;
	
	@Getter	@Setter
    protected Scope scope;      // All symbols know what scope contains them.

    public Symbol(String name) { 
    	this.name = name; 
    }
    
    public Symbol(String name, Type type) { 
    	this(name); this.type = type; 
    }
    
    public String toString() {
        if ( type!=null ) return '<'+getName()+":"+type+'>';
        return getName();
    }
}
