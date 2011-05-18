// $ANTLR 3.3 Nov 30, 2010 12:45:30 Z:\\Semester 4\\CI\\Praktikum\\symbolraetselV2.g 2011-05-09 21:50:59

package main;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class symbolraetselV2Parser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "LETTER", "SIGN", "EQUAL", "NEWLINE", "WS"
    };
    public static final int EOF=-1;
    public static final int LETTER=4;
    public static final int SIGN=5;
    public static final int EQUAL=6;
    public static final int NEWLINE=7;
    public static final int WS=8;

    // delegates
    // delegators


        public symbolraetselV2Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public symbolraetselV2Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return symbolraetselV2Parser.tokenNames; }
    public String getGrammarFileName() { return "Z:\\Semester 4\\CI\\Praktikum\\symbolraetselV2.g"; }


    protected static class prog_scope {
        List<Token> symbols;
        List<Token> ops;
    }
    protected Stack prog_stack = new Stack();

    public static class prog_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "prog"
    // Z:\\Semester 4\\CI\\Praktikum\\symbolraetselV2.g:9:1: prog : init ;
    public final symbolraetselV2Parser.prog_return prog() throws RecognitionException {
        prog_stack.push(new prog_scope());
        symbolraetselV2Parser.prog_return retval = new symbolraetselV2Parser.prog_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        symbolraetselV2Parser.init_return init1 = null;



         ((prog_scope)prog_stack.peek()).symbols = new ArrayList<Token>(); 
        	((prog_scope)prog_stack.peek()).ops = new ArrayList<Token>(); 
        try {
            // Z:\\Semester 4\\CI\\Praktikum\\symbolraetselV2.g:14:2: ( init )
            // Z:\\Semester 4\\CI\\Praktikum\\symbolraetselV2.g:14:4: init
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_init_in_prog56);
            init1=init();

            state._fsp--;

            adaptor.addChild(root_0, init1.getTree());

            	    int size = 3;
            	    for(int i = 0; i < size; i++) {
            		Tree equals = new CommonTree(new CommonToken(6, "="));
            		    
            		Tree plus = new CommonTree(((prog_scope)prog_stack.peek()).ops.get(i + size * 0));
            		plus.addChild(new CommonTree(((prog_scope)prog_stack.peek()).symbols.get(i)));
            		plus.addChild(new CommonTree(((prog_scope)prog_stack.peek()).symbols.get(i + size * 1)));
            		    
            		equals.addChild(plus);
            	    	equals.addChild(new CommonTree(((prog_scope)prog_stack.peek()).symbols.get(i + size * 2)));
            		 
            		CommonTreeAdaptor adaptor = new CommonTreeAdaptor();
            		adaptor.addChild((init1!=null?((CommonTree)init1.tree):null), equals);
            	    }
            	    
            	    System.out.println((init1!=null?((CommonTree)init1.tree):null).toStringTree());
            	

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            prog_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "prog"

    public static class init_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "init"
    // Z:\\Semester 4\\CI\\Praktikum\\symbolraetselV2.g:34:1: init : expr operators expr equals expr ;
    public final symbolraetselV2Parser.init_return init() throws RecognitionException {
        symbolraetselV2Parser.init_return retval = new symbolraetselV2Parser.init_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        symbolraetselV2Parser.expr_return expr2 = null;

        symbolraetselV2Parser.operators_return operators3 = null;

        symbolraetselV2Parser.expr_return expr4 = null;

        symbolraetselV2Parser.equals_return equals5 = null;

        symbolraetselV2Parser.expr_return expr6 = null;



        try {
            // Z:\\Semester 4\\CI\\Praktikum\\symbolraetselV2.g:35:2: ( expr operators expr equals expr )
            // Z:\\Semester 4\\CI\\Praktikum\\symbolraetselV2.g:35:4: expr operators expr equals expr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_expr_in_init69);
            expr2=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr2.getTree());
            pushFollow(FOLLOW_operators_in_init71);
            operators3=operators();

            state._fsp--;

            adaptor.addChild(root_0, operators3.getTree());
            pushFollow(FOLLOW_expr_in_init73);
            expr4=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr4.getTree());
            pushFollow(FOLLOW_equals_in_init75);
            equals5=equals();

            state._fsp--;

            adaptor.addChild(root_0, equals5.getTree());
            pushFollow(FOLLOW_expr_in_init77);
            expr6=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr6.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "init"

    public static class expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr"
    // Z:\\Semester 4\\CI\\Praktikum\\symbolraetselV2.g:37:1: expr : letterA= LETTER SIGN letterB= LETTER EQUAL letterC= LETTER NEWLINE ;
    public final symbolraetselV2Parser.expr_return expr() throws RecognitionException {
        symbolraetselV2Parser.expr_return retval = new symbolraetselV2Parser.expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonToken letterA=null;
        CommonToken letterB=null;
        CommonToken letterC=null;
        CommonToken SIGN7=null;
        CommonToken EQUAL8=null;
        CommonToken NEWLINE9=null;

        CommonTree letterA_tree=null;
        CommonTree letterB_tree=null;
        CommonTree letterC_tree=null;
        CommonTree SIGN7_tree=null;
        CommonTree EQUAL8_tree=null;
        CommonTree NEWLINE9_tree=null;

        try {
            // Z:\\Semester 4\\CI\\Praktikum\\symbolraetselV2.g:38:2: (letterA= LETTER SIGN letterB= LETTER EQUAL letterC= LETTER NEWLINE )
            // Z:\\Semester 4\\CI\\Praktikum\\symbolraetselV2.g:38:4: letterA= LETTER SIGN letterB= LETTER EQUAL letterC= LETTER NEWLINE
            {
            root_0 = (CommonTree)adaptor.nil();

            letterA=(CommonToken)match(input,LETTER,FOLLOW_LETTER_in_expr91); 
            letterA_tree = (CommonTree)adaptor.create(letterA);
            adaptor.addChild(root_0, letterA_tree);

            SIGN7=(CommonToken)match(input,SIGN,FOLLOW_SIGN_in_expr93); 
            SIGN7_tree = (CommonTree)adaptor.create(SIGN7);
            root_0 = (CommonTree)adaptor.becomeRoot(SIGN7_tree, root_0);

            letterB=(CommonToken)match(input,LETTER,FOLLOW_LETTER_in_expr98); 
            letterB_tree = (CommonTree)adaptor.create(letterB);
            adaptor.addChild(root_0, letterB_tree);

            EQUAL8=(CommonToken)match(input,EQUAL,FOLLOW_EQUAL_in_expr100); 
            EQUAL8_tree = (CommonTree)adaptor.create(EQUAL8);
            root_0 = (CommonTree)adaptor.becomeRoot(EQUAL8_tree, root_0);

            letterC=(CommonToken)match(input,LETTER,FOLLOW_LETTER_in_expr105); 
            letterC_tree = (CommonTree)adaptor.create(letterC);
            adaptor.addChild(root_0, letterC_tree);

            NEWLINE9=(CommonToken)match(input,NEWLINE,FOLLOW_NEWLINE_in_expr107); 

            	    ((prog_scope)prog_stack.peek()).symbols.add(letterA);
            	    ((prog_scope)prog_stack.peek()).symbols.add(letterB);
            	    ((prog_scope)prog_stack.peek()).symbols.add(letterC);
            	

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expr"

    public static class operators_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "operators"
    // Z:\\Semester 4\\CI\\Praktikum\\symbolraetselV2.g:45:1: operators : signA= SIGN signB= SIGN signC= SIGN NEWLINE ;
    public final symbolraetselV2Parser.operators_return operators() throws RecognitionException {
        symbolraetselV2Parser.operators_return retval = new symbolraetselV2Parser.operators_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonToken signA=null;
        CommonToken signB=null;
        CommonToken signC=null;
        CommonToken NEWLINE10=null;

        CommonTree signA_tree=null;
        CommonTree signB_tree=null;
        CommonTree signC_tree=null;
        CommonTree NEWLINE10_tree=null;

        try {
            // Z:\\Semester 4\\CI\\Praktikum\\symbolraetselV2.g:46:2: (signA= SIGN signB= SIGN signC= SIGN NEWLINE )
            // Z:\\Semester 4\\CI\\Praktikum\\symbolraetselV2.g:46:4: signA= SIGN signB= SIGN signC= SIGN NEWLINE
            {
            root_0 = (CommonTree)adaptor.nil();

            signA=(CommonToken)match(input,SIGN,FOLLOW_SIGN_in_operators123); 
            signB=(CommonToken)match(input,SIGN,FOLLOW_SIGN_in_operators128); 
            signC=(CommonToken)match(input,SIGN,FOLLOW_SIGN_in_operators133); 
            NEWLINE10=(CommonToken)match(input,NEWLINE,FOLLOW_NEWLINE_in_operators136); 
             
            	    ((prog_scope)prog_stack.peek()).ops.add(signA);
            	    ((prog_scope)prog_stack.peek()).ops.add(signB);
            	    ((prog_scope)prog_stack.peek()).ops.add(signC); 
            	

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "operators"

    public static class equals_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "equals"
    // Z:\\Semester 4\\CI\\Praktikum\\symbolraetselV2.g:53:1: equals : EQUAL EQUAL EQUAL NEWLINE ;
    public final symbolraetselV2Parser.equals_return equals() throws RecognitionException {
        symbolraetselV2Parser.equals_return retval = new symbolraetselV2Parser.equals_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonToken EQUAL11=null;
        CommonToken EQUAL12=null;
        CommonToken EQUAL13=null;
        CommonToken NEWLINE14=null;

        CommonTree EQUAL11_tree=null;
        CommonTree EQUAL12_tree=null;
        CommonTree EQUAL13_tree=null;
        CommonTree NEWLINE14_tree=null;

        try {
            // Z:\\Semester 4\\CI\\Praktikum\\symbolraetselV2.g:54:2: ( EQUAL EQUAL EQUAL NEWLINE )
            // Z:\\Semester 4\\CI\\Praktikum\\symbolraetselV2.g:54:4: EQUAL EQUAL EQUAL NEWLINE
            {
            root_0 = (CommonTree)adaptor.nil();

            EQUAL11=(CommonToken)match(input,EQUAL,FOLLOW_EQUAL_in_equals151); 
            EQUAL12=(CommonToken)match(input,EQUAL,FOLLOW_EQUAL_in_equals154); 
            EQUAL13=(CommonToken)match(input,EQUAL,FOLLOW_EQUAL_in_equals157); 
            NEWLINE14=(CommonToken)match(input,NEWLINE,FOLLOW_NEWLINE_in_equals160); 

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "equals"

    // Delegated rules


 

    public static final BitSet FOLLOW_init_in_prog56 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_init69 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_operators_in_init71 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_expr_in_init73 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_equals_in_init75 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_expr_in_init77 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LETTER_in_expr91 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_SIGN_in_expr93 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_LETTER_in_expr98 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_EQUAL_in_expr100 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_LETTER_in_expr105 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_NEWLINE_in_expr107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIGN_in_operators123 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_SIGN_in_operators128 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_SIGN_in_operators133 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_NEWLINE_in_operators136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQUAL_in_equals151 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_EQUAL_in_equals154 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_EQUAL_in_equals157 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_NEWLINE_in_equals160 = new BitSet(new long[]{0x0000000000000002L});

}