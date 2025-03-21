
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20141204 (SVN rev 60)
//----------------------------------------------------

package cup.example;

import java_cup.runtime.*;
import cup.example.Lexer;
import java.io.IOException;
import java.io.File;
import java.io.FileInputStream;
import utilities.*;
import java_cup.runtime.ComplexSymbolFactory.Location;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20141204 (SVN rev 60) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class Parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  public Parser() {super();}

  /** Constructor which sets the default scanner. */
  public Parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\021\000\002\002\003\000\002\002\004\000\002\003" +
    "\004\000\002\003\004\000\002\003\002\000\002\004\005" +
    "\000\002\004\005\000\002\005\006\000\002\005\005\000" +
    "\002\006\005\000\002\006\005\000\002\006\005\000\002" +
    "\006\005\000\002\006\003\000\002\007\003\000\002\007" +
    "\003\000\002\007\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\041\000\014\002\ufffd\012\011\013\010\014\006\017" +
    "\004\001\002\000\004\011\025\001\002\000\004\002\024" +
    "\001\002\000\004\017\022\001\002\000\014\002\ufffd\012" +
    "\011\013\010\014\006\017\004\001\002\000\004\017\017" +
    "\001\002\000\004\017\015\001\002\000\004\002\001\001" +
    "\002\000\014\002\ufffd\012\011\013\010\014\006\017\004" +
    "\001\002\000\004\002\ufffe\001\002\000\004\004\016\001" +
    "\002\000\014\002\ufffb\012\ufffb\013\ufffb\014\ufffb\017\ufffb" +
    "\001\002\000\004\004\020\001\002\000\014\002\ufffc\012" +
    "\ufffc\013\ufffc\014\ufffc\017\ufffc\001\002\000\004\002\uffff" +
    "\001\002\000\004\004\023\001\002\000\014\002\ufff9\012" +
    "\ufff9\013\ufff9\014\ufff9\017\ufff9\001\002\000\004\002\000" +
    "\001\002\000\010\015\032\016\031\017\026\001\002\000" +
    "\014\004\ufff1\005\ufff1\006\ufff1\007\ufff1\010\ufff1\001\002" +
    "\000\014\004\ufff4\005\ufff4\006\ufff4\007\ufff4\010\ufff4\001" +
    "\002\000\014\004\035\005\033\006\034\007\037\010\036" +
    "\001\002\000\014\004\ufff2\005\ufff2\006\ufff2\007\ufff2\010" +
    "\ufff2\001\002\000\014\004\ufff3\005\ufff3\006\ufff3\007\ufff3" +
    "\010\ufff3\001\002\000\010\015\032\016\031\017\026\001" +
    "\002\000\010\015\032\016\031\017\026\001\002\000\014" +
    "\002\ufffa\012\ufffa\013\ufffa\014\ufffa\017\ufffa\001\002\000" +
    "\010\015\032\016\031\017\026\001\002\000\010\015\032" +
    "\016\031\017\026\001\002\000\014\004\ufff6\005\ufff6\006" +
    "\ufff6\007\ufff6\010\ufff6\001\002\000\014\004\ufff5\005\ufff5" +
    "\006\ufff5\007\ufff5\010\ufff5\001\002\000\014\004\ufff7\005" +
    "\ufff7\006\ufff7\007\037\010\036\001\002\000\014\004\ufff8" +
    "\005\ufff8\006\ufff8\007\037\010\036\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\041\000\012\002\004\003\011\004\006\005\012\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\010\003\020\004\006\005\012\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\010\003\013" +
    "\004\006\005\012\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\006\006\027\007\026\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\006\006\042\007\026\001\001" +
    "\000\006\006\041\007\026\001\001\000\002\001\001\000" +
    "\006\006\040\007\026\001\001\000\006\006\037\007\026" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}


  /** User initialization code. */
  public void user_init() throws java.lang.Exception
    {
//@@CUPDBG1

  ComplexSymbolFactory f = new ComplexSymbolFactory();
  symbolFactory = f;
  File file = new File("input.txt");
  FileInputStream fis = null;
  try {
    fis = new FileInputStream(file);
  } catch (IOException e) {
    e.printStackTrace();
  } 
  lexer = new Lexer(f,fis);
  SymbolTable.init();
  Methods.init();
  

    }

  /** Scan to get the next Symbol. */
  public java_cup.runtime.Symbol scan()
    throws java.lang.Exception
    {
//@@CUPDBG2
 return lexer.next_token(); 
    }

//@@CUPDBG0

  protected Lexer lexer;
  


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$Parser$actions {
  private final Parser parser;

  /** Constructor */
  CUP$Parser$actions(Parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action_part00000000(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Parser$result;

      /* select the action based on the action number */
      switch (CUP$Parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // Prg ::= DSs 
            {
              TypeDescriptor RESULT =null;
		Location typexleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.peek()).xleft;
		Location typexright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.peek()).xright;
		TypeDescriptor type = (TypeDescriptor)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		//@@CUPDBG3
RESULT= Methods.prg(type);
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("Prg",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= Prg EOF 
            {
              Object RESULT =null;
		Location start_valxleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).xleft;
		Location start_valxright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).xright;
		TypeDescriptor start_val = (TypeDescriptor)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		RESULT = start_val;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Parser$parser.done_parsing();
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // DSs ::= Dcl DSs 
            {
              TypeDescriptor RESULT =null;
		Location type1xleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).xleft;
		Location type1xright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).xright;
		TypeDescriptor type1 = (TypeDescriptor)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		Location type2xleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.peek()).xleft;
		Location type2xright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.peek()).xright;
		TypeDescriptor type2 = (TypeDescriptor)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		//@@CUPDBG4
