package java_compiler;

import java.util.HashMap;
import java.util.Set;

import utilities.CTNInformation;
import utilities.IDInformation;
import utilities.SymbolInformation;

public class SymbolTable {

	HashMap<String,SymbolInformation> symbolTable;
	
	
	public SymbolTable() {
		this.symbolTable = new HashMap<>();
	}
	
	public void addID(String name, IDInformation idi){
		this.symbolTable.put(name, idi);
	}
	
	public void addCTN(String name, CTNInformation ctni) {
		this.symbolTable.put(name, ctni);
	}
	
	public SymbolInformation getLexeme(String name) {
		SymbolInformation si = this.symbolTable.get(name);
		if (si==null)
			si = new SymbolInformation(-1);
		return si;
	}
	
	public Set<String> getAll() {
		return this.symbolTable.keySet();
	}
	
}
