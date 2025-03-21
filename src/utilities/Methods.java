package utilities;

import utilities.LangType;
import utilities.TypeDescriptor;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import utilities.Attributes;
import utilities.SymbolTable;

public class Methods {
	
	private static char[] registers = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	private static int regIndex;
	private static StringBuilder log;
	private static StringBuilder code;
	
	public static void init() {
		regIndex = 0;
		log = new StringBuilder();
		code = new StringBuilder();
	}

	private static char newRegister() {
		
		char out;
		if(regIndex<26) { 
			out=registers[regIndex];
			regIndex++;
			return out;
			}
		else
			throw new IndexOutOfBoundsException("ERRORE: Massimo numero di registri consentiti superato\n");
		
	}
	
	public static TypeDescriptor prg(TypeDescriptor type) {
		
		if(type.equals(TypeDescriptor.ERROR)) {
			log.append("ERROR: " + "prg\n");
			printToFile("src/output/log.txt", log.toString());
			printToFile("src/output/code.txt", "");
			return TypeDescriptor.ERROR;
		}
		printToFile("src/output/log.txt", log.toString());
		printToFile("src/output/code.txt", code.toString());
		return TypeDescriptor.VOID;
	}
	
	public static TypeDescriptor dss1(TypeDescriptor type1,TypeDescriptor type2) {
		return dss(type1,type2,"dss1");
	}
	
	public static TypeDescriptor dss2(TypeDescriptor type1,TypeDescriptor type2) {
		return dss(type1,type2,"dss2");
		
	}
	
	public static TypeDescriptor dss3() {
		return TypeDescriptor.VOID;
	}
	
	public static TypeDescriptor dcl1(String val) {
		return dcl(val,"dcl1",LangType.FLOAT);
	
	}
	
	public static TypeDescriptor dcl2(String val) {
		return dcl(val,"dcl2",LangType.INT);
	}
	
	public static TypeDescriptor stm1(String val,TypeDescriptor type) {
		
		TypeDescriptor idType = idCheck(val);
		if(idType.equals(TypeDescriptor.ERROR)) {
			log.append("ERROR: stm1 " + val +"\n");
			return TypeDescriptor.ERROR;
		}
		else {
			if(compatible(idType, type)) {
				code.append("s"+val+" ");
				code.append("0k ");
				return TypeDescriptor.VOID;
			}
			else {
				log.append("ERROR: stm1 " + "incompatible" + "\n");
				return TypeDescriptor.ERROR;
			}
		}
		
	}
	
	public static TypeDescriptor stm2(String val) {
		TypeDescriptor idType = idCheck(val);
		if(idType.equals(TypeDescriptor.ERROR)) {
			log.append("ERROR: " + val +"\n");
			return TypeDescriptor.ERROR;
		}
		else {
			code.append("l"+val+" ");
			code.append("p ");
			code.append("P ");
			return TypeDescriptor.VOID;
		}
	}
	
	public static TypeDescriptor exp1(TypeDescriptor type1,TypeDescriptor type2) {
		return exp(type1,type2,"exp1","+");
	}
	
	public static TypeDescriptor exp2(TypeDescriptor type1,TypeDescriptor type2) {
		return exp(type1,type2,"exp2","-");
	}
	
	public static TypeDescriptor exp3(TypeDescriptor type1,TypeDescriptor type2) {
		return exp(type1,type2,"exp3","*");
	}
	
	public static TypeDescriptor exp4(TypeDescriptor type1,TypeDescriptor type2) {
		return exp(type1,type2,"exp4","/");
	}
	
	public static TypeDescriptor exp5(TypeDescriptor type) {
		if(type.equals(TypeDescriptor.ERROR))
			log.append("ERROR: " + "exp5\n");
		return type;
	}
	
	public static TypeDescriptor val1(String val) {
		code.append(val+" ");
		return TypeDescriptor.INT;
	}
	
	public static TypeDescriptor val2(String val) {
		code.append(val+" ");
		return TypeDescriptor.FLOAT;
	}
	
	public static TypeDescriptor val3(String val) {
		code.append("l"+val+" ");
		return idCheck(val);
	}
	
	
	private static boolean compatible(TypeDescriptor t1, TypeDescriptor t2) {
		
		if(!t1.equals(TypeDescriptor.ERROR) && !t2.equals(TypeDescriptor.ERROR )&& t1.equals(t2))
			return true;
		else if(t1.equals(TypeDescriptor.FLOAT) && t2.equals(TypeDescriptor.INT))
			return true;
		else
			return false;
		
	}
	
	private static TypeDescriptor idCheck(String val) {
		
		Attributes attr;
		if((attr=SymbolTable.lookup(val))==null) { 
			return TypeDescriptor.ERROR;
		}
		else {
			if(attr.getType().equals(LangType.INT)) 
				return TypeDescriptor.INT;
			else if(attr.getType().equals(LangType.FLOAT))
				return TypeDescriptor.FLOAT;
			else
				return TypeDescriptor.ERROR;
		}
	}
	
	private static TypeDescriptor dss(TypeDescriptor type1,TypeDescriptor type2,String method) {
		
		if(type1.equals(TypeDescriptor.ERROR)) {
			log.append("ERROR: " + method + " type1\n");
			return TypeDescriptor.ERROR;
		}
		else if(type2.equals(TypeDescriptor.ERROR)) {
			log.append("ERROR: " + method + " type2\n");
			return TypeDescriptor.ERROR;
		}
		else {
			return TypeDescriptor.VOID;
		}
	}
	
	private static TypeDescriptor dcl(String val,String method,LangType type) {
		
		if(!SymbolTable.enter(val,new Attributes(type))) {
			log.append("ERROR: " + method +" "+val+"\n");
			return TypeDescriptor.ERROR;
		}	
		else {
			SymbolTable.lookup(val).setRegister(newRegister());
			return TypeDescriptor.VOID;
		}
	}
	
	private static TypeDescriptor exp(TypeDescriptor type1,TypeDescriptor type2, String method,String op) {
		
		if(type1.equals(TypeDescriptor.ERROR)) {
			log.append("ERROR: " + method + " type1\n" );
			return TypeDescriptor.ERROR;
		}
		else if(type2.equals(TypeDescriptor.ERROR)) {
			log.append("ERROR: " + method + " type2\n");
			return TypeDescriptor.ERROR;
		}
		else {
			TypeDescriptor out ;
			if(type1.equals(type2)) {
				out = type1;
				}
			else {
				code.append("5k ");
				out = TypeDescriptor.FLOAT;
			}
			code.append(op+" ");
			return out;
		}
	}
	
	private static void printToFile(String path, String input) {
		
	        try{ 
	        	FileWriter file;
	            file = new FileWriter(path); 
	           
	            BufferedWriter buff = new BufferedWriter(file); 
	       
	            buff.write(input); 
	            buff.close();    
	        } 
	        
	        catch (IOException e){ 
	            e.printStackTrace(); 
	        }
	}

}