RESULT= Methods.dss1(type1,type2);
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("DSs",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // DSs ::= Stm DSs 
            {
              TypeDescriptor RESULT =null;
		Location type1xleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).xleft;
		Location type1xright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).xright;
		TypeDescriptor type1 = (TypeDescriptor)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		Location type2xleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.peek()).xleft;
		Location type2xright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.peek()).xright;
		TypeDescriptor type2 = (TypeDescriptor)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		//@@CUPDBG5
RESULT= Methods.dss2(type1,type2);
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("DSs",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // DSs ::= 
            {
              TypeDescriptor RESULT =null;
		//@@CUPDBG6
RESULT= Methods.dss3();
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("DSs",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // Dcl ::= TYFLOAT ID SEMI 
            {
              TypeDescriptor RESULT =null;
		Location valxleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).xleft;
		Location valxright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).xright;
		String val = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		//@@CUPDBG7
RESULT= Methods.dcl1(val);
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("Dcl",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // Dcl ::= TYINT ID SEMI 
            {
              TypeDescriptor RESULT =null;
		Location valxleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).xleft;
		Location valxright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).xright;
		String val = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		//@@CUPDBG8
RESULT= Methods.dcl2(val);
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("Dcl",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // Stm ::= ID ASSIGN Exp SEMI 
            {
              TypeDescriptor RESULT =null;
		Location valxleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).xleft;
		Location valxright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).xright;
		String val = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-3)).value;
		Location typexleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).xleft;
		Location typexright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).xright;
		TypeDescriptor type = (TypeDescriptor)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		//@@CUPDBG9
RESULT= Methods.stm1(val,type);
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("Stm",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // Stm ::= PRINT ID SEMI 
            {
              TypeDescriptor RESULT =null;
		Location valxleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).xleft;
		Location valxright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).xright;
		String val = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		//@@CUPDBG10
RESULT= Methods.stm2(val);
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("Stm",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // Exp ::= Exp PLUS Exp 
            {
              TypeDescriptor RESULT =null;
		Location type1xleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).xleft;
		Location type1xright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).xright;
		TypeDescriptor type1 = (TypeDescriptor)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		Location type2xleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.peek()).xleft;
		Location type2xright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.peek()).xright;
		TypeDescriptor type2 = (TypeDescriptor)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		//@@CUPDBG11
RESULT= Methods.exp1(type1,type2);
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("Exp",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // Exp ::= Exp MINUS Exp 
            {
              TypeDescriptor RESULT =null;
		Location type1xleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).xleft;
		Location type1xright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).xright;
		TypeDescriptor type1 = (TypeDescriptor)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		Location type2xleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.peek()).xleft;
		Location type2xright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.peek()).xright;
		TypeDescriptor type2 = (TypeDescriptor)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		//@@CUPDBG12
RESULT= Methods.exp2(type1,type2);
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("Exp",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // Exp ::= Exp TIMES Exp 
            {
              TypeDescriptor RESULT =null;
		Location type1xleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).xleft;
		Location type1xright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).xright;
		TypeDescriptor type1 = (TypeDescriptor)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		Location type2xleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.peek()).xleft;
		Location type2xright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.peek()).xright;
		TypeDescriptor type2 = (TypeDescriptor)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		//@@CUPDBG13
RESULT= Methods.exp3(type1,type2);
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("Exp",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // Exp ::= Exp DIV Exp 
            {
              TypeDescriptor RESULT =null;
		Location type1xleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).xleft;
		Location type1xright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).xright;
		TypeDescriptor type1 = (TypeDescriptor)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		Location type2xleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.peek()).xleft;
		Location type2xright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.peek()).xright;
		TypeDescriptor type2 = (TypeDescriptor)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		//@@CUPDBG14
RESULT= Methods.exp4(type1,type2);
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("Exp",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // Exp ::= Val 
            {
              TypeDescriptor RESULT =null;
		Location typexleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.peek()).xleft;
		Location typexright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.peek()).xright;
		TypeDescriptor type = (TypeDescriptor)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		//@@CUPDBG15
RESULT= Methods.exp5(type);
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("Exp",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // Val ::= INT 
            {
              TypeDescriptor RESULT =null;
		Location valxleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.peek()).xleft;
		Location valxright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.peek()).xright;
		String val = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		//@@CUPDBG16
RESULT= Methods.val1(val);
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("Val",5, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // Val ::= FLOAT 
            {
              TypeDescriptor RESULT =null;
		Location valxleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.peek()).xleft;
		Location valxright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.peek()).xright;
		String val = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		//@@CUPDBG17
RESULT= Methods.val2(val);
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("Val",5, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // Val ::= ID 
            {
              TypeDescriptor RESULT =null;
		Location valxleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.peek()).xleft;
		Location valxright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.peek()).xright;
		String val = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		//@@CUPDBG18
RESULT= Methods.val3(val);
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("Val",5, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$Parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
              return CUP$Parser$do_action_part00000000(
                               CUP$Parser$act_num,
                               CUP$Parser$parser,
                               CUP$Parser$stack,
                               CUP$Parser$top);
    }
}

}
