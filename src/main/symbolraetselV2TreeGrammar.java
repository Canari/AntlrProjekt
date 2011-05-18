// $ANTLR 3.3 Nov 30, 2010 12:45:30 Z:\\Semester 4\\CI\\Praktikum\\symbolraetselV2TreeGrammar.g 2011-05-09 22:16:43

package main;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;

public class symbolraetselV2TreeGrammar extends TreeParser {
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


        public symbolraetselV2TreeGrammar(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public symbolraetselV2TreeGrammar(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return symbolraetselV2TreeGrammar.tokenNames; }
    public String getGrammarFileName() { return "Z:\\Semester 4\\CI\\Praktikum\\symbolraetselV2TreeGrammar.g"; }



    // $ANTLR start "prog"
    // Z:\\Semester 4\\CI\\Praktikum\\symbolraetselV2TreeGrammar.g:8:1: prog : init ;
    public final void prog() throws RecognitionException {
        try {
            // Z:\\Semester 4\\CI\\Praktikum\\symbolraetselV2TreeGrammar.g:9:2: ( init )
            // Z:\\Semester 4\\CI\\Praktikum\\symbolraetselV2TreeGrammar.g:9:4: init
            {
            pushFollow(FOLLOW_init_in_prog39);
            init();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "prog"


    // $ANTLR start "init"
    // Z:\\Semester 4\\CI\\Praktikum\\symbolraetselV2TreeGrammar.g:11:1: init : expr expr expr expr expr expr ;
    public final void init() throws RecognitionException {
        try {
            // Z:\\Semester 4\\CI\\Praktikum\\symbolraetselV2TreeGrammar.g:12:2: ( expr expr expr expr expr expr )
            // Z:\\Semester 4\\CI\\Praktikum\\symbolraetselV2TreeGrammar.g:12:4: expr expr expr expr expr expr
            {
            pushFollow(FOLLOW_expr_in_init49);
            expr();

            state._fsp--;

            pushFollow(FOLLOW_expr_in_init51);
            expr();

            state._fsp--;

            pushFollow(FOLLOW_expr_in_init53);
            expr();

            state._fsp--;

            pushFollow(FOLLOW_expr_in_init55);
            expr();

            state._fsp--;

            pushFollow(FOLLOW_expr_in_init57);
            expr();

            state._fsp--;

            pushFollow(FOLLOW_expr_in_init59);
            expr();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "init"


    // $ANTLR start "expr"
    // Z:\\Semester 4\\CI\\Praktikum\\symbolraetselV2TreeGrammar.g:14:1: expr : ^( EQUAL ^( SIGN LETTER LETTER ) LETTER ) ;
    public final void expr() throws RecognitionException {
        try {
            // Z:\\Semester 4\\CI\\Praktikum\\symbolraetselV2TreeGrammar.g:15:2: ( ^( EQUAL ^( SIGN LETTER LETTER ) LETTER ) )
            // Z:\\Semester 4\\CI\\Praktikum\\symbolraetselV2TreeGrammar.g:15:4: ^( EQUAL ^( SIGN LETTER LETTER ) LETTER )
            {
            match(input,EQUAL,FOLLOW_EQUAL_in_expr71); 

            match(input, Token.DOWN, null); 
            match(input,SIGN,FOLLOW_SIGN_in_expr74); 

            match(input, Token.DOWN, null); 
            match(input,LETTER,FOLLOW_LETTER_in_expr76); 
            match(input,LETTER,FOLLOW_LETTER_in_expr78); 

            match(input, Token.UP, null); 
            match(input,LETTER,FOLLOW_LETTER_in_expr81); 

            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "expr"

    // Delegated rules


 

    public static final BitSet FOLLOW_init_in_prog39 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_init49 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_expr_in_init51 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_expr_in_init53 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_expr_in_init55 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_expr_in_init57 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_expr_in_init59 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQUAL_in_expr71 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SIGN_in_expr74 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_LETTER_in_expr76 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_LETTER_in_expr78 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LETTER_in_expr81 = new BitSet(new long[]{0x0000000000000008L});

}