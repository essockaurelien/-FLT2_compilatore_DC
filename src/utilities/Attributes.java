package utilities;

import utilities.LangType;

public class Attributes {

	private LangType type;
	private char register;

	public Attributes(LangType type) {
		this.type = type;
		this.register ='\0';
	}

	public LangType getType() {
		return type;
	}

	@Override
	public String toString() {
		return "Attributes [type=" + type + "]";
	}

	public char getRegister() {
		return register;
	}

	public void setRegister(char register) {
		this.register = register;
	}
	
	
}
