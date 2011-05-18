// $ANTLR 3.3 Nov 30, 2010 12:45:30 Z:\\Semester 4\\CI\\Praktikum\\symbolraetselV2.g 2011-05-09 21:51:00

package main;

import org.antlr.runtime.*;

public class symbolraetselV2Lexer extends Lexer {
    public static final int EOF=-1;
    public static final int LETTER=4;
    public static final int SIGN=5;
    public static final int EQUAL=6;
    public static final int NEWLINE=7;
    public static final int WS=8;

    // delegates
    // delegators

    public symbolraetselV2Lexer() {;} 
    public symbolraetselV2Lexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public symbolraetselV2Lexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "Z:\\Semester 4\\CI\\Praktikum\\symbolraetselV2.g"; }

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            int _type = LETTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Z:\\Semester 4\\CI\\Praktikum\\symbolraetselV2.g:57:9: ( ( 'A' .. 'Z' )+ )
            // Z:\\Semester 4\\CI\\Praktikum\\symbolraetselV2.g:57:11: ( 'A' .. 'Z' )+
            {
            // Z:\\Semester 4\\CI\\Praktikum\\symbolraetselV2.g:57:11: ( 'A' .. 'Z' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='A' && LA1_0<='Z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Z:\\Semester 4\\CI\\Praktikum\\symbolraetselV2.g:57:12: 'A' .. 'Z'
            	    {
            	    matchRange('A','Z'); 

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LETTER"

    // $ANTLR start "SIGN"
    public final void mSIGN() throws RecognitionException {
        try {
            int _type = SIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Z:\\Semester 4\\CI\\Praktikum\\symbolraetselV2.g:58:7: ( ( '+' | '-' ) )
            // Z:\\Semester 4\\CI\\Praktikum\\symbolraetselV2.g:58:9: ( '+' | '-' )
            {
            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SIGN"

    // $ANTLR start "NEWLINE"
    public final void mNEWLINE() throws RecognitionException {
        try {
            int _type = NEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Z:\\Semester 4\\CI\\Praktikum\\symbolraetselV2.g:59:9: ( ( ( '\\r' )? '\\n' ) )
            // Z:\\Semester 4\\CI\\Praktikum\\symbolraetselV2.g:59:11: ( ( '\\r' )? '\\n' )
            {
            // Z:\\Semester 4\\CI\\Praktikum\\symbolraetselV2.g:59:11: ( ( '\\r' )? '\\n' )
            // Z:\\Semester 4\\CI\\Praktikum\\symbolraetselV2.g:59:12: ( '\\r' )? '\\n'
            {
            // Z:\\Semester 4\\CI\\Praktikum\\symbolraetselV2.g:59:12: ( '\\r' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='\r') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // Z:\\Semester 4\\CI\\Praktikum\\symbolraetselV2.g:59:12: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NEWLINE"

    // $ANTLR start "EQUAL"
    public final void mEQUAL() throws RecognitionException {
        try {
            int _type = EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Z:\\Semester 4\\CI\\Praktikum\\symbolraetselV2.g:60:9: ( '=' )
            // Z:\\Semester 4\\CI\\Praktikum\\symbolraetselV2.g:60:11: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EQUAL"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Z:\\Semester 4\\CI\\Praktikum\\symbolraetselV2.g:61:6: ( ( ' ' | '\\t' | NEWLINE )+ )
            // Z:\\Semester 4\\CI\\Praktikum\\symbolraetselV2.g:61:8: ( ' ' | '\\t' | NEWLINE )+
            {
            // Z:\\Semester 4\\CI\\Praktikum\\symbolraetselV2.g:61:8: ( ' ' | '\\t' | NEWLINE )+
            int cnt3=0;
            loop3:
            do {
                int alt3=4;
                switch ( input.LA(1) ) {
                case ' ':
                    {
                    alt3=1;
                    }
                    break;
                case '\t':
                    {
                    alt3=2;
                    }
                    break;
                case '\n':
                case '\r':
                    {
                    alt3=3;
                    }
                    break;

                }

                switch (alt3) {
            	case 1 :
            	    // Z:\\Semester 4\\CI\\Praktikum\\symbolraetselV2.g:61:9: ' '
            	    {
            	    match(' '); 

            	    }
            	    break;
            	case 2 :
            	    // Z:\\Semester 4\\CI\\Praktikum\\symbolraetselV2.g:61:13: '\\t'
            	    {
            	    match('\t'); 

            	    }
            	    break;
            	case 3 :
            	    // Z:\\Semester 4\\CI\\Praktikum\\symbolraetselV2.g:61:18: NEWLINE
            	    {
            	    mNEWLINE(); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            skip();

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // Z:\\Semester 4\\CI\\Praktikum\\symbolraetselV2.g:1:8: ( LETTER | SIGN | NEWLINE | EQUAL | WS )
        int alt4=5;
        switch ( input.LA(1) ) {
        case 'A':
        case 'B':
        case 'C':
        case 'D':
        case 'E':
        case 'F':
        case 'G':
        case 'H':
        case 'I':
        case 'J':
        case 'K':
        case 'L':
        case 'M':
        case 'N':
        case 'O':
        case 'P':
        case 'Q':
        case 'R':
        case 'S':
        case 'T':
        case 'U':
        case 'V':
        case 'W':
        case 'X':
        case 'Y':
        case 'Z':
            {
            alt4=1;
            }
            break;
        case '+':
        case '-':
            {
            alt4=2;
            }
            break;
        case '\r':
            {
            int LA4_3 = input.LA(2);

            if ( (LA4_3=='\n') ) {
                int LA4_4 = input.LA(3);

                if ( ((LA4_4>='\t' && LA4_4<='\n')||LA4_4=='\r'||LA4_4==' ') ) {
                    alt4=5;
                }
                else {
                    alt4=3;}
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 3, input);

                throw nvae;
            }
            }
            break;
        case '\n':
            {
            int LA4_4 = input.LA(2);

            if ( ((LA4_4>='\t' && LA4_4<='\n')||LA4_4=='\r'||LA4_4==' ') ) {
                alt4=5;
            }
            else {
                alt4=3;}
            }
            break;
        case '=':
            {
            alt4=4;
            }
            break;
        case '\t':
        case ' ':
            {
            alt4=5;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 4, 0, input);

            throw nvae;
        }

        switch (alt4) {
            case 1 :
                // Z:\\Semester 4\\CI\\Praktikum\\symbolraetselV2.g:1:10: LETTER
                {
                mLETTER(); 

                }
                break;
            case 2 :
                // Z:\\Semester 4\\CI\\Praktikum\\symbolraetselV2.g:1:17: SIGN
                {
                mSIGN(); 

                }
                break;
            case 3 :
                // Z:\\Semester 4\\CI\\Praktikum\\symbolraetselV2.g:1:22: NEWLINE
                {
                mNEWLINE(); 

                }
                break;
            case 4 :
                // Z:\\Semester 4\\CI\\Praktikum\\symbolraetselV2.g:1:30: EQUAL
                {
                mEQUAL(); 

                }
                break;
            case 5 :
                // Z:\\Semester 4\\CI\\Praktikum\\symbolraetselV2.g:1:36: WS
                {
                mWS(); 

                }
                break;

        }

    }


 

}