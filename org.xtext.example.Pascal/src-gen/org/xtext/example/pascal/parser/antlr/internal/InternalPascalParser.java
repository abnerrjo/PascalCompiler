package org.xtext.example.pascal.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.pascal.services.PascalGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPascalParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Procedure", "Function", "Forward", "Program", "Downto", "Packed", "Record", "Repeat", "Array", "Begin", "Const", "False", "Label", "Until", "While", "Case", "Else", "File", "Goto", "Then", "True", "Type", "With", "And", "Div", "End", "For", "Mod", "Nil", "Not", "Set", "Var", "FullStopFullStop", "ColonEqualsSign", "Do", "If", "In", "Of", "Or", "To", "LeftParenthesis", "RightParenthesis", "Comma", "FullStop", "Colon", "Semicolon", "EqualsSign", "LeftSquareBracket", "RightSquareBracket", "CircumflexAccent", "RULE_INTEGER_NUMBER", "RULE_REAL_NUMBER", "RULE_SIGNED_INTEGER_NUMBER", "RULE_SIGNED_REAL_NUMBER", "RULE_NUMERIC_SUBRANGE", "RULE_ADDITION_OPERATOR", "RULE_MULTIPLICATION_OPERATOR", "RULE_RELATIONAL_OPERATOR", "RULE_UNSIGNED_DIGIT_SEQUENCE", "RULE_DIGIT_SEQUENCE", "RULE_DIGIT", "RULE_ML_COMMENT", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int End=29;
    public static final int RULE_ID=66;
    public static final int Goto=22;
    public static final int RightParenthesis=45;
    public static final int Array=12;
    public static final int RULE_ANY_OTHER=71;
    public static final int False=15;
    public static final int Forward=6;
    public static final int LeftParenthesis=44;
    public static final int RightSquareBracket=52;
    public static final int RULE_NUMERIC_SUBRANGE=58;
    public static final int While=18;
    public static final int Case=19;
    public static final int RULE_ADDITION_OPERATOR=59;
    public static final int EOF=-1;
    public static final int Set=34;
    public static final int FullStop=47;
    public static final int Program=7;
    public static final int Begin=13;
    public static final int Repeat=11;
    public static final int Nil=32;
    public static final int RULE_REAL_NUMBER=55;
    public static final int To=43;
    public static final int Do=38;
    public static final int RULE_MULTIPLICATION_OPERATOR=60;
    public static final int RULE_INT=67;
    public static final int LeftSquareBracket=51;
    public static final int Or=42;
    public static final int True=24;
    public static final int FullStopFullStop=36;
    public static final int Downto=8;
    public static final int If=39;
    public static final int And=27;
    public static final int Div=28;
    public static final int RULE_RELATIONAL_OPERATOR=61;
    public static final int Mod=31;
    public static final int In=40;
    public static final int Packed=9;
    public static final int Type=25;
    public static final int Then=23;
    public static final int Procedure=4;
    public static final int ColonEqualsSign=37;
    public static final int RULE_UNSIGNED_DIGIT_SEQUENCE=62;
    public static final int Colon=48;
    public static final int Const=14;
    public static final int Semicolon=49;
    public static final int RULE_SL_COMMENT=69;
    public static final int For=30;
    public static final int With=26;
    public static final int RULE_ML_COMMENT=65;
    public static final int RULE_STRING=68;
    public static final int RULE_SIGNED_REAL_NUMBER=57;
    public static final int File=21;
    public static final int Function=5;
    public static final int Not=33;
    public static final int Record=10;
    public static final int RULE_DIGIT_SEQUENCE=63;
    public static final int RULE_WS=70;
    public static final int Else=20;
    public static final int CircumflexAccent=53;
    public static final int RULE_SIGNED_INTEGER_NUMBER=56;
    public static final int RULE_DIGIT=64;
    public static final int Label=16;
    public static final int Comma=46;
    public static final int EqualsSign=50;
    public static final int Of=41;
    public static final int Var=35;
    public static final int Until=17;
    public static final int RULE_INTEGER_NUMBER=54;

    // delegates
    // delegators


        public InternalPascalParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPascalParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPascalParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g"; }




    	private PascalGrammarAccess grammarAccess;
    	 	
    	public InternalPascalParser(TokenStream input, PascalGrammarAccess grammarAccess) {
    		this(input);
    		this.grammarAccess = grammarAccess;
    		registerRules(grammarAccess.getGrammar());
    	}
    	
    	@Override
    	protected String getFirstRuleName() {
    		return "pascal";	
    	} 
    	   	   	
    	@Override
    	protected PascalGrammarAccess getGrammarAccess() {
    		return grammarAccess;
    	}



    // $ANTLR start "entryRulepascal"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:61:1: entryRulepascal returns [EObject current=null] : iv_rulepascal= rulepascal EOF ;
    public final EObject entryRulepascal() throws RecognitionException {
        EObject current = null;

        EObject iv_rulepascal = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:62:2: (iv_rulepascal= rulepascal EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:63:2: iv_rulepascal= rulepascal EOF
            {
             newCompositeNode(grammarAccess.getPascalRule()); 
            pushFollow(FOLLOW_rulepascal_in_entryRulepascal67);
            iv_rulepascal=rulepascal();

            state._fsp--;

             current =iv_rulepascal; 
            match(input,EOF,FOLLOW_EOF_in_entryRulepascal77); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulepascal"


    // $ANTLR start "rulepascal"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:70:1: rulepascal returns [EObject current=null] : ( (lv_program_0_0= ruleprogram ) ) ;
    public final EObject rulepascal() throws RecognitionException {
        EObject current = null;

        EObject lv_program_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:73:28: ( ( (lv_program_0_0= ruleprogram ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:74:1: ( (lv_program_0_0= ruleprogram ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:74:1: ( (lv_program_0_0= ruleprogram ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:75:1: (lv_program_0_0= ruleprogram )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:75:1: (lv_program_0_0= ruleprogram )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:76:3: lv_program_0_0= ruleprogram
            {
             
            	        newCompositeNode(grammarAccess.getPascalAccess().getProgramProgramParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleprogram_in_rulepascal122);
            lv_program_0_0=ruleprogram();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPascalRule());
            	        }
                   		add(
                   			current, 
                   			"program",
                    		lv_program_0_0, 
                    		"program");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "rulepascal"


    // $ANTLR start "entryRuleprogram"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:100:1: entryRuleprogram returns [EObject current=null] : iv_ruleprogram= ruleprogram EOF ;
    public final EObject entryRuleprogram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprogram = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:101:2: (iv_ruleprogram= ruleprogram EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:102:2: iv_ruleprogram= ruleprogram EOF
            {
             newCompositeNode(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_ruleprogram_in_entryRuleprogram156);
            iv_ruleprogram=ruleprogram();

            state._fsp--;

             current =iv_ruleprogram; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleprogram166); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleprogram"


    // $ANTLR start "ruleprogram"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:109:1: ruleprogram returns [EObject current=null] : ( ( (lv_heading_0_0= ruleprogram_heading_block ) ) ( (lv_block_1_0= ruleblock ) ) otherlv_2= FullStop ) ;
    public final EObject ruleprogram() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_heading_0_0 = null;

        EObject lv_block_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:112:28: ( ( ( (lv_heading_0_0= ruleprogram_heading_block ) ) ( (lv_block_1_0= ruleblock ) ) otherlv_2= FullStop ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:113:1: ( ( (lv_heading_0_0= ruleprogram_heading_block ) ) ( (lv_block_1_0= ruleblock ) ) otherlv_2= FullStop )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:113:1: ( ( (lv_heading_0_0= ruleprogram_heading_block ) ) ( (lv_block_1_0= ruleblock ) ) otherlv_2= FullStop )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:113:2: ( (lv_heading_0_0= ruleprogram_heading_block ) ) ( (lv_block_1_0= ruleblock ) ) otherlv_2= FullStop
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:113:2: ( (lv_heading_0_0= ruleprogram_heading_block ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:114:1: (lv_heading_0_0= ruleprogram_heading_block )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:114:1: (lv_heading_0_0= ruleprogram_heading_block )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:115:3: lv_heading_0_0= ruleprogram_heading_block
            {
             
            	        newCompositeNode(grammarAccess.getProgramAccess().getHeadingProgram_heading_blockParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleprogram_heading_block_in_ruleprogram212);
            lv_heading_0_0=ruleprogram_heading_block();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getProgramRule());
            	        }
                   		set(
                   			current, 
                   			"heading",
                    		lv_heading_0_0, 
                    		"program_heading_block");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:131:2: ( (lv_block_1_0= ruleblock ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:132:1: (lv_block_1_0= ruleblock )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:132:1: (lv_block_1_0= ruleblock )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:133:3: lv_block_1_0= ruleblock
            {
             
            	        newCompositeNode(grammarAccess.getProgramAccess().getBlockBlockParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleblock_in_ruleprogram233);
            lv_block_1_0=ruleblock();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getProgramRule());
            	        }
                   		set(
                   			current, 
                   			"block",
                    		lv_block_1_0, 
                    		"block");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,FullStop,FOLLOW_FullStop_in_ruleprogram246); 

                	newLeafNode(otherlv_2, grammarAccess.getProgramAccess().getFullStopKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleprogram"


    // $ANTLR start "entryRuleprogram_heading_block"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:162:1: entryRuleprogram_heading_block returns [EObject current=null] : iv_ruleprogram_heading_block= ruleprogram_heading_block EOF ;
    public final EObject entryRuleprogram_heading_block() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprogram_heading_block = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:163:2: (iv_ruleprogram_heading_block= ruleprogram_heading_block EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:164:2: iv_ruleprogram_heading_block= ruleprogram_heading_block EOF
            {
             newCompositeNode(grammarAccess.getProgram_heading_blockRule()); 
            pushFollow(FOLLOW_ruleprogram_heading_block_in_entryRuleprogram_heading_block280);
            iv_ruleprogram_heading_block=ruleprogram_heading_block();

            state._fsp--;

             current =iv_ruleprogram_heading_block; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleprogram_heading_block290); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleprogram_heading_block"


    // $ANTLR start "ruleprogram_heading_block"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:171:1: ruleprogram_heading_block returns [EObject current=null] : (otherlv_0= Program ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= LeftParenthesis ( (lv_identifiers_3_0= ruleidentifier_list ) ) otherlv_4= RightParenthesis )? otherlv_5= Semicolon ) ;
    public final EObject ruleprogram_heading_block() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_identifiers_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:174:28: ( (otherlv_0= Program ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= LeftParenthesis ( (lv_identifiers_3_0= ruleidentifier_list ) ) otherlv_4= RightParenthesis )? otherlv_5= Semicolon ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:175:1: (otherlv_0= Program ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= LeftParenthesis ( (lv_identifiers_3_0= ruleidentifier_list ) ) otherlv_4= RightParenthesis )? otherlv_5= Semicolon )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:175:1: (otherlv_0= Program ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= LeftParenthesis ( (lv_identifiers_3_0= ruleidentifier_list ) ) otherlv_4= RightParenthesis )? otherlv_5= Semicolon )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:176:2: otherlv_0= Program ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= LeftParenthesis ( (lv_identifiers_3_0= ruleidentifier_list ) ) otherlv_4= RightParenthesis )? otherlv_5= Semicolon
            {
            otherlv_0=(Token)match(input,Program,FOLLOW_Program_in_ruleprogram_heading_block328); 

                	newLeafNode(otherlv_0, grammarAccess.getProgram_heading_blockAccess().getProgramKeyword_0());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:180:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:181:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:181:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:182:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleprogram_heading_block344); 

            			newLeafNode(lv_name_1_0, grammarAccess.getProgram_heading_blockAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getProgram_heading_blockRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:198:2: (otherlv_2= LeftParenthesis ( (lv_identifiers_3_0= ruleidentifier_list ) ) otherlv_4= RightParenthesis )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==LeftParenthesis) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:199:2: otherlv_2= LeftParenthesis ( (lv_identifiers_3_0= ruleidentifier_list ) ) otherlv_4= RightParenthesis
                    {
                    otherlv_2=(Token)match(input,LeftParenthesis,FOLLOW_LeftParenthesis_in_ruleprogram_heading_block363); 

                        	newLeafNode(otherlv_2, grammarAccess.getProgram_heading_blockAccess().getLeftParenthesisKeyword_2_0());
                        
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:203:1: ( (lv_identifiers_3_0= ruleidentifier_list ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:204:1: (lv_identifiers_3_0= ruleidentifier_list )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:204:1: (lv_identifiers_3_0= ruleidentifier_list )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:205:3: lv_identifiers_3_0= ruleidentifier_list
                    {
                     
                    	        newCompositeNode(grammarAccess.getProgram_heading_blockAccess().getIdentifiersIdentifier_listParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleidentifier_list_in_ruleprogram_heading_block383);
                    lv_identifiers_3_0=ruleidentifier_list();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getProgram_heading_blockRule());
                    	        }
                           		set(
                           			current, 
                           			"identifiers",
                            		lv_identifiers_3_0, 
                            		"identifier_list");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_4=(Token)match(input,RightParenthesis,FOLLOW_RightParenthesis_in_ruleprogram_heading_block396); 

                        	newLeafNode(otherlv_4, grammarAccess.getProgram_heading_blockAccess().getRightParenthesisKeyword_2_2());
                        

                    }
                    break;

            }

            otherlv_5=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_ruleprogram_heading_block410); 

                	newLeafNode(otherlv_5, grammarAccess.getProgram_heading_blockAccess().getSemicolonKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleprogram_heading_block"


    // $ANTLR start "entryRuleidentifier_list"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:239:1: entryRuleidentifier_list returns [EObject current=null] : iv_ruleidentifier_list= ruleidentifier_list EOF ;
    public final EObject entryRuleidentifier_list() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleidentifier_list = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:240:2: (iv_ruleidentifier_list= ruleidentifier_list EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:241:2: iv_ruleidentifier_list= ruleidentifier_list EOF
            {
             newCompositeNode(grammarAccess.getIdentifier_listRule()); 
            pushFollow(FOLLOW_ruleidentifier_list_in_entryRuleidentifier_list444);
            iv_ruleidentifier_list=ruleidentifier_list();

            state._fsp--;

             current =iv_ruleidentifier_list; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleidentifier_list454); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleidentifier_list"


    // $ANTLR start "ruleidentifier_list"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:248:1: ruleidentifier_list returns [EObject current=null] : ( ( (lv_names_0_0= RULE_ID ) ) (otherlv_1= Comma ( (lv_names_2_0= RULE_ID ) ) )* ) ;
    public final EObject ruleidentifier_list() throws RecognitionException {
        EObject current = null;

        Token lv_names_0_0=null;
        Token otherlv_1=null;
        Token lv_names_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:251:28: ( ( ( (lv_names_0_0= RULE_ID ) ) (otherlv_1= Comma ( (lv_names_2_0= RULE_ID ) ) )* ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:252:1: ( ( (lv_names_0_0= RULE_ID ) ) (otherlv_1= Comma ( (lv_names_2_0= RULE_ID ) ) )* )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:252:1: ( ( (lv_names_0_0= RULE_ID ) ) (otherlv_1= Comma ( (lv_names_2_0= RULE_ID ) ) )* )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:252:2: ( (lv_names_0_0= RULE_ID ) ) (otherlv_1= Comma ( (lv_names_2_0= RULE_ID ) ) )*
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:252:2: ( (lv_names_0_0= RULE_ID ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:253:1: (lv_names_0_0= RULE_ID )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:253:1: (lv_names_0_0= RULE_ID )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:254:3: lv_names_0_0= RULE_ID
            {
            lv_names_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleidentifier_list496); 

            			newLeafNode(lv_names_0_0, grammarAccess.getIdentifier_listAccess().getNamesIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getIdentifier_listRule());
            	        }
                   		addWithLastConsumed(
                   			current, 
                   			"names",
                    		lv_names_0_0, 
                    		"ID");
            	    

            }


            }

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:270:2: (otherlv_1= Comma ( (lv_names_2_0= RULE_ID ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==Comma) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:271:2: otherlv_1= Comma ( (lv_names_2_0= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,Comma,FOLLOW_Comma_in_ruleidentifier_list515); 

            	        	newLeafNode(otherlv_1, grammarAccess.getIdentifier_listAccess().getCommaKeyword_1_0());
            	        
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:275:1: ( (lv_names_2_0= RULE_ID ) )
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:276:1: (lv_names_2_0= RULE_ID )
            	    {
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:276:1: (lv_names_2_0= RULE_ID )
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:277:3: lv_names_2_0= RULE_ID
            	    {
            	    lv_names_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleidentifier_list531); 

            	    			newLeafNode(lv_names_2_0, grammarAccess.getIdentifier_listAccess().getNamesIDTerminalRuleCall_1_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getIdentifier_listRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"names",
            	            		lv_names_2_0, 
            	            		"ID");
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleidentifier_list"


    // $ANTLR start "entryRuleblock"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:301:1: entryRuleblock returns [EObject current=null] : iv_ruleblock= ruleblock EOF ;
    public final EObject entryRuleblock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleblock = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:302:2: (iv_ruleblock= ruleblock EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:303:2: iv_ruleblock= ruleblock EOF
            {
             newCompositeNode(grammarAccess.getBlockRule()); 
            pushFollow(FOLLOW_ruleblock_in_entryRuleblock573);
            iv_ruleblock=ruleblock();

            state._fsp--;

             current =iv_ruleblock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleblock583); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleblock"


    // $ANTLR start "ruleblock"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:310:1: ruleblock returns [EObject current=null] : ( ( (lv_label_0_0= rulelabel_declaration_part ) )? ( (lv_constant_1_0= ruleconstant_definition_part ) )? ( (lv_type_2_0= ruletype_definition_part ) )? ( (lv_variable_3_0= rulevariable_declaration_part ) )? ( (lv_abstraction_4_0= ruleprocedure_and_function_declaration_part ) )? ( (lv_statement_5_0= rulestatement_part ) ) ) ;
    public final EObject ruleblock() throws RecognitionException {
        EObject current = null;

        EObject lv_label_0_0 = null;

        EObject lv_constant_1_0 = null;

        EObject lv_type_2_0 = null;

        EObject lv_variable_3_0 = null;

        EObject lv_abstraction_4_0 = null;

        EObject lv_statement_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:313:28: ( ( ( (lv_label_0_0= rulelabel_declaration_part ) )? ( (lv_constant_1_0= ruleconstant_definition_part ) )? ( (lv_type_2_0= ruletype_definition_part ) )? ( (lv_variable_3_0= rulevariable_declaration_part ) )? ( (lv_abstraction_4_0= ruleprocedure_and_function_declaration_part ) )? ( (lv_statement_5_0= rulestatement_part ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:314:1: ( ( (lv_label_0_0= rulelabel_declaration_part ) )? ( (lv_constant_1_0= ruleconstant_definition_part ) )? ( (lv_type_2_0= ruletype_definition_part ) )? ( (lv_variable_3_0= rulevariable_declaration_part ) )? ( (lv_abstraction_4_0= ruleprocedure_and_function_declaration_part ) )? ( (lv_statement_5_0= rulestatement_part ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:314:1: ( ( (lv_label_0_0= rulelabel_declaration_part ) )? ( (lv_constant_1_0= ruleconstant_definition_part ) )? ( (lv_type_2_0= ruletype_definition_part ) )? ( (lv_variable_3_0= rulevariable_declaration_part ) )? ( (lv_abstraction_4_0= ruleprocedure_and_function_declaration_part ) )? ( (lv_statement_5_0= rulestatement_part ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:314:2: ( (lv_label_0_0= rulelabel_declaration_part ) )? ( (lv_constant_1_0= ruleconstant_definition_part ) )? ( (lv_type_2_0= ruletype_definition_part ) )? ( (lv_variable_3_0= rulevariable_declaration_part ) )? ( (lv_abstraction_4_0= ruleprocedure_and_function_declaration_part ) )? ( (lv_statement_5_0= rulestatement_part ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:314:2: ( (lv_label_0_0= rulelabel_declaration_part ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==Label) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:315:1: (lv_label_0_0= rulelabel_declaration_part )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:315:1: (lv_label_0_0= rulelabel_declaration_part )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:316:3: lv_label_0_0= rulelabel_declaration_part
                    {
                     
                    	        newCompositeNode(grammarAccess.getBlockAccess().getLabelLabel_declaration_partParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_rulelabel_declaration_part_in_ruleblock629);
                    lv_label_0_0=rulelabel_declaration_part();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBlockRule());
                    	        }
                           		set(
                           			current, 
                           			"label",
                            		lv_label_0_0, 
                            		"label_declaration_part");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:332:3: ( (lv_constant_1_0= ruleconstant_definition_part ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==Const) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:333:1: (lv_constant_1_0= ruleconstant_definition_part )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:333:1: (lv_constant_1_0= ruleconstant_definition_part )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:334:3: lv_constant_1_0= ruleconstant_definition_part
                    {
                     
                    	        newCompositeNode(grammarAccess.getBlockAccess().getConstantConstant_definition_partParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleconstant_definition_part_in_ruleblock651);
                    lv_constant_1_0=ruleconstant_definition_part();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBlockRule());
                    	        }
                           		set(
                           			current, 
                           			"constant",
                            		lv_constant_1_0, 
                            		"constant_definition_part");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:350:3: ( (lv_type_2_0= ruletype_definition_part ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==Type) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:351:1: (lv_type_2_0= ruletype_definition_part )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:351:1: (lv_type_2_0= ruletype_definition_part )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:352:3: lv_type_2_0= ruletype_definition_part
                    {
                     
                    	        newCompositeNode(grammarAccess.getBlockAccess().getTypeType_definition_partParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruletype_definition_part_in_ruleblock673);
                    lv_type_2_0=ruletype_definition_part();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBlockRule());
                    	        }
                           		set(
                           			current, 
                           			"type",
                            		lv_type_2_0, 
                            		"type_definition_part");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:368:3: ( (lv_variable_3_0= rulevariable_declaration_part ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==Var) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:369:1: (lv_variable_3_0= rulevariable_declaration_part )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:369:1: (lv_variable_3_0= rulevariable_declaration_part )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:370:3: lv_variable_3_0= rulevariable_declaration_part
                    {
                     
                    	        newCompositeNode(grammarAccess.getBlockAccess().getVariableVariable_declaration_partParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_rulevariable_declaration_part_in_ruleblock695);
                    lv_variable_3_0=rulevariable_declaration_part();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBlockRule());
                    	        }
                           		set(
                           			current, 
                           			"variable",
                            		lv_variable_3_0, 
                            		"variable_declaration_part");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:386:3: ( (lv_abstraction_4_0= ruleprocedure_and_function_declaration_part ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=Procedure && LA7_0<=Function)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:387:1: (lv_abstraction_4_0= ruleprocedure_and_function_declaration_part )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:387:1: (lv_abstraction_4_0= ruleprocedure_and_function_declaration_part )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:388:3: lv_abstraction_4_0= ruleprocedure_and_function_declaration_part
                    {
                     
                    	        newCompositeNode(grammarAccess.getBlockAccess().getAbstractionProcedure_and_function_declaration_partParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleprocedure_and_function_declaration_part_in_ruleblock717);
                    lv_abstraction_4_0=ruleprocedure_and_function_declaration_part();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBlockRule());
                    	        }
                           		set(
                           			current, 
                           			"abstraction",
                            		lv_abstraction_4_0, 
                            		"procedure_and_function_declaration_part");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:404:3: ( (lv_statement_5_0= rulestatement_part ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:405:1: (lv_statement_5_0= rulestatement_part )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:405:1: (lv_statement_5_0= rulestatement_part )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:406:3: lv_statement_5_0= rulestatement_part
            {
             
            	        newCompositeNode(grammarAccess.getBlockAccess().getStatementStatement_partParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_rulestatement_part_in_ruleblock739);
            lv_statement_5_0=rulestatement_part();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBlockRule());
            	        }
                   		set(
                   			current, 
                   			"statement",
                    		lv_statement_5_0, 
                    		"statement_part");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleblock"


    // $ANTLR start "entryRulestatement_part"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:430:1: entryRulestatement_part returns [EObject current=null] : iv_rulestatement_part= rulestatement_part EOF ;
    public final EObject entryRulestatement_part() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestatement_part = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:431:2: (iv_rulestatement_part= rulestatement_part EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:432:2: iv_rulestatement_part= rulestatement_part EOF
            {
             newCompositeNode(grammarAccess.getStatement_partRule()); 
            pushFollow(FOLLOW_rulestatement_part_in_entryRulestatement_part774);
            iv_rulestatement_part=rulestatement_part();

            state._fsp--;

             current =iv_rulestatement_part; 
            match(input,EOF,FOLLOW_EOF_in_entryRulestatement_part784); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulestatement_part"


    // $ANTLR start "rulestatement_part"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:439:1: rulestatement_part returns [EObject current=null] : (otherlv_0= Begin ( (lv_sequence_1_0= rulestatement_sequence ) ) otherlv_2= End ) ;
    public final EObject rulestatement_part() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_sequence_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:442:28: ( (otherlv_0= Begin ( (lv_sequence_1_0= rulestatement_sequence ) ) otherlv_2= End ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:443:1: (otherlv_0= Begin ( (lv_sequence_1_0= rulestatement_sequence ) ) otherlv_2= End )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:443:1: (otherlv_0= Begin ( (lv_sequence_1_0= rulestatement_sequence ) ) otherlv_2= End )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:444:2: otherlv_0= Begin ( (lv_sequence_1_0= rulestatement_sequence ) ) otherlv_2= End
            {
            otherlv_0=(Token)match(input,Begin,FOLLOW_Begin_in_rulestatement_part822); 

                	newLeafNode(otherlv_0, grammarAccess.getStatement_partAccess().getBeginKeyword_0());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:448:1: ( (lv_sequence_1_0= rulestatement_sequence ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:449:1: (lv_sequence_1_0= rulestatement_sequence )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:449:1: (lv_sequence_1_0= rulestatement_sequence )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:450:3: lv_sequence_1_0= rulestatement_sequence
            {
             
            	        newCompositeNode(grammarAccess.getStatement_partAccess().getSequenceStatement_sequenceParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulestatement_sequence_in_rulestatement_part842);
            lv_sequence_1_0=rulestatement_sequence();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStatement_partRule());
            	        }
                   		set(
                   			current, 
                   			"sequence",
                    		lv_sequence_1_0, 
                    		"statement_sequence");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,End,FOLLOW_End_in_rulestatement_part855); 

                	newLeafNode(otherlv_2, grammarAccess.getStatement_partAccess().getEndKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "rulestatement_part"


    // $ANTLR start "entryRulestatement_sequence"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:479:1: entryRulestatement_sequence returns [EObject current=null] : iv_rulestatement_sequence= rulestatement_sequence EOF ;
    public final EObject entryRulestatement_sequence() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestatement_sequence = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:480:2: (iv_rulestatement_sequence= rulestatement_sequence EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:481:2: iv_rulestatement_sequence= rulestatement_sequence EOF
            {
             newCompositeNode(grammarAccess.getStatement_sequenceRule()); 
            pushFollow(FOLLOW_rulestatement_sequence_in_entryRulestatement_sequence889);
            iv_rulestatement_sequence=rulestatement_sequence();

            state._fsp--;

             current =iv_rulestatement_sequence; 
            match(input,EOF,FOLLOW_EOF_in_entryRulestatement_sequence899); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulestatement_sequence"


    // $ANTLR start "rulestatement_sequence"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:488:1: rulestatement_sequence returns [EObject current=null] : ( ( (lv_statements_0_0= rulestatement ) ) (otherlv_1= Semicolon ( (lv_statements_2_0= rulestatement ) ) )* ) ;
    public final EObject rulestatement_sequence() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_statements_0_0 = null;

        EObject lv_statements_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:491:28: ( ( ( (lv_statements_0_0= rulestatement ) ) (otherlv_1= Semicolon ( (lv_statements_2_0= rulestatement ) ) )* ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:492:1: ( ( (lv_statements_0_0= rulestatement ) ) (otherlv_1= Semicolon ( (lv_statements_2_0= rulestatement ) ) )* )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:492:1: ( ( (lv_statements_0_0= rulestatement ) ) (otherlv_1= Semicolon ( (lv_statements_2_0= rulestatement ) ) )* )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:492:2: ( (lv_statements_0_0= rulestatement ) ) (otherlv_1= Semicolon ( (lv_statements_2_0= rulestatement ) ) )*
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:492:2: ( (lv_statements_0_0= rulestatement ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:493:1: (lv_statements_0_0= rulestatement )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:493:1: (lv_statements_0_0= rulestatement )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:494:3: lv_statements_0_0= rulestatement
            {
             
            	        newCompositeNode(grammarAccess.getStatement_sequenceAccess().getStatementsStatementParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_rulestatement_in_rulestatement_sequence945);
            lv_statements_0_0=rulestatement();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStatement_sequenceRule());
            	        }
                   		add(
                   			current, 
                   			"statements",
                    		lv_statements_0_0, 
                    		"statement");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:510:2: (otherlv_1= Semicolon ( (lv_statements_2_0= rulestatement ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==Semicolon) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:511:2: otherlv_1= Semicolon ( (lv_statements_2_0= rulestatement ) )
            	    {
            	    otherlv_1=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_rulestatement_sequence959); 

            	        	newLeafNode(otherlv_1, grammarAccess.getStatement_sequenceAccess().getSemicolonKeyword_1_0());
            	        
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:515:1: ( (lv_statements_2_0= rulestatement ) )
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:516:1: (lv_statements_2_0= rulestatement )
            	    {
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:516:1: (lv_statements_2_0= rulestatement )
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:517:3: lv_statements_2_0= rulestatement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStatement_sequenceAccess().getStatementsStatementParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulestatement_in_rulestatement_sequence979);
            	    lv_statements_2_0=rulestatement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStatement_sequenceRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"statements",
            	            		lv_statements_2_0, 
            	            		"statement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "rulestatement_sequence"


    // $ANTLR start "entryRulestatement"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:541:1: entryRulestatement returns [EObject current=null] : iv_rulestatement= rulestatement EOF ;
    public final EObject entryRulestatement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestatement = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:542:2: (iv_rulestatement= rulestatement EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:543:2: iv_rulestatement= rulestatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_rulestatement_in_entryRulestatement1016);
            iv_rulestatement=rulestatement();

            state._fsp--;

             current =iv_rulestatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRulestatement1026); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulestatement"


    // $ANTLR start "rulestatement"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:550:1: rulestatement returns [EObject current=null] : ( ( ( (lv_label_0_0= rulelabel ) ) otherlv_1= Colon )? ( ( (lv_simple_2_0= rulesimple_statement ) ) | ( (lv_structured_3_0= rulestructured_statement ) ) ) ) ;
    public final EObject rulestatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_label_0_0 = null;

        EObject lv_simple_2_0 = null;

        EObject lv_structured_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:553:28: ( ( ( ( (lv_label_0_0= rulelabel ) ) otherlv_1= Colon )? ( ( (lv_simple_2_0= rulesimple_statement ) ) | ( (lv_structured_3_0= rulestructured_statement ) ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:554:1: ( ( ( (lv_label_0_0= rulelabel ) ) otherlv_1= Colon )? ( ( (lv_simple_2_0= rulesimple_statement ) ) | ( (lv_structured_3_0= rulestructured_statement ) ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:554:1: ( ( ( (lv_label_0_0= rulelabel ) ) otherlv_1= Colon )? ( ( (lv_simple_2_0= rulesimple_statement ) ) | ( (lv_structured_3_0= rulestructured_statement ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:554:2: ( ( (lv_label_0_0= rulelabel ) ) otherlv_1= Colon )? ( ( (lv_simple_2_0= rulesimple_statement ) ) | ( (lv_structured_3_0= rulestructured_statement ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:554:2: ( ( (lv_label_0_0= rulelabel ) ) otherlv_1= Colon )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_INTEGER_NUMBER||LA9_0==RULE_SIGNED_INTEGER_NUMBER) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:554:3: ( (lv_label_0_0= rulelabel ) ) otherlv_1= Colon
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:554:3: ( (lv_label_0_0= rulelabel ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:555:1: (lv_label_0_0= rulelabel )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:555:1: (lv_label_0_0= rulelabel )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:556:3: lv_label_0_0= rulelabel
                    {
                     
                    	        newCompositeNode(grammarAccess.getStatementAccess().getLabelLabelParserRuleCall_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_rulelabel_in_rulestatement1073);
                    lv_label_0_0=rulelabel();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStatementRule());
                    	        }
                           		set(
                           			current, 
                           			"label",
                            		lv_label_0_0, 
                            		"label");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_1=(Token)match(input,Colon,FOLLOW_Colon_in_rulestatement1086); 

                        	newLeafNode(otherlv_1, grammarAccess.getStatementAccess().getColonKeyword_0_1());
                        

                    }
                    break;

            }

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:577:3: ( ( (lv_simple_2_0= rulesimple_statement ) ) | ( (lv_structured_3_0= rulestructured_statement ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==EOF||LA10_0==Until||LA10_0==Else||LA10_0==Goto||LA10_0==End||LA10_0==Semicolon||LA10_0==RULE_ID) ) {
                alt10=1;
            }
            else if ( (LA10_0==Repeat||LA10_0==Begin||(LA10_0>=While && LA10_0<=Case)||LA10_0==With||LA10_0==For||LA10_0==If) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:577:4: ( (lv_simple_2_0= rulesimple_statement ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:577:4: ( (lv_simple_2_0= rulesimple_statement ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:578:1: (lv_simple_2_0= rulesimple_statement )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:578:1: (lv_simple_2_0= rulesimple_statement )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:579:3: lv_simple_2_0= rulesimple_statement
                    {
                     
                    	        newCompositeNode(grammarAccess.getStatementAccess().getSimpleSimple_statementParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_rulesimple_statement_in_rulestatement1109);
                    lv_simple_2_0=rulesimple_statement();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStatementRule());
                    	        }
                           		set(
                           			current, 
                           			"simple",
                            		lv_simple_2_0, 
                            		"simple_statement");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:596:6: ( (lv_structured_3_0= rulestructured_statement ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:596:6: ( (lv_structured_3_0= rulestructured_statement ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:597:1: (lv_structured_3_0= rulestructured_statement )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:597:1: (lv_structured_3_0= rulestructured_statement )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:598:3: lv_structured_3_0= rulestructured_statement
                    {
                     
                    	        newCompositeNode(grammarAccess.getStatementAccess().getStructuredStructured_statementParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_rulestructured_statement_in_rulestatement1136);
                    lv_structured_3_0=rulestructured_statement();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStatementRule());
                    	        }
                           		set(
                           			current, 
                           			"structured",
                            		lv_structured_3_0, 
                            		"structured_statement");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "rulestatement"


    // $ANTLR start "entryRulelabel"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:622:1: entryRulelabel returns [EObject current=null] : iv_rulelabel= rulelabel EOF ;
    public final EObject entryRulelabel() throws RecognitionException {
        EObject current = null;

        EObject iv_rulelabel = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:623:2: (iv_rulelabel= rulelabel EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:624:2: iv_rulelabel= rulelabel EOF
            {
             newCompositeNode(grammarAccess.getLabelRule()); 
            pushFollow(FOLLOW_rulelabel_in_entryRulelabel1172);
            iv_rulelabel=rulelabel();

            state._fsp--;

             current =iv_rulelabel; 
            match(input,EOF,FOLLOW_EOF_in_entryRulelabel1182); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulelabel"


    // $ANTLR start "rulelabel"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:631:1: rulelabel returns [EObject current=null] : ( ( (lv_number_0_0= RULE_SIGNED_INTEGER_NUMBER ) ) | ( (lv_number_1_0= RULE_INTEGER_NUMBER ) ) ) ;
    public final EObject rulelabel() throws RecognitionException {
        EObject current = null;

        Token lv_number_0_0=null;
        Token lv_number_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:634:28: ( ( ( (lv_number_0_0= RULE_SIGNED_INTEGER_NUMBER ) ) | ( (lv_number_1_0= RULE_INTEGER_NUMBER ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:635:1: ( ( (lv_number_0_0= RULE_SIGNED_INTEGER_NUMBER ) ) | ( (lv_number_1_0= RULE_INTEGER_NUMBER ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:635:1: ( ( (lv_number_0_0= RULE_SIGNED_INTEGER_NUMBER ) ) | ( (lv_number_1_0= RULE_INTEGER_NUMBER ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_SIGNED_INTEGER_NUMBER) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_INTEGER_NUMBER) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:635:2: ( (lv_number_0_0= RULE_SIGNED_INTEGER_NUMBER ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:635:2: ( (lv_number_0_0= RULE_SIGNED_INTEGER_NUMBER ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:636:1: (lv_number_0_0= RULE_SIGNED_INTEGER_NUMBER )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:636:1: (lv_number_0_0= RULE_SIGNED_INTEGER_NUMBER )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:637:3: lv_number_0_0= RULE_SIGNED_INTEGER_NUMBER
                    {
                    lv_number_0_0=(Token)match(input,RULE_SIGNED_INTEGER_NUMBER,FOLLOW_RULE_SIGNED_INTEGER_NUMBER_in_rulelabel1224); 

                    			newLeafNode(lv_number_0_0, grammarAccess.getLabelAccess().getNumberSIGNED_INTEGER_NUMBERTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLabelRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"number",
                            		lv_number_0_0, 
                            		"SIGNED_INTEGER_NUMBER");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:654:6: ( (lv_number_1_0= RULE_INTEGER_NUMBER ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:654:6: ( (lv_number_1_0= RULE_INTEGER_NUMBER ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:655:1: (lv_number_1_0= RULE_INTEGER_NUMBER )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:655:1: (lv_number_1_0= RULE_INTEGER_NUMBER )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:656:3: lv_number_1_0= RULE_INTEGER_NUMBER
                    {
                    lv_number_1_0=(Token)match(input,RULE_INTEGER_NUMBER,FOLLOW_RULE_INTEGER_NUMBER_in_rulelabel1252); 

                    			newLeafNode(lv_number_1_0, grammarAccess.getLabelAccess().getNumberINTEGER_NUMBERTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLabelRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"number",
                            		lv_number_1_0, 
                            		"INTEGER_NUMBER");
                    	    

                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "rulelabel"


    // $ANTLR start "entryRulesimple_statement"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:680:1: entryRulesimple_statement returns [EObject current=null] : iv_rulesimple_statement= rulesimple_statement EOF ;
    public final EObject entryRulesimple_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesimple_statement = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:681:2: (iv_rulesimple_statement= rulesimple_statement EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:682:2: iv_rulesimple_statement= rulesimple_statement EOF
            {
             newCompositeNode(grammarAccess.getSimple_statementRule()); 
            pushFollow(FOLLOW_rulesimple_statement_in_entryRulesimple_statement1292);
            iv_rulesimple_statement=rulesimple_statement();

            state._fsp--;

             current =iv_rulesimple_statement; 
            match(input,EOF,FOLLOW_EOF_in_entryRulesimple_statement1302); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulesimple_statement"


    // $ANTLR start "rulesimple_statement"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:689:1: rulesimple_statement returns [EObject current=null] : ( ( (lv_assignment_0_0= ruleassignment_statement ) ) | ( (lv_function_1_0= rulefunction_designator ) ) | ( (lv_goto_2_0= rulegoto_statement ) ) | ( (lv_function_noargs_3_0= RULE_ID ) ) )? ;
    public final EObject rulesimple_statement() throws RecognitionException {
        EObject current = null;

        Token lv_function_noargs_3_0=null;
        EObject lv_assignment_0_0 = null;

        EObject lv_function_1_0 = null;

        EObject lv_goto_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:692:28: ( ( ( (lv_assignment_0_0= ruleassignment_statement ) ) | ( (lv_function_1_0= rulefunction_designator ) ) | ( (lv_goto_2_0= rulegoto_statement ) ) | ( (lv_function_noargs_3_0= RULE_ID ) ) )? )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:693:1: ( ( (lv_assignment_0_0= ruleassignment_statement ) ) | ( (lv_function_1_0= rulefunction_designator ) ) | ( (lv_goto_2_0= rulegoto_statement ) ) | ( (lv_function_noargs_3_0= RULE_ID ) ) )?
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:693:1: ( ( (lv_assignment_0_0= ruleassignment_statement ) ) | ( (lv_function_1_0= rulefunction_designator ) ) | ( (lv_goto_2_0= rulegoto_statement ) ) | ( (lv_function_noargs_3_0= RULE_ID ) ) )?
            int alt12=5;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                    case LeftParenthesis:
                        {
                        alt12=2;
                        }
                        break;
                    case EOF:
                    case Until:
                    case Else:
                    case End:
                    case Semicolon:
                        {
                        alt12=4;
                        }
                        break;
                    case ColonEqualsSign:
                    case FullStop:
                    case LeftSquareBracket:
                    case CircumflexAccent:
                        {
                        alt12=1;
                        }
                        break;
                }

            }
            else if ( (LA12_0==Goto) ) {
                alt12=3;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:693:2: ( (lv_assignment_0_0= ruleassignment_statement ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:693:2: ( (lv_assignment_0_0= ruleassignment_statement ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:694:1: (lv_assignment_0_0= ruleassignment_statement )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:694:1: (lv_assignment_0_0= ruleassignment_statement )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:695:3: lv_assignment_0_0= ruleassignment_statement
                    {
                     
                    	        newCompositeNode(grammarAccess.getSimple_statementAccess().getAssignmentAssignment_statementParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleassignment_statement_in_rulesimple_statement1348);
                    lv_assignment_0_0=ruleassignment_statement();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSimple_statementRule());
                    	        }
                           		set(
                           			current, 
                           			"assignment",
                            		lv_assignment_0_0, 
                            		"assignment_statement");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:712:6: ( (lv_function_1_0= rulefunction_designator ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:712:6: ( (lv_function_1_0= rulefunction_designator ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:713:1: (lv_function_1_0= rulefunction_designator )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:713:1: (lv_function_1_0= rulefunction_designator )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:714:3: lv_function_1_0= rulefunction_designator
                    {
                     
                    	        newCompositeNode(grammarAccess.getSimple_statementAccess().getFunctionFunction_designatorParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_rulefunction_designator_in_rulesimple_statement1375);
                    lv_function_1_0=rulefunction_designator();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSimple_statementRule());
                    	        }
                           		set(
                           			current, 
                           			"function",
                            		lv_function_1_0, 
                            		"function_designator");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:731:6: ( (lv_goto_2_0= rulegoto_statement ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:731:6: ( (lv_goto_2_0= rulegoto_statement ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:732:1: (lv_goto_2_0= rulegoto_statement )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:732:1: (lv_goto_2_0= rulegoto_statement )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:733:3: lv_goto_2_0= rulegoto_statement
                    {
                     
                    	        newCompositeNode(grammarAccess.getSimple_statementAccess().getGotoGoto_statementParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_rulegoto_statement_in_rulesimple_statement1402);
                    lv_goto_2_0=rulegoto_statement();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSimple_statementRule());
                    	        }
                           		set(
                           			current, 
                           			"goto",
                            		lv_goto_2_0, 
                            		"goto_statement");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:750:6: ( (lv_function_noargs_3_0= RULE_ID ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:750:6: ( (lv_function_noargs_3_0= RULE_ID ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:751:1: (lv_function_noargs_3_0= RULE_ID )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:751:1: (lv_function_noargs_3_0= RULE_ID )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:752:3: lv_function_noargs_3_0= RULE_ID
                    {
                    lv_function_noargs_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulesimple_statement1425); 

                    			newLeafNode(lv_function_noargs_3_0, grammarAccess.getSimple_statementAccess().getFunction_noargsIDTerminalRuleCall_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSimple_statementRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"function_noargs",
                            		lv_function_noargs_3_0, 
                            		"ID");
                    	    

                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "rulesimple_statement"


    // $ANTLR start "entryRuleassignment_statement"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:776:1: entryRuleassignment_statement returns [EObject current=null] : iv_ruleassignment_statement= ruleassignment_statement EOF ;
    public final EObject entryRuleassignment_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleassignment_statement = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:777:2: (iv_ruleassignment_statement= ruleassignment_statement EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:778:2: iv_ruleassignment_statement= ruleassignment_statement EOF
            {
             newCompositeNode(grammarAccess.getAssignment_statementRule()); 
            pushFollow(FOLLOW_ruleassignment_statement_in_entryRuleassignment_statement1466);
            iv_ruleassignment_statement=ruleassignment_statement();

            state._fsp--;

             current =iv_ruleassignment_statement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleassignment_statement1476); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleassignment_statement"


    // $ANTLR start "ruleassignment_statement"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:785:1: ruleassignment_statement returns [EObject current=null] : ( ( (lv_variable_0_0= rulevariable ) ) otherlv_1= ColonEqualsSign ( (lv_expression_2_0= ruleexpression ) ) ) ;
    public final EObject ruleassignment_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_variable_0_0 = null;

        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:788:28: ( ( ( (lv_variable_0_0= rulevariable ) ) otherlv_1= ColonEqualsSign ( (lv_expression_2_0= ruleexpression ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:789:1: ( ( (lv_variable_0_0= rulevariable ) ) otherlv_1= ColonEqualsSign ( (lv_expression_2_0= ruleexpression ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:789:1: ( ( (lv_variable_0_0= rulevariable ) ) otherlv_1= ColonEqualsSign ( (lv_expression_2_0= ruleexpression ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:789:2: ( (lv_variable_0_0= rulevariable ) ) otherlv_1= ColonEqualsSign ( (lv_expression_2_0= ruleexpression ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:789:2: ( (lv_variable_0_0= rulevariable ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:790:1: (lv_variable_0_0= rulevariable )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:790:1: (lv_variable_0_0= rulevariable )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:791:3: lv_variable_0_0= rulevariable
            {
             
            	        newCompositeNode(grammarAccess.getAssignment_statementAccess().getVariableVariableParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_rulevariable_in_ruleassignment_statement1522);
            lv_variable_0_0=rulevariable();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAssignment_statementRule());
            	        }
                   		set(
                   			current, 
                   			"variable",
                    		lv_variable_0_0, 
                    		"variable");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,ColonEqualsSign,FOLLOW_ColonEqualsSign_in_ruleassignment_statement1535); 

                	newLeafNode(otherlv_1, grammarAccess.getAssignment_statementAccess().getColonEqualsSignKeyword_1());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:812:1: ( (lv_expression_2_0= ruleexpression ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:813:1: (lv_expression_2_0= ruleexpression )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:813:1: (lv_expression_2_0= ruleexpression )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:814:3: lv_expression_2_0= ruleexpression
            {
             
            	        newCompositeNode(grammarAccess.getAssignment_statementAccess().getExpressionExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleexpression_in_ruleassignment_statement1555);
            lv_expression_2_0=ruleexpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAssignment_statementRule());
            	        }
                   		set(
                   			current, 
                   			"expression",
                    		lv_expression_2_0, 
                    		"expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleassignment_statement"


    // $ANTLR start "entryRulevariable"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:838:1: entryRulevariable returns [EObject current=null] : iv_rulevariable= rulevariable EOF ;
    public final EObject entryRulevariable() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariable = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:839:2: (iv_rulevariable= rulevariable EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:840:2: iv_rulevariable= rulevariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_rulevariable_in_entryRulevariable1590);
            iv_rulevariable=rulevariable();

            state._fsp--;

             current =iv_rulevariable; 
            match(input,EOF,FOLLOW_EOF_in_entryRulevariable1600); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulevariable"


    // $ANTLR start "rulevariable"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:847:1: rulevariable returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_variable_1_0= rulevar_ ) ) ) ;
    public final EObject rulevariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_variable_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:850:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_variable_1_0= rulevar_ ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:851:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_variable_1_0= rulevar_ ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:851:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_variable_1_0= rulevar_ ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:851:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_variable_1_0= rulevar_ ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:851:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:852:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:852:1: (lv_name_0_0= RULE_ID )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:853:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulevariable1642); 

            			newLeafNode(lv_name_0_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getVariableRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:869:2: ( (lv_variable_1_0= rulevar_ ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:870:1: (lv_variable_1_0= rulevar_ )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:870:1: (lv_variable_1_0= rulevar_ )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:871:3: lv_variable_1_0= rulevar_
            {
             
            	        newCompositeNode(grammarAccess.getVariableAccess().getVariableVar_ParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulevar__in_rulevariable1668);
            lv_variable_1_0=rulevar_();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVariableRule());
            	        }
                   		set(
                   			current, 
                   			"variable",
                    		lv_variable_1_0, 
                    		"var_");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "rulevariable"


    // $ANTLR start "entryRulevar_"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:895:1: entryRulevar_ returns [EObject current=null] : iv_rulevar_= rulevar_ EOF ;
    public final EObject entryRulevar_() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevar_ = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:896:2: (iv_rulevar_= rulevar_ EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:897:2: iv_rulevar_= rulevar_ EOF
            {
             newCompositeNode(grammarAccess.getVar_Rule()); 
            pushFollow(FOLLOW_rulevar__in_entryRulevar_1703);
            iv_rulevar_=rulevar_();

            state._fsp--;

             current =iv_rulevar_; 
            match(input,EOF,FOLLOW_EOF_in_entryRulevar_1713); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulevar_"


    // $ANTLR start "rulevar_"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:904:1: rulevar_ returns [EObject current=null] : ( (otherlv_0= LeftSquareBracket ( (lv_expressions_1_0= ruleexpression_list ) ) otherlv_2= RightSquareBracket ( (lv_array_3_0= rulevar_ ) ) ) | ( ( (lv_accessor_4_0= FullStop ) ) ( (lv_name_5_0= RULE_ID ) ) ( (lv_variable_6_0= rulevar_ ) ) ) | (otherlv_7= CircumflexAccent ( (lv_pointer_8_0= rulevar_ ) ) ) )? ;
    public final EObject rulevar_() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_accessor_4_0=null;
        Token lv_name_5_0=null;
        Token otherlv_7=null;
        EObject lv_expressions_1_0 = null;

        EObject lv_array_3_0 = null;

        EObject lv_variable_6_0 = null;

        EObject lv_pointer_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:907:28: ( ( (otherlv_0= LeftSquareBracket ( (lv_expressions_1_0= ruleexpression_list ) ) otherlv_2= RightSquareBracket ( (lv_array_3_0= rulevar_ ) ) ) | ( ( (lv_accessor_4_0= FullStop ) ) ( (lv_name_5_0= RULE_ID ) ) ( (lv_variable_6_0= rulevar_ ) ) ) | (otherlv_7= CircumflexAccent ( (lv_pointer_8_0= rulevar_ ) ) ) )? )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:908:1: ( (otherlv_0= LeftSquareBracket ( (lv_expressions_1_0= ruleexpression_list ) ) otherlv_2= RightSquareBracket ( (lv_array_3_0= rulevar_ ) ) ) | ( ( (lv_accessor_4_0= FullStop ) ) ( (lv_name_5_0= RULE_ID ) ) ( (lv_variable_6_0= rulevar_ ) ) ) | (otherlv_7= CircumflexAccent ( (lv_pointer_8_0= rulevar_ ) ) ) )?
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:908:1: ( (otherlv_0= LeftSquareBracket ( (lv_expressions_1_0= ruleexpression_list ) ) otherlv_2= RightSquareBracket ( (lv_array_3_0= rulevar_ ) ) ) | ( ( (lv_accessor_4_0= FullStop ) ) ( (lv_name_5_0= RULE_ID ) ) ( (lv_variable_6_0= rulevar_ ) ) ) | (otherlv_7= CircumflexAccent ( (lv_pointer_8_0= rulevar_ ) ) ) )?
            int alt13=4;
            switch ( input.LA(1) ) {
                case LeftSquareBracket:
                    {
                    alt13=1;
                    }
                    break;
                case FullStop:
                    {
                    alt13=2;
                    }
                    break;
                case CircumflexAccent:
                    {
                    alt13=3;
                    }
                    break;
            }

            switch (alt13) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:908:2: (otherlv_0= LeftSquareBracket ( (lv_expressions_1_0= ruleexpression_list ) ) otherlv_2= RightSquareBracket ( (lv_array_3_0= rulevar_ ) ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:908:2: (otherlv_0= LeftSquareBracket ( (lv_expressions_1_0= ruleexpression_list ) ) otherlv_2= RightSquareBracket ( (lv_array_3_0= rulevar_ ) ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:909:2: otherlv_0= LeftSquareBracket ( (lv_expressions_1_0= ruleexpression_list ) ) otherlv_2= RightSquareBracket ( (lv_array_3_0= rulevar_ ) )
                    {
                    otherlv_0=(Token)match(input,LeftSquareBracket,FOLLOW_LeftSquareBracket_in_rulevar_1752); 

                        	newLeafNode(otherlv_0, grammarAccess.getVar_Access().getLeftSquareBracketKeyword_0_0());
                        
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:913:1: ( (lv_expressions_1_0= ruleexpression_list ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:914:1: (lv_expressions_1_0= ruleexpression_list )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:914:1: (lv_expressions_1_0= ruleexpression_list )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:915:3: lv_expressions_1_0= ruleexpression_list
                    {
                     
                    	        newCompositeNode(grammarAccess.getVar_Access().getExpressionsExpression_listParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleexpression_list_in_rulevar_1772);
                    lv_expressions_1_0=ruleexpression_list();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVar_Rule());
                    	        }
                           		set(
                           			current, 
                           			"expressions",
                            		lv_expressions_1_0, 
                            		"expression_list");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_2=(Token)match(input,RightSquareBracket,FOLLOW_RightSquareBracket_in_rulevar_1785); 

                        	newLeafNode(otherlv_2, grammarAccess.getVar_Access().getRightSquareBracketKeyword_0_2());
                        
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:936:1: ( (lv_array_3_0= rulevar_ ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:937:1: (lv_array_3_0= rulevar_ )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:937:1: (lv_array_3_0= rulevar_ )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:938:3: lv_array_3_0= rulevar_
                    {
                     
                    	        newCompositeNode(grammarAccess.getVar_Access().getArrayVar_ParserRuleCall_0_3_0()); 
                    	    
                    pushFollow(FOLLOW_rulevar__in_rulevar_1805);
                    lv_array_3_0=rulevar_();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVar_Rule());
                    	        }
                           		set(
                           			current, 
                           			"array",
                            		lv_array_3_0, 
                            		"var_");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:955:6: ( ( (lv_accessor_4_0= FullStop ) ) ( (lv_name_5_0= RULE_ID ) ) ( (lv_variable_6_0= rulevar_ ) ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:955:6: ( ( (lv_accessor_4_0= FullStop ) ) ( (lv_name_5_0= RULE_ID ) ) ( (lv_variable_6_0= rulevar_ ) ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:955:7: ( (lv_accessor_4_0= FullStop ) ) ( (lv_name_5_0= RULE_ID ) ) ( (lv_variable_6_0= rulevar_ ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:955:7: ( (lv_accessor_4_0= FullStop ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:956:1: (lv_accessor_4_0= FullStop )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:956:1: (lv_accessor_4_0= FullStop )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:957:3: lv_accessor_4_0= FullStop
                    {
                    lv_accessor_4_0=(Token)match(input,FullStop,FOLLOW_FullStop_in_rulevar_1832); 

                            newLeafNode(lv_accessor_4_0, grammarAccess.getVar_Access().getAccessorFullStopKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getVar_Rule());
                    	        }
                           		setWithLastConsumed(current, "accessor", true, ".");
                    	    

                    }


                    }

                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:971:2: ( (lv_name_5_0= RULE_ID ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:972:1: (lv_name_5_0= RULE_ID )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:972:1: (lv_name_5_0= RULE_ID )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:973:3: lv_name_5_0= RULE_ID
                    {
                    lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulevar_1860); 

                    			newLeafNode(lv_name_5_0, grammarAccess.getVar_Access().getNameIDTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getVar_Rule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_5_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:989:2: ( (lv_variable_6_0= rulevar_ ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:990:1: (lv_variable_6_0= rulevar_ )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:990:1: (lv_variable_6_0= rulevar_ )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:991:3: lv_variable_6_0= rulevar_
                    {
                     
                    	        newCompositeNode(grammarAccess.getVar_Access().getVariableVar_ParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_rulevar__in_rulevar_1886);
                    lv_variable_6_0=rulevar_();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVar_Rule());
                    	        }
                           		set(
                           			current, 
                           			"variable",
                            		lv_variable_6_0, 
                            		"var_");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1008:6: (otherlv_7= CircumflexAccent ( (lv_pointer_8_0= rulevar_ ) ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1008:6: (otherlv_7= CircumflexAccent ( (lv_pointer_8_0= rulevar_ ) ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1009:2: otherlv_7= CircumflexAccent ( (lv_pointer_8_0= rulevar_ ) )
                    {
                    otherlv_7=(Token)match(input,CircumflexAccent,FOLLOW_CircumflexAccent_in_rulevar_1907); 

                        	newLeafNode(otherlv_7, grammarAccess.getVar_Access().getCircumflexAccentKeyword_2_0());
                        
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1013:1: ( (lv_pointer_8_0= rulevar_ ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1014:1: (lv_pointer_8_0= rulevar_ )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1014:1: (lv_pointer_8_0= rulevar_ )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1015:3: lv_pointer_8_0= rulevar_
                    {
                     
                    	        newCompositeNode(grammarAccess.getVar_Access().getPointerVar_ParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_rulevar__in_rulevar_1927);
                    lv_pointer_8_0=rulevar_();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVar_Rule());
                    	        }
                           		set(
                           			current, 
                           			"pointer",
                            		lv_pointer_8_0, 
                            		"var_");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "rulevar_"


    // $ANTLR start "entryRuleexpression_list"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1039:1: entryRuleexpression_list returns [EObject current=null] : iv_ruleexpression_list= ruleexpression_list EOF ;
    public final EObject entryRuleexpression_list() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleexpression_list = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1040:2: (iv_ruleexpression_list= ruleexpression_list EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1041:2: iv_ruleexpression_list= ruleexpression_list EOF
            {
             newCompositeNode(grammarAccess.getExpression_listRule()); 
            pushFollow(FOLLOW_ruleexpression_list_in_entryRuleexpression_list1964);
            iv_ruleexpression_list=ruleexpression_list();

            state._fsp--;

             current =iv_ruleexpression_list; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleexpression_list1974); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleexpression_list"


    // $ANTLR start "ruleexpression_list"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1048:1: ruleexpression_list returns [EObject current=null] : ( ( (lv_expressions_0_0= ruleexpression ) ) (otherlv_1= Comma ( (lv_expressions_2_0= ruleexpression ) ) )* ) ;
    public final EObject ruleexpression_list() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expressions_0_0 = null;

        EObject lv_expressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1051:28: ( ( ( (lv_expressions_0_0= ruleexpression ) ) (otherlv_1= Comma ( (lv_expressions_2_0= ruleexpression ) ) )* ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1052:1: ( ( (lv_expressions_0_0= ruleexpression ) ) (otherlv_1= Comma ( (lv_expressions_2_0= ruleexpression ) ) )* )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1052:1: ( ( (lv_expressions_0_0= ruleexpression ) ) (otherlv_1= Comma ( (lv_expressions_2_0= ruleexpression ) ) )* )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1052:2: ( (lv_expressions_0_0= ruleexpression ) ) (otherlv_1= Comma ( (lv_expressions_2_0= ruleexpression ) ) )*
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1052:2: ( (lv_expressions_0_0= ruleexpression ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1053:1: (lv_expressions_0_0= ruleexpression )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1053:1: (lv_expressions_0_0= ruleexpression )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1054:3: lv_expressions_0_0= ruleexpression
            {
             
            	        newCompositeNode(grammarAccess.getExpression_listAccess().getExpressionsExpressionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleexpression_in_ruleexpression_list2020);
            lv_expressions_0_0=ruleexpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExpression_listRule());
            	        }
                   		add(
                   			current, 
                   			"expressions",
                    		lv_expressions_0_0, 
                    		"expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1070:2: (otherlv_1= Comma ( (lv_expressions_2_0= ruleexpression ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==Comma) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1071:2: otherlv_1= Comma ( (lv_expressions_2_0= ruleexpression ) )
            	    {
            	    otherlv_1=(Token)match(input,Comma,FOLLOW_Comma_in_ruleexpression_list2034); 

            	        	newLeafNode(otherlv_1, grammarAccess.getExpression_listAccess().getCommaKeyword_1_0());
            	        
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1075:1: ( (lv_expressions_2_0= ruleexpression ) )
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1076:1: (lv_expressions_2_0= ruleexpression )
            	    {
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1076:1: (lv_expressions_2_0= ruleexpression )
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1077:3: lv_expressions_2_0= ruleexpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExpression_listAccess().getExpressionsExpressionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleexpression_in_ruleexpression_list2054);
            	    lv_expressions_2_0=ruleexpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getExpression_listRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"expressions",
            	            		lv_expressions_2_0, 
            	            		"expression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleexpression_list"


    // $ANTLR start "entryRuleexpression"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1101:1: entryRuleexpression returns [EObject current=null] : iv_ruleexpression= ruleexpression EOF ;
    public final EObject entryRuleexpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleexpression = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1102:2: (iv_ruleexpression= ruleexpression EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1103:2: iv_ruleexpression= ruleexpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleexpression_in_entryRuleexpression2091);
            iv_ruleexpression=ruleexpression();

            state._fsp--;

             current =iv_ruleexpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleexpression2101); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleexpression"


    // $ANTLR start "ruleexpression"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1110:1: ruleexpression returns [EObject current=null] : ( ( (lv_expressions_0_0= rulesimple_expression ) ) ( ( ( (lv_operator_1_0= RULE_RELATIONAL_OPERATOR ) ) | ( (lv_operator_2_0= In ) ) | ( (lv_operator_3_0= EqualsSign ) ) ) ( (lv_expressions_4_0= rulesimple_expression ) ) )? ) ;
    public final EObject ruleexpression() throws RecognitionException {
        EObject current = null;

        Token lv_operator_1_0=null;
        Token lv_operator_2_0=null;
        Token lv_operator_3_0=null;
        EObject lv_expressions_0_0 = null;

        EObject lv_expressions_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1113:28: ( ( ( (lv_expressions_0_0= rulesimple_expression ) ) ( ( ( (lv_operator_1_0= RULE_RELATIONAL_OPERATOR ) ) | ( (lv_operator_2_0= In ) ) | ( (lv_operator_3_0= EqualsSign ) ) ) ( (lv_expressions_4_0= rulesimple_expression ) ) )? ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1114:1: ( ( (lv_expressions_0_0= rulesimple_expression ) ) ( ( ( (lv_operator_1_0= RULE_RELATIONAL_OPERATOR ) ) | ( (lv_operator_2_0= In ) ) | ( (lv_operator_3_0= EqualsSign ) ) ) ( (lv_expressions_4_0= rulesimple_expression ) ) )? )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1114:1: ( ( (lv_expressions_0_0= rulesimple_expression ) ) ( ( ( (lv_operator_1_0= RULE_RELATIONAL_OPERATOR ) ) | ( (lv_operator_2_0= In ) ) | ( (lv_operator_3_0= EqualsSign ) ) ) ( (lv_expressions_4_0= rulesimple_expression ) ) )? )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1114:2: ( (lv_expressions_0_0= rulesimple_expression ) ) ( ( ( (lv_operator_1_0= RULE_RELATIONAL_OPERATOR ) ) | ( (lv_operator_2_0= In ) ) | ( (lv_operator_3_0= EqualsSign ) ) ) ( (lv_expressions_4_0= rulesimple_expression ) ) )?
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1114:2: ( (lv_expressions_0_0= rulesimple_expression ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1115:1: (lv_expressions_0_0= rulesimple_expression )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1115:1: (lv_expressions_0_0= rulesimple_expression )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1116:3: lv_expressions_0_0= rulesimple_expression
            {
             
            	        newCompositeNode(grammarAccess.getExpressionAccess().getExpressionsSimple_expressionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_rulesimple_expression_in_ruleexpression2147);
            lv_expressions_0_0=rulesimple_expression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExpressionRule());
            	        }
                   		add(
                   			current, 
                   			"expressions",
                    		lv_expressions_0_0, 
                    		"simple_expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1132:2: ( ( ( (lv_operator_1_0= RULE_RELATIONAL_OPERATOR ) ) | ( (lv_operator_2_0= In ) ) | ( (lv_operator_3_0= EqualsSign ) ) ) ( (lv_expressions_4_0= rulesimple_expression ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==In||LA16_0==EqualsSign||LA16_0==RULE_RELATIONAL_OPERATOR) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1132:3: ( ( (lv_operator_1_0= RULE_RELATIONAL_OPERATOR ) ) | ( (lv_operator_2_0= In ) ) | ( (lv_operator_3_0= EqualsSign ) ) ) ( (lv_expressions_4_0= rulesimple_expression ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1132:3: ( ( (lv_operator_1_0= RULE_RELATIONAL_OPERATOR ) ) | ( (lv_operator_2_0= In ) ) | ( (lv_operator_3_0= EqualsSign ) ) )
                    int alt15=3;
                    switch ( input.LA(1) ) {
                    case RULE_RELATIONAL_OPERATOR:
                        {
                        alt15=1;
                        }
                        break;
                    case In:
                        {
                        alt15=2;
                        }
                        break;
                    case EqualsSign:
                        {
                        alt15=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 15, 0, input);

                        throw nvae;
                    }

                    switch (alt15) {
                        case 1 :
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1132:4: ( (lv_operator_1_0= RULE_RELATIONAL_OPERATOR ) )
                            {
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1132:4: ( (lv_operator_1_0= RULE_RELATIONAL_OPERATOR ) )
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1133:1: (lv_operator_1_0= RULE_RELATIONAL_OPERATOR )
                            {
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1133:1: (lv_operator_1_0= RULE_RELATIONAL_OPERATOR )
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1134:3: lv_operator_1_0= RULE_RELATIONAL_OPERATOR
                            {
                            lv_operator_1_0=(Token)match(input,RULE_RELATIONAL_OPERATOR,FOLLOW_RULE_RELATIONAL_OPERATOR_in_ruleexpression2166); 

                            			newLeafNode(lv_operator_1_0, grammarAccess.getExpressionAccess().getOperatorRELATIONAL_OPERATORTerminalRuleCall_1_0_0_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getExpressionRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"operator",
                                    		lv_operator_1_0, 
                                    		"RELATIONAL_OPERATOR");
                            	    

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1151:6: ( (lv_operator_2_0= In ) )
                            {
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1151:6: ( (lv_operator_2_0= In ) )
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1152:1: (lv_operator_2_0= In )
                            {
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1152:1: (lv_operator_2_0= In )
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1153:3: lv_operator_2_0= In
                            {
                            lv_operator_2_0=(Token)match(input,In,FOLLOW_In_in_ruleexpression2196); 

                                    newLeafNode(lv_operator_2_0, grammarAccess.getExpressionAccess().getOperatorInKeyword_1_0_1_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getExpressionRule());
                            	        }
                                   		setWithLastConsumed(current, "operator", lv_operator_2_0, "in");
                            	    

                            }


                            }


                            }
                            break;
                        case 3 :
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1168:6: ( (lv_operator_3_0= EqualsSign ) )
                            {
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1168:6: ( (lv_operator_3_0= EqualsSign ) )
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1169:1: (lv_operator_3_0= EqualsSign )
                            {
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1169:1: (lv_operator_3_0= EqualsSign )
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1170:3: lv_operator_3_0= EqualsSign
                            {
                            lv_operator_3_0=(Token)match(input,EqualsSign,FOLLOW_EqualsSign_in_ruleexpression2232); 

                                    newLeafNode(lv_operator_3_0, grammarAccess.getExpressionAccess().getOperatorEqualsSignKeyword_1_0_2_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getExpressionRule());
                            	        }
                                   		setWithLastConsumed(current, "operator", lv_operator_3_0, "=");
                            	    

                            }


                            }


                            }
                            break;

                    }

                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1184:3: ( (lv_expressions_4_0= rulesimple_expression ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1185:1: (lv_expressions_4_0= rulesimple_expression )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1185:1: (lv_expressions_4_0= rulesimple_expression )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1186:3: lv_expressions_4_0= rulesimple_expression
                    {
                     
                    	        newCompositeNode(grammarAccess.getExpressionAccess().getExpressionsSimple_expressionParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_rulesimple_expression_in_ruleexpression2265);
                    lv_expressions_4_0=rulesimple_expression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                    	        }
                           		add(
                           			current, 
                           			"expressions",
                            		lv_expressions_4_0, 
                            		"simple_expression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleexpression"


    // $ANTLR start "entryRulesimple_expression"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1210:1: entryRulesimple_expression returns [EObject current=null] : iv_rulesimple_expression= rulesimple_expression EOF ;
    public final EObject entryRulesimple_expression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesimple_expression = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        	
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1214:2: (iv_rulesimple_expression= rulesimple_expression EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1215:2: iv_rulesimple_expression= rulesimple_expression EOF
            {
             newCompositeNode(grammarAccess.getSimple_expressionRule()); 
            pushFollow(FOLLOW_rulesimple_expression_in_entryRulesimple_expression2308);
            iv_rulesimple_expression=rulesimple_expression();

            state._fsp--;

             current =iv_rulesimple_expression; 
            match(input,EOF,FOLLOW_EOF_in_entryRulesimple_expression2318); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRulesimple_expression"


    // $ANTLR start "rulesimple_expression"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1225:1: rulesimple_expression returns [EObject current=null] : ( ( (lv_operators_0_0= RULE_ADDITION_OPERATOR ) )? ( (lv_terms_1_0= ruleterm ) ) ( ( ( ( (lv_operators_2_0= RULE_ADDITION_OPERATOR ) )+ | ( (lv_operators_3_0= Or ) ) ) ( (lv_terms_4_0= ruleterm ) ) ) | ( (lv_numbers_5_0= rulesigned_number ) ) )* ) ;
    public final EObject rulesimple_expression() throws RecognitionException {
        EObject current = null;

        Token lv_operators_0_0=null;
        Token lv_operators_2_0=null;
        Token lv_operators_3_0=null;
        EObject lv_terms_1_0 = null;

        EObject lv_terms_4_0 = null;

        EObject lv_numbers_5_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1229:28: ( ( ( (lv_operators_0_0= RULE_ADDITION_OPERATOR ) )? ( (lv_terms_1_0= ruleterm ) ) ( ( ( ( (lv_operators_2_0= RULE_ADDITION_OPERATOR ) )+ | ( (lv_operators_3_0= Or ) ) ) ( (lv_terms_4_0= ruleterm ) ) ) | ( (lv_numbers_5_0= rulesigned_number ) ) )* ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1230:1: ( ( (lv_operators_0_0= RULE_ADDITION_OPERATOR ) )? ( (lv_terms_1_0= ruleterm ) ) ( ( ( ( (lv_operators_2_0= RULE_ADDITION_OPERATOR ) )+ | ( (lv_operators_3_0= Or ) ) ) ( (lv_terms_4_0= ruleterm ) ) ) | ( (lv_numbers_5_0= rulesigned_number ) ) )* )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1230:1: ( ( (lv_operators_0_0= RULE_ADDITION_OPERATOR ) )? ( (lv_terms_1_0= ruleterm ) ) ( ( ( ( (lv_operators_2_0= RULE_ADDITION_OPERATOR ) )+ | ( (lv_operators_3_0= Or ) ) ) ( (lv_terms_4_0= ruleterm ) ) ) | ( (lv_numbers_5_0= rulesigned_number ) ) )* )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1230:2: ( (lv_operators_0_0= RULE_ADDITION_OPERATOR ) )? ( (lv_terms_1_0= ruleterm ) ) ( ( ( ( (lv_operators_2_0= RULE_ADDITION_OPERATOR ) )+ | ( (lv_operators_3_0= Or ) ) ) ( (lv_terms_4_0= ruleterm ) ) ) | ( (lv_numbers_5_0= rulesigned_number ) ) )*
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1230:2: ( (lv_operators_0_0= RULE_ADDITION_OPERATOR ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ADDITION_OPERATOR) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1231:1: (lv_operators_0_0= RULE_ADDITION_OPERATOR )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1231:1: (lv_operators_0_0= RULE_ADDITION_OPERATOR )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1232:3: lv_operators_0_0= RULE_ADDITION_OPERATOR
                    {
                    lv_operators_0_0=(Token)match(input,RULE_ADDITION_OPERATOR,FOLLOW_RULE_ADDITION_OPERATOR_in_rulesimple_expression2364); 

                    			newLeafNode(lv_operators_0_0, grammarAccess.getSimple_expressionAccess().getOperatorsADDITION_OPERATORTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSimple_expressionRule());
                    	        }
                           		addWithLastConsumed(
                           			current, 
                           			"operators",
                            		lv_operators_0_0, 
                            		"ADDITION_OPERATOR");
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1248:3: ( (lv_terms_1_0= ruleterm ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1249:1: (lv_terms_1_0= ruleterm )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1249:1: (lv_terms_1_0= ruleterm )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1250:3: lv_terms_1_0= ruleterm
            {
             
            	        newCompositeNode(grammarAccess.getSimple_expressionAccess().getTermsTermParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleterm_in_rulesimple_expression2391);
            lv_terms_1_0=ruleterm();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSimple_expressionRule());
            	        }
                   		add(
                   			current, 
                   			"terms",
                    		lv_terms_1_0, 
                    		"term");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1266:2: ( ( ( ( (lv_operators_2_0= RULE_ADDITION_OPERATOR ) )+ | ( (lv_operators_3_0= Or ) ) ) ( (lv_terms_4_0= ruleterm ) ) ) | ( (lv_numbers_5_0= rulesigned_number ) ) )*
            loop20:
            do {
                int alt20=3;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==Or||LA20_0==RULE_ADDITION_OPERATOR) ) {
                    alt20=1;
                }
                else if ( ((LA20_0>=RULE_SIGNED_INTEGER_NUMBER && LA20_0<=RULE_SIGNED_REAL_NUMBER)) ) {
                    alt20=2;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1266:3: ( ( ( (lv_operators_2_0= RULE_ADDITION_OPERATOR ) )+ | ( (lv_operators_3_0= Or ) ) ) ( (lv_terms_4_0= ruleterm ) ) )
            	    {
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1266:3: ( ( ( (lv_operators_2_0= RULE_ADDITION_OPERATOR ) )+ | ( (lv_operators_3_0= Or ) ) ) ( (lv_terms_4_0= ruleterm ) ) )
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1266:4: ( ( (lv_operators_2_0= RULE_ADDITION_OPERATOR ) )+ | ( (lv_operators_3_0= Or ) ) ) ( (lv_terms_4_0= ruleterm ) )
            	    {
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1266:4: ( ( (lv_operators_2_0= RULE_ADDITION_OPERATOR ) )+ | ( (lv_operators_3_0= Or ) ) )
            	    int alt19=2;
            	    int LA19_0 = input.LA(1);

            	    if ( (LA19_0==RULE_ADDITION_OPERATOR) ) {
            	        alt19=1;
            	    }
            	    else if ( (LA19_0==Or) ) {
            	        alt19=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 19, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt19) {
            	        case 1 :
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1266:5: ( (lv_operators_2_0= RULE_ADDITION_OPERATOR ) )+
            	            {
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1266:5: ( (lv_operators_2_0= RULE_ADDITION_OPERATOR ) )+
            	            int cnt18=0;
            	            loop18:
            	            do {
            	                int alt18=2;
            	                int LA18_0 = input.LA(1);

            	                if ( (LA18_0==RULE_ADDITION_OPERATOR) ) {
            	                    alt18=1;
            	                }


            	                switch (alt18) {
            	            	case 1 :
            	            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1267:1: (lv_operators_2_0= RULE_ADDITION_OPERATOR )
            	            	    {
            	            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1267:1: (lv_operators_2_0= RULE_ADDITION_OPERATOR )
            	            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1268:3: lv_operators_2_0= RULE_ADDITION_OPERATOR
            	            	    {
            	            	    lv_operators_2_0=(Token)match(input,RULE_ADDITION_OPERATOR,FOLLOW_RULE_ADDITION_OPERATOR_in_rulesimple_expression2411); 

            	            	    			newLeafNode(lv_operators_2_0, grammarAccess.getSimple_expressionAccess().getOperatorsADDITION_OPERATORTerminalRuleCall_2_0_0_0_0()); 
            	            	    		

            	            	    	        if (current==null) {
            	            	    	            current = createModelElement(grammarAccess.getSimple_expressionRule());
            	            	    	        }
            	            	           		addWithLastConsumed(
            	            	           			current, 
            	            	           			"operators",
            	            	            		lv_operators_2_0, 
            	            	            		"ADDITION_OPERATOR");
            	            	    	    

            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    if ( cnt18 >= 1 ) break loop18;
            	                        EarlyExitException eee =
            	                            new EarlyExitException(18, input);
            	                        throw eee;
            	                }
            	                cnt18++;
            	            } while (true);


            	            }
            	            break;
            	        case 2 :
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1285:6: ( (lv_operators_3_0= Or ) )
            	            {
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1285:6: ( (lv_operators_3_0= Or ) )
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1286:1: (lv_operators_3_0= Or )
            	            {
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1286:1: (lv_operators_3_0= Or )
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1287:3: lv_operators_3_0= Or
            	            {
            	            lv_operators_3_0=(Token)match(input,Or,FOLLOW_Or_in_rulesimple_expression2442); 

            	                    newLeafNode(lv_operators_3_0, grammarAccess.getSimple_expressionAccess().getOperatorsOrKeyword_2_0_0_1_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getSimple_expressionRule());
            	            	        }
            	                   		addWithLastConsumed(current, "operators", lv_operators_3_0, "or");
            	            	    

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1301:3: ( (lv_terms_4_0= ruleterm ) )
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1302:1: (lv_terms_4_0= ruleterm )
            	    {
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1302:1: (lv_terms_4_0= ruleterm )
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1303:3: lv_terms_4_0= ruleterm
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSimple_expressionAccess().getTermsTermParserRuleCall_2_0_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleterm_in_rulesimple_expression2475);
            	    lv_terms_4_0=ruleterm();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSimple_expressionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"terms",
            	            		lv_terms_4_0, 
            	            		"term");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1320:6: ( (lv_numbers_5_0= rulesigned_number ) )
            	    {
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1320:6: ( (lv_numbers_5_0= rulesigned_number ) )
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1321:1: (lv_numbers_5_0= rulesigned_number )
            	    {
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1321:1: (lv_numbers_5_0= rulesigned_number )
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1322:3: lv_numbers_5_0= rulesigned_number
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSimple_expressionAccess().getNumbersSigned_numberParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulesigned_number_in_rulesimple_expression2503);
            	    lv_numbers_5_0=rulesigned_number();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSimple_expressionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"numbers",
            	            		lv_numbers_5_0, 
            	            		"signed_number");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "rulesimple_expression"


    // $ANTLR start "entryRuleterm"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1349:1: entryRuleterm returns [EObject current=null] : iv_ruleterm= ruleterm EOF ;
    public final EObject entryRuleterm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleterm = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        	
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1353:2: (iv_ruleterm= ruleterm EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1354:2: iv_ruleterm= ruleterm EOF
            {
             newCompositeNode(grammarAccess.getTermRule()); 
            pushFollow(FOLLOW_ruleterm_in_entryRuleterm2550);
            iv_ruleterm=ruleterm();

            state._fsp--;

             current =iv_ruleterm; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleterm2560); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleterm"


    // $ANTLR start "ruleterm"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1364:1: ruleterm returns [EObject current=null] : ( ( (lv_factors_0_0= rulefactor ) ) ( ( ( (lv_operators_1_0= RULE_MULTIPLICATION_OPERATOR ) ) | ( (lv_operators_2_0= Div ) ) | ( (lv_operators_3_0= Mod ) ) | ( (lv_operators_4_0= And ) ) ) ( (lv_factors_5_0= rulefactor ) ) )* ) ;
    public final EObject ruleterm() throws RecognitionException {
        EObject current = null;

        Token lv_operators_1_0=null;
        Token lv_operators_2_0=null;
        Token lv_operators_3_0=null;
        Token lv_operators_4_0=null;
        EObject lv_factors_0_0 = null;

        EObject lv_factors_5_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1368:28: ( ( ( (lv_factors_0_0= rulefactor ) ) ( ( ( (lv_operators_1_0= RULE_MULTIPLICATION_OPERATOR ) ) | ( (lv_operators_2_0= Div ) ) | ( (lv_operators_3_0= Mod ) ) | ( (lv_operators_4_0= And ) ) ) ( (lv_factors_5_0= rulefactor ) ) )* ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1369:1: ( ( (lv_factors_0_0= rulefactor ) ) ( ( ( (lv_operators_1_0= RULE_MULTIPLICATION_OPERATOR ) ) | ( (lv_operators_2_0= Div ) ) | ( (lv_operators_3_0= Mod ) ) | ( (lv_operators_4_0= And ) ) ) ( (lv_factors_5_0= rulefactor ) ) )* )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1369:1: ( ( (lv_factors_0_0= rulefactor ) ) ( ( ( (lv_operators_1_0= RULE_MULTIPLICATION_OPERATOR ) ) | ( (lv_operators_2_0= Div ) ) | ( (lv_operators_3_0= Mod ) ) | ( (lv_operators_4_0= And ) ) ) ( (lv_factors_5_0= rulefactor ) ) )* )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1369:2: ( (lv_factors_0_0= rulefactor ) ) ( ( ( (lv_operators_1_0= RULE_MULTIPLICATION_OPERATOR ) ) | ( (lv_operators_2_0= Div ) ) | ( (lv_operators_3_0= Mod ) ) | ( (lv_operators_4_0= And ) ) ) ( (lv_factors_5_0= rulefactor ) ) )*
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1369:2: ( (lv_factors_0_0= rulefactor ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1370:1: (lv_factors_0_0= rulefactor )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1370:1: (lv_factors_0_0= rulefactor )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1371:3: lv_factors_0_0= rulefactor
            {
             
            	        newCompositeNode(grammarAccess.getTermAccess().getFactorsFactorParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_rulefactor_in_ruleterm2610);
            lv_factors_0_0=rulefactor();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTermRule());
            	        }
                   		add(
                   			current, 
                   			"factors",
                    		lv_factors_0_0, 
                    		"factor");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1387:2: ( ( ( (lv_operators_1_0= RULE_MULTIPLICATION_OPERATOR ) ) | ( (lv_operators_2_0= Div ) ) | ( (lv_operators_3_0= Mod ) ) | ( (lv_operators_4_0= And ) ) ) ( (lv_factors_5_0= rulefactor ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=And && LA22_0<=Div)||LA22_0==Mod||LA22_0==RULE_MULTIPLICATION_OPERATOR) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1387:3: ( ( (lv_operators_1_0= RULE_MULTIPLICATION_OPERATOR ) ) | ( (lv_operators_2_0= Div ) ) | ( (lv_operators_3_0= Mod ) ) | ( (lv_operators_4_0= And ) ) ) ( (lv_factors_5_0= rulefactor ) )
            	    {
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1387:3: ( ( (lv_operators_1_0= RULE_MULTIPLICATION_OPERATOR ) ) | ( (lv_operators_2_0= Div ) ) | ( (lv_operators_3_0= Mod ) ) | ( (lv_operators_4_0= And ) ) )
            	    int alt21=4;
            	    switch ( input.LA(1) ) {
            	    case RULE_MULTIPLICATION_OPERATOR:
            	        {
            	        alt21=1;
            	        }
            	        break;
            	    case Div:
            	        {
            	        alt21=2;
            	        }
            	        break;
            	    case Mod:
            	        {
            	        alt21=3;
            	        }
            	        break;
            	    case And:
            	        {
            	        alt21=4;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 21, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt21) {
            	        case 1 :
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1387:4: ( (lv_operators_1_0= RULE_MULTIPLICATION_OPERATOR ) )
            	            {
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1387:4: ( (lv_operators_1_0= RULE_MULTIPLICATION_OPERATOR ) )
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1388:1: (lv_operators_1_0= RULE_MULTIPLICATION_OPERATOR )
            	            {
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1388:1: (lv_operators_1_0= RULE_MULTIPLICATION_OPERATOR )
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1389:3: lv_operators_1_0= RULE_MULTIPLICATION_OPERATOR
            	            {
            	            lv_operators_1_0=(Token)match(input,RULE_MULTIPLICATION_OPERATOR,FOLLOW_RULE_MULTIPLICATION_OPERATOR_in_ruleterm2629); 

            	            			newLeafNode(lv_operators_1_0, grammarAccess.getTermAccess().getOperatorsMULTIPLICATION_OPERATORTerminalRuleCall_1_0_0_0()); 
            	            		

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getTermRule());
            	            	        }
            	                   		addWithLastConsumed(
            	                   			current, 
            	                   			"operators",
            	                    		lv_operators_1_0, 
            	                    		"MULTIPLICATION_OPERATOR");
            	            	    

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1406:6: ( (lv_operators_2_0= Div ) )
            	            {
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1406:6: ( (lv_operators_2_0= Div ) )
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1407:1: (lv_operators_2_0= Div )
            	            {
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1407:1: (lv_operators_2_0= Div )
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1408:3: lv_operators_2_0= Div
            	            {
            	            lv_operators_2_0=(Token)match(input,Div,FOLLOW_Div_in_ruleterm2659); 

            	                    newLeafNode(lv_operators_2_0, grammarAccess.getTermAccess().getOperatorsDivKeyword_1_0_1_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getTermRule());
            	            	        }
            	                   		addWithLastConsumed(current, "operators", lv_operators_2_0, "div");
            	            	    

            	            }


            	            }


            	            }
            	            break;
            	        case 3 :
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1423:6: ( (lv_operators_3_0= Mod ) )
            	            {
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1423:6: ( (lv_operators_3_0= Mod ) )
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1424:1: (lv_operators_3_0= Mod )
            	            {
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1424:1: (lv_operators_3_0= Mod )
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1425:3: lv_operators_3_0= Mod
            	            {
            	            lv_operators_3_0=(Token)match(input,Mod,FOLLOW_Mod_in_ruleterm2695); 

            	                    newLeafNode(lv_operators_3_0, grammarAccess.getTermAccess().getOperatorsModKeyword_1_0_2_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getTermRule());
            	            	        }
            	                   		addWithLastConsumed(current, "operators", lv_operators_3_0, "mod");
            	            	    

            	            }


            	            }


            	            }
            	            break;
            	        case 4 :
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1440:6: ( (lv_operators_4_0= And ) )
            	            {
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1440:6: ( (lv_operators_4_0= And ) )
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1441:1: (lv_operators_4_0= And )
            	            {
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1441:1: (lv_operators_4_0= And )
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1442:3: lv_operators_4_0= And
            	            {
            	            lv_operators_4_0=(Token)match(input,And,FOLLOW_And_in_ruleterm2731); 

            	                    newLeafNode(lv_operators_4_0, grammarAccess.getTermAccess().getOperatorsAndKeyword_1_0_3_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getTermRule());
            	            	        }
            	                   		addWithLastConsumed(current, "operators", lv_operators_4_0, "and");
            	            	    

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1456:3: ( (lv_factors_5_0= rulefactor ) )
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1457:1: (lv_factors_5_0= rulefactor )
            	    {
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1457:1: (lv_factors_5_0= rulefactor )
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1458:3: lv_factors_5_0= rulefactor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTermAccess().getFactorsFactorParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulefactor_in_ruleterm2764);
            	    lv_factors_5_0=rulefactor();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTermRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"factors",
            	            		lv_factors_5_0, 
            	            		"factor");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleterm"


    // $ANTLR start "entryRulefactor"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1485:1: entryRulefactor returns [EObject current=null] : iv_rulefactor= rulefactor EOF ;
    public final EObject entryRulefactor() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefactor = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1486:2: (iv_rulefactor= rulefactor EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1487:2: iv_rulefactor= rulefactor EOF
            {
             newCompositeNode(grammarAccess.getFactorRule()); 
            pushFollow(FOLLOW_rulefactor_in_entryRulefactor2805);
            iv_rulefactor=rulefactor();

            state._fsp--;

             current =iv_rulefactor; 
            match(input,EOF,FOLLOW_EOF_in_entryRulefactor2815); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulefactor"


    // $ANTLR start "rulefactor"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1494:1: rulefactor returns [EObject current=null] : ( ( (lv_variable_0_0= rulevariable ) ) | ( (lv_number_1_0= rulenumber ) ) | ( (lv_string_2_0= RULE_STRING ) ) | ( (lv_set_3_0= ruleset ) ) | ( (lv_nil_4_0= Nil ) ) | ( (lv_boolean_5_0= True ) ) | ( (lv_boolean_6_0= False ) ) | ( (lv_function_7_0= rulefunction_designator ) ) | (otherlv_8= LeftParenthesis ( (lv_expression_9_0= ruleexpression ) ) otherlv_10= RightParenthesis ) | (otherlv_11= Not ( (lv_not_12_0= rulefactor ) ) ) ) ;
    public final EObject rulefactor() throws RecognitionException {
        EObject current = null;

        Token lv_string_2_0=null;
        Token lv_nil_4_0=null;
        Token lv_boolean_5_0=null;
        Token lv_boolean_6_0=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        EObject lv_variable_0_0 = null;

        EObject lv_number_1_0 = null;

        EObject lv_set_3_0 = null;

        EObject lv_function_7_0 = null;

        EObject lv_expression_9_0 = null;

        EObject lv_not_12_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1497:28: ( ( ( (lv_variable_0_0= rulevariable ) ) | ( (lv_number_1_0= rulenumber ) ) | ( (lv_string_2_0= RULE_STRING ) ) | ( (lv_set_3_0= ruleset ) ) | ( (lv_nil_4_0= Nil ) ) | ( (lv_boolean_5_0= True ) ) | ( (lv_boolean_6_0= False ) ) | ( (lv_function_7_0= rulefunction_designator ) ) | (otherlv_8= LeftParenthesis ( (lv_expression_9_0= ruleexpression ) ) otherlv_10= RightParenthesis ) | (otherlv_11= Not ( (lv_not_12_0= rulefactor ) ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1498:1: ( ( (lv_variable_0_0= rulevariable ) ) | ( (lv_number_1_0= rulenumber ) ) | ( (lv_string_2_0= RULE_STRING ) ) | ( (lv_set_3_0= ruleset ) ) | ( (lv_nil_4_0= Nil ) ) | ( (lv_boolean_5_0= True ) ) | ( (lv_boolean_6_0= False ) ) | ( (lv_function_7_0= rulefunction_designator ) ) | (otherlv_8= LeftParenthesis ( (lv_expression_9_0= ruleexpression ) ) otherlv_10= RightParenthesis ) | (otherlv_11= Not ( (lv_not_12_0= rulefactor ) ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1498:1: ( ( (lv_variable_0_0= rulevariable ) ) | ( (lv_number_1_0= rulenumber ) ) | ( (lv_string_2_0= RULE_STRING ) ) | ( (lv_set_3_0= ruleset ) ) | ( (lv_nil_4_0= Nil ) ) | ( (lv_boolean_5_0= True ) ) | ( (lv_boolean_6_0= False ) ) | ( (lv_function_7_0= rulefunction_designator ) ) | (otherlv_8= LeftParenthesis ( (lv_expression_9_0= ruleexpression ) ) otherlv_10= RightParenthesis ) | (otherlv_11= Not ( (lv_not_12_0= rulefactor ) ) ) )
            int alt23=10;
            alt23 = dfa23.predict(input);
            switch (alt23) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1498:2: ( (lv_variable_0_0= rulevariable ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1498:2: ( (lv_variable_0_0= rulevariable ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1499:1: (lv_variable_0_0= rulevariable )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1499:1: (lv_variable_0_0= rulevariable )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1500:3: lv_variable_0_0= rulevariable
                    {
                     
                    	        newCompositeNode(grammarAccess.getFactorAccess().getVariableVariableParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_rulevariable_in_rulefactor2861);
                    lv_variable_0_0=rulevariable();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFactorRule());
                    	        }
                           		set(
                           			current, 
                           			"variable",
                            		lv_variable_0_0, 
                            		"variable");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1517:6: ( (lv_number_1_0= rulenumber ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1517:6: ( (lv_number_1_0= rulenumber ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1518:1: (lv_number_1_0= rulenumber )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1518:1: (lv_number_1_0= rulenumber )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1519:3: lv_number_1_0= rulenumber
                    {
                     
                    	        newCompositeNode(grammarAccess.getFactorAccess().getNumberNumberParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_rulenumber_in_rulefactor2888);
                    lv_number_1_0=rulenumber();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFactorRule());
                    	        }
                           		set(
                           			current, 
                           			"number",
                            		lv_number_1_0, 
                            		"number");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1536:6: ( (lv_string_2_0= RULE_STRING ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1536:6: ( (lv_string_2_0= RULE_STRING ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1537:1: (lv_string_2_0= RULE_STRING )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1537:1: (lv_string_2_0= RULE_STRING )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1538:3: lv_string_2_0= RULE_STRING
                    {
                    lv_string_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulefactor2911); 

                    			newLeafNode(lv_string_2_0, grammarAccess.getFactorAccess().getStringSTRINGTerminalRuleCall_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFactorRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"string",
                            		lv_string_2_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1555:6: ( (lv_set_3_0= ruleset ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1555:6: ( (lv_set_3_0= ruleset ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1556:1: (lv_set_3_0= ruleset )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1556:1: (lv_set_3_0= ruleset )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1557:3: lv_set_3_0= ruleset
                    {
                     
                    	        newCompositeNode(grammarAccess.getFactorAccess().getSetSetParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleset_in_rulefactor2943);
                    lv_set_3_0=ruleset();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFactorRule());
                    	        }
                           		set(
                           			current, 
                           			"set",
                            		lv_set_3_0, 
                            		"set");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1574:6: ( (lv_nil_4_0= Nil ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1574:6: ( (lv_nil_4_0= Nil ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1575:1: (lv_nil_4_0= Nil )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1575:1: (lv_nil_4_0= Nil )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1576:3: lv_nil_4_0= Nil
                    {
                    lv_nil_4_0=(Token)match(input,Nil,FOLLOW_Nil_in_rulefactor2968); 

                            newLeafNode(lv_nil_4_0, grammarAccess.getFactorAccess().getNilNilKeyword_4_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFactorRule());
                    	        }
                           		setWithLastConsumed(current, "nil", true, "nil");
                    	    

                    }


                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1591:6: ( (lv_boolean_5_0= True ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1591:6: ( (lv_boolean_5_0= True ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1592:1: (lv_boolean_5_0= True )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1592:1: (lv_boolean_5_0= True )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1593:3: lv_boolean_5_0= True
                    {
                    lv_boolean_5_0=(Token)match(input,True,FOLLOW_True_in_rulefactor3004); 

                            newLeafNode(lv_boolean_5_0, grammarAccess.getFactorAccess().getBooleanTrueKeyword_5_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFactorRule());
                    	        }
                           		setWithLastConsumed(current, "boolean", lv_boolean_5_0, "true");
                    	    

                    }


                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1608:6: ( (lv_boolean_6_0= False ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1608:6: ( (lv_boolean_6_0= False ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1609:1: (lv_boolean_6_0= False )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1609:1: (lv_boolean_6_0= False )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1610:3: lv_boolean_6_0= False
                    {
                    lv_boolean_6_0=(Token)match(input,False,FOLLOW_False_in_rulefactor3040); 

                            newLeafNode(lv_boolean_6_0, grammarAccess.getFactorAccess().getBooleanFalseKeyword_6_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFactorRule());
                    	        }
                           		setWithLastConsumed(current, "boolean", lv_boolean_6_0, "false");
                    	    

                    }


                    }


                    }
                    break;
                case 8 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1625:6: ( (lv_function_7_0= rulefunction_designator ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1625:6: ( (lv_function_7_0= rulefunction_designator ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1626:1: (lv_function_7_0= rulefunction_designator )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1626:1: (lv_function_7_0= rulefunction_designator )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1627:3: lv_function_7_0= rulefunction_designator
                    {
                     
                    	        newCompositeNode(grammarAccess.getFactorAccess().getFunctionFunction_designatorParserRuleCall_7_0()); 
                    	    
                    pushFollow(FOLLOW_rulefunction_designator_in_rulefactor3078);
                    lv_function_7_0=rulefunction_designator();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFactorRule());
                    	        }
                           		set(
                           			current, 
                           			"function",
                            		lv_function_7_0, 
                            		"function_designator");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 9 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1644:6: (otherlv_8= LeftParenthesis ( (lv_expression_9_0= ruleexpression ) ) otherlv_10= RightParenthesis )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1644:6: (otherlv_8= LeftParenthesis ( (lv_expression_9_0= ruleexpression ) ) otherlv_10= RightParenthesis )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1645:2: otherlv_8= LeftParenthesis ( (lv_expression_9_0= ruleexpression ) ) otherlv_10= RightParenthesis
                    {
                    otherlv_8=(Token)match(input,LeftParenthesis,FOLLOW_LeftParenthesis_in_rulefactor3098); 

                        	newLeafNode(otherlv_8, grammarAccess.getFactorAccess().getLeftParenthesisKeyword_8_0());
                        
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1649:1: ( (lv_expression_9_0= ruleexpression ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1650:1: (lv_expression_9_0= ruleexpression )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1650:1: (lv_expression_9_0= ruleexpression )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1651:3: lv_expression_9_0= ruleexpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getFactorAccess().getExpressionExpressionParserRuleCall_8_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleexpression_in_rulefactor3118);
                    lv_expression_9_0=ruleexpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFactorRule());
                    	        }
                           		set(
                           			current, 
                           			"expression",
                            		lv_expression_9_0, 
                            		"expression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_10=(Token)match(input,RightParenthesis,FOLLOW_RightParenthesis_in_rulefactor3131); 

                        	newLeafNode(otherlv_10, grammarAccess.getFactorAccess().getRightParenthesisKeyword_8_2());
                        

                    }


                    }
                    break;
                case 10 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1673:6: (otherlv_11= Not ( (lv_not_12_0= rulefactor ) ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1673:6: (otherlv_11= Not ( (lv_not_12_0= rulefactor ) ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1674:2: otherlv_11= Not ( (lv_not_12_0= rulefactor ) )
                    {
                    otherlv_11=(Token)match(input,Not,FOLLOW_Not_in_rulefactor3151); 

                        	newLeafNode(otherlv_11, grammarAccess.getFactorAccess().getNotKeyword_9_0());
                        
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1678:1: ( (lv_not_12_0= rulefactor ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1679:1: (lv_not_12_0= rulefactor )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1679:1: (lv_not_12_0= rulefactor )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1680:3: lv_not_12_0= rulefactor
                    {
                     
                    	        newCompositeNode(grammarAccess.getFactorAccess().getNotFactorParserRuleCall_9_1_0()); 
                    	    
                    pushFollow(FOLLOW_rulefactor_in_rulefactor3171);
                    lv_not_12_0=rulefactor();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFactorRule());
                    	        }
                           		set(
                           			current, 
                           			"not",
                            		lv_not_12_0, 
                            		"factor");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "rulefactor"


    // $ANTLR start "entryRulenumber"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1704:1: entryRulenumber returns [EObject current=null] : iv_rulenumber= rulenumber EOF ;
    public final EObject entryRulenumber() throws RecognitionException {
        EObject current = null;

        EObject iv_rulenumber = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1705:2: (iv_rulenumber= rulenumber EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1706:2: iv_rulenumber= rulenumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_rulenumber_in_entryRulenumber3207);
            iv_rulenumber=rulenumber();

            state._fsp--;

             current =iv_rulenumber; 
            match(input,EOF,FOLLOW_EOF_in_entryRulenumber3217); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulenumber"


    // $ANTLR start "rulenumber"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1713:1: rulenumber returns [EObject current=null] : ( (lv_number_0_0= ruleany_number ) ) ;
    public final EObject rulenumber() throws RecognitionException {
        EObject current = null;

        EObject lv_number_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1716:28: ( ( (lv_number_0_0= ruleany_number ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1717:1: ( (lv_number_0_0= ruleany_number ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1717:1: ( (lv_number_0_0= ruleany_number ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1718:1: (lv_number_0_0= ruleany_number )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1718:1: (lv_number_0_0= ruleany_number )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1719:3: lv_number_0_0= ruleany_number
            {
             
            	        newCompositeNode(grammarAccess.getNumberAccess().getNumberAny_numberParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleany_number_in_rulenumber3262);
            lv_number_0_0=ruleany_number();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNumberRule());
            	        }
                   		set(
                   			current, 
                   			"number",
                    		lv_number_0_0, 
                    		"any_number");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "rulenumber"


    // $ANTLR start "entryRuleany_number"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1743:1: entryRuleany_number returns [EObject current=null] : iv_ruleany_number= ruleany_number EOF ;
    public final EObject entryRuleany_number() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleany_number = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1744:2: (iv_ruleany_number= ruleany_number EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1745:2: iv_ruleany_number= ruleany_number EOF
            {
             newCompositeNode(grammarAccess.getAny_numberRule()); 
            pushFollow(FOLLOW_ruleany_number_in_entryRuleany_number3296);
            iv_ruleany_number=ruleany_number();

            state._fsp--;

             current =iv_ruleany_number; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleany_number3306); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleany_number"


    // $ANTLR start "ruleany_number"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1752:1: ruleany_number returns [EObject current=null] : (this_unsigned_number_0= ruleunsigned_number | this_signed_number_1= rulesigned_number ) ;
    public final EObject ruleany_number() throws RecognitionException {
        EObject current = null;

        EObject this_unsigned_number_0 = null;

        EObject this_signed_number_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1755:28: ( (this_unsigned_number_0= ruleunsigned_number | this_signed_number_1= rulesigned_number ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1756:1: (this_unsigned_number_0= ruleunsigned_number | this_signed_number_1= rulesigned_number )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1756:1: (this_unsigned_number_0= ruleunsigned_number | this_signed_number_1= rulesigned_number )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=RULE_INTEGER_NUMBER && LA24_0<=RULE_REAL_NUMBER)) ) {
                alt24=1;
            }
            else if ( ((LA24_0>=RULE_SIGNED_INTEGER_NUMBER && LA24_0<=RULE_SIGNED_REAL_NUMBER)) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1757:5: this_unsigned_number_0= ruleunsigned_number
                    {
                     
                            newCompositeNode(grammarAccess.getAny_numberAccess().getUnsigned_numberParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleunsigned_number_in_ruleany_number3353);
                    this_unsigned_number_0=ruleunsigned_number();

                    state._fsp--;


                            current = this_unsigned_number_0;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1767:5: this_signed_number_1= rulesigned_number
                    {
                     
                            newCompositeNode(grammarAccess.getAny_numberAccess().getSigned_numberParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulesigned_number_in_ruleany_number3380);
                    this_signed_number_1=rulesigned_number();

                    state._fsp--;


                            current = this_signed_number_1;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleany_number"


    // $ANTLR start "entryRuleunsigned_number"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1783:1: entryRuleunsigned_number returns [EObject current=null] : iv_ruleunsigned_number= ruleunsigned_number EOF ;
    public final EObject entryRuleunsigned_number() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleunsigned_number = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1784:2: (iv_ruleunsigned_number= ruleunsigned_number EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1785:2: iv_ruleunsigned_number= ruleunsigned_number EOF
            {
             newCompositeNode(grammarAccess.getUnsigned_numberRule()); 
            pushFollow(FOLLOW_ruleunsigned_number_in_entryRuleunsigned_number3414);
            iv_ruleunsigned_number=ruleunsigned_number();

            state._fsp--;

             current =iv_ruleunsigned_number; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleunsigned_number3424); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleunsigned_number"


    // $ANTLR start "ruleunsigned_number"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1792:1: ruleunsigned_number returns [EObject current=null] : ( ( (lv_integer_0_0= RULE_INTEGER_NUMBER ) ) | ( (lv_real_1_0= RULE_REAL_NUMBER ) ) ) ;
    public final EObject ruleunsigned_number() throws RecognitionException {
        EObject current = null;

        Token lv_integer_0_0=null;
        Token lv_real_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1795:28: ( ( ( (lv_integer_0_0= RULE_INTEGER_NUMBER ) ) | ( (lv_real_1_0= RULE_REAL_NUMBER ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1796:1: ( ( (lv_integer_0_0= RULE_INTEGER_NUMBER ) ) | ( (lv_real_1_0= RULE_REAL_NUMBER ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1796:1: ( ( (lv_integer_0_0= RULE_INTEGER_NUMBER ) ) | ( (lv_real_1_0= RULE_REAL_NUMBER ) ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_INTEGER_NUMBER) ) {
                alt25=1;
            }
            else if ( (LA25_0==RULE_REAL_NUMBER) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1796:2: ( (lv_integer_0_0= RULE_INTEGER_NUMBER ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1796:2: ( (lv_integer_0_0= RULE_INTEGER_NUMBER ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1797:1: (lv_integer_0_0= RULE_INTEGER_NUMBER )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1797:1: (lv_integer_0_0= RULE_INTEGER_NUMBER )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1798:3: lv_integer_0_0= RULE_INTEGER_NUMBER
                    {
                    lv_integer_0_0=(Token)match(input,RULE_INTEGER_NUMBER,FOLLOW_RULE_INTEGER_NUMBER_in_ruleunsigned_number3466); 

                    			newLeafNode(lv_integer_0_0, grammarAccess.getUnsigned_numberAccess().getIntegerINTEGER_NUMBERTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getUnsigned_numberRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"integer",
                            		lv_integer_0_0, 
                            		"INTEGER_NUMBER");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1815:6: ( (lv_real_1_0= RULE_REAL_NUMBER ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1815:6: ( (lv_real_1_0= RULE_REAL_NUMBER ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1816:1: (lv_real_1_0= RULE_REAL_NUMBER )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1816:1: (lv_real_1_0= RULE_REAL_NUMBER )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1817:3: lv_real_1_0= RULE_REAL_NUMBER
                    {
                    lv_real_1_0=(Token)match(input,RULE_REAL_NUMBER,FOLLOW_RULE_REAL_NUMBER_in_ruleunsigned_number3494); 

                    			newLeafNode(lv_real_1_0, grammarAccess.getUnsigned_numberAccess().getRealREAL_NUMBERTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getUnsigned_numberRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"real",
                            		lv_real_1_0, 
                            		"REAL_NUMBER");
                    	    

                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleunsigned_number"


    // $ANTLR start "entryRulesigned_number"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1841:1: entryRulesigned_number returns [EObject current=null] : iv_rulesigned_number= rulesigned_number EOF ;
    public final EObject entryRulesigned_number() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesigned_number = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1842:2: (iv_rulesigned_number= rulesigned_number EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1843:2: iv_rulesigned_number= rulesigned_number EOF
            {
             newCompositeNode(grammarAccess.getSigned_numberRule()); 
            pushFollow(FOLLOW_rulesigned_number_in_entryRulesigned_number3534);
            iv_rulesigned_number=rulesigned_number();

            state._fsp--;

             current =iv_rulesigned_number; 
            match(input,EOF,FOLLOW_EOF_in_entryRulesigned_number3544); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulesigned_number"


    // $ANTLR start "rulesigned_number"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1850:1: rulesigned_number returns [EObject current=null] : ( ( (lv_integer_0_0= RULE_SIGNED_INTEGER_NUMBER ) ) | ( (lv_real_1_0= RULE_SIGNED_REAL_NUMBER ) ) ) ;
    public final EObject rulesigned_number() throws RecognitionException {
        EObject current = null;

        Token lv_integer_0_0=null;
        Token lv_real_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1853:28: ( ( ( (lv_integer_0_0= RULE_SIGNED_INTEGER_NUMBER ) ) | ( (lv_real_1_0= RULE_SIGNED_REAL_NUMBER ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1854:1: ( ( (lv_integer_0_0= RULE_SIGNED_INTEGER_NUMBER ) ) | ( (lv_real_1_0= RULE_SIGNED_REAL_NUMBER ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1854:1: ( ( (lv_integer_0_0= RULE_SIGNED_INTEGER_NUMBER ) ) | ( (lv_real_1_0= RULE_SIGNED_REAL_NUMBER ) ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_SIGNED_INTEGER_NUMBER) ) {
                alt26=1;
            }
            else if ( (LA26_0==RULE_SIGNED_REAL_NUMBER) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1854:2: ( (lv_integer_0_0= RULE_SIGNED_INTEGER_NUMBER ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1854:2: ( (lv_integer_0_0= RULE_SIGNED_INTEGER_NUMBER ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1855:1: (lv_integer_0_0= RULE_SIGNED_INTEGER_NUMBER )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1855:1: (lv_integer_0_0= RULE_SIGNED_INTEGER_NUMBER )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1856:3: lv_integer_0_0= RULE_SIGNED_INTEGER_NUMBER
                    {
                    lv_integer_0_0=(Token)match(input,RULE_SIGNED_INTEGER_NUMBER,FOLLOW_RULE_SIGNED_INTEGER_NUMBER_in_rulesigned_number3586); 

                    			newLeafNode(lv_integer_0_0, grammarAccess.getSigned_numberAccess().getIntegerSIGNED_INTEGER_NUMBERTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSigned_numberRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"integer",
                            		lv_integer_0_0, 
                            		"SIGNED_INTEGER_NUMBER");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1873:6: ( (lv_real_1_0= RULE_SIGNED_REAL_NUMBER ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1873:6: ( (lv_real_1_0= RULE_SIGNED_REAL_NUMBER ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1874:1: (lv_real_1_0= RULE_SIGNED_REAL_NUMBER )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1874:1: (lv_real_1_0= RULE_SIGNED_REAL_NUMBER )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1875:3: lv_real_1_0= RULE_SIGNED_REAL_NUMBER
                    {
                    lv_real_1_0=(Token)match(input,RULE_SIGNED_REAL_NUMBER,FOLLOW_RULE_SIGNED_REAL_NUMBER_in_rulesigned_number3614); 

                    			newLeafNode(lv_real_1_0, grammarAccess.getSigned_numberAccess().getRealSIGNED_REAL_NUMBERTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSigned_numberRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"real",
                            		lv_real_1_0, 
                            		"SIGNED_REAL_NUMBER");
                    	    

                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "rulesigned_number"


    // $ANTLR start "entryRuleset"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1899:1: entryRuleset returns [EObject current=null] : iv_ruleset= ruleset EOF ;
    public final EObject entryRuleset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleset = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1900:2: (iv_ruleset= ruleset EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1901:2: iv_ruleset= ruleset EOF
            {
             newCompositeNode(grammarAccess.getSetRule()); 
            pushFollow(FOLLOW_ruleset_in_entryRuleset3654);
            iv_ruleset=ruleset();

            state._fsp--;

             current =iv_ruleset; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleset3664); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleset"


    // $ANTLR start "ruleset"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1908:1: ruleset returns [EObject current=null] : ( ( (lv_brackets_0_0= LeftSquareBracket ) ) ( (lv_expressions_1_0= ruleexpression_list ) )? ( (lv_brackets_2_0= RightSquareBracket ) ) ) ;
    public final EObject ruleset() throws RecognitionException {
        EObject current = null;

        Token lv_brackets_0_0=null;
        Token lv_brackets_2_0=null;
        EObject lv_expressions_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1911:28: ( ( ( (lv_brackets_0_0= LeftSquareBracket ) ) ( (lv_expressions_1_0= ruleexpression_list ) )? ( (lv_brackets_2_0= RightSquareBracket ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1912:1: ( ( (lv_brackets_0_0= LeftSquareBracket ) ) ( (lv_expressions_1_0= ruleexpression_list ) )? ( (lv_brackets_2_0= RightSquareBracket ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1912:1: ( ( (lv_brackets_0_0= LeftSquareBracket ) ) ( (lv_expressions_1_0= ruleexpression_list ) )? ( (lv_brackets_2_0= RightSquareBracket ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1912:2: ( (lv_brackets_0_0= LeftSquareBracket ) ) ( (lv_expressions_1_0= ruleexpression_list ) )? ( (lv_brackets_2_0= RightSquareBracket ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1912:2: ( (lv_brackets_0_0= LeftSquareBracket ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1913:1: (lv_brackets_0_0= LeftSquareBracket )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1913:1: (lv_brackets_0_0= LeftSquareBracket )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1914:3: lv_brackets_0_0= LeftSquareBracket
            {
            lv_brackets_0_0=(Token)match(input,LeftSquareBracket,FOLLOW_LeftSquareBracket_in_ruleset3708); 

                    newLeafNode(lv_brackets_0_0, grammarAccess.getSetAccess().getBracketsLeftSquareBracketKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSetRule());
            	        }
                   		addWithLastConsumed(current, "brackets", lv_brackets_0_0, "[");
            	    

            }


            }

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1928:2: ( (lv_expressions_1_0= ruleexpression_list ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==False||LA27_0==True||(LA27_0>=Nil && LA27_0<=Not)||LA27_0==LeftParenthesis||LA27_0==LeftSquareBracket||(LA27_0>=RULE_INTEGER_NUMBER && LA27_0<=RULE_SIGNED_REAL_NUMBER)||LA27_0==RULE_ADDITION_OPERATOR||LA27_0==RULE_ID||LA27_0==RULE_STRING) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1929:1: (lv_expressions_1_0= ruleexpression_list )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1929:1: (lv_expressions_1_0= ruleexpression_list )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1930:3: lv_expressions_1_0= ruleexpression_list
                    {
                     
                    	        newCompositeNode(grammarAccess.getSetAccess().getExpressionsExpression_listParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleexpression_list_in_ruleset3740);
                    lv_expressions_1_0=ruleexpression_list();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSetRule());
                    	        }
                           		set(
                           			current, 
                           			"expressions",
                            		lv_expressions_1_0, 
                            		"expression_list");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1946:3: ( (lv_brackets_2_0= RightSquareBracket ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1947:1: (lv_brackets_2_0= RightSquareBracket )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1947:1: (lv_brackets_2_0= RightSquareBracket )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1948:3: lv_brackets_2_0= RightSquareBracket
            {
            lv_brackets_2_0=(Token)match(input,RightSquareBracket,FOLLOW_RightSquareBracket_in_ruleset3760); 

                    newLeafNode(lv_brackets_2_0, grammarAccess.getSetAccess().getBracketsRightSquareBracketKeyword_2_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSetRule());
            	        }
                   		addWithLastConsumed(current, "brackets", lv_brackets_2_0, "]");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleset"


    // $ANTLR start "entryRulefunction_designator"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1970:1: entryRulefunction_designator returns [EObject current=null] : iv_rulefunction_designator= rulefunction_designator EOF ;
    public final EObject entryRulefunction_designator() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefunction_designator = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1971:2: (iv_rulefunction_designator= rulefunction_designator EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1972:2: iv_rulefunction_designator= rulefunction_designator EOF
            {
             newCompositeNode(grammarAccess.getFunction_designatorRule()); 
            pushFollow(FOLLOW_rulefunction_designator_in_entryRulefunction_designator3806);
            iv_rulefunction_designator=rulefunction_designator();

            state._fsp--;

             current =iv_rulefunction_designator; 
            match(input,EOF,FOLLOW_EOF_in_entryRulefunction_designator3816); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulefunction_designator"


    // $ANTLR start "rulefunction_designator"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1979:1: rulefunction_designator returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= LeftParenthesis ( (lv_expressions_2_0= ruleexpression_list ) )? otherlv_3= RightParenthesis ) ;
    public final EObject rulefunction_designator() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1982:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= LeftParenthesis ( (lv_expressions_2_0= ruleexpression_list ) )? otherlv_3= RightParenthesis ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1983:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= LeftParenthesis ( (lv_expressions_2_0= ruleexpression_list ) )? otherlv_3= RightParenthesis )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1983:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= LeftParenthesis ( (lv_expressions_2_0= ruleexpression_list ) )? otherlv_3= RightParenthesis )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1983:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= LeftParenthesis ( (lv_expressions_2_0= ruleexpression_list ) )? otherlv_3= RightParenthesis
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1983:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1984:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1984:1: (lv_name_0_0= RULE_ID )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:1985:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulefunction_designator3858); 

            			newLeafNode(lv_name_0_0, grammarAccess.getFunction_designatorAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFunction_designatorRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,LeftParenthesis,FOLLOW_LeftParenthesis_in_rulefunction_designator3876); 

                	newLeafNode(otherlv_1, grammarAccess.getFunction_designatorAccess().getLeftParenthesisKeyword_1());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2006:1: ( (lv_expressions_2_0= ruleexpression_list ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==False||LA28_0==True||(LA28_0>=Nil && LA28_0<=Not)||LA28_0==LeftParenthesis||LA28_0==LeftSquareBracket||(LA28_0>=RULE_INTEGER_NUMBER && LA28_0<=RULE_SIGNED_REAL_NUMBER)||LA28_0==RULE_ADDITION_OPERATOR||LA28_0==RULE_ID||LA28_0==RULE_STRING) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2007:1: (lv_expressions_2_0= ruleexpression_list )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2007:1: (lv_expressions_2_0= ruleexpression_list )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2008:3: lv_expressions_2_0= ruleexpression_list
                    {
                     
                    	        newCompositeNode(grammarAccess.getFunction_designatorAccess().getExpressionsExpression_listParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleexpression_list_in_rulefunction_designator3896);
                    lv_expressions_2_0=ruleexpression_list();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFunction_designatorRule());
                    	        }
                           		set(
                           			current, 
                           			"expressions",
                            		lv_expressions_2_0, 
                            		"expression_list");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,RightParenthesis,FOLLOW_RightParenthesis_in_rulefunction_designator3910); 

                	newLeafNode(otherlv_3, grammarAccess.getFunction_designatorAccess().getRightParenthesisKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "rulefunction_designator"


    // $ANTLR start "entryRulestructured_statement"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2037:1: entryRulestructured_statement returns [EObject current=null] : iv_rulestructured_statement= rulestructured_statement EOF ;
    public final EObject entryRulestructured_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestructured_statement = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2038:2: (iv_rulestructured_statement= rulestructured_statement EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2039:2: iv_rulestructured_statement= rulestructured_statement EOF
            {
             newCompositeNode(grammarAccess.getStructured_statementRule()); 
            pushFollow(FOLLOW_rulestructured_statement_in_entryRulestructured_statement3944);
            iv_rulestructured_statement=rulestructured_statement();

            state._fsp--;

             current =iv_rulestructured_statement; 
            match(input,EOF,FOLLOW_EOF_in_entryRulestructured_statement3954); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulestructured_statement"


    // $ANTLR start "rulestructured_statement"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2046:1: rulestructured_statement returns [EObject current=null] : ( ( (lv_compound_0_0= rulecompound_statement ) ) | ( (lv_repetitive_1_0= rulerepetitive_statement ) ) | ( (lv_conditional_2_0= ruleconditional_statement ) ) | ( (lv_withStmt_3_0= rulewith_statement ) ) ) ;
    public final EObject rulestructured_statement() throws RecognitionException {
        EObject current = null;

        EObject lv_compound_0_0 = null;

        EObject lv_repetitive_1_0 = null;

        EObject lv_conditional_2_0 = null;

        EObject lv_withStmt_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2049:28: ( ( ( (lv_compound_0_0= rulecompound_statement ) ) | ( (lv_repetitive_1_0= rulerepetitive_statement ) ) | ( (lv_conditional_2_0= ruleconditional_statement ) ) | ( (lv_withStmt_3_0= rulewith_statement ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2050:1: ( ( (lv_compound_0_0= rulecompound_statement ) ) | ( (lv_repetitive_1_0= rulerepetitive_statement ) ) | ( (lv_conditional_2_0= ruleconditional_statement ) ) | ( (lv_withStmt_3_0= rulewith_statement ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2050:1: ( ( (lv_compound_0_0= rulecompound_statement ) ) | ( (lv_repetitive_1_0= rulerepetitive_statement ) ) | ( (lv_conditional_2_0= ruleconditional_statement ) ) | ( (lv_withStmt_3_0= rulewith_statement ) ) )
            int alt29=4;
            switch ( input.LA(1) ) {
            case Begin:
                {
                alt29=1;
                }
                break;
            case Repeat:
            case While:
            case For:
                {
                alt29=2;
                }
                break;
            case Case:
            case If:
                {
                alt29=3;
                }
                break;
            case With:
                {
                alt29=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2050:2: ( (lv_compound_0_0= rulecompound_statement ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2050:2: ( (lv_compound_0_0= rulecompound_statement ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2051:1: (lv_compound_0_0= rulecompound_statement )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2051:1: (lv_compound_0_0= rulecompound_statement )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2052:3: lv_compound_0_0= rulecompound_statement
                    {
                     
                    	        newCompositeNode(grammarAccess.getStructured_statementAccess().getCompoundCompound_statementParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_rulecompound_statement_in_rulestructured_statement4000);
                    lv_compound_0_0=rulecompound_statement();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStructured_statementRule());
                    	        }
                           		set(
                           			current, 
                           			"compound",
                            		lv_compound_0_0, 
                            		"compound_statement");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2069:6: ( (lv_repetitive_1_0= rulerepetitive_statement ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2069:6: ( (lv_repetitive_1_0= rulerepetitive_statement ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2070:1: (lv_repetitive_1_0= rulerepetitive_statement )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2070:1: (lv_repetitive_1_0= rulerepetitive_statement )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2071:3: lv_repetitive_1_0= rulerepetitive_statement
                    {
                     
                    	        newCompositeNode(grammarAccess.getStructured_statementAccess().getRepetitiveRepetitive_statementParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_rulerepetitive_statement_in_rulestructured_statement4027);
                    lv_repetitive_1_0=rulerepetitive_statement();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStructured_statementRule());
                    	        }
                           		set(
                           			current, 
                           			"repetitive",
                            		lv_repetitive_1_0, 
                            		"repetitive_statement");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2088:6: ( (lv_conditional_2_0= ruleconditional_statement ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2088:6: ( (lv_conditional_2_0= ruleconditional_statement ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2089:1: (lv_conditional_2_0= ruleconditional_statement )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2089:1: (lv_conditional_2_0= ruleconditional_statement )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2090:3: lv_conditional_2_0= ruleconditional_statement
                    {
                     
                    	        newCompositeNode(grammarAccess.getStructured_statementAccess().getConditionalConditional_statementParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleconditional_statement_in_rulestructured_statement4054);
                    lv_conditional_2_0=ruleconditional_statement();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStructured_statementRule());
                    	        }
                           		set(
                           			current, 
                           			"conditional",
                            		lv_conditional_2_0, 
                            		"conditional_statement");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2107:6: ( (lv_withStmt_3_0= rulewith_statement ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2107:6: ( (lv_withStmt_3_0= rulewith_statement ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2108:1: (lv_withStmt_3_0= rulewith_statement )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2108:1: (lv_withStmt_3_0= rulewith_statement )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2109:3: lv_withStmt_3_0= rulewith_statement
                    {
                     
                    	        newCompositeNode(grammarAccess.getStructured_statementAccess().getWithStmtWith_statementParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_rulewith_statement_in_rulestructured_statement4081);
                    lv_withStmt_3_0=rulewith_statement();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStructured_statementRule());
                    	        }
                           		set(
                           			current, 
                           			"withStmt",
                            		lv_withStmt_3_0, 
                            		"with_statement");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "rulestructured_statement"


    // $ANTLR start "entryRulecompound_statement"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2133:1: entryRulecompound_statement returns [EObject current=null] : iv_rulecompound_statement= rulecompound_statement EOF ;
    public final EObject entryRulecompound_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecompound_statement = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2134:2: (iv_rulecompound_statement= rulecompound_statement EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2135:2: iv_rulecompound_statement= rulecompound_statement EOF
            {
             newCompositeNode(grammarAccess.getCompound_statementRule()); 
            pushFollow(FOLLOW_rulecompound_statement_in_entryRulecompound_statement4116);
            iv_rulecompound_statement=rulecompound_statement();

            state._fsp--;

             current =iv_rulecompound_statement; 
            match(input,EOF,FOLLOW_EOF_in_entryRulecompound_statement4126); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulecompound_statement"


    // $ANTLR start "rulecompound_statement"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2142:1: rulecompound_statement returns [EObject current=null] : (otherlv_0= Begin ( (lv_sequence_1_0= rulestatement_sequence ) ) otherlv_2= End ) ;
    public final EObject rulecompound_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_sequence_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2145:28: ( (otherlv_0= Begin ( (lv_sequence_1_0= rulestatement_sequence ) ) otherlv_2= End ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2146:1: (otherlv_0= Begin ( (lv_sequence_1_0= rulestatement_sequence ) ) otherlv_2= End )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2146:1: (otherlv_0= Begin ( (lv_sequence_1_0= rulestatement_sequence ) ) otherlv_2= End )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2147:2: otherlv_0= Begin ( (lv_sequence_1_0= rulestatement_sequence ) ) otherlv_2= End
            {
            otherlv_0=(Token)match(input,Begin,FOLLOW_Begin_in_rulecompound_statement4164); 

                	newLeafNode(otherlv_0, grammarAccess.getCompound_statementAccess().getBeginKeyword_0());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2151:1: ( (lv_sequence_1_0= rulestatement_sequence ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2152:1: (lv_sequence_1_0= rulestatement_sequence )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2152:1: (lv_sequence_1_0= rulestatement_sequence )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2153:3: lv_sequence_1_0= rulestatement_sequence
            {
             
            	        newCompositeNode(grammarAccess.getCompound_statementAccess().getSequenceStatement_sequenceParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulestatement_sequence_in_rulecompound_statement4184);
            lv_sequence_1_0=rulestatement_sequence();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCompound_statementRule());
            	        }
                   		set(
                   			current, 
                   			"sequence",
                    		lv_sequence_1_0, 
                    		"statement_sequence");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,End,FOLLOW_End_in_rulecompound_statement4197); 

                	newLeafNode(otherlv_2, grammarAccess.getCompound_statementAccess().getEndKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "rulecompound_statement"


    // $ANTLR start "entryRulerepetitive_statement"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2182:1: entryRulerepetitive_statement returns [EObject current=null] : iv_rulerepetitive_statement= rulerepetitive_statement EOF ;
    public final EObject entryRulerepetitive_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerepetitive_statement = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2183:2: (iv_rulerepetitive_statement= rulerepetitive_statement EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2184:2: iv_rulerepetitive_statement= rulerepetitive_statement EOF
            {
             newCompositeNode(grammarAccess.getRepetitive_statementRule()); 
            pushFollow(FOLLOW_rulerepetitive_statement_in_entryRulerepetitive_statement4231);
            iv_rulerepetitive_statement=rulerepetitive_statement();

            state._fsp--;

             current =iv_rulerepetitive_statement; 
            match(input,EOF,FOLLOW_EOF_in_entryRulerepetitive_statement4241); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulerepetitive_statement"


    // $ANTLR start "rulerepetitive_statement"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2191:1: rulerepetitive_statement returns [EObject current=null] : ( ( (lv_whileStmt_0_0= rulewhile_statement ) ) | ( (lv_repeatStmt_1_0= rulerepeat_statement ) ) | ( (lv_forStmt_2_0= rulefor_statement ) ) ) ;
    public final EObject rulerepetitive_statement() throws RecognitionException {
        EObject current = null;

        EObject lv_whileStmt_0_0 = null;

        EObject lv_repeatStmt_1_0 = null;

        EObject lv_forStmt_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2194:28: ( ( ( (lv_whileStmt_0_0= rulewhile_statement ) ) | ( (lv_repeatStmt_1_0= rulerepeat_statement ) ) | ( (lv_forStmt_2_0= rulefor_statement ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2195:1: ( ( (lv_whileStmt_0_0= rulewhile_statement ) ) | ( (lv_repeatStmt_1_0= rulerepeat_statement ) ) | ( (lv_forStmt_2_0= rulefor_statement ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2195:1: ( ( (lv_whileStmt_0_0= rulewhile_statement ) ) | ( (lv_repeatStmt_1_0= rulerepeat_statement ) ) | ( (lv_forStmt_2_0= rulefor_statement ) ) )
            int alt30=3;
            switch ( input.LA(1) ) {
            case While:
                {
                alt30=1;
                }
                break;
            case Repeat:
                {
                alt30=2;
                }
                break;
            case For:
                {
                alt30=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2195:2: ( (lv_whileStmt_0_0= rulewhile_statement ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2195:2: ( (lv_whileStmt_0_0= rulewhile_statement ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2196:1: (lv_whileStmt_0_0= rulewhile_statement )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2196:1: (lv_whileStmt_0_0= rulewhile_statement )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2197:3: lv_whileStmt_0_0= rulewhile_statement
                    {
                     
                    	        newCompositeNode(grammarAccess.getRepetitive_statementAccess().getWhileStmtWhile_statementParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_rulewhile_statement_in_rulerepetitive_statement4287);
                    lv_whileStmt_0_0=rulewhile_statement();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRepetitive_statementRule());
                    	        }
                           		set(
                           			current, 
                           			"whileStmt",
                            		lv_whileStmt_0_0, 
                            		"while_statement");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2214:6: ( (lv_repeatStmt_1_0= rulerepeat_statement ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2214:6: ( (lv_repeatStmt_1_0= rulerepeat_statement ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2215:1: (lv_repeatStmt_1_0= rulerepeat_statement )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2215:1: (lv_repeatStmt_1_0= rulerepeat_statement )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2216:3: lv_repeatStmt_1_0= rulerepeat_statement
                    {
                     
                    	        newCompositeNode(grammarAccess.getRepetitive_statementAccess().getRepeatStmtRepeat_statementParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_rulerepeat_statement_in_rulerepetitive_statement4314);
                    lv_repeatStmt_1_0=rulerepeat_statement();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRepetitive_statementRule());
                    	        }
                           		set(
                           			current, 
                           			"repeatStmt",
                            		lv_repeatStmt_1_0, 
                            		"repeat_statement");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2233:6: ( (lv_forStmt_2_0= rulefor_statement ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2233:6: ( (lv_forStmt_2_0= rulefor_statement ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2234:1: (lv_forStmt_2_0= rulefor_statement )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2234:1: (lv_forStmt_2_0= rulefor_statement )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2235:3: lv_forStmt_2_0= rulefor_statement
                    {
                     
                    	        newCompositeNode(grammarAccess.getRepetitive_statementAccess().getForStmtFor_statementParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_rulefor_statement_in_rulerepetitive_statement4341);
                    lv_forStmt_2_0=rulefor_statement();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRepetitive_statementRule());
                    	        }
                           		set(
                           			current, 
                           			"forStmt",
                            		lv_forStmt_2_0, 
                            		"for_statement");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "rulerepetitive_statement"


    // $ANTLR start "entryRulewhile_statement"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2259:1: entryRulewhile_statement returns [EObject current=null] : iv_rulewhile_statement= rulewhile_statement EOF ;
    public final EObject entryRulewhile_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulewhile_statement = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2260:2: (iv_rulewhile_statement= rulewhile_statement EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2261:2: iv_rulewhile_statement= rulewhile_statement EOF
            {
             newCompositeNode(grammarAccess.getWhile_statementRule()); 
            pushFollow(FOLLOW_rulewhile_statement_in_entryRulewhile_statement4376);
            iv_rulewhile_statement=rulewhile_statement();

            state._fsp--;

             current =iv_rulewhile_statement; 
            match(input,EOF,FOLLOW_EOF_in_entryRulewhile_statement4386); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulewhile_statement"


    // $ANTLR start "rulewhile_statement"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2268:1: rulewhile_statement returns [EObject current=null] : (otherlv_0= While ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= Do ( (lv_statement_3_0= rulestatement ) ) ) ;
    public final EObject rulewhile_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_expression_1_0 = null;

        EObject lv_statement_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2271:28: ( (otherlv_0= While ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= Do ( (lv_statement_3_0= rulestatement ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2272:1: (otherlv_0= While ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= Do ( (lv_statement_3_0= rulestatement ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2272:1: (otherlv_0= While ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= Do ( (lv_statement_3_0= rulestatement ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2273:2: otherlv_0= While ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= Do ( (lv_statement_3_0= rulestatement ) )
            {
            otherlv_0=(Token)match(input,While,FOLLOW_While_in_rulewhile_statement4424); 

                	newLeafNode(otherlv_0, grammarAccess.getWhile_statementAccess().getWhileKeyword_0());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2277:1: ( (lv_expression_1_0= ruleexpression ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2278:1: (lv_expression_1_0= ruleexpression )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2278:1: (lv_expression_1_0= ruleexpression )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2279:3: lv_expression_1_0= ruleexpression
            {
             
            	        newCompositeNode(grammarAccess.getWhile_statementAccess().getExpressionExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleexpression_in_rulewhile_statement4444);
            lv_expression_1_0=ruleexpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getWhile_statementRule());
            	        }
                   		set(
                   			current, 
                   			"expression",
                    		lv_expression_1_0, 
                    		"expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,Do,FOLLOW_Do_in_rulewhile_statement4457); 

                	newLeafNode(otherlv_2, grammarAccess.getWhile_statementAccess().getDoKeyword_2());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2300:1: ( (lv_statement_3_0= rulestatement ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2301:1: (lv_statement_3_0= rulestatement )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2301:1: (lv_statement_3_0= rulestatement )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2302:3: lv_statement_3_0= rulestatement
            {
             
            	        newCompositeNode(grammarAccess.getWhile_statementAccess().getStatementStatementParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_rulestatement_in_rulewhile_statement4477);
            lv_statement_3_0=rulestatement();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getWhile_statementRule());
            	        }
                   		set(
                   			current, 
                   			"statement",
                    		lv_statement_3_0, 
                    		"statement");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "rulewhile_statement"


    // $ANTLR start "entryRulerepeat_statement"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2326:1: entryRulerepeat_statement returns [EObject current=null] : iv_rulerepeat_statement= rulerepeat_statement EOF ;
    public final EObject entryRulerepeat_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerepeat_statement = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2327:2: (iv_rulerepeat_statement= rulerepeat_statement EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2328:2: iv_rulerepeat_statement= rulerepeat_statement EOF
            {
             newCompositeNode(grammarAccess.getRepeat_statementRule()); 
            pushFollow(FOLLOW_rulerepeat_statement_in_entryRulerepeat_statement4512);
            iv_rulerepeat_statement=rulerepeat_statement();

            state._fsp--;

             current =iv_rulerepeat_statement; 
            match(input,EOF,FOLLOW_EOF_in_entryRulerepeat_statement4522); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulerepeat_statement"


    // $ANTLR start "rulerepeat_statement"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2335:1: rulerepeat_statement returns [EObject current=null] : (otherlv_0= Repeat ( (lv_sequence_1_0= rulestatement_sequence ) ) otherlv_2= Until ( (lv_expression_3_0= ruleexpression ) ) ) ;
    public final EObject rulerepeat_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_sequence_1_0 = null;

        EObject lv_expression_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2338:28: ( (otherlv_0= Repeat ( (lv_sequence_1_0= rulestatement_sequence ) ) otherlv_2= Until ( (lv_expression_3_0= ruleexpression ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2339:1: (otherlv_0= Repeat ( (lv_sequence_1_0= rulestatement_sequence ) ) otherlv_2= Until ( (lv_expression_3_0= ruleexpression ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2339:1: (otherlv_0= Repeat ( (lv_sequence_1_0= rulestatement_sequence ) ) otherlv_2= Until ( (lv_expression_3_0= ruleexpression ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2340:2: otherlv_0= Repeat ( (lv_sequence_1_0= rulestatement_sequence ) ) otherlv_2= Until ( (lv_expression_3_0= ruleexpression ) )
            {
            otherlv_0=(Token)match(input,Repeat,FOLLOW_Repeat_in_rulerepeat_statement4560); 

                	newLeafNode(otherlv_0, grammarAccess.getRepeat_statementAccess().getRepeatKeyword_0());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2344:1: ( (lv_sequence_1_0= rulestatement_sequence ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2345:1: (lv_sequence_1_0= rulestatement_sequence )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2345:1: (lv_sequence_1_0= rulestatement_sequence )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2346:3: lv_sequence_1_0= rulestatement_sequence
            {
             
            	        newCompositeNode(grammarAccess.getRepeat_statementAccess().getSequenceStatement_sequenceParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulestatement_sequence_in_rulerepeat_statement4580);
            lv_sequence_1_0=rulestatement_sequence();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRepeat_statementRule());
            	        }
                   		set(
                   			current, 
                   			"sequence",
                    		lv_sequence_1_0, 
                    		"statement_sequence");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,Until,FOLLOW_Until_in_rulerepeat_statement4593); 

                	newLeafNode(otherlv_2, grammarAccess.getRepeat_statementAccess().getUntilKeyword_2());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2367:1: ( (lv_expression_3_0= ruleexpression ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2368:1: (lv_expression_3_0= ruleexpression )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2368:1: (lv_expression_3_0= ruleexpression )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2369:3: lv_expression_3_0= ruleexpression
            {
             
            	        newCompositeNode(grammarAccess.getRepeat_statementAccess().getExpressionExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleexpression_in_rulerepeat_statement4613);
            lv_expression_3_0=ruleexpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRepeat_statementRule());
            	        }
                   		set(
                   			current, 
                   			"expression",
                    		lv_expression_3_0, 
                    		"expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "rulerepeat_statement"


    // $ANTLR start "entryRulefor_statement"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2393:1: entryRulefor_statement returns [EObject current=null] : iv_rulefor_statement= rulefor_statement EOF ;
    public final EObject entryRulefor_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefor_statement = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2394:2: (iv_rulefor_statement= rulefor_statement EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2395:2: iv_rulefor_statement= rulefor_statement EOF
            {
             newCompositeNode(grammarAccess.getFor_statementRule()); 
            pushFollow(FOLLOW_rulefor_statement_in_entryRulefor_statement4648);
            iv_rulefor_statement=rulefor_statement();

            state._fsp--;

             current =iv_rulefor_statement; 
            match(input,EOF,FOLLOW_EOF_in_entryRulefor_statement4658); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulefor_statement"


    // $ANTLR start "rulefor_statement"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2402:1: rulefor_statement returns [EObject current=null] : (otherlv_0= For ( (lv_assignment_1_0= ruleassignment_statement ) ) (otherlv_2= To | otherlv_3= Downto ) ( (lv_expression_4_0= ruleexpression ) ) otherlv_5= Do ( (lv_statement_6_0= rulestatement ) ) ) ;
    public final EObject rulefor_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_assignment_1_0 = null;

        EObject lv_expression_4_0 = null;

        EObject lv_statement_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2405:28: ( (otherlv_0= For ( (lv_assignment_1_0= ruleassignment_statement ) ) (otherlv_2= To | otherlv_3= Downto ) ( (lv_expression_4_0= ruleexpression ) ) otherlv_5= Do ( (lv_statement_6_0= rulestatement ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2406:1: (otherlv_0= For ( (lv_assignment_1_0= ruleassignment_statement ) ) (otherlv_2= To | otherlv_3= Downto ) ( (lv_expression_4_0= ruleexpression ) ) otherlv_5= Do ( (lv_statement_6_0= rulestatement ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2406:1: (otherlv_0= For ( (lv_assignment_1_0= ruleassignment_statement ) ) (otherlv_2= To | otherlv_3= Downto ) ( (lv_expression_4_0= ruleexpression ) ) otherlv_5= Do ( (lv_statement_6_0= rulestatement ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2407:2: otherlv_0= For ( (lv_assignment_1_0= ruleassignment_statement ) ) (otherlv_2= To | otherlv_3= Downto ) ( (lv_expression_4_0= ruleexpression ) ) otherlv_5= Do ( (lv_statement_6_0= rulestatement ) )
            {
            otherlv_0=(Token)match(input,For,FOLLOW_For_in_rulefor_statement4696); 

                	newLeafNode(otherlv_0, grammarAccess.getFor_statementAccess().getForKeyword_0());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2411:1: ( (lv_assignment_1_0= ruleassignment_statement ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2412:1: (lv_assignment_1_0= ruleassignment_statement )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2412:1: (lv_assignment_1_0= ruleassignment_statement )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2413:3: lv_assignment_1_0= ruleassignment_statement
            {
             
            	        newCompositeNode(grammarAccess.getFor_statementAccess().getAssignmentAssignment_statementParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleassignment_statement_in_rulefor_statement4716);
            lv_assignment_1_0=ruleassignment_statement();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFor_statementRule());
            	        }
                   		set(
                   			current, 
                   			"assignment",
                    		lv_assignment_1_0, 
                    		"assignment_statement");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2429:2: (otherlv_2= To | otherlv_3= Downto )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==To) ) {
                alt31=1;
            }
            else if ( (LA31_0==Downto) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2430:2: otherlv_2= To
                    {
                    otherlv_2=(Token)match(input,To,FOLLOW_To_in_rulefor_statement4730); 

                        	newLeafNode(otherlv_2, grammarAccess.getFor_statementAccess().getToKeyword_2_0());
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2436:2: otherlv_3= Downto
                    {
                    otherlv_3=(Token)match(input,Downto,FOLLOW_Downto_in_rulefor_statement4748); 

                        	newLeafNode(otherlv_3, grammarAccess.getFor_statementAccess().getDowntoKeyword_2_1());
                        

                    }
                    break;

            }

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2440:2: ( (lv_expression_4_0= ruleexpression ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2441:1: (lv_expression_4_0= ruleexpression )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2441:1: (lv_expression_4_0= ruleexpression )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2442:3: lv_expression_4_0= ruleexpression
            {
             
            	        newCompositeNode(grammarAccess.getFor_statementAccess().getExpressionExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleexpression_in_rulefor_statement4769);
            lv_expression_4_0=ruleexpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFor_statementRule());
            	        }
                   		set(
                   			current, 
                   			"expression",
                    		lv_expression_4_0, 
                    		"expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,Do,FOLLOW_Do_in_rulefor_statement4782); 

                	newLeafNode(otherlv_5, grammarAccess.getFor_statementAccess().getDoKeyword_4());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2463:1: ( (lv_statement_6_0= rulestatement ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2464:1: (lv_statement_6_0= rulestatement )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2464:1: (lv_statement_6_0= rulestatement )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2465:3: lv_statement_6_0= rulestatement
            {
             
            	        newCompositeNode(grammarAccess.getFor_statementAccess().getStatementStatementParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_rulestatement_in_rulefor_statement4802);
            lv_statement_6_0=rulestatement();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFor_statementRule());
            	        }
                   		set(
                   			current, 
                   			"statement",
                    		lv_statement_6_0, 
                    		"statement");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "rulefor_statement"


    // $ANTLR start "entryRuleconditional_statement"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2489:1: entryRuleconditional_statement returns [EObject current=null] : iv_ruleconditional_statement= ruleconditional_statement EOF ;
    public final EObject entryRuleconditional_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleconditional_statement = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2490:2: (iv_ruleconditional_statement= ruleconditional_statement EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2491:2: iv_ruleconditional_statement= ruleconditional_statement EOF
            {
             newCompositeNode(grammarAccess.getConditional_statementRule()); 
            pushFollow(FOLLOW_ruleconditional_statement_in_entryRuleconditional_statement4837);
            iv_ruleconditional_statement=ruleconditional_statement();

            state._fsp--;

             current =iv_ruleconditional_statement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleconditional_statement4847); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleconditional_statement"


    // $ANTLR start "ruleconditional_statement"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2498:1: ruleconditional_statement returns [EObject current=null] : ( ( (lv_ifStmt_0_0= ruleif_statement ) ) | ( (lv_caseStmt_1_0= rulecase_statement ) ) ) ;
    public final EObject ruleconditional_statement() throws RecognitionException {
        EObject current = null;

        EObject lv_ifStmt_0_0 = null;

        EObject lv_caseStmt_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2501:28: ( ( ( (lv_ifStmt_0_0= ruleif_statement ) ) | ( (lv_caseStmt_1_0= rulecase_statement ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2502:1: ( ( (lv_ifStmt_0_0= ruleif_statement ) ) | ( (lv_caseStmt_1_0= rulecase_statement ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2502:1: ( ( (lv_ifStmt_0_0= ruleif_statement ) ) | ( (lv_caseStmt_1_0= rulecase_statement ) ) )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==If) ) {
                alt32=1;
            }
            else if ( (LA32_0==Case) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2502:2: ( (lv_ifStmt_0_0= ruleif_statement ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2502:2: ( (lv_ifStmt_0_0= ruleif_statement ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2503:1: (lv_ifStmt_0_0= ruleif_statement )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2503:1: (lv_ifStmt_0_0= ruleif_statement )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2504:3: lv_ifStmt_0_0= ruleif_statement
                    {
                     
                    	        newCompositeNode(grammarAccess.getConditional_statementAccess().getIfStmtIf_statementParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleif_statement_in_ruleconditional_statement4893);
                    lv_ifStmt_0_0=ruleif_statement();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConditional_statementRule());
                    	        }
                           		set(
                           			current, 
                           			"ifStmt",
                            		lv_ifStmt_0_0, 
                            		"if_statement");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2521:6: ( (lv_caseStmt_1_0= rulecase_statement ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2521:6: ( (lv_caseStmt_1_0= rulecase_statement ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2522:1: (lv_caseStmt_1_0= rulecase_statement )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2522:1: (lv_caseStmt_1_0= rulecase_statement )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2523:3: lv_caseStmt_1_0= rulecase_statement
                    {
                     
                    	        newCompositeNode(grammarAccess.getConditional_statementAccess().getCaseStmtCase_statementParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_rulecase_statement_in_ruleconditional_statement4920);
                    lv_caseStmt_1_0=rulecase_statement();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConditional_statementRule());
                    	        }
                           		set(
                           			current, 
                           			"caseStmt",
                            		lv_caseStmt_1_0, 
                            		"case_statement");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleconditional_statement"


    // $ANTLR start "entryRuleif_statement"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2547:1: entryRuleif_statement returns [EObject current=null] : iv_ruleif_statement= ruleif_statement EOF ;
    public final EObject entryRuleif_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleif_statement = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2548:2: (iv_ruleif_statement= ruleif_statement EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2549:2: iv_ruleif_statement= ruleif_statement EOF
            {
             newCompositeNode(grammarAccess.getIf_statementRule()); 
            pushFollow(FOLLOW_ruleif_statement_in_entryRuleif_statement4955);
            iv_ruleif_statement=ruleif_statement();

            state._fsp--;

             current =iv_ruleif_statement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleif_statement4965); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleif_statement"


    // $ANTLR start "ruleif_statement"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2556:1: ruleif_statement returns [EObject current=null] : (otherlv_0= If ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= Then ( (lv_ifStatement_3_0= rulestatement ) ) (otherlv_4= Else ( (lv_elseStatement_5_0= rulestatement ) ) )? ) ;
    public final EObject ruleif_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_expression_1_0 = null;

        EObject lv_ifStatement_3_0 = null;

        EObject lv_elseStatement_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2559:28: ( (otherlv_0= If ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= Then ( (lv_ifStatement_3_0= rulestatement ) ) (otherlv_4= Else ( (lv_elseStatement_5_0= rulestatement ) ) )? ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2560:1: (otherlv_0= If ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= Then ( (lv_ifStatement_3_0= rulestatement ) ) (otherlv_4= Else ( (lv_elseStatement_5_0= rulestatement ) ) )? )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2560:1: (otherlv_0= If ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= Then ( (lv_ifStatement_3_0= rulestatement ) ) (otherlv_4= Else ( (lv_elseStatement_5_0= rulestatement ) ) )? )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2561:2: otherlv_0= If ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= Then ( (lv_ifStatement_3_0= rulestatement ) ) (otherlv_4= Else ( (lv_elseStatement_5_0= rulestatement ) ) )?
            {
            otherlv_0=(Token)match(input,If,FOLLOW_If_in_ruleif_statement5003); 

                	newLeafNode(otherlv_0, grammarAccess.getIf_statementAccess().getIfKeyword_0());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2565:1: ( (lv_expression_1_0= ruleexpression ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2566:1: (lv_expression_1_0= ruleexpression )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2566:1: (lv_expression_1_0= ruleexpression )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2567:3: lv_expression_1_0= ruleexpression
            {
             
            	        newCompositeNode(grammarAccess.getIf_statementAccess().getExpressionExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleexpression_in_ruleif_statement5023);
            lv_expression_1_0=ruleexpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIf_statementRule());
            	        }
                   		set(
                   			current, 
                   			"expression",
                    		lv_expression_1_0, 
                    		"expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,Then,FOLLOW_Then_in_ruleif_statement5036); 

                	newLeafNode(otherlv_2, grammarAccess.getIf_statementAccess().getThenKeyword_2());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2588:1: ( (lv_ifStatement_3_0= rulestatement ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2589:1: (lv_ifStatement_3_0= rulestatement )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2589:1: (lv_ifStatement_3_0= rulestatement )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2590:3: lv_ifStatement_3_0= rulestatement
            {
             
            	        newCompositeNode(grammarAccess.getIf_statementAccess().getIfStatementStatementParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_rulestatement_in_ruleif_statement5056);
            lv_ifStatement_3_0=rulestatement();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIf_statementRule());
            	        }
                   		set(
                   			current, 
                   			"ifStatement",
                    		lv_ifStatement_3_0, 
                    		"statement");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2606:2: (otherlv_4= Else ( (lv_elseStatement_5_0= rulestatement ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==Else) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2607:2: otherlv_4= Else ( (lv_elseStatement_5_0= rulestatement ) )
                    {
                    otherlv_4=(Token)match(input,Else,FOLLOW_Else_in_ruleif_statement5070); 

                        	newLeafNode(otherlv_4, grammarAccess.getIf_statementAccess().getElseKeyword_4_0());
                        
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2611:1: ( (lv_elseStatement_5_0= rulestatement ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2612:1: (lv_elseStatement_5_0= rulestatement )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2612:1: (lv_elseStatement_5_0= rulestatement )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2613:3: lv_elseStatement_5_0= rulestatement
                    {
                     
                    	        newCompositeNode(grammarAccess.getIf_statementAccess().getElseStatementStatementParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_rulestatement_in_ruleif_statement5090);
                    lv_elseStatement_5_0=rulestatement();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getIf_statementRule());
                    	        }
                           		set(
                           			current, 
                           			"elseStatement",
                            		lv_elseStatement_5_0, 
                            		"statement");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleif_statement"


    // $ANTLR start "entryRulecase_statement"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2637:1: entryRulecase_statement returns [EObject current=null] : iv_rulecase_statement= rulecase_statement EOF ;
    public final EObject entryRulecase_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecase_statement = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2638:2: (iv_rulecase_statement= rulecase_statement EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2639:2: iv_rulecase_statement= rulecase_statement EOF
            {
             newCompositeNode(grammarAccess.getCase_statementRule()); 
            pushFollow(FOLLOW_rulecase_statement_in_entryRulecase_statement5127);
            iv_rulecase_statement=rulecase_statement();

            state._fsp--;

             current =iv_rulecase_statement; 
            match(input,EOF,FOLLOW_EOF_in_entryRulecase_statement5137); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulecase_statement"


    // $ANTLR start "rulecase_statement"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2646:1: rulecase_statement returns [EObject current=null] : (otherlv_0= Case ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= Of ( (lv_cases_3_0= rulecase_limb ) ) (otherlv_4= Semicolon ( (lv_cases_5_0= rulecase_limb ) ) )* (otherlv_6= Semicolon )? otherlv_7= End ) ;
    public final EObject rulecase_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_expression_1_0 = null;

        EObject lv_cases_3_0 = null;

        EObject lv_cases_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2649:28: ( (otherlv_0= Case ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= Of ( (lv_cases_3_0= rulecase_limb ) ) (otherlv_4= Semicolon ( (lv_cases_5_0= rulecase_limb ) ) )* (otherlv_6= Semicolon )? otherlv_7= End ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2650:1: (otherlv_0= Case ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= Of ( (lv_cases_3_0= rulecase_limb ) ) (otherlv_4= Semicolon ( (lv_cases_5_0= rulecase_limb ) ) )* (otherlv_6= Semicolon )? otherlv_7= End )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2650:1: (otherlv_0= Case ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= Of ( (lv_cases_3_0= rulecase_limb ) ) (otherlv_4= Semicolon ( (lv_cases_5_0= rulecase_limb ) ) )* (otherlv_6= Semicolon )? otherlv_7= End )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2651:2: otherlv_0= Case ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= Of ( (lv_cases_3_0= rulecase_limb ) ) (otherlv_4= Semicolon ( (lv_cases_5_0= rulecase_limb ) ) )* (otherlv_6= Semicolon )? otherlv_7= End
            {
            otherlv_0=(Token)match(input,Case,FOLLOW_Case_in_rulecase_statement5175); 

                	newLeafNode(otherlv_0, grammarAccess.getCase_statementAccess().getCaseKeyword_0());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2655:1: ( (lv_expression_1_0= ruleexpression ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2656:1: (lv_expression_1_0= ruleexpression )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2656:1: (lv_expression_1_0= ruleexpression )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2657:3: lv_expression_1_0= ruleexpression
            {
             
            	        newCompositeNode(grammarAccess.getCase_statementAccess().getExpressionExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleexpression_in_rulecase_statement5195);
            lv_expression_1_0=ruleexpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCase_statementRule());
            	        }
                   		set(
                   			current, 
                   			"expression",
                    		lv_expression_1_0, 
                    		"expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,Of,FOLLOW_Of_in_rulecase_statement5208); 

                	newLeafNode(otherlv_2, grammarAccess.getCase_statementAccess().getOfKeyword_2());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2678:1: ( (lv_cases_3_0= rulecase_limb ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2679:1: (lv_cases_3_0= rulecase_limb )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2679:1: (lv_cases_3_0= rulecase_limb )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2680:3: lv_cases_3_0= rulecase_limb
            {
             
            	        newCompositeNode(grammarAccess.getCase_statementAccess().getCasesCase_limbParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_rulecase_limb_in_rulecase_statement5228);
            lv_cases_3_0=rulecase_limb();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCase_statementRule());
            	        }
                   		add(
                   			current, 
                   			"cases",
                    		lv_cases_3_0, 
                    		"case_limb");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2696:2: (otherlv_4= Semicolon ( (lv_cases_5_0= rulecase_limb ) ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==Semicolon) ) {
                    int LA34_1 = input.LA(2);

                    if ( (LA34_1==False||LA34_1==True||LA34_1==Nil||(LA34_1>=RULE_INTEGER_NUMBER && LA34_1<=RULE_SIGNED_REAL_NUMBER)||LA34_1==RULE_ADDITION_OPERATOR||LA34_1==RULE_ID||LA34_1==RULE_STRING) ) {
                        alt34=1;
                    }


                }


                switch (alt34) {
            	case 1 :
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2697:2: otherlv_4= Semicolon ( (lv_cases_5_0= rulecase_limb ) )
            	    {
            	    otherlv_4=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_rulecase_statement5242); 

            	        	newLeafNode(otherlv_4, grammarAccess.getCase_statementAccess().getSemicolonKeyword_4_0());
            	        
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2701:1: ( (lv_cases_5_0= rulecase_limb ) )
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2702:1: (lv_cases_5_0= rulecase_limb )
            	    {
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2702:1: (lv_cases_5_0= rulecase_limb )
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2703:3: lv_cases_5_0= rulecase_limb
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCase_statementAccess().getCasesCase_limbParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulecase_limb_in_rulecase_statement5262);
            	    lv_cases_5_0=rulecase_limb();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCase_statementRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"cases",
            	            		lv_cases_5_0, 
            	            		"case_limb");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2719:4: (otherlv_6= Semicolon )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==Semicolon) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2720:2: otherlv_6= Semicolon
                    {
                    otherlv_6=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_rulecase_statement5278); 

                        	newLeafNode(otherlv_6, grammarAccess.getCase_statementAccess().getSemicolonKeyword_5());
                        

                    }
                    break;

            }

            otherlv_7=(Token)match(input,End,FOLLOW_End_in_rulecase_statement5292); 

                	newLeafNode(otherlv_7, grammarAccess.getCase_statementAccess().getEndKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "rulecase_statement"


    // $ANTLR start "entryRulecase_limb"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2737:1: entryRulecase_limb returns [EObject current=null] : iv_rulecase_limb= rulecase_limb EOF ;
    public final EObject entryRulecase_limb() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecase_limb = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2738:2: (iv_rulecase_limb= rulecase_limb EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2739:2: iv_rulecase_limb= rulecase_limb EOF
            {
             newCompositeNode(grammarAccess.getCase_limbRule()); 
            pushFollow(FOLLOW_rulecase_limb_in_entryRulecase_limb5326);
            iv_rulecase_limb=rulecase_limb();

            state._fsp--;

             current =iv_rulecase_limb; 
            match(input,EOF,FOLLOW_EOF_in_entryRulecase_limb5336); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulecase_limb"


    // $ANTLR start "rulecase_limb"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2746:1: rulecase_limb returns [EObject current=null] : ( ( (lv_cases_0_0= rulecase_label_list ) ) otherlv_1= Colon ( (lv_statement_2_0= rulestatement ) ) ) ;
    public final EObject rulecase_limb() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_cases_0_0 = null;

        EObject lv_statement_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2749:28: ( ( ( (lv_cases_0_0= rulecase_label_list ) ) otherlv_1= Colon ( (lv_statement_2_0= rulestatement ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2750:1: ( ( (lv_cases_0_0= rulecase_label_list ) ) otherlv_1= Colon ( (lv_statement_2_0= rulestatement ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2750:1: ( ( (lv_cases_0_0= rulecase_label_list ) ) otherlv_1= Colon ( (lv_statement_2_0= rulestatement ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2750:2: ( (lv_cases_0_0= rulecase_label_list ) ) otherlv_1= Colon ( (lv_statement_2_0= rulestatement ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2750:2: ( (lv_cases_0_0= rulecase_label_list ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2751:1: (lv_cases_0_0= rulecase_label_list )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2751:1: (lv_cases_0_0= rulecase_label_list )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2752:3: lv_cases_0_0= rulecase_label_list
            {
             
            	        newCompositeNode(grammarAccess.getCase_limbAccess().getCasesCase_label_listParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_rulecase_label_list_in_rulecase_limb5382);
            lv_cases_0_0=rulecase_label_list();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCase_limbRule());
            	        }
                   		set(
                   			current, 
                   			"cases",
                    		lv_cases_0_0, 
                    		"case_label_list");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_Colon_in_rulecase_limb5395); 

                	newLeafNode(otherlv_1, grammarAccess.getCase_limbAccess().getColonKeyword_1());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2773:1: ( (lv_statement_2_0= rulestatement ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2774:1: (lv_statement_2_0= rulestatement )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2774:1: (lv_statement_2_0= rulestatement )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2775:3: lv_statement_2_0= rulestatement
            {
             
            	        newCompositeNode(grammarAccess.getCase_limbAccess().getStatementStatementParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_rulestatement_in_rulecase_limb5415);
            lv_statement_2_0=rulestatement();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCase_limbRule());
            	        }
                   		set(
                   			current, 
                   			"statement",
                    		lv_statement_2_0, 
                    		"statement");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "rulecase_limb"


    // $ANTLR start "entryRulecase_label_list"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2799:1: entryRulecase_label_list returns [EObject current=null] : iv_rulecase_label_list= rulecase_label_list EOF ;
    public final EObject entryRulecase_label_list() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecase_label_list = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2800:2: (iv_rulecase_label_list= rulecase_label_list EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2801:2: iv_rulecase_label_list= rulecase_label_list EOF
            {
             newCompositeNode(grammarAccess.getCase_label_listRule()); 
            pushFollow(FOLLOW_rulecase_label_list_in_entryRulecase_label_list5450);
            iv_rulecase_label_list=rulecase_label_list();

            state._fsp--;

             current =iv_rulecase_label_list; 
            match(input,EOF,FOLLOW_EOF_in_entryRulecase_label_list5460); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulecase_label_list"


    // $ANTLR start "rulecase_label_list"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2808:1: rulecase_label_list returns [EObject current=null] : ( ( (lv_constants_0_0= ruleconstant ) ) (otherlv_1= Comma ( (lv_constants_2_0= ruleconstant ) ) )* ) ;
    public final EObject rulecase_label_list() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_constants_0_0 = null;

        EObject lv_constants_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2811:28: ( ( ( (lv_constants_0_0= ruleconstant ) ) (otherlv_1= Comma ( (lv_constants_2_0= ruleconstant ) ) )* ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2812:1: ( ( (lv_constants_0_0= ruleconstant ) ) (otherlv_1= Comma ( (lv_constants_2_0= ruleconstant ) ) )* )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2812:1: ( ( (lv_constants_0_0= ruleconstant ) ) (otherlv_1= Comma ( (lv_constants_2_0= ruleconstant ) ) )* )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2812:2: ( (lv_constants_0_0= ruleconstant ) ) (otherlv_1= Comma ( (lv_constants_2_0= ruleconstant ) ) )*
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2812:2: ( (lv_constants_0_0= ruleconstant ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2813:1: (lv_constants_0_0= ruleconstant )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2813:1: (lv_constants_0_0= ruleconstant )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2814:3: lv_constants_0_0= ruleconstant
            {
             
            	        newCompositeNode(grammarAccess.getCase_label_listAccess().getConstantsConstantParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleconstant_in_rulecase_label_list5506);
            lv_constants_0_0=ruleconstant();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCase_label_listRule());
            	        }
                   		add(
                   			current, 
                   			"constants",
                    		lv_constants_0_0, 
                    		"constant");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2830:2: (otherlv_1= Comma ( (lv_constants_2_0= ruleconstant ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==Comma) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2831:2: otherlv_1= Comma ( (lv_constants_2_0= ruleconstant ) )
            	    {
            	    otherlv_1=(Token)match(input,Comma,FOLLOW_Comma_in_rulecase_label_list5520); 

            	        	newLeafNode(otherlv_1, grammarAccess.getCase_label_listAccess().getCommaKeyword_1_0());
            	        
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2835:1: ( (lv_constants_2_0= ruleconstant ) )
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2836:1: (lv_constants_2_0= ruleconstant )
            	    {
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2836:1: (lv_constants_2_0= ruleconstant )
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2837:3: lv_constants_2_0= ruleconstant
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCase_label_listAccess().getConstantsConstantParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleconstant_in_rulecase_label_list5540);
            	    lv_constants_2_0=ruleconstant();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCase_label_listRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"constants",
            	            		lv_constants_2_0, 
            	            		"constant");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "rulecase_label_list"


    // $ANTLR start "entryRuleconstant"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2861:1: entryRuleconstant returns [EObject current=null] : iv_ruleconstant= ruleconstant EOF ;
    public final EObject entryRuleconstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleconstant = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2862:2: (iv_ruleconstant= ruleconstant EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2863:2: iv_ruleconstant= ruleconstant EOF
            {
             newCompositeNode(grammarAccess.getConstantRule()); 
            pushFollow(FOLLOW_ruleconstant_in_entryRuleconstant5577);
            iv_ruleconstant=ruleconstant();

            state._fsp--;

             current =iv_ruleconstant; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleconstant5587); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleconstant"


    // $ANTLR start "ruleconstant"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2870:1: ruleconstant returns [EObject current=null] : ( ( ( (lv_opterator_0_0= RULE_ADDITION_OPERATOR ) )? ( ( (lv_name_1_0= RULE_ID ) ) | ( (lv_number_2_0= rulenumber ) ) ) ) | ( (lv_string_3_0= RULE_STRING ) ) | ( (lv_boolLiteral_4_0= True ) ) | ( (lv_boolLiteral_5_0= False ) ) | ( (lv_nil_6_0= Nil ) ) ) ;
    public final EObject ruleconstant() throws RecognitionException {
        EObject current = null;

        Token lv_opterator_0_0=null;
        Token lv_name_1_0=null;
        Token lv_string_3_0=null;
        Token lv_boolLiteral_4_0=null;
        Token lv_boolLiteral_5_0=null;
        Token lv_nil_6_0=null;
        EObject lv_number_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2873:28: ( ( ( ( (lv_opterator_0_0= RULE_ADDITION_OPERATOR ) )? ( ( (lv_name_1_0= RULE_ID ) ) | ( (lv_number_2_0= rulenumber ) ) ) ) | ( (lv_string_3_0= RULE_STRING ) ) | ( (lv_boolLiteral_4_0= True ) ) | ( (lv_boolLiteral_5_0= False ) ) | ( (lv_nil_6_0= Nil ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2874:1: ( ( ( (lv_opterator_0_0= RULE_ADDITION_OPERATOR ) )? ( ( (lv_name_1_0= RULE_ID ) ) | ( (lv_number_2_0= rulenumber ) ) ) ) | ( (lv_string_3_0= RULE_STRING ) ) | ( (lv_boolLiteral_4_0= True ) ) | ( (lv_boolLiteral_5_0= False ) ) | ( (lv_nil_6_0= Nil ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2874:1: ( ( ( (lv_opterator_0_0= RULE_ADDITION_OPERATOR ) )? ( ( (lv_name_1_0= RULE_ID ) ) | ( (lv_number_2_0= rulenumber ) ) ) ) | ( (lv_string_3_0= RULE_STRING ) ) | ( (lv_boolLiteral_4_0= True ) ) | ( (lv_boolLiteral_5_0= False ) ) | ( (lv_nil_6_0= Nil ) ) )
            int alt39=5;
            switch ( input.LA(1) ) {
            case RULE_INTEGER_NUMBER:
            case RULE_REAL_NUMBER:
            case RULE_SIGNED_INTEGER_NUMBER:
            case RULE_SIGNED_REAL_NUMBER:
            case RULE_ADDITION_OPERATOR:
            case RULE_ID:
                {
                alt39=1;
                }
                break;
            case RULE_STRING:
                {
                alt39=2;
                }
                break;
            case True:
                {
                alt39=3;
                }
                break;
            case False:
                {
                alt39=4;
                }
                break;
            case Nil:
                {
                alt39=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2874:2: ( ( (lv_opterator_0_0= RULE_ADDITION_OPERATOR ) )? ( ( (lv_name_1_0= RULE_ID ) ) | ( (lv_number_2_0= rulenumber ) ) ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2874:2: ( ( (lv_opterator_0_0= RULE_ADDITION_OPERATOR ) )? ( ( (lv_name_1_0= RULE_ID ) ) | ( (lv_number_2_0= rulenumber ) ) ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2874:3: ( (lv_opterator_0_0= RULE_ADDITION_OPERATOR ) )? ( ( (lv_name_1_0= RULE_ID ) ) | ( (lv_number_2_0= rulenumber ) ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2874:3: ( (lv_opterator_0_0= RULE_ADDITION_OPERATOR ) )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==RULE_ADDITION_OPERATOR) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2875:1: (lv_opterator_0_0= RULE_ADDITION_OPERATOR )
                            {
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2875:1: (lv_opterator_0_0= RULE_ADDITION_OPERATOR )
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2876:3: lv_opterator_0_0= RULE_ADDITION_OPERATOR
                            {
                            lv_opterator_0_0=(Token)match(input,RULE_ADDITION_OPERATOR,FOLLOW_RULE_ADDITION_OPERATOR_in_ruleconstant5630); 

                            			newLeafNode(lv_opterator_0_0, grammarAccess.getConstantAccess().getOpteratorADDITION_OPERATORTerminalRuleCall_0_0_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getConstantRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"opterator",
                                    		lv_opterator_0_0, 
                                    		"ADDITION_OPERATOR");
                            	    

                            }


                            }
                            break;

                    }

                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2892:3: ( ( (lv_name_1_0= RULE_ID ) ) | ( (lv_number_2_0= rulenumber ) ) )
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==RULE_ID) ) {
                        alt38=1;
                    }
                    else if ( ((LA38_0>=RULE_INTEGER_NUMBER && LA38_0<=RULE_SIGNED_REAL_NUMBER)) ) {
                        alt38=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 38, 0, input);

                        throw nvae;
                    }
                    switch (alt38) {
                        case 1 :
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2892:4: ( (lv_name_1_0= RULE_ID ) )
                            {
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2892:4: ( (lv_name_1_0= RULE_ID ) )
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2893:1: (lv_name_1_0= RULE_ID )
                            {
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2893:1: (lv_name_1_0= RULE_ID )
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2894:3: lv_name_1_0= RULE_ID
                            {
                            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleconstant5654); 

                            			newLeafNode(lv_name_1_0, grammarAccess.getConstantAccess().getNameIDTerminalRuleCall_0_1_0_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getConstantRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"name",
                                    		lv_name_1_0, 
                                    		"ID");
                            	    

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2911:6: ( (lv_number_2_0= rulenumber ) )
                            {
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2911:6: ( (lv_number_2_0= rulenumber ) )
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2912:1: (lv_number_2_0= rulenumber )
                            {
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2912:1: (lv_number_2_0= rulenumber )
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2913:3: lv_number_2_0= rulenumber
                            {
                             
                            	        newCompositeNode(grammarAccess.getConstantAccess().getNumberNumberParserRuleCall_0_1_1_0()); 
                            	    
                            pushFollow(FOLLOW_rulenumber_in_ruleconstant5686);
                            lv_number_2_0=rulenumber();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getConstantRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"number",
                                    		lv_number_2_0, 
                                    		"number");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2930:6: ( (lv_string_3_0= RULE_STRING ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2930:6: ( (lv_string_3_0= RULE_STRING ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2931:1: (lv_string_3_0= RULE_STRING )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2931:1: (lv_string_3_0= RULE_STRING )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2932:3: lv_string_3_0= RULE_STRING
                    {
                    lv_string_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleconstant5711); 

                    			newLeafNode(lv_string_3_0, grammarAccess.getConstantAccess().getStringSTRINGTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConstantRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"string",
                            		lv_string_3_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2949:6: ( (lv_boolLiteral_4_0= True ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2949:6: ( (lv_boolLiteral_4_0= True ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2950:1: (lv_boolLiteral_4_0= True )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2950:1: (lv_boolLiteral_4_0= True )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2951:3: lv_boolLiteral_4_0= True
                    {
                    lv_boolLiteral_4_0=(Token)match(input,True,FOLLOW_True_in_ruleconstant5741); 

                            newLeafNode(lv_boolLiteral_4_0, grammarAccess.getConstantAccess().getBoolLiteralTrueKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConstantRule());
                    	        }
                           		setWithLastConsumed(current, "boolLiteral", lv_boolLiteral_4_0, "true");
                    	    

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2966:6: ( (lv_boolLiteral_5_0= False ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2966:6: ( (lv_boolLiteral_5_0= False ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2967:1: (lv_boolLiteral_5_0= False )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2967:1: (lv_boolLiteral_5_0= False )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2968:3: lv_boolLiteral_5_0= False
                    {
                    lv_boolLiteral_5_0=(Token)match(input,False,FOLLOW_False_in_ruleconstant5777); 

                            newLeafNode(lv_boolLiteral_5_0, grammarAccess.getConstantAccess().getBoolLiteralFalseKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConstantRule());
                    	        }
                           		setWithLastConsumed(current, "boolLiteral", lv_boolLiteral_5_0, "false");
                    	    

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2983:6: ( (lv_nil_6_0= Nil ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2983:6: ( (lv_nil_6_0= Nil ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2984:1: (lv_nil_6_0= Nil )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2984:1: (lv_nil_6_0= Nil )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:2985:3: lv_nil_6_0= Nil
                    {
                    lv_nil_6_0=(Token)match(input,Nil,FOLLOW_Nil_in_ruleconstant5813); 

                            newLeafNode(lv_nil_6_0, grammarAccess.getConstantAccess().getNilNilKeyword_4_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConstantRule());
                    	        }
                           		setWithLastConsumed(current, "nil", lv_nil_6_0, "nil");
                    	    

                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleconstant"


    // $ANTLR start "entryRulewith_statement"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3007:1: entryRulewith_statement returns [EObject current=null] : iv_rulewith_statement= rulewith_statement EOF ;
    public final EObject entryRulewith_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulewith_statement = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3008:2: (iv_rulewith_statement= rulewith_statement EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3009:2: iv_rulewith_statement= rulewith_statement EOF
            {
             newCompositeNode(grammarAccess.getWith_statementRule()); 
            pushFollow(FOLLOW_rulewith_statement_in_entryRulewith_statement5859);
            iv_rulewith_statement=rulewith_statement();

            state._fsp--;

             current =iv_rulewith_statement; 
            match(input,EOF,FOLLOW_EOF_in_entryRulewith_statement5869); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulewith_statement"


    // $ANTLR start "rulewith_statement"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3016:1: rulewith_statement returns [EObject current=null] : (otherlv_0= With ( (lv_variables_1_0= rulevariable ) ) (otherlv_2= Comma ( (lv_variables_3_0= rulevariable ) ) )* otherlv_4= Do ( (lv_statement_5_0= rulestatement ) ) ) ;
    public final EObject rulewith_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_variables_1_0 = null;

        EObject lv_variables_3_0 = null;

        EObject lv_statement_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3019:28: ( (otherlv_0= With ( (lv_variables_1_0= rulevariable ) ) (otherlv_2= Comma ( (lv_variables_3_0= rulevariable ) ) )* otherlv_4= Do ( (lv_statement_5_0= rulestatement ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3020:1: (otherlv_0= With ( (lv_variables_1_0= rulevariable ) ) (otherlv_2= Comma ( (lv_variables_3_0= rulevariable ) ) )* otherlv_4= Do ( (lv_statement_5_0= rulestatement ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3020:1: (otherlv_0= With ( (lv_variables_1_0= rulevariable ) ) (otherlv_2= Comma ( (lv_variables_3_0= rulevariable ) ) )* otherlv_4= Do ( (lv_statement_5_0= rulestatement ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3021:2: otherlv_0= With ( (lv_variables_1_0= rulevariable ) ) (otherlv_2= Comma ( (lv_variables_3_0= rulevariable ) ) )* otherlv_4= Do ( (lv_statement_5_0= rulestatement ) )
            {
            otherlv_0=(Token)match(input,With,FOLLOW_With_in_rulewith_statement5907); 

                	newLeafNode(otherlv_0, grammarAccess.getWith_statementAccess().getWithKeyword_0());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3025:1: ( (lv_variables_1_0= rulevariable ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3026:1: (lv_variables_1_0= rulevariable )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3026:1: (lv_variables_1_0= rulevariable )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3027:3: lv_variables_1_0= rulevariable
            {
             
            	        newCompositeNode(grammarAccess.getWith_statementAccess().getVariablesVariableParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulevariable_in_rulewith_statement5927);
            lv_variables_1_0=rulevariable();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getWith_statementRule());
            	        }
                   		add(
                   			current, 
                   			"variables",
                    		lv_variables_1_0, 
                    		"variable");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3043:2: (otherlv_2= Comma ( (lv_variables_3_0= rulevariable ) ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==Comma) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3044:2: otherlv_2= Comma ( (lv_variables_3_0= rulevariable ) )
            	    {
            	    otherlv_2=(Token)match(input,Comma,FOLLOW_Comma_in_rulewith_statement5941); 

            	        	newLeafNode(otherlv_2, grammarAccess.getWith_statementAccess().getCommaKeyword_2_0());
            	        
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3048:1: ( (lv_variables_3_0= rulevariable ) )
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3049:1: (lv_variables_3_0= rulevariable )
            	    {
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3049:1: (lv_variables_3_0= rulevariable )
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3050:3: lv_variables_3_0= rulevariable
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getWith_statementAccess().getVariablesVariableParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulevariable_in_rulewith_statement5961);
            	    lv_variables_3_0=rulevariable();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getWith_statementRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"variables",
            	            		lv_variables_3_0, 
            	            		"variable");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            otherlv_4=(Token)match(input,Do,FOLLOW_Do_in_rulewith_statement5976); 

                	newLeafNode(otherlv_4, grammarAccess.getWith_statementAccess().getDoKeyword_3());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3071:1: ( (lv_statement_5_0= rulestatement ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3072:1: (lv_statement_5_0= rulestatement )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3072:1: (lv_statement_5_0= rulestatement )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3073:3: lv_statement_5_0= rulestatement
            {
             
            	        newCompositeNode(grammarAccess.getWith_statementAccess().getStatementStatementParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_rulestatement_in_rulewith_statement5996);
            lv_statement_5_0=rulestatement();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getWith_statementRule());
            	        }
                   		set(
                   			current, 
                   			"statement",
                    		lv_statement_5_0, 
                    		"statement");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "rulewith_statement"


    // $ANTLR start "entryRulegoto_statement"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3097:1: entryRulegoto_statement returns [EObject current=null] : iv_rulegoto_statement= rulegoto_statement EOF ;
    public final EObject entryRulegoto_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulegoto_statement = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3098:2: (iv_rulegoto_statement= rulegoto_statement EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3099:2: iv_rulegoto_statement= rulegoto_statement EOF
            {
             newCompositeNode(grammarAccess.getGoto_statementRule()); 
            pushFollow(FOLLOW_rulegoto_statement_in_entryRulegoto_statement6031);
            iv_rulegoto_statement=rulegoto_statement();

            state._fsp--;

             current =iv_rulegoto_statement; 
            match(input,EOF,FOLLOW_EOF_in_entryRulegoto_statement6041); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulegoto_statement"


    // $ANTLR start "rulegoto_statement"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3106:1: rulegoto_statement returns [EObject current=null] : (otherlv_0= Goto ( (lv_label_1_0= rulelabel ) ) ) ;
    public final EObject rulegoto_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_label_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3109:28: ( (otherlv_0= Goto ( (lv_label_1_0= rulelabel ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3110:1: (otherlv_0= Goto ( (lv_label_1_0= rulelabel ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3110:1: (otherlv_0= Goto ( (lv_label_1_0= rulelabel ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3111:2: otherlv_0= Goto ( (lv_label_1_0= rulelabel ) )
            {
            otherlv_0=(Token)match(input,Goto,FOLLOW_Goto_in_rulegoto_statement6079); 

                	newLeafNode(otherlv_0, grammarAccess.getGoto_statementAccess().getGotoKeyword_0());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3115:1: ( (lv_label_1_0= rulelabel ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3116:1: (lv_label_1_0= rulelabel )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3116:1: (lv_label_1_0= rulelabel )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3117:3: lv_label_1_0= rulelabel
            {
             
            	        newCompositeNode(grammarAccess.getGoto_statementAccess().getLabelLabelParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulelabel_in_rulegoto_statement6099);
            lv_label_1_0=rulelabel();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGoto_statementRule());
            	        }
                   		set(
                   			current, 
                   			"label",
                    		lv_label_1_0, 
                    		"label");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "rulegoto_statement"


    // $ANTLR start "entryRulelabel_declaration_part"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3141:1: entryRulelabel_declaration_part returns [EObject current=null] : iv_rulelabel_declaration_part= rulelabel_declaration_part EOF ;
    public final EObject entryRulelabel_declaration_part() throws RecognitionException {
        EObject current = null;

        EObject iv_rulelabel_declaration_part = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3142:2: (iv_rulelabel_declaration_part= rulelabel_declaration_part EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3143:2: iv_rulelabel_declaration_part= rulelabel_declaration_part EOF
            {
             newCompositeNode(grammarAccess.getLabel_declaration_partRule()); 
            pushFollow(FOLLOW_rulelabel_declaration_part_in_entryRulelabel_declaration_part6134);
            iv_rulelabel_declaration_part=rulelabel_declaration_part();

            state._fsp--;

             current =iv_rulelabel_declaration_part; 
            match(input,EOF,FOLLOW_EOF_in_entryRulelabel_declaration_part6144); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulelabel_declaration_part"


    // $ANTLR start "rulelabel_declaration_part"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3150:1: rulelabel_declaration_part returns [EObject current=null] : (otherlv_0= Label ( (lv_labels_1_0= rulelabel ) ) (otherlv_2= Comma ( (lv_labels_3_0= rulelabel ) ) )* otherlv_4= Semicolon ) ;
    public final EObject rulelabel_declaration_part() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_labels_1_0 = null;

        EObject lv_labels_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3153:28: ( (otherlv_0= Label ( (lv_labels_1_0= rulelabel ) ) (otherlv_2= Comma ( (lv_labels_3_0= rulelabel ) ) )* otherlv_4= Semicolon ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3154:1: (otherlv_0= Label ( (lv_labels_1_0= rulelabel ) ) (otherlv_2= Comma ( (lv_labels_3_0= rulelabel ) ) )* otherlv_4= Semicolon )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3154:1: (otherlv_0= Label ( (lv_labels_1_0= rulelabel ) ) (otherlv_2= Comma ( (lv_labels_3_0= rulelabel ) ) )* otherlv_4= Semicolon )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3155:2: otherlv_0= Label ( (lv_labels_1_0= rulelabel ) ) (otherlv_2= Comma ( (lv_labels_3_0= rulelabel ) ) )* otherlv_4= Semicolon
            {
            otherlv_0=(Token)match(input,Label,FOLLOW_Label_in_rulelabel_declaration_part6182); 

                	newLeafNode(otherlv_0, grammarAccess.getLabel_declaration_partAccess().getLabelKeyword_0());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3159:1: ( (lv_labels_1_0= rulelabel ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3160:1: (lv_labels_1_0= rulelabel )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3160:1: (lv_labels_1_0= rulelabel )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3161:3: lv_labels_1_0= rulelabel
            {
             
            	        newCompositeNode(grammarAccess.getLabel_declaration_partAccess().getLabelsLabelParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulelabel_in_rulelabel_declaration_part6202);
            lv_labels_1_0=rulelabel();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLabel_declaration_partRule());
            	        }
                   		add(
                   			current, 
                   			"labels",
                    		lv_labels_1_0, 
                    		"label");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3177:2: (otherlv_2= Comma ( (lv_labels_3_0= rulelabel ) ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==Comma) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3178:2: otherlv_2= Comma ( (lv_labels_3_0= rulelabel ) )
            	    {
            	    otherlv_2=(Token)match(input,Comma,FOLLOW_Comma_in_rulelabel_declaration_part6216); 

            	        	newLeafNode(otherlv_2, grammarAccess.getLabel_declaration_partAccess().getCommaKeyword_2_0());
            	        
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3182:1: ( (lv_labels_3_0= rulelabel ) )
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3183:1: (lv_labels_3_0= rulelabel )
            	    {
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3183:1: (lv_labels_3_0= rulelabel )
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3184:3: lv_labels_3_0= rulelabel
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLabel_declaration_partAccess().getLabelsLabelParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulelabel_in_rulelabel_declaration_part6236);
            	    lv_labels_3_0=rulelabel();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getLabel_declaration_partRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"labels",
            	            		lv_labels_3_0, 
            	            		"label");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            otherlv_4=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_rulelabel_declaration_part6251); 

                	newLeafNode(otherlv_4, grammarAccess.getLabel_declaration_partAccess().getSemicolonKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "rulelabel_declaration_part"


    // $ANTLR start "entryRuleconstant_definition_part"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3213:1: entryRuleconstant_definition_part returns [EObject current=null] : iv_ruleconstant_definition_part= ruleconstant_definition_part EOF ;
    public final EObject entryRuleconstant_definition_part() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleconstant_definition_part = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3214:2: (iv_ruleconstant_definition_part= ruleconstant_definition_part EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3215:2: iv_ruleconstant_definition_part= ruleconstant_definition_part EOF
            {
             newCompositeNode(grammarAccess.getConstant_definition_partRule()); 
            pushFollow(FOLLOW_ruleconstant_definition_part_in_entryRuleconstant_definition_part6285);
            iv_ruleconstant_definition_part=ruleconstant_definition_part();

            state._fsp--;

             current =iv_ruleconstant_definition_part; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleconstant_definition_part6295); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleconstant_definition_part"


    // $ANTLR start "ruleconstant_definition_part"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3222:1: ruleconstant_definition_part returns [EObject current=null] : (otherlv_0= Const ( ( (lv_consts_1_0= ruleconstant_definition ) ) otherlv_2= Semicolon )+ ) ;
    public final EObject ruleconstant_definition_part() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_consts_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3225:28: ( (otherlv_0= Const ( ( (lv_consts_1_0= ruleconstant_definition ) ) otherlv_2= Semicolon )+ ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3226:1: (otherlv_0= Const ( ( (lv_consts_1_0= ruleconstant_definition ) ) otherlv_2= Semicolon )+ )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3226:1: (otherlv_0= Const ( ( (lv_consts_1_0= ruleconstant_definition ) ) otherlv_2= Semicolon )+ )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3227:2: otherlv_0= Const ( ( (lv_consts_1_0= ruleconstant_definition ) ) otherlv_2= Semicolon )+
            {
            otherlv_0=(Token)match(input,Const,FOLLOW_Const_in_ruleconstant_definition_part6333); 

                	newLeafNode(otherlv_0, grammarAccess.getConstant_definition_partAccess().getConstKeyword_0());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3231:1: ( ( (lv_consts_1_0= ruleconstant_definition ) ) otherlv_2= Semicolon )+
            int cnt42=0;
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==RULE_ID) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3231:2: ( (lv_consts_1_0= ruleconstant_definition ) ) otherlv_2= Semicolon
            	    {
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3231:2: ( (lv_consts_1_0= ruleconstant_definition ) )
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3232:1: (lv_consts_1_0= ruleconstant_definition )
            	    {
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3232:1: (lv_consts_1_0= ruleconstant_definition )
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3233:3: lv_consts_1_0= ruleconstant_definition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getConstant_definition_partAccess().getConstsConstant_definitionParserRuleCall_1_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleconstant_definition_in_ruleconstant_definition_part6354);
            	    lv_consts_1_0=ruleconstant_definition();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getConstant_definition_partRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"consts",
            	            		lv_consts_1_0, 
            	            		"constant_definition");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_2=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_ruleconstant_definition_part6367); 

            	        	newLeafNode(otherlv_2, grammarAccess.getConstant_definition_partAccess().getSemicolonKeyword_1_1());
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt42 >= 1 ) break loop42;
                        EarlyExitException eee =
                            new EarlyExitException(42, input);
                        throw eee;
                }
                cnt42++;
            } while (true);


            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleconstant_definition_part"


    // $ANTLR start "entryRuleconstant_definition"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3262:1: entryRuleconstant_definition returns [EObject current=null] : iv_ruleconstant_definition= ruleconstant_definition EOF ;
    public final EObject entryRuleconstant_definition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleconstant_definition = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3263:2: (iv_ruleconstant_definition= ruleconstant_definition EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3264:2: iv_ruleconstant_definition= ruleconstant_definition EOF
            {
             newCompositeNode(grammarAccess.getConstant_definitionRule()); 
            pushFollow(FOLLOW_ruleconstant_definition_in_entryRuleconstant_definition6403);
            iv_ruleconstant_definition=ruleconstant_definition();

            state._fsp--;

             current =iv_ruleconstant_definition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleconstant_definition6413); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleconstant_definition"


    // $ANTLR start "ruleconstant_definition"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3271:1: ruleconstant_definition returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= EqualsSign ( (lv_const_2_0= ruleconstant ) ) ) ;
    public final EObject ruleconstant_definition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_const_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3274:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= EqualsSign ( (lv_const_2_0= ruleconstant ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3275:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= EqualsSign ( (lv_const_2_0= ruleconstant ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3275:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= EqualsSign ( (lv_const_2_0= ruleconstant ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3275:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= EqualsSign ( (lv_const_2_0= ruleconstant ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3275:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3276:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3276:1: (lv_name_0_0= RULE_ID )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3277:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleconstant_definition6455); 

            			newLeafNode(lv_name_0_0, grammarAccess.getConstant_definitionAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getConstant_definitionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,EqualsSign,FOLLOW_EqualsSign_in_ruleconstant_definition6473); 

                	newLeafNode(otherlv_1, grammarAccess.getConstant_definitionAccess().getEqualsSignKeyword_1());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3298:1: ( (lv_const_2_0= ruleconstant ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3299:1: (lv_const_2_0= ruleconstant )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3299:1: (lv_const_2_0= ruleconstant )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3300:3: lv_const_2_0= ruleconstant
            {
             
            	        newCompositeNode(grammarAccess.getConstant_definitionAccess().getConstConstantParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleconstant_in_ruleconstant_definition6493);
            lv_const_2_0=ruleconstant();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConstant_definitionRule());
            	        }
                   		set(
                   			current, 
                   			"const",
                    		lv_const_2_0, 
                    		"constant");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleconstant_definition"


    // $ANTLR start "entryRuletype_definition_part"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3324:1: entryRuletype_definition_part returns [EObject current=null] : iv_ruletype_definition_part= ruletype_definition_part EOF ;
    public final EObject entryRuletype_definition_part() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletype_definition_part = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3325:2: (iv_ruletype_definition_part= ruletype_definition_part EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3326:2: iv_ruletype_definition_part= ruletype_definition_part EOF
            {
             newCompositeNode(grammarAccess.getType_definition_partRule()); 
            pushFollow(FOLLOW_ruletype_definition_part_in_entryRuletype_definition_part6528);
            iv_ruletype_definition_part=ruletype_definition_part();

            state._fsp--;

             current =iv_ruletype_definition_part; 
            match(input,EOF,FOLLOW_EOF_in_entryRuletype_definition_part6538); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuletype_definition_part"


    // $ANTLR start "ruletype_definition_part"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3333:1: ruletype_definition_part returns [EObject current=null] : (otherlv_0= Type ( ( (lv_types_1_0= ruletype_definition ) ) otherlv_2= Semicolon )+ ) ;
    public final EObject ruletype_definition_part() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_types_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3336:28: ( (otherlv_0= Type ( ( (lv_types_1_0= ruletype_definition ) ) otherlv_2= Semicolon )+ ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3337:1: (otherlv_0= Type ( ( (lv_types_1_0= ruletype_definition ) ) otherlv_2= Semicolon )+ )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3337:1: (otherlv_0= Type ( ( (lv_types_1_0= ruletype_definition ) ) otherlv_2= Semicolon )+ )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3338:2: otherlv_0= Type ( ( (lv_types_1_0= ruletype_definition ) ) otherlv_2= Semicolon )+
            {
            otherlv_0=(Token)match(input,Type,FOLLOW_Type_in_ruletype_definition_part6576); 

                	newLeafNode(otherlv_0, grammarAccess.getType_definition_partAccess().getTypeKeyword_0());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3342:1: ( ( (lv_types_1_0= ruletype_definition ) ) otherlv_2= Semicolon )+
            int cnt43=0;
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==RULE_ID) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3342:2: ( (lv_types_1_0= ruletype_definition ) ) otherlv_2= Semicolon
            	    {
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3342:2: ( (lv_types_1_0= ruletype_definition ) )
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3343:1: (lv_types_1_0= ruletype_definition )
            	    {
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3343:1: (lv_types_1_0= ruletype_definition )
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3344:3: lv_types_1_0= ruletype_definition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getType_definition_partAccess().getTypesType_definitionParserRuleCall_1_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruletype_definition_in_ruletype_definition_part6597);
            	    lv_types_1_0=ruletype_definition();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getType_definition_partRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"types",
            	            		lv_types_1_0, 
            	            		"type_definition");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_2=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_ruletype_definition_part6610); 

            	        	newLeafNode(otherlv_2, grammarAccess.getType_definition_partAccess().getSemicolonKeyword_1_1());
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt43 >= 1 ) break loop43;
                        EarlyExitException eee =
                            new EarlyExitException(43, input);
                        throw eee;
                }
                cnt43++;
            } while (true);


            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruletype_definition_part"


    // $ANTLR start "entryRuletype_definition"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3373:1: entryRuletype_definition returns [EObject current=null] : iv_ruletype_definition= ruletype_definition EOF ;
    public final EObject entryRuletype_definition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletype_definition = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3374:2: (iv_ruletype_definition= ruletype_definition EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3375:2: iv_ruletype_definition= ruletype_definition EOF
            {
             newCompositeNode(grammarAccess.getType_definitionRule()); 
            pushFollow(FOLLOW_ruletype_definition_in_entryRuletype_definition6646);
            iv_ruletype_definition=ruletype_definition();

            state._fsp--;

             current =iv_ruletype_definition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuletype_definition6656); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuletype_definition"


    // $ANTLR start "ruletype_definition"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3382:1: ruletype_definition returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= EqualsSign ( (lv_type_2_0= ruletype ) ) ) ;
    public final EObject ruletype_definition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3385:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= EqualsSign ( (lv_type_2_0= ruletype ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3386:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= EqualsSign ( (lv_type_2_0= ruletype ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3386:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= EqualsSign ( (lv_type_2_0= ruletype ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3386:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= EqualsSign ( (lv_type_2_0= ruletype ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3386:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3387:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3387:1: (lv_name_0_0= RULE_ID )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3388:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruletype_definition6698); 

            			newLeafNode(lv_name_0_0, grammarAccess.getType_definitionAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getType_definitionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,EqualsSign,FOLLOW_EqualsSign_in_ruletype_definition6716); 

                	newLeafNode(otherlv_1, grammarAccess.getType_definitionAccess().getEqualsSignKeyword_1());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3409:1: ( (lv_type_2_0= ruletype ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3410:1: (lv_type_2_0= ruletype )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3410:1: (lv_type_2_0= ruletype )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3411:3: lv_type_2_0= ruletype
            {
             
            	        newCompositeNode(grammarAccess.getType_definitionAccess().getTypeTypeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruletype_in_ruletype_definition6736);
            lv_type_2_0=ruletype();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getType_definitionRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_2_0, 
                    		"type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruletype_definition"


    // $ANTLR start "entryRuletype"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3435:1: entryRuletype returns [EObject current=null] : iv_ruletype= ruletype EOF ;
    public final EObject entryRuletype() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletype = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3436:2: (iv_ruletype= ruletype EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3437:2: iv_ruletype= ruletype EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruletype_in_entryRuletype6771);
            iv_ruletype=ruletype();

            state._fsp--;

             current =iv_ruletype; 
            match(input,EOF,FOLLOW_EOF_in_entryRuletype6781); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuletype"


    // $ANTLR start "ruletype"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3444:1: ruletype returns [EObject current=null] : ( ( (lv_simple_0_0= rulesimple_type ) ) | ( (lv_structured_1_0= rulestructured_type ) ) | ( (lv_pointer_2_0= rulepointer_type ) ) ) ;
    public final EObject ruletype() throws RecognitionException {
        EObject current = null;

        EObject lv_simple_0_0 = null;

        EObject lv_structured_1_0 = null;

        EObject lv_pointer_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3447:28: ( ( ( (lv_simple_0_0= rulesimple_type ) ) | ( (lv_structured_1_0= rulestructured_type ) ) | ( (lv_pointer_2_0= rulepointer_type ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3448:1: ( ( (lv_simple_0_0= rulesimple_type ) ) | ( (lv_structured_1_0= rulestructured_type ) ) | ( (lv_pointer_2_0= rulepointer_type ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3448:1: ( ( (lv_simple_0_0= rulesimple_type ) ) | ( (lv_structured_1_0= rulestructured_type ) ) | ( (lv_pointer_2_0= rulepointer_type ) ) )
            int alt44=3;
            switch ( input.LA(1) ) {
            case False:
            case True:
            case Nil:
            case LeftParenthesis:
            case RULE_INTEGER_NUMBER:
            case RULE_REAL_NUMBER:
            case RULE_SIGNED_INTEGER_NUMBER:
            case RULE_SIGNED_REAL_NUMBER:
            case RULE_NUMERIC_SUBRANGE:
            case RULE_ADDITION_OPERATOR:
            case RULE_ID:
            case RULE_STRING:
                {
                alt44=1;
                }
                break;
            case Packed:
            case Record:
            case Array:
            case File:
            case Set:
                {
                alt44=2;
                }
                break;
            case CircumflexAccent:
                {
                alt44=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3448:2: ( (lv_simple_0_0= rulesimple_type ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3448:2: ( (lv_simple_0_0= rulesimple_type ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3449:1: (lv_simple_0_0= rulesimple_type )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3449:1: (lv_simple_0_0= rulesimple_type )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3450:3: lv_simple_0_0= rulesimple_type
                    {
                     
                    	        newCompositeNode(grammarAccess.getTypeAccess().getSimpleSimple_typeParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_rulesimple_type_in_ruletype6827);
                    lv_simple_0_0=rulesimple_type();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"simple",
                            		lv_simple_0_0, 
                            		"simple_type");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3467:6: ( (lv_structured_1_0= rulestructured_type ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3467:6: ( (lv_structured_1_0= rulestructured_type ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3468:1: (lv_structured_1_0= rulestructured_type )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3468:1: (lv_structured_1_0= rulestructured_type )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3469:3: lv_structured_1_0= rulestructured_type
                    {
                     
                    	        newCompositeNode(grammarAccess.getTypeAccess().getStructuredStructured_typeParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_rulestructured_type_in_ruletype6854);
                    lv_structured_1_0=rulestructured_type();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"structured",
                            		lv_structured_1_0, 
                            		"structured_type");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3486:6: ( (lv_pointer_2_0= rulepointer_type ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3486:6: ( (lv_pointer_2_0= rulepointer_type ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3487:1: (lv_pointer_2_0= rulepointer_type )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3487:1: (lv_pointer_2_0= rulepointer_type )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3488:3: lv_pointer_2_0= rulepointer_type
                    {
                     
                    	        newCompositeNode(grammarAccess.getTypeAccess().getPointerPointer_typeParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_rulepointer_type_in_ruletype6881);
                    lv_pointer_2_0=rulepointer_type();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"pointer",
                            		lv_pointer_2_0, 
                            		"pointer_type");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruletype"


    // $ANTLR start "entryRulesimple_type"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3512:1: entryRulesimple_type returns [EObject current=null] : iv_rulesimple_type= rulesimple_type EOF ;
    public final EObject entryRulesimple_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesimple_type = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3513:2: (iv_rulesimple_type= rulesimple_type EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3514:2: iv_rulesimple_type= rulesimple_type EOF
            {
             newCompositeNode(grammarAccess.getSimple_typeRule()); 
            pushFollow(FOLLOW_rulesimple_type_in_entryRulesimple_type6916);
            iv_rulesimple_type=rulesimple_type();

            state._fsp--;

             current =iv_rulesimple_type; 
            match(input,EOF,FOLLOW_EOF_in_entryRulesimple_type6926); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulesimple_type"


    // $ANTLR start "rulesimple_type"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3521:1: rulesimple_type returns [EObject current=null] : ( ( (lv_subrange_0_0= rulesubrange_type ) ) | ( (lv_enumerated_1_0= ruleenumerated_type ) ) | ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject rulesimple_type() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        EObject lv_subrange_0_0 = null;

        EObject lv_enumerated_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3524:28: ( ( ( (lv_subrange_0_0= rulesubrange_type ) ) | ( (lv_enumerated_1_0= ruleenumerated_type ) ) | ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3525:1: ( ( (lv_subrange_0_0= rulesubrange_type ) ) | ( (lv_enumerated_1_0= ruleenumerated_type ) ) | ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3525:1: ( ( (lv_subrange_0_0= rulesubrange_type ) ) | ( (lv_enumerated_1_0= ruleenumerated_type ) ) | ( (lv_name_2_0= RULE_ID ) ) )
            int alt45=3;
            switch ( input.LA(1) ) {
            case False:
            case True:
            case Nil:
            case RULE_INTEGER_NUMBER:
            case RULE_REAL_NUMBER:
            case RULE_SIGNED_INTEGER_NUMBER:
            case RULE_SIGNED_REAL_NUMBER:
            case RULE_NUMERIC_SUBRANGE:
            case RULE_ADDITION_OPERATOR:
            case RULE_STRING:
                {
                alt45=1;
                }
                break;
            case RULE_ID:
                {
                int LA45_2 = input.LA(2);

                if ( (LA45_2==EOF||LA45_2==End||(LA45_2>=RightParenthesis && LA45_2<=Comma)||LA45_2==Semicolon||LA45_2==RightSquareBracket) ) {
                    alt45=3;
                }
                else if ( (LA45_2==FullStopFullStop) ) {
                    alt45=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 45, 2, input);

                    throw nvae;
                }
                }
                break;
            case LeftParenthesis:
                {
                alt45=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3525:2: ( (lv_subrange_0_0= rulesubrange_type ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3525:2: ( (lv_subrange_0_0= rulesubrange_type ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3526:1: (lv_subrange_0_0= rulesubrange_type )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3526:1: (lv_subrange_0_0= rulesubrange_type )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3527:3: lv_subrange_0_0= rulesubrange_type
                    {
                     
                    	        newCompositeNode(grammarAccess.getSimple_typeAccess().getSubrangeSubrange_typeParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_rulesubrange_type_in_rulesimple_type6972);
                    lv_subrange_0_0=rulesubrange_type();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSimple_typeRule());
                    	        }
                           		set(
                           			current, 
                           			"subrange",
                            		lv_subrange_0_0, 
                            		"subrange_type");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3544:6: ( (lv_enumerated_1_0= ruleenumerated_type ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3544:6: ( (lv_enumerated_1_0= ruleenumerated_type ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3545:1: (lv_enumerated_1_0= ruleenumerated_type )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3545:1: (lv_enumerated_1_0= ruleenumerated_type )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3546:3: lv_enumerated_1_0= ruleenumerated_type
                    {
                     
                    	        newCompositeNode(grammarAccess.getSimple_typeAccess().getEnumeratedEnumerated_typeParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleenumerated_type_in_rulesimple_type6999);
                    lv_enumerated_1_0=ruleenumerated_type();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSimple_typeRule());
                    	        }
                           		set(
                           			current, 
                           			"enumerated",
                            		lv_enumerated_1_0, 
                            		"enumerated_type");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3563:6: ( (lv_name_2_0= RULE_ID ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3563:6: ( (lv_name_2_0= RULE_ID ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3564:1: (lv_name_2_0= RULE_ID )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3564:1: (lv_name_2_0= RULE_ID )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3565:3: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulesimple_type7022); 

                    			newLeafNode(lv_name_2_0, grammarAccess.getSimple_typeAccess().getNameIDTerminalRuleCall_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSimple_typeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_2_0, 
                            		"ID");
                    	    

                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "rulesimple_type"


    // $ANTLR start "entryRulesubrange_type"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3589:1: entryRulesubrange_type returns [EObject current=null] : iv_rulesubrange_type= rulesubrange_type EOF ;
    public final EObject entryRulesubrange_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesubrange_type = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        	
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3593:2: (iv_rulesubrange_type= rulesubrange_type EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3594:2: iv_rulesubrange_type= rulesubrange_type EOF
            {
             newCompositeNode(grammarAccess.getSubrange_typeRule()); 
            pushFollow(FOLLOW_rulesubrange_type_in_entryRulesubrange_type7068);
            iv_rulesubrange_type=rulesubrange_type();

            state._fsp--;

             current =iv_rulesubrange_type; 
            match(input,EOF,FOLLOW_EOF_in_entryRulesubrange_type7078); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRulesubrange_type"


    // $ANTLR start "rulesubrange_type"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3604:1: rulesubrange_type returns [EObject current=null] : ( ( ( (lv_initialConst_0_0= ruleconstant ) ) otherlv_1= FullStopFullStop ( (lv_finalConst_2_0= ruleconstant ) ) ) | ( ( (lv_subrange_3_0= RULE_NUMERIC_SUBRANGE ) ) ( (lv_const_4_0= ruleconstant ) ) ) ) ;
    public final EObject rulesubrange_type() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_subrange_3_0=null;
        EObject lv_initialConst_0_0 = null;

        EObject lv_finalConst_2_0 = null;

        EObject lv_const_4_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3608:28: ( ( ( ( (lv_initialConst_0_0= ruleconstant ) ) otherlv_1= FullStopFullStop ( (lv_finalConst_2_0= ruleconstant ) ) ) | ( ( (lv_subrange_3_0= RULE_NUMERIC_SUBRANGE ) ) ( (lv_const_4_0= ruleconstant ) ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3609:1: ( ( ( (lv_initialConst_0_0= ruleconstant ) ) otherlv_1= FullStopFullStop ( (lv_finalConst_2_0= ruleconstant ) ) ) | ( ( (lv_subrange_3_0= RULE_NUMERIC_SUBRANGE ) ) ( (lv_const_4_0= ruleconstant ) ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3609:1: ( ( ( (lv_initialConst_0_0= ruleconstant ) ) otherlv_1= FullStopFullStop ( (lv_finalConst_2_0= ruleconstant ) ) ) | ( ( (lv_subrange_3_0= RULE_NUMERIC_SUBRANGE ) ) ( (lv_const_4_0= ruleconstant ) ) ) )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==False||LA46_0==True||LA46_0==Nil||(LA46_0>=RULE_INTEGER_NUMBER && LA46_0<=RULE_SIGNED_REAL_NUMBER)||LA46_0==RULE_ADDITION_OPERATOR||LA46_0==RULE_ID||LA46_0==RULE_STRING) ) {
                alt46=1;
            }
            else if ( (LA46_0==RULE_NUMERIC_SUBRANGE) ) {
                alt46=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3609:2: ( ( (lv_initialConst_0_0= ruleconstant ) ) otherlv_1= FullStopFullStop ( (lv_finalConst_2_0= ruleconstant ) ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3609:2: ( ( (lv_initialConst_0_0= ruleconstant ) ) otherlv_1= FullStopFullStop ( (lv_finalConst_2_0= ruleconstant ) ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3609:3: ( (lv_initialConst_0_0= ruleconstant ) ) otherlv_1= FullStopFullStop ( (lv_finalConst_2_0= ruleconstant ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3609:3: ( (lv_initialConst_0_0= ruleconstant ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3610:1: (lv_initialConst_0_0= ruleconstant )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3610:1: (lv_initialConst_0_0= ruleconstant )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3611:3: lv_initialConst_0_0= ruleconstant
                    {
                     
                    	        newCompositeNode(grammarAccess.getSubrange_typeAccess().getInitialConstConstantParserRuleCall_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleconstant_in_rulesubrange_type7129);
                    lv_initialConst_0_0=ruleconstant();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSubrange_typeRule());
                    	        }
                           		set(
                           			current, 
                           			"initialConst",
                            		lv_initialConst_0_0, 
                            		"constant");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_1=(Token)match(input,FullStopFullStop,FOLLOW_FullStopFullStop_in_rulesubrange_type7142); 

                        	newLeafNode(otherlv_1, grammarAccess.getSubrange_typeAccess().getFullStopFullStopKeyword_0_1());
                        
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3632:1: ( (lv_finalConst_2_0= ruleconstant ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3633:1: (lv_finalConst_2_0= ruleconstant )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3633:1: (lv_finalConst_2_0= ruleconstant )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3634:3: lv_finalConst_2_0= ruleconstant
                    {
                     
                    	        newCompositeNode(grammarAccess.getSubrange_typeAccess().getFinalConstConstantParserRuleCall_0_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleconstant_in_rulesubrange_type7162);
                    lv_finalConst_2_0=ruleconstant();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSubrange_typeRule());
                    	        }
                           		set(
                           			current, 
                           			"finalConst",
                            		lv_finalConst_2_0, 
                            		"constant");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3651:6: ( ( (lv_subrange_3_0= RULE_NUMERIC_SUBRANGE ) ) ( (lv_const_4_0= ruleconstant ) ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3651:6: ( ( (lv_subrange_3_0= RULE_NUMERIC_SUBRANGE ) ) ( (lv_const_4_0= ruleconstant ) ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3651:7: ( (lv_subrange_3_0= RULE_NUMERIC_SUBRANGE ) ) ( (lv_const_4_0= ruleconstant ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3651:7: ( (lv_subrange_3_0= RULE_NUMERIC_SUBRANGE ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3652:1: (lv_subrange_3_0= RULE_NUMERIC_SUBRANGE )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3652:1: (lv_subrange_3_0= RULE_NUMERIC_SUBRANGE )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3653:3: lv_subrange_3_0= RULE_NUMERIC_SUBRANGE
                    {
                    lv_subrange_3_0=(Token)match(input,RULE_NUMERIC_SUBRANGE,FOLLOW_RULE_NUMERIC_SUBRANGE_in_rulesubrange_type7187); 

                    			newLeafNode(lv_subrange_3_0, grammarAccess.getSubrange_typeAccess().getSubrangeNUMERIC_SUBRANGETerminalRuleCall_1_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSubrange_typeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"subrange",
                            		lv_subrange_3_0, 
                            		"NUMERIC_SUBRANGE");
                    	    

                    }


                    }

                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3669:2: ( (lv_const_4_0= ruleconstant ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3670:1: (lv_const_4_0= ruleconstant )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3670:1: (lv_const_4_0= ruleconstant )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3671:3: lv_const_4_0= ruleconstant
                    {
                     
                    	        newCompositeNode(grammarAccess.getSubrange_typeAccess().getConstConstantParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleconstant_in_rulesubrange_type7213);
                    lv_const_4_0=ruleconstant();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSubrange_typeRule());
                    	        }
                           		set(
                           			current, 
                           			"const",
                            		lv_const_4_0, 
                            		"constant");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "rulesubrange_type"


    // $ANTLR start "entryRuleenumerated_type"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3698:1: entryRuleenumerated_type returns [EObject current=null] : iv_ruleenumerated_type= ruleenumerated_type EOF ;
    public final EObject entryRuleenumerated_type() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleenumerated_type = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3699:2: (iv_ruleenumerated_type= ruleenumerated_type EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3700:2: iv_ruleenumerated_type= ruleenumerated_type EOF
            {
             newCompositeNode(grammarAccess.getEnumerated_typeRule()); 
            pushFollow(FOLLOW_ruleenumerated_type_in_entryRuleenumerated_type7253);
            iv_ruleenumerated_type=ruleenumerated_type();

            state._fsp--;

             current =iv_ruleenumerated_type; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleenumerated_type7263); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleenumerated_type"


    // $ANTLR start "ruleenumerated_type"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3707:1: ruleenumerated_type returns [EObject current=null] : (otherlv_0= LeftParenthesis ( (lv_identifiers_1_0= ruleidentifier_list ) ) otherlv_2= RightParenthesis ) ;
    public final EObject ruleenumerated_type() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_identifiers_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3710:28: ( (otherlv_0= LeftParenthesis ( (lv_identifiers_1_0= ruleidentifier_list ) ) otherlv_2= RightParenthesis ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3711:1: (otherlv_0= LeftParenthesis ( (lv_identifiers_1_0= ruleidentifier_list ) ) otherlv_2= RightParenthesis )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3711:1: (otherlv_0= LeftParenthesis ( (lv_identifiers_1_0= ruleidentifier_list ) ) otherlv_2= RightParenthesis )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3712:2: otherlv_0= LeftParenthesis ( (lv_identifiers_1_0= ruleidentifier_list ) ) otherlv_2= RightParenthesis
            {
            otherlv_0=(Token)match(input,LeftParenthesis,FOLLOW_LeftParenthesis_in_ruleenumerated_type7301); 

                	newLeafNode(otherlv_0, grammarAccess.getEnumerated_typeAccess().getLeftParenthesisKeyword_0());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3716:1: ( (lv_identifiers_1_0= ruleidentifier_list ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3717:1: (lv_identifiers_1_0= ruleidentifier_list )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3717:1: (lv_identifiers_1_0= ruleidentifier_list )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3718:3: lv_identifiers_1_0= ruleidentifier_list
            {
             
            	        newCompositeNode(grammarAccess.getEnumerated_typeAccess().getIdentifiersIdentifier_listParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleidentifier_list_in_ruleenumerated_type7321);
            lv_identifiers_1_0=ruleidentifier_list();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEnumerated_typeRule());
            	        }
                   		set(
                   			current, 
                   			"identifiers",
                    		lv_identifiers_1_0, 
                    		"identifier_list");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,RightParenthesis,FOLLOW_RightParenthesis_in_ruleenumerated_type7334); 

                	newLeafNode(otherlv_2, grammarAccess.getEnumerated_typeAccess().getRightParenthesisKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleenumerated_type"


    // $ANTLR start "entryRulestructured_type"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3747:1: entryRulestructured_type returns [EObject current=null] : iv_rulestructured_type= rulestructured_type EOF ;
    public final EObject entryRulestructured_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestructured_type = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3748:2: (iv_rulestructured_type= rulestructured_type EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3749:2: iv_rulestructured_type= rulestructured_type EOF
            {
             newCompositeNode(grammarAccess.getStructured_typeRule()); 
            pushFollow(FOLLOW_rulestructured_type_in_entryRulestructured_type7368);
            iv_rulestructured_type=rulestructured_type();

            state._fsp--;

             current =iv_rulestructured_type; 
            match(input,EOF,FOLLOW_EOF_in_entryRulestructured_type7378); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulestructured_type"


    // $ANTLR start "rulestructured_type"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3756:1: rulestructured_type returns [EObject current=null] : ( ( (lv_packed_0_0= Packed ) )? ( (lv_type_1_0= ruleunpacked_structured_type ) ) ) ;
    public final EObject rulestructured_type() throws RecognitionException {
        EObject current = null;

        Token lv_packed_0_0=null;
        EObject lv_type_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3759:28: ( ( ( (lv_packed_0_0= Packed ) )? ( (lv_type_1_0= ruleunpacked_structured_type ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3760:1: ( ( (lv_packed_0_0= Packed ) )? ( (lv_type_1_0= ruleunpacked_structured_type ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3760:1: ( ( (lv_packed_0_0= Packed ) )? ( (lv_type_1_0= ruleunpacked_structured_type ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3760:2: ( (lv_packed_0_0= Packed ) )? ( (lv_type_1_0= ruleunpacked_structured_type ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3760:2: ( (lv_packed_0_0= Packed ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==Packed) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3761:1: (lv_packed_0_0= Packed )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3761:1: (lv_packed_0_0= Packed )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3762:3: lv_packed_0_0= Packed
                    {
                    lv_packed_0_0=(Token)match(input,Packed,FOLLOW_Packed_in_rulestructured_type7422); 

                            newLeafNode(lv_packed_0_0, grammarAccess.getStructured_typeAccess().getPackedPackedKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStructured_typeRule());
                    	        }
                           		setWithLastConsumed(current, "packed", true, "packed");
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3776:3: ( (lv_type_1_0= ruleunpacked_structured_type ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3777:1: (lv_type_1_0= ruleunpacked_structured_type )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3777:1: (lv_type_1_0= ruleunpacked_structured_type )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3778:3: lv_type_1_0= ruleunpacked_structured_type
            {
             
            	        newCompositeNode(grammarAccess.getStructured_typeAccess().getTypeUnpacked_structured_typeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleunpacked_structured_type_in_rulestructured_type7455);
            lv_type_1_0=ruleunpacked_structured_type();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStructured_typeRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_1_0, 
                    		"unpacked_structured_type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "rulestructured_type"


    // $ANTLR start "entryRuleunpacked_structured_type"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3802:1: entryRuleunpacked_structured_type returns [EObject current=null] : iv_ruleunpacked_structured_type= ruleunpacked_structured_type EOF ;
    public final EObject entryRuleunpacked_structured_type() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleunpacked_structured_type = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3803:2: (iv_ruleunpacked_structured_type= ruleunpacked_structured_type EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3804:2: iv_ruleunpacked_structured_type= ruleunpacked_structured_type EOF
            {
             newCompositeNode(grammarAccess.getUnpacked_structured_typeRule()); 
            pushFollow(FOLLOW_ruleunpacked_structured_type_in_entryRuleunpacked_structured_type7490);
            iv_ruleunpacked_structured_type=ruleunpacked_structured_type();

            state._fsp--;

             current =iv_ruleunpacked_structured_type; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleunpacked_structured_type7500); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleunpacked_structured_type"


    // $ANTLR start "ruleunpacked_structured_type"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3811:1: ruleunpacked_structured_type returns [EObject current=null] : ( ( (lv_array_0_0= rulearray_type ) ) | ( (lv_dynamic_1_0= ruledynamic_array_type ) ) | ( (lv_record_2_0= rulerecord_type ) ) | ( (lv_set_3_0= ruleset_type ) ) | ( (lv_file_4_0= rulefile_type ) ) ) ;
    public final EObject ruleunpacked_structured_type() throws RecognitionException {
        EObject current = null;

        EObject lv_array_0_0 = null;

        EObject lv_dynamic_1_0 = null;

        EObject lv_record_2_0 = null;

        EObject lv_set_3_0 = null;

        EObject lv_file_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3814:28: ( ( ( (lv_array_0_0= rulearray_type ) ) | ( (lv_dynamic_1_0= ruledynamic_array_type ) ) | ( (lv_record_2_0= rulerecord_type ) ) | ( (lv_set_3_0= ruleset_type ) ) | ( (lv_file_4_0= rulefile_type ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3815:1: ( ( (lv_array_0_0= rulearray_type ) ) | ( (lv_dynamic_1_0= ruledynamic_array_type ) ) | ( (lv_record_2_0= rulerecord_type ) ) | ( (lv_set_3_0= ruleset_type ) ) | ( (lv_file_4_0= rulefile_type ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3815:1: ( ( (lv_array_0_0= rulearray_type ) ) | ( (lv_dynamic_1_0= ruledynamic_array_type ) ) | ( (lv_record_2_0= rulerecord_type ) ) | ( (lv_set_3_0= ruleset_type ) ) | ( (lv_file_4_0= rulefile_type ) ) )
            int alt48=5;
            switch ( input.LA(1) ) {
            case Array:
                {
                int LA48_1 = input.LA(2);

                if ( (LA48_1==Of) ) {
                    alt48=2;
                }
                else if ( (LA48_1==LeftSquareBracket) ) {
                    alt48=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 48, 1, input);

                    throw nvae;
                }
                }
                break;
            case Record:
                {
                alt48=3;
                }
                break;
            case Set:
                {
                alt48=4;
                }
                break;
            case File:
                {
                alt48=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }

            switch (alt48) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3815:2: ( (lv_array_0_0= rulearray_type ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3815:2: ( (lv_array_0_0= rulearray_type ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3816:1: (lv_array_0_0= rulearray_type )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3816:1: (lv_array_0_0= rulearray_type )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3817:3: lv_array_0_0= rulearray_type
                    {
                     
                    	        newCompositeNode(grammarAccess.getUnpacked_structured_typeAccess().getArrayArray_typeParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_rulearray_type_in_ruleunpacked_structured_type7546);
                    lv_array_0_0=rulearray_type();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getUnpacked_structured_typeRule());
                    	        }
                           		set(
                           			current, 
                           			"array",
                            		lv_array_0_0, 
                            		"array_type");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3834:6: ( (lv_dynamic_1_0= ruledynamic_array_type ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3834:6: ( (lv_dynamic_1_0= ruledynamic_array_type ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3835:1: (lv_dynamic_1_0= ruledynamic_array_type )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3835:1: (lv_dynamic_1_0= ruledynamic_array_type )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3836:3: lv_dynamic_1_0= ruledynamic_array_type
                    {
                     
                    	        newCompositeNode(grammarAccess.getUnpacked_structured_typeAccess().getDynamicDynamic_array_typeParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruledynamic_array_type_in_ruleunpacked_structured_type7573);
                    lv_dynamic_1_0=ruledynamic_array_type();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getUnpacked_structured_typeRule());
                    	        }
                           		set(
                           			current, 
                           			"dynamic",
                            		lv_dynamic_1_0, 
                            		"dynamic_array_type");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3853:6: ( (lv_record_2_0= rulerecord_type ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3853:6: ( (lv_record_2_0= rulerecord_type ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3854:1: (lv_record_2_0= rulerecord_type )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3854:1: (lv_record_2_0= rulerecord_type )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3855:3: lv_record_2_0= rulerecord_type
                    {
                     
                    	        newCompositeNode(grammarAccess.getUnpacked_structured_typeAccess().getRecordRecord_typeParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_rulerecord_type_in_ruleunpacked_structured_type7600);
                    lv_record_2_0=rulerecord_type();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getUnpacked_structured_typeRule());
                    	        }
                           		set(
                           			current, 
                           			"record",
                            		lv_record_2_0, 
                            		"record_type");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3872:6: ( (lv_set_3_0= ruleset_type ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3872:6: ( (lv_set_3_0= ruleset_type ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3873:1: (lv_set_3_0= ruleset_type )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3873:1: (lv_set_3_0= ruleset_type )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3874:3: lv_set_3_0= ruleset_type
                    {
                     
                    	        newCompositeNode(grammarAccess.getUnpacked_structured_typeAccess().getSetSet_typeParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleset_type_in_ruleunpacked_structured_type7627);
                    lv_set_3_0=ruleset_type();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getUnpacked_structured_typeRule());
                    	        }
                           		set(
                           			current, 
                           			"set",
                            		lv_set_3_0, 
                            		"set_type");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3891:6: ( (lv_file_4_0= rulefile_type ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3891:6: ( (lv_file_4_0= rulefile_type ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3892:1: (lv_file_4_0= rulefile_type )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3892:1: (lv_file_4_0= rulefile_type )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3893:3: lv_file_4_0= rulefile_type
                    {
                     
                    	        newCompositeNode(grammarAccess.getUnpacked_structured_typeAccess().getFileFile_typeParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_rulefile_type_in_ruleunpacked_structured_type7654);
                    lv_file_4_0=rulefile_type();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getUnpacked_structured_typeRule());
                    	        }
                           		set(
                           			current, 
                           			"file",
                            		lv_file_4_0, 
                            		"file_type");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleunpacked_structured_type"


    // $ANTLR start "entryRulearray_type"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3917:1: entryRulearray_type returns [EObject current=null] : iv_rulearray_type= rulearray_type EOF ;
    public final EObject entryRulearray_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulearray_type = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3918:2: (iv_rulearray_type= rulearray_type EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3919:2: iv_rulearray_type= rulearray_type EOF
            {
             newCompositeNode(grammarAccess.getArray_typeRule()); 
            pushFollow(FOLLOW_rulearray_type_in_entryRulearray_type7689);
            iv_rulearray_type=rulearray_type();

            state._fsp--;

             current =iv_rulearray_type; 
            match(input,EOF,FOLLOW_EOF_in_entryRulearray_type7699); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulearray_type"


    // $ANTLR start "rulearray_type"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3926:1: rulearray_type returns [EObject current=null] : (otherlv_0= Array otherlv_1= LeftSquareBracket ( (lv_indexes_2_0= ruleindex_type ) ) (otherlv_3= Comma ( (lv_indexes_4_0= ruleindex_type ) ) )* otherlv_5= RightSquareBracket otherlv_6= Of ( (lv_type_7_0= ruletype ) ) ) ;
    public final EObject rulearray_type() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_indexes_2_0 = null;

        EObject lv_indexes_4_0 = null;

        EObject lv_type_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3929:28: ( (otherlv_0= Array otherlv_1= LeftSquareBracket ( (lv_indexes_2_0= ruleindex_type ) ) (otherlv_3= Comma ( (lv_indexes_4_0= ruleindex_type ) ) )* otherlv_5= RightSquareBracket otherlv_6= Of ( (lv_type_7_0= ruletype ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3930:1: (otherlv_0= Array otherlv_1= LeftSquareBracket ( (lv_indexes_2_0= ruleindex_type ) ) (otherlv_3= Comma ( (lv_indexes_4_0= ruleindex_type ) ) )* otherlv_5= RightSquareBracket otherlv_6= Of ( (lv_type_7_0= ruletype ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3930:1: (otherlv_0= Array otherlv_1= LeftSquareBracket ( (lv_indexes_2_0= ruleindex_type ) ) (otherlv_3= Comma ( (lv_indexes_4_0= ruleindex_type ) ) )* otherlv_5= RightSquareBracket otherlv_6= Of ( (lv_type_7_0= ruletype ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3931:2: otherlv_0= Array otherlv_1= LeftSquareBracket ( (lv_indexes_2_0= ruleindex_type ) ) (otherlv_3= Comma ( (lv_indexes_4_0= ruleindex_type ) ) )* otherlv_5= RightSquareBracket otherlv_6= Of ( (lv_type_7_0= ruletype ) )
            {
            otherlv_0=(Token)match(input,Array,FOLLOW_Array_in_rulearray_type7737); 

                	newLeafNode(otherlv_0, grammarAccess.getArray_typeAccess().getArrayKeyword_0());
                
            otherlv_1=(Token)match(input,LeftSquareBracket,FOLLOW_LeftSquareBracket_in_rulearray_type7749); 

                	newLeafNode(otherlv_1, grammarAccess.getArray_typeAccess().getLeftSquareBracketKeyword_1());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3940:1: ( (lv_indexes_2_0= ruleindex_type ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3941:1: (lv_indexes_2_0= ruleindex_type )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3941:1: (lv_indexes_2_0= ruleindex_type )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3942:3: lv_indexes_2_0= ruleindex_type
            {
             
            	        newCompositeNode(grammarAccess.getArray_typeAccess().getIndexesIndex_typeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleindex_type_in_rulearray_type7769);
            lv_indexes_2_0=ruleindex_type();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getArray_typeRule());
            	        }
                   		add(
                   			current, 
                   			"indexes",
                    		lv_indexes_2_0, 
                    		"index_type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3958:2: (otherlv_3= Comma ( (lv_indexes_4_0= ruleindex_type ) ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==Comma) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3959:2: otherlv_3= Comma ( (lv_indexes_4_0= ruleindex_type ) )
            	    {
            	    otherlv_3=(Token)match(input,Comma,FOLLOW_Comma_in_rulearray_type7783); 

            	        	newLeafNode(otherlv_3, grammarAccess.getArray_typeAccess().getCommaKeyword_3_0());
            	        
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3963:1: ( (lv_indexes_4_0= ruleindex_type ) )
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3964:1: (lv_indexes_4_0= ruleindex_type )
            	    {
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3964:1: (lv_indexes_4_0= ruleindex_type )
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3965:3: lv_indexes_4_0= ruleindex_type
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getArray_typeAccess().getIndexesIndex_typeParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleindex_type_in_rulearray_type7803);
            	    lv_indexes_4_0=ruleindex_type();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getArray_typeRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"indexes",
            	            		lv_indexes_4_0, 
            	            		"index_type");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

            otherlv_5=(Token)match(input,RightSquareBracket,FOLLOW_RightSquareBracket_in_rulearray_type7818); 

                	newLeafNode(otherlv_5, grammarAccess.getArray_typeAccess().getRightSquareBracketKeyword_4());
                
            otherlv_6=(Token)match(input,Of,FOLLOW_Of_in_rulearray_type7830); 

                	newLeafNode(otherlv_6, grammarAccess.getArray_typeAccess().getOfKeyword_5());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3991:1: ( (lv_type_7_0= ruletype ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3992:1: (lv_type_7_0= ruletype )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3992:1: (lv_type_7_0= ruletype )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:3993:3: lv_type_7_0= ruletype
            {
             
            	        newCompositeNode(grammarAccess.getArray_typeAccess().getTypeTypeParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruletype_in_rulearray_type7850);
            lv_type_7_0=ruletype();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getArray_typeRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_7_0, 
                    		"type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "rulearray_type"


    // $ANTLR start "entryRuledynamic_array_type"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4017:1: entryRuledynamic_array_type returns [EObject current=null] : iv_ruledynamic_array_type= ruledynamic_array_type EOF ;
    public final EObject entryRuledynamic_array_type() throws RecognitionException {
        EObject current = null;

        EObject iv_ruledynamic_array_type = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4018:2: (iv_ruledynamic_array_type= ruledynamic_array_type EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4019:2: iv_ruledynamic_array_type= ruledynamic_array_type EOF
            {
             newCompositeNode(grammarAccess.getDynamic_array_typeRule()); 
            pushFollow(FOLLOW_ruledynamic_array_type_in_entryRuledynamic_array_type7885);
            iv_ruledynamic_array_type=ruledynamic_array_type();

            state._fsp--;

             current =iv_ruledynamic_array_type; 
            match(input,EOF,FOLLOW_EOF_in_entryRuledynamic_array_type7895); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuledynamic_array_type"


    // $ANTLR start "ruledynamic_array_type"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4026:1: ruledynamic_array_type returns [EObject current=null] : (otherlv_0= Array otherlv_1= Of ( (lv_type_2_0= ruletype ) ) ) ;
    public final EObject ruledynamic_array_type() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4029:28: ( (otherlv_0= Array otherlv_1= Of ( (lv_type_2_0= ruletype ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4030:1: (otherlv_0= Array otherlv_1= Of ( (lv_type_2_0= ruletype ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4030:1: (otherlv_0= Array otherlv_1= Of ( (lv_type_2_0= ruletype ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4031:2: otherlv_0= Array otherlv_1= Of ( (lv_type_2_0= ruletype ) )
            {
            otherlv_0=(Token)match(input,Array,FOLLOW_Array_in_ruledynamic_array_type7933); 

                	newLeafNode(otherlv_0, grammarAccess.getDynamic_array_typeAccess().getArrayKeyword_0());
                
            otherlv_1=(Token)match(input,Of,FOLLOW_Of_in_ruledynamic_array_type7945); 

                	newLeafNode(otherlv_1, grammarAccess.getDynamic_array_typeAccess().getOfKeyword_1());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4040:1: ( (lv_type_2_0= ruletype ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4041:1: (lv_type_2_0= ruletype )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4041:1: (lv_type_2_0= ruletype )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4042:3: lv_type_2_0= ruletype
            {
             
            	        newCompositeNode(grammarAccess.getDynamic_array_typeAccess().getTypeTypeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruletype_in_ruledynamic_array_type7965);
            lv_type_2_0=ruletype();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDynamic_array_typeRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_2_0, 
                    		"type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruledynamic_array_type"


    // $ANTLR start "entryRuleindex_type"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4066:1: entryRuleindex_type returns [EObject current=null] : iv_ruleindex_type= ruleindex_type EOF ;
    public final EObject entryRuleindex_type() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleindex_type = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4067:2: (iv_ruleindex_type= ruleindex_type EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4068:2: iv_ruleindex_type= ruleindex_type EOF
            {
             newCompositeNode(grammarAccess.getIndex_typeRule()); 
            pushFollow(FOLLOW_ruleindex_type_in_entryRuleindex_type8000);
            iv_ruleindex_type=ruleindex_type();

            state._fsp--;

             current =iv_ruleindex_type; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleindex_type8010); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleindex_type"


    // $ANTLR start "ruleindex_type"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4075:1: ruleindex_type returns [EObject current=null] : ( (lv_type_0_0= rulesimple_type ) ) ;
    public final EObject ruleindex_type() throws RecognitionException {
        EObject current = null;

        EObject lv_type_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4078:28: ( ( (lv_type_0_0= rulesimple_type ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4079:1: ( (lv_type_0_0= rulesimple_type ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4079:1: ( (lv_type_0_0= rulesimple_type ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4080:1: (lv_type_0_0= rulesimple_type )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4080:1: (lv_type_0_0= rulesimple_type )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4081:3: lv_type_0_0= rulesimple_type
            {
             
            	        newCompositeNode(grammarAccess.getIndex_typeAccess().getTypeSimple_typeParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_rulesimple_type_in_ruleindex_type8055);
            lv_type_0_0=rulesimple_type();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIndex_typeRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_0_0, 
                    		"simple_type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleindex_type"


    // $ANTLR start "entryRulerecord_type"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4105:1: entryRulerecord_type returns [EObject current=null] : iv_rulerecord_type= rulerecord_type EOF ;
    public final EObject entryRulerecord_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerecord_type = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4106:2: (iv_rulerecord_type= rulerecord_type EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4107:2: iv_rulerecord_type= rulerecord_type EOF
            {
             newCompositeNode(grammarAccess.getRecord_typeRule()); 
            pushFollow(FOLLOW_rulerecord_type_in_entryRulerecord_type8089);
            iv_rulerecord_type=rulerecord_type();

            state._fsp--;

             current =iv_rulerecord_type; 
            match(input,EOF,FOLLOW_EOF_in_entryRulerecord_type8099); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulerecord_type"


    // $ANTLR start "rulerecord_type"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4114:1: rulerecord_type returns [EObject current=null] : ( ( (lv_recordKeyword_0_0= Record ) ) ( (lv_fields_1_0= rulefield_list ) )? ( (lv_endKeyword_2_0= End ) ) ) ;
    public final EObject rulerecord_type() throws RecognitionException {
        EObject current = null;

        Token lv_recordKeyword_0_0=null;
        Token lv_endKeyword_2_0=null;
        EObject lv_fields_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4117:28: ( ( ( (lv_recordKeyword_0_0= Record ) ) ( (lv_fields_1_0= rulefield_list ) )? ( (lv_endKeyword_2_0= End ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4118:1: ( ( (lv_recordKeyword_0_0= Record ) ) ( (lv_fields_1_0= rulefield_list ) )? ( (lv_endKeyword_2_0= End ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4118:1: ( ( (lv_recordKeyword_0_0= Record ) ) ( (lv_fields_1_0= rulefield_list ) )? ( (lv_endKeyword_2_0= End ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4118:2: ( (lv_recordKeyword_0_0= Record ) ) ( (lv_fields_1_0= rulefield_list ) )? ( (lv_endKeyword_2_0= End ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4118:2: ( (lv_recordKeyword_0_0= Record ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4119:1: (lv_recordKeyword_0_0= Record )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4119:1: (lv_recordKeyword_0_0= Record )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4120:3: lv_recordKeyword_0_0= Record
            {
            lv_recordKeyword_0_0=(Token)match(input,Record,FOLLOW_Record_in_rulerecord_type8143); 

                    newLeafNode(lv_recordKeyword_0_0, grammarAccess.getRecord_typeAccess().getRecordKeywordRecordKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRecord_typeRule());
            	        }
                   		setWithLastConsumed(current, "recordKeyword", lv_recordKeyword_0_0, "record");
            	    

            }


            }

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4134:2: ( (lv_fields_1_0= rulefield_list ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==Case||LA50_0==RULE_ID) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4135:1: (lv_fields_1_0= rulefield_list )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4135:1: (lv_fields_1_0= rulefield_list )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4136:3: lv_fields_1_0= rulefield_list
                    {
                     
                    	        newCompositeNode(grammarAccess.getRecord_typeAccess().getFieldsField_listParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_rulefield_list_in_rulerecord_type8175);
                    lv_fields_1_0=rulefield_list();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRecord_typeRule());
                    	        }
                           		set(
                           			current, 
                           			"fields",
                            		lv_fields_1_0, 
                            		"field_list");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4152:3: ( (lv_endKeyword_2_0= End ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4153:1: (lv_endKeyword_2_0= End )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4153:1: (lv_endKeyword_2_0= End )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4154:3: lv_endKeyword_2_0= End
            {
            lv_endKeyword_2_0=(Token)match(input,End,FOLLOW_End_in_rulerecord_type8195); 

                    newLeafNode(lv_endKeyword_2_0, grammarAccess.getRecord_typeAccess().getEndKeywordEndKeyword_2_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRecord_typeRule());
            	        }
                   		setWithLastConsumed(current, "endKeyword", lv_endKeyword_2_0, "end");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "rulerecord_type"


    // $ANTLR start "entryRulefield_list"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4176:1: entryRulefield_list returns [EObject current=null] : iv_rulefield_list= rulefield_list EOF ;
    public final EObject entryRulefield_list() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefield_list = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4177:2: (iv_rulefield_list= rulefield_list EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4178:2: iv_rulefield_list= rulefield_list EOF
            {
             newCompositeNode(grammarAccess.getField_listRule()); 
            pushFollow(FOLLOW_rulefield_list_in_entryRulefield_list8241);
            iv_rulefield_list=rulefield_list();

            state._fsp--;

             current =iv_rulefield_list; 
            match(input,EOF,FOLLOW_EOF_in_entryRulefield_list8251); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulefield_list"


    // $ANTLR start "rulefield_list"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4185:1: rulefield_list returns [EObject current=null] : ( ( ( ( (lv_fixed_0_0= rulefixed_part ) ) (otherlv_1= Semicolon ( (lv_variants_2_0= rulevariant_part ) ) )? ) | ( (lv_variants_3_0= rulevariant_part ) ) ) (otherlv_4= Semicolon )? ) ;
    public final EObject rulefield_list() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_fixed_0_0 = null;

        EObject lv_variants_2_0 = null;

        EObject lv_variants_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4188:28: ( ( ( ( ( (lv_fixed_0_0= rulefixed_part ) ) (otherlv_1= Semicolon ( (lv_variants_2_0= rulevariant_part ) ) )? ) | ( (lv_variants_3_0= rulevariant_part ) ) ) (otherlv_4= Semicolon )? ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4189:1: ( ( ( ( (lv_fixed_0_0= rulefixed_part ) ) (otherlv_1= Semicolon ( (lv_variants_2_0= rulevariant_part ) ) )? ) | ( (lv_variants_3_0= rulevariant_part ) ) ) (otherlv_4= Semicolon )? )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4189:1: ( ( ( ( (lv_fixed_0_0= rulefixed_part ) ) (otherlv_1= Semicolon ( (lv_variants_2_0= rulevariant_part ) ) )? ) | ( (lv_variants_3_0= rulevariant_part ) ) ) (otherlv_4= Semicolon )? )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4189:2: ( ( ( (lv_fixed_0_0= rulefixed_part ) ) (otherlv_1= Semicolon ( (lv_variants_2_0= rulevariant_part ) ) )? ) | ( (lv_variants_3_0= rulevariant_part ) ) ) (otherlv_4= Semicolon )?
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4189:2: ( ( ( (lv_fixed_0_0= rulefixed_part ) ) (otherlv_1= Semicolon ( (lv_variants_2_0= rulevariant_part ) ) )? ) | ( (lv_variants_3_0= rulevariant_part ) ) )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_ID) ) {
                alt52=1;
            }
            else if ( (LA52_0==Case) ) {
                alt52=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4189:3: ( ( (lv_fixed_0_0= rulefixed_part ) ) (otherlv_1= Semicolon ( (lv_variants_2_0= rulevariant_part ) ) )? )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4189:3: ( ( (lv_fixed_0_0= rulefixed_part ) ) (otherlv_1= Semicolon ( (lv_variants_2_0= rulevariant_part ) ) )? )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4189:4: ( (lv_fixed_0_0= rulefixed_part ) ) (otherlv_1= Semicolon ( (lv_variants_2_0= rulevariant_part ) ) )?
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4189:4: ( (lv_fixed_0_0= rulefixed_part ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4190:1: (lv_fixed_0_0= rulefixed_part )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4190:1: (lv_fixed_0_0= rulefixed_part )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4191:3: lv_fixed_0_0= rulefixed_part
                    {
                     
                    	        newCompositeNode(grammarAccess.getField_listAccess().getFixedFixed_partParserRuleCall_0_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_rulefixed_part_in_rulefield_list8299);
                    lv_fixed_0_0=rulefixed_part();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getField_listRule());
                    	        }
                           		set(
                           			current, 
                           			"fixed",
                            		lv_fixed_0_0, 
                            		"fixed_part");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4207:2: (otherlv_1= Semicolon ( (lv_variants_2_0= rulevariant_part ) ) )?
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( (LA51_0==Semicolon) ) {
                        int LA51_1 = input.LA(2);

                        if ( (LA51_1==Case) ) {
                            alt51=1;
                        }
                    }
                    switch (alt51) {
                        case 1 :
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4208:2: otherlv_1= Semicolon ( (lv_variants_2_0= rulevariant_part ) )
                            {
                            otherlv_1=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_rulefield_list8313); 

                                	newLeafNode(otherlv_1, grammarAccess.getField_listAccess().getSemicolonKeyword_0_0_1_0());
                                
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4212:1: ( (lv_variants_2_0= rulevariant_part ) )
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4213:1: (lv_variants_2_0= rulevariant_part )
                            {
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4213:1: (lv_variants_2_0= rulevariant_part )
                            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4214:3: lv_variants_2_0= rulevariant_part
                            {
                             
                            	        newCompositeNode(grammarAccess.getField_listAccess().getVariantsVariant_partParserRuleCall_0_0_1_1_0()); 
                            	    
                            pushFollow(FOLLOW_rulevariant_part_in_rulefield_list8333);
                            lv_variants_2_0=rulevariant_part();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getField_listRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"variants",
                                    		lv_variants_2_0, 
                                    		"variant_part");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4231:6: ( (lv_variants_3_0= rulevariant_part ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4231:6: ( (lv_variants_3_0= rulevariant_part ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4232:1: (lv_variants_3_0= rulevariant_part )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4232:1: (lv_variants_3_0= rulevariant_part )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4233:3: lv_variants_3_0= rulevariant_part
                    {
                     
                    	        newCompositeNode(grammarAccess.getField_listAccess().getVariantsVariant_partParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_rulevariant_part_in_rulefield_list8363);
                    lv_variants_3_0=rulevariant_part();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getField_listRule());
                    	        }
                           		add(
                           			current, 
                           			"variants",
                            		lv_variants_3_0, 
                            		"variant_part");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4249:3: (otherlv_4= Semicolon )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==Semicolon) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4250:2: otherlv_4= Semicolon
                    {
                    otherlv_4=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_rulefield_list8378); 

                        	newLeafNode(otherlv_4, grammarAccess.getField_listAccess().getSemicolonKeyword_1());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "rulefield_list"


    // $ANTLR start "entryRulefixed_part"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4262:1: entryRulefixed_part returns [EObject current=null] : iv_rulefixed_part= rulefixed_part EOF ;
    public final EObject entryRulefixed_part() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefixed_part = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4263:2: (iv_rulefixed_part= rulefixed_part EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4264:2: iv_rulefixed_part= rulefixed_part EOF
            {
             newCompositeNode(grammarAccess.getFixed_partRule()); 
            pushFollow(FOLLOW_rulefixed_part_in_entryRulefixed_part8414);
            iv_rulefixed_part=rulefixed_part();

            state._fsp--;

             current =iv_rulefixed_part; 
            match(input,EOF,FOLLOW_EOF_in_entryRulefixed_part8424); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulefixed_part"


    // $ANTLR start "rulefixed_part"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4271:1: rulefixed_part returns [EObject current=null] : ( ( (lv_sections_0_0= rulerecord_section ) ) (otherlv_1= Semicolon ( (lv_sections_2_0= rulerecord_section ) ) )* ) ;
    public final EObject rulefixed_part() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_sections_0_0 = null;

        EObject lv_sections_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4274:28: ( ( ( (lv_sections_0_0= rulerecord_section ) ) (otherlv_1= Semicolon ( (lv_sections_2_0= rulerecord_section ) ) )* ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4275:1: ( ( (lv_sections_0_0= rulerecord_section ) ) (otherlv_1= Semicolon ( (lv_sections_2_0= rulerecord_section ) ) )* )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4275:1: ( ( (lv_sections_0_0= rulerecord_section ) ) (otherlv_1= Semicolon ( (lv_sections_2_0= rulerecord_section ) ) )* )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4275:2: ( (lv_sections_0_0= rulerecord_section ) ) (otherlv_1= Semicolon ( (lv_sections_2_0= rulerecord_section ) ) )*
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4275:2: ( (lv_sections_0_0= rulerecord_section ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4276:1: (lv_sections_0_0= rulerecord_section )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4276:1: (lv_sections_0_0= rulerecord_section )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4277:3: lv_sections_0_0= rulerecord_section
            {
             
            	        newCompositeNode(grammarAccess.getFixed_partAccess().getSectionsRecord_sectionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_rulerecord_section_in_rulefixed_part8470);
            lv_sections_0_0=rulerecord_section();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFixed_partRule());
            	        }
                   		add(
                   			current, 
                   			"sections",
                    		lv_sections_0_0, 
                    		"record_section");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4293:2: (otherlv_1= Semicolon ( (lv_sections_2_0= rulerecord_section ) ) )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==Semicolon) ) {
                    int LA54_1 = input.LA(2);

                    if ( (LA54_1==RULE_ID) ) {
                        alt54=1;
                    }


                }


                switch (alt54) {
            	case 1 :
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4294:2: otherlv_1= Semicolon ( (lv_sections_2_0= rulerecord_section ) )
            	    {
            	    otherlv_1=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_rulefixed_part8484); 

            	        	newLeafNode(otherlv_1, grammarAccess.getFixed_partAccess().getSemicolonKeyword_1_0());
            	        
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4298:1: ( (lv_sections_2_0= rulerecord_section ) )
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4299:1: (lv_sections_2_0= rulerecord_section )
            	    {
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4299:1: (lv_sections_2_0= rulerecord_section )
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4300:3: lv_sections_2_0= rulerecord_section
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFixed_partAccess().getSectionsRecord_sectionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulerecord_section_in_rulefixed_part8504);
            	    lv_sections_2_0=rulerecord_section();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFixed_partRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"sections",
            	            		lv_sections_2_0, 
            	            		"record_section");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "rulefixed_part"


    // $ANTLR start "entryRulevariable_identifier_list"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4324:1: entryRulevariable_identifier_list returns [EObject current=null] : iv_rulevariable_identifier_list= rulevariable_identifier_list EOF ;
    public final EObject entryRulevariable_identifier_list() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariable_identifier_list = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4325:2: (iv_rulevariable_identifier_list= rulevariable_identifier_list EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4326:2: iv_rulevariable_identifier_list= rulevariable_identifier_list EOF
            {
             newCompositeNode(grammarAccess.getVariable_identifier_listRule()); 
            pushFollow(FOLLOW_rulevariable_identifier_list_in_entryRulevariable_identifier_list8541);
            iv_rulevariable_identifier_list=rulevariable_identifier_list();

            state._fsp--;

             current =iv_rulevariable_identifier_list; 
            match(input,EOF,FOLLOW_EOF_in_entryRulevariable_identifier_list8551); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulevariable_identifier_list"


    // $ANTLR start "rulevariable_identifier_list"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4333:1: rulevariable_identifier_list returns [EObject current=null] : ( ( (lv_names_0_0= RULE_ID ) ) (otherlv_1= Comma ( (lv_names_2_0= RULE_ID ) ) )* ) ;
    public final EObject rulevariable_identifier_list() throws RecognitionException {
        EObject current = null;

        Token lv_names_0_0=null;
        Token otherlv_1=null;
        Token lv_names_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4336:28: ( ( ( (lv_names_0_0= RULE_ID ) ) (otherlv_1= Comma ( (lv_names_2_0= RULE_ID ) ) )* ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4337:1: ( ( (lv_names_0_0= RULE_ID ) ) (otherlv_1= Comma ( (lv_names_2_0= RULE_ID ) ) )* )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4337:1: ( ( (lv_names_0_0= RULE_ID ) ) (otherlv_1= Comma ( (lv_names_2_0= RULE_ID ) ) )* )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4337:2: ( (lv_names_0_0= RULE_ID ) ) (otherlv_1= Comma ( (lv_names_2_0= RULE_ID ) ) )*
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4337:2: ( (lv_names_0_0= RULE_ID ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4338:1: (lv_names_0_0= RULE_ID )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4338:1: (lv_names_0_0= RULE_ID )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4339:3: lv_names_0_0= RULE_ID
            {
            lv_names_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulevariable_identifier_list8593); 

            			newLeafNode(lv_names_0_0, grammarAccess.getVariable_identifier_listAccess().getNamesIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getVariable_identifier_listRule());
            	        }
                   		addWithLastConsumed(
                   			current, 
                   			"names",
                    		lv_names_0_0, 
                    		"ID");
            	    

            }


            }

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4355:2: (otherlv_1= Comma ( (lv_names_2_0= RULE_ID ) ) )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==Comma) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4356:2: otherlv_1= Comma ( (lv_names_2_0= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,Comma,FOLLOW_Comma_in_rulevariable_identifier_list8612); 

            	        	newLeafNode(otherlv_1, grammarAccess.getVariable_identifier_listAccess().getCommaKeyword_1_0());
            	        
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4360:1: ( (lv_names_2_0= RULE_ID ) )
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4361:1: (lv_names_2_0= RULE_ID )
            	    {
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4361:1: (lv_names_2_0= RULE_ID )
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4362:3: lv_names_2_0= RULE_ID
            	    {
            	    lv_names_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulevariable_identifier_list8628); 

            	    			newLeafNode(lv_names_2_0, grammarAccess.getVariable_identifier_listAccess().getNamesIDTerminalRuleCall_1_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getVariable_identifier_listRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"names",
            	            		lv_names_2_0, 
            	            		"ID");
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "rulevariable_identifier_list"


    // $ANTLR start "entryRulevariable_section"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4386:1: entryRulevariable_section returns [EObject current=null] : iv_rulevariable_section= rulevariable_section EOF ;
    public final EObject entryRulevariable_section() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariable_section = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4387:2: (iv_rulevariable_section= rulevariable_section EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4388:2: iv_rulevariable_section= rulevariable_section EOF
            {
             newCompositeNode(grammarAccess.getVariable_sectionRule()); 
            pushFollow(FOLLOW_rulevariable_section_in_entryRulevariable_section8670);
            iv_rulevariable_section=rulevariable_section();

            state._fsp--;

             current =iv_rulevariable_section; 
            match(input,EOF,FOLLOW_EOF_in_entryRulevariable_section8680); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulevariable_section"


    // $ANTLR start "rulevariable_section"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4395:1: rulevariable_section returns [EObject current=null] : ( ( (lv_identifiers_0_0= rulevariable_identifier_list ) ) otherlv_1= Colon ( (lv_type_2_0= ruletype ) ) ) ;
    public final EObject rulevariable_section() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_identifiers_0_0 = null;

        EObject lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4398:28: ( ( ( (lv_identifiers_0_0= rulevariable_identifier_list ) ) otherlv_1= Colon ( (lv_type_2_0= ruletype ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4399:1: ( ( (lv_identifiers_0_0= rulevariable_identifier_list ) ) otherlv_1= Colon ( (lv_type_2_0= ruletype ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4399:1: ( ( (lv_identifiers_0_0= rulevariable_identifier_list ) ) otherlv_1= Colon ( (lv_type_2_0= ruletype ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4399:2: ( (lv_identifiers_0_0= rulevariable_identifier_list ) ) otherlv_1= Colon ( (lv_type_2_0= ruletype ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4399:2: ( (lv_identifiers_0_0= rulevariable_identifier_list ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4400:1: (lv_identifiers_0_0= rulevariable_identifier_list )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4400:1: (lv_identifiers_0_0= rulevariable_identifier_list )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4401:3: lv_identifiers_0_0= rulevariable_identifier_list
            {
             
            	        newCompositeNode(grammarAccess.getVariable_sectionAccess().getIdentifiersVariable_identifier_listParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_rulevariable_identifier_list_in_rulevariable_section8726);
            lv_identifiers_0_0=rulevariable_identifier_list();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVariable_sectionRule());
            	        }
                   		set(
                   			current, 
                   			"identifiers",
                    		lv_identifiers_0_0, 
                    		"variable_identifier_list");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_Colon_in_rulevariable_section8739); 

                	newLeafNode(otherlv_1, grammarAccess.getVariable_sectionAccess().getColonKeyword_1());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4422:1: ( (lv_type_2_0= ruletype ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4423:1: (lv_type_2_0= ruletype )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4423:1: (lv_type_2_0= ruletype )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4424:3: lv_type_2_0= ruletype
            {
             
            	        newCompositeNode(grammarAccess.getVariable_sectionAccess().getTypeTypeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruletype_in_rulevariable_section8759);
            lv_type_2_0=ruletype();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVariable_sectionRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_2_0, 
                    		"type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "rulevariable_section"


    // $ANTLR start "entryRulerecord_section"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4448:1: entryRulerecord_section returns [EObject current=null] : iv_rulerecord_section= rulerecord_section EOF ;
    public final EObject entryRulerecord_section() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerecord_section = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4449:2: (iv_rulerecord_section= rulerecord_section EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4450:2: iv_rulerecord_section= rulerecord_section EOF
            {
             newCompositeNode(grammarAccess.getRecord_sectionRule()); 
            pushFollow(FOLLOW_rulerecord_section_in_entryRulerecord_section8794);
            iv_rulerecord_section=rulerecord_section();

            state._fsp--;

             current =iv_rulerecord_section; 
            match(input,EOF,FOLLOW_EOF_in_entryRulerecord_section8804); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulerecord_section"


    // $ANTLR start "rulerecord_section"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4457:1: rulerecord_section returns [EObject current=null] : ( ( (lv_identifiers_0_0= ruleidentifier_list ) ) otherlv_1= Colon ( (lv_type_2_0= ruletype ) ) ) ;
    public final EObject rulerecord_section() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_identifiers_0_0 = null;

        EObject lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4460:28: ( ( ( (lv_identifiers_0_0= ruleidentifier_list ) ) otherlv_1= Colon ( (lv_type_2_0= ruletype ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4461:1: ( ( (lv_identifiers_0_0= ruleidentifier_list ) ) otherlv_1= Colon ( (lv_type_2_0= ruletype ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4461:1: ( ( (lv_identifiers_0_0= ruleidentifier_list ) ) otherlv_1= Colon ( (lv_type_2_0= ruletype ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4461:2: ( (lv_identifiers_0_0= ruleidentifier_list ) ) otherlv_1= Colon ( (lv_type_2_0= ruletype ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4461:2: ( (lv_identifiers_0_0= ruleidentifier_list ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4462:1: (lv_identifiers_0_0= ruleidentifier_list )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4462:1: (lv_identifiers_0_0= ruleidentifier_list )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4463:3: lv_identifiers_0_0= ruleidentifier_list
            {
             
            	        newCompositeNode(grammarAccess.getRecord_sectionAccess().getIdentifiersIdentifier_listParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleidentifier_list_in_rulerecord_section8850);
            lv_identifiers_0_0=ruleidentifier_list();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRecord_sectionRule());
            	        }
                   		set(
                   			current, 
                   			"identifiers",
                    		lv_identifiers_0_0, 
                    		"identifier_list");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_Colon_in_rulerecord_section8863); 

                	newLeafNode(otherlv_1, grammarAccess.getRecord_sectionAccess().getColonKeyword_1());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4484:1: ( (lv_type_2_0= ruletype ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4485:1: (lv_type_2_0= ruletype )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4485:1: (lv_type_2_0= ruletype )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4486:3: lv_type_2_0= ruletype
            {
             
            	        newCompositeNode(grammarAccess.getRecord_sectionAccess().getTypeTypeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruletype_in_rulerecord_section8883);
            lv_type_2_0=ruletype();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRecord_sectionRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_2_0, 
                    		"type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "rulerecord_section"


    // $ANTLR start "entryRulevariant_part"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4510:1: entryRulevariant_part returns [EObject current=null] : iv_rulevariant_part= rulevariant_part EOF ;
    public final EObject entryRulevariant_part() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariant_part = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4511:2: (iv_rulevariant_part= rulevariant_part EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4512:2: iv_rulevariant_part= rulevariant_part EOF
            {
             newCompositeNode(grammarAccess.getVariant_partRule()); 
            pushFollow(FOLLOW_rulevariant_part_in_entryRulevariant_part8918);
            iv_rulevariant_part=rulevariant_part();

            state._fsp--;

             current =iv_rulevariant_part; 
            match(input,EOF,FOLLOW_EOF_in_entryRulevariant_part8928); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulevariant_part"


    // $ANTLR start "rulevariant_part"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4519:1: rulevariant_part returns [EObject current=null] : (otherlv_0= Case ( (lv_tag_1_0= ruletag_field ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= Of ( (lv_variants_4_0= rulevariant ) ) (otherlv_5= Semicolon ( (lv_variants_6_0= rulevariant ) ) )* ) ;
    public final EObject rulevariant_part() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_tag_1_0 = null;

        EObject lv_variants_4_0 = null;

        EObject lv_variants_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4522:28: ( (otherlv_0= Case ( (lv_tag_1_0= ruletag_field ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= Of ( (lv_variants_4_0= rulevariant ) ) (otherlv_5= Semicolon ( (lv_variants_6_0= rulevariant ) ) )* ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4523:1: (otherlv_0= Case ( (lv_tag_1_0= ruletag_field ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= Of ( (lv_variants_4_0= rulevariant ) ) (otherlv_5= Semicolon ( (lv_variants_6_0= rulevariant ) ) )* )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4523:1: (otherlv_0= Case ( (lv_tag_1_0= ruletag_field ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= Of ( (lv_variants_4_0= rulevariant ) ) (otherlv_5= Semicolon ( (lv_variants_6_0= rulevariant ) ) )* )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4524:2: otherlv_0= Case ( (lv_tag_1_0= ruletag_field ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= Of ( (lv_variants_4_0= rulevariant ) ) (otherlv_5= Semicolon ( (lv_variants_6_0= rulevariant ) ) )*
            {
            otherlv_0=(Token)match(input,Case,FOLLOW_Case_in_rulevariant_part8966); 

                	newLeafNode(otherlv_0, grammarAccess.getVariant_partAccess().getCaseKeyword_0());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4528:1: ( (lv_tag_1_0= ruletag_field ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==RULE_ID) ) {
                int LA56_1 = input.LA(2);

                if ( (LA56_1==Colon) ) {
                    alt56=1;
                }
            }
            switch (alt56) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4529:1: (lv_tag_1_0= ruletag_field )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4529:1: (lv_tag_1_0= ruletag_field )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4530:3: lv_tag_1_0= ruletag_field
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariant_partAccess().getTagTag_fieldParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruletag_field_in_rulevariant_part8986);
                    lv_tag_1_0=ruletag_field();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVariant_partRule());
                    	        }
                           		set(
                           			current, 
                           			"tag",
                            		lv_tag_1_0, 
                            		"tag_field");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4546:3: ( (lv_name_2_0= RULE_ID ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4547:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4547:1: (lv_name_2_0= RULE_ID )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4548:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulevariant_part9004); 

            			newLeafNode(lv_name_2_0, grammarAccess.getVariant_partAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getVariant_partRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,Of,FOLLOW_Of_in_rulevariant_part9022); 

                	newLeafNode(otherlv_3, grammarAccess.getVariant_partAccess().getOfKeyword_3());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4569:1: ( (lv_variants_4_0= rulevariant ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4570:1: (lv_variants_4_0= rulevariant )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4570:1: (lv_variants_4_0= rulevariant )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4571:3: lv_variants_4_0= rulevariant
            {
             
            	        newCompositeNode(grammarAccess.getVariant_partAccess().getVariantsVariantParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_rulevariant_in_rulevariant_part9042);
            lv_variants_4_0=rulevariant();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVariant_partRule());
            	        }
                   		add(
                   			current, 
                   			"variants",
                    		lv_variants_4_0, 
                    		"variant");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4587:2: (otherlv_5= Semicolon ( (lv_variants_6_0= rulevariant ) ) )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==Semicolon) ) {
                    int LA57_1 = input.LA(2);

                    if ( (LA57_1==False||LA57_1==True||LA57_1==Nil||(LA57_1>=RULE_INTEGER_NUMBER && LA57_1<=RULE_SIGNED_REAL_NUMBER)||LA57_1==RULE_ADDITION_OPERATOR||LA57_1==RULE_ID||LA57_1==RULE_STRING) ) {
                        alt57=1;
                    }


                }


                switch (alt57) {
            	case 1 :
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4588:2: otherlv_5= Semicolon ( (lv_variants_6_0= rulevariant ) )
            	    {
            	    otherlv_5=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_rulevariant_part9056); 

            	        	newLeafNode(otherlv_5, grammarAccess.getVariant_partAccess().getSemicolonKeyword_5_0());
            	        
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4592:1: ( (lv_variants_6_0= rulevariant ) )
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4593:1: (lv_variants_6_0= rulevariant )
            	    {
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4593:1: (lv_variants_6_0= rulevariant )
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4594:3: lv_variants_6_0= rulevariant
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getVariant_partAccess().getVariantsVariantParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulevariant_in_rulevariant_part9076);
            	    lv_variants_6_0=rulevariant();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getVariant_partRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"variants",
            	            		lv_variants_6_0, 
            	            		"variant");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "rulevariant_part"


    // $ANTLR start "entryRuletag_field"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4618:1: entryRuletag_field returns [EObject current=null] : iv_ruletag_field= ruletag_field EOF ;
    public final EObject entryRuletag_field() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletag_field = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4619:2: (iv_ruletag_field= ruletag_field EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4620:2: iv_ruletag_field= ruletag_field EOF
            {
             newCompositeNode(grammarAccess.getTag_fieldRule()); 
            pushFollow(FOLLOW_ruletag_field_in_entryRuletag_field9113);
            iv_ruletag_field=ruletag_field();

            state._fsp--;

             current =iv_ruletag_field; 
            match(input,EOF,FOLLOW_EOF_in_entryRuletag_field9123); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuletag_field"


    // $ANTLR start "ruletag_field"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4627:1: ruletag_field returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ) ;
    public final EObject ruletag_field() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4630:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4631:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4631:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4631:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4631:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4632:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4632:1: (lv_name_0_0= RULE_ID )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4633:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruletag_field9165); 

            			newLeafNode(lv_name_0_0, grammarAccess.getTag_fieldAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTag_fieldRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_Colon_in_ruletag_field9183); 

                	newLeafNode(otherlv_1, grammarAccess.getTag_fieldAccess().getColonKeyword_1());
                

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruletag_field"


    // $ANTLR start "entryRulevariant"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4662:1: entryRulevariant returns [EObject current=null] : iv_rulevariant= rulevariant EOF ;
    public final EObject entryRulevariant() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariant = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4663:2: (iv_rulevariant= rulevariant EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4664:2: iv_rulevariant= rulevariant EOF
            {
             newCompositeNode(grammarAccess.getVariantRule()); 
            pushFollow(FOLLOW_rulevariant_in_entryRulevariant9217);
            iv_rulevariant=rulevariant();

            state._fsp--;

             current =iv_rulevariant; 
            match(input,EOF,FOLLOW_EOF_in_entryRulevariant9227); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulevariant"


    // $ANTLR start "rulevariant"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4671:1: rulevariant returns [EObject current=null] : ( ( (lv_labels_0_0= rulecase_label_list ) ) otherlv_1= Colon otherlv_2= LeftParenthesis ( (lv_fields_3_0= rulefield_list ) )? otherlv_4= RightParenthesis ) ;
    public final EObject rulevariant() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_labels_0_0 = null;

        EObject lv_fields_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4674:28: ( ( ( (lv_labels_0_0= rulecase_label_list ) ) otherlv_1= Colon otherlv_2= LeftParenthesis ( (lv_fields_3_0= rulefield_list ) )? otherlv_4= RightParenthesis ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4675:1: ( ( (lv_labels_0_0= rulecase_label_list ) ) otherlv_1= Colon otherlv_2= LeftParenthesis ( (lv_fields_3_0= rulefield_list ) )? otherlv_4= RightParenthesis )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4675:1: ( ( (lv_labels_0_0= rulecase_label_list ) ) otherlv_1= Colon otherlv_2= LeftParenthesis ( (lv_fields_3_0= rulefield_list ) )? otherlv_4= RightParenthesis )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4675:2: ( (lv_labels_0_0= rulecase_label_list ) ) otherlv_1= Colon otherlv_2= LeftParenthesis ( (lv_fields_3_0= rulefield_list ) )? otherlv_4= RightParenthesis
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4675:2: ( (lv_labels_0_0= rulecase_label_list ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4676:1: (lv_labels_0_0= rulecase_label_list )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4676:1: (lv_labels_0_0= rulecase_label_list )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4677:3: lv_labels_0_0= rulecase_label_list
            {
             
            	        newCompositeNode(grammarAccess.getVariantAccess().getLabelsCase_label_listParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_rulecase_label_list_in_rulevariant9273);
            lv_labels_0_0=rulecase_label_list();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVariantRule());
            	        }
                   		set(
                   			current, 
                   			"labels",
                    		lv_labels_0_0, 
                    		"case_label_list");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_Colon_in_rulevariant9286); 

                	newLeafNode(otherlv_1, grammarAccess.getVariantAccess().getColonKeyword_1());
                
            otherlv_2=(Token)match(input,LeftParenthesis,FOLLOW_LeftParenthesis_in_rulevariant9298); 

                	newLeafNode(otherlv_2, grammarAccess.getVariantAccess().getLeftParenthesisKeyword_2());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4703:1: ( (lv_fields_3_0= rulefield_list ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==Case||LA58_0==RULE_ID) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4704:1: (lv_fields_3_0= rulefield_list )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4704:1: (lv_fields_3_0= rulefield_list )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4705:3: lv_fields_3_0= rulefield_list
                    {
                     
                    	        newCompositeNode(grammarAccess.getVariantAccess().getFieldsField_listParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_rulefield_list_in_rulevariant9318);
                    lv_fields_3_0=rulefield_list();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVariantRule());
                    	        }
                           		set(
                           			current, 
                           			"fields",
                            		lv_fields_3_0, 
                            		"field_list");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,RightParenthesis,FOLLOW_RightParenthesis_in_rulevariant9332); 

                	newLeafNode(otherlv_4, grammarAccess.getVariantAccess().getRightParenthesisKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "rulevariant"


    // $ANTLR start "entryRuleset_type"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4734:1: entryRuleset_type returns [EObject current=null] : iv_ruleset_type= ruleset_type EOF ;
    public final EObject entryRuleset_type() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleset_type = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4735:2: (iv_ruleset_type= ruleset_type EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4736:2: iv_ruleset_type= ruleset_type EOF
            {
             newCompositeNode(grammarAccess.getSet_typeRule()); 
            pushFollow(FOLLOW_ruleset_type_in_entryRuleset_type9366);
            iv_ruleset_type=ruleset_type();

            state._fsp--;

             current =iv_ruleset_type; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleset_type9376); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleset_type"


    // $ANTLR start "ruleset_type"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4743:1: ruleset_type returns [EObject current=null] : (otherlv_0= Set otherlv_1= Of ( (lv_type_2_0= ruletype ) ) ) ;
    public final EObject ruleset_type() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4746:28: ( (otherlv_0= Set otherlv_1= Of ( (lv_type_2_0= ruletype ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4747:1: (otherlv_0= Set otherlv_1= Of ( (lv_type_2_0= ruletype ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4747:1: (otherlv_0= Set otherlv_1= Of ( (lv_type_2_0= ruletype ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4748:2: otherlv_0= Set otherlv_1= Of ( (lv_type_2_0= ruletype ) )
            {
            otherlv_0=(Token)match(input,Set,FOLLOW_Set_in_ruleset_type9414); 

                	newLeafNode(otherlv_0, grammarAccess.getSet_typeAccess().getSetKeyword_0());
                
            otherlv_1=(Token)match(input,Of,FOLLOW_Of_in_ruleset_type9426); 

                	newLeafNode(otherlv_1, grammarAccess.getSet_typeAccess().getOfKeyword_1());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4757:1: ( (lv_type_2_0= ruletype ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4758:1: (lv_type_2_0= ruletype )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4758:1: (lv_type_2_0= ruletype )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4759:3: lv_type_2_0= ruletype
            {
             
            	        newCompositeNode(grammarAccess.getSet_typeAccess().getTypeTypeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruletype_in_ruleset_type9446);
            lv_type_2_0=ruletype();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSet_typeRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_2_0, 
                    		"type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleset_type"


    // $ANTLR start "entryRulefile_type"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4783:1: entryRulefile_type returns [EObject current=null] : iv_rulefile_type= rulefile_type EOF ;
    public final EObject entryRulefile_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefile_type = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4784:2: (iv_rulefile_type= rulefile_type EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4785:2: iv_rulefile_type= rulefile_type EOF
            {
             newCompositeNode(grammarAccess.getFile_typeRule()); 
            pushFollow(FOLLOW_rulefile_type_in_entryRulefile_type9481);
            iv_rulefile_type=rulefile_type();

            state._fsp--;

             current =iv_rulefile_type; 
            match(input,EOF,FOLLOW_EOF_in_entryRulefile_type9491); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulefile_type"


    // $ANTLR start "rulefile_type"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4792:1: rulefile_type returns [EObject current=null] : (otherlv_0= File otherlv_1= Of ( (lv_type_2_0= ruletype ) ) ) ;
    public final EObject rulefile_type() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4795:28: ( (otherlv_0= File otherlv_1= Of ( (lv_type_2_0= ruletype ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4796:1: (otherlv_0= File otherlv_1= Of ( (lv_type_2_0= ruletype ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4796:1: (otherlv_0= File otherlv_1= Of ( (lv_type_2_0= ruletype ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4797:2: otherlv_0= File otherlv_1= Of ( (lv_type_2_0= ruletype ) )
            {
            otherlv_0=(Token)match(input,File,FOLLOW_File_in_rulefile_type9529); 

                	newLeafNode(otherlv_0, grammarAccess.getFile_typeAccess().getFileKeyword_0());
                
            otherlv_1=(Token)match(input,Of,FOLLOW_Of_in_rulefile_type9541); 

                	newLeafNode(otherlv_1, grammarAccess.getFile_typeAccess().getOfKeyword_1());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4806:1: ( (lv_type_2_0= ruletype ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4807:1: (lv_type_2_0= ruletype )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4807:1: (lv_type_2_0= ruletype )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4808:3: lv_type_2_0= ruletype
            {
             
            	        newCompositeNode(grammarAccess.getFile_typeAccess().getTypeTypeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruletype_in_rulefile_type9561);
            lv_type_2_0=ruletype();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFile_typeRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_2_0, 
                    		"type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "rulefile_type"


    // $ANTLR start "entryRulepointer_type"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4832:1: entryRulepointer_type returns [EObject current=null] : iv_rulepointer_type= rulepointer_type EOF ;
    public final EObject entryRulepointer_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulepointer_type = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4833:2: (iv_rulepointer_type= rulepointer_type EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4834:2: iv_rulepointer_type= rulepointer_type EOF
            {
             newCompositeNode(grammarAccess.getPointer_typeRule()); 
            pushFollow(FOLLOW_rulepointer_type_in_entryRulepointer_type9596);
            iv_rulepointer_type=rulepointer_type();

            state._fsp--;

             current =iv_rulepointer_type; 
            match(input,EOF,FOLLOW_EOF_in_entryRulepointer_type9606); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulepointer_type"


    // $ANTLR start "rulepointer_type"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4841:1: rulepointer_type returns [EObject current=null] : (otherlv_0= CircumflexAccent ( (lv_type_1_0= ruletype ) ) ) ;
    public final EObject rulepointer_type() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_type_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4844:28: ( (otherlv_0= CircumflexAccent ( (lv_type_1_0= ruletype ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4845:1: (otherlv_0= CircumflexAccent ( (lv_type_1_0= ruletype ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4845:1: (otherlv_0= CircumflexAccent ( (lv_type_1_0= ruletype ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4846:2: otherlv_0= CircumflexAccent ( (lv_type_1_0= ruletype ) )
            {
            otherlv_0=(Token)match(input,CircumflexAccent,FOLLOW_CircumflexAccent_in_rulepointer_type9644); 

                	newLeafNode(otherlv_0, grammarAccess.getPointer_typeAccess().getCircumflexAccentKeyword_0());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4850:1: ( (lv_type_1_0= ruletype ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4851:1: (lv_type_1_0= ruletype )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4851:1: (lv_type_1_0= ruletype )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4852:3: lv_type_1_0= ruletype
            {
             
            	        newCompositeNode(grammarAccess.getPointer_typeAccess().getTypeTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruletype_in_rulepointer_type9664);
            lv_type_1_0=ruletype();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPointer_typeRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_1_0, 
                    		"type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "rulepointer_type"


    // $ANTLR start "entryRulevariable_declaration_part"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4876:1: entryRulevariable_declaration_part returns [EObject current=null] : iv_rulevariable_declaration_part= rulevariable_declaration_part EOF ;
    public final EObject entryRulevariable_declaration_part() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariable_declaration_part = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4877:2: (iv_rulevariable_declaration_part= rulevariable_declaration_part EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4878:2: iv_rulevariable_declaration_part= rulevariable_declaration_part EOF
            {
             newCompositeNode(grammarAccess.getVariable_declaration_partRule()); 
            pushFollow(FOLLOW_rulevariable_declaration_part_in_entryRulevariable_declaration_part9699);
            iv_rulevariable_declaration_part=rulevariable_declaration_part();

            state._fsp--;

             current =iv_rulevariable_declaration_part; 
            match(input,EOF,FOLLOW_EOF_in_entryRulevariable_declaration_part9709); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulevariable_declaration_part"


    // $ANTLR start "rulevariable_declaration_part"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4885:1: rulevariable_declaration_part returns [EObject current=null] : (otherlv_0= Var ( (lv_sections_1_0= rulevariable_section ) ) otherlv_2= Semicolon ( ( (lv_sections_3_0= rulevariable_section ) ) otherlv_4= Semicolon )* ) ;
    public final EObject rulevariable_declaration_part() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_sections_1_0 = null;

        EObject lv_sections_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4888:28: ( (otherlv_0= Var ( (lv_sections_1_0= rulevariable_section ) ) otherlv_2= Semicolon ( ( (lv_sections_3_0= rulevariable_section ) ) otherlv_4= Semicolon )* ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4889:1: (otherlv_0= Var ( (lv_sections_1_0= rulevariable_section ) ) otherlv_2= Semicolon ( ( (lv_sections_3_0= rulevariable_section ) ) otherlv_4= Semicolon )* )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4889:1: (otherlv_0= Var ( (lv_sections_1_0= rulevariable_section ) ) otherlv_2= Semicolon ( ( (lv_sections_3_0= rulevariable_section ) ) otherlv_4= Semicolon )* )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4890:2: otherlv_0= Var ( (lv_sections_1_0= rulevariable_section ) ) otherlv_2= Semicolon ( ( (lv_sections_3_0= rulevariable_section ) ) otherlv_4= Semicolon )*
            {
            otherlv_0=(Token)match(input,Var,FOLLOW_Var_in_rulevariable_declaration_part9747); 

                	newLeafNode(otherlv_0, grammarAccess.getVariable_declaration_partAccess().getVarKeyword_0());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4894:1: ( (lv_sections_1_0= rulevariable_section ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4895:1: (lv_sections_1_0= rulevariable_section )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4895:1: (lv_sections_1_0= rulevariable_section )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4896:3: lv_sections_1_0= rulevariable_section
            {
             
            	        newCompositeNode(grammarAccess.getVariable_declaration_partAccess().getSectionsVariable_sectionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulevariable_section_in_rulevariable_declaration_part9767);
            lv_sections_1_0=rulevariable_section();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVariable_declaration_partRule());
            	        }
                   		add(
                   			current, 
                   			"sections",
                    		lv_sections_1_0, 
                    		"variable_section");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_rulevariable_declaration_part9780); 

                	newLeafNode(otherlv_2, grammarAccess.getVariable_declaration_partAccess().getSemicolonKeyword_2());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4917:1: ( ( (lv_sections_3_0= rulevariable_section ) ) otherlv_4= Semicolon )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==RULE_ID) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4917:2: ( (lv_sections_3_0= rulevariable_section ) ) otherlv_4= Semicolon
            	    {
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4917:2: ( (lv_sections_3_0= rulevariable_section ) )
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4918:1: (lv_sections_3_0= rulevariable_section )
            	    {
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4918:1: (lv_sections_3_0= rulevariable_section )
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4919:3: lv_sections_3_0= rulevariable_section
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getVariable_declaration_partAccess().getSectionsVariable_sectionParserRuleCall_3_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulevariable_section_in_rulevariable_declaration_part9801);
            	    lv_sections_3_0=rulevariable_section();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getVariable_declaration_partRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"sections",
            	            		lv_sections_3_0, 
            	            		"variable_section");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_4=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_rulevariable_declaration_part9814); 

            	        	newLeafNode(otherlv_4, grammarAccess.getVariable_declaration_partAccess().getSemicolonKeyword_3_1());
            	        

            	    }
            	    break;

            	default :
            	    break loop59;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "rulevariable_declaration_part"


    // $ANTLR start "entryRuleprocedure_and_function_declaration_part"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4948:1: entryRuleprocedure_and_function_declaration_part returns [EObject current=null] : iv_ruleprocedure_and_function_declaration_part= ruleprocedure_and_function_declaration_part EOF ;
    public final EObject entryRuleprocedure_and_function_declaration_part() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprocedure_and_function_declaration_part = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4949:2: (iv_ruleprocedure_and_function_declaration_part= ruleprocedure_and_function_declaration_part EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4950:2: iv_ruleprocedure_and_function_declaration_part= ruleprocedure_and_function_declaration_part EOF
            {
             newCompositeNode(grammarAccess.getProcedure_and_function_declaration_partRule()); 
            pushFollow(FOLLOW_ruleprocedure_and_function_declaration_part_in_entryRuleprocedure_and_function_declaration_part9850);
            iv_ruleprocedure_and_function_declaration_part=ruleprocedure_and_function_declaration_part();

            state._fsp--;

             current =iv_ruleprocedure_and_function_declaration_part; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleprocedure_and_function_declaration_part9860); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleprocedure_and_function_declaration_part"


    // $ANTLR start "ruleprocedure_and_function_declaration_part"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4957:1: ruleprocedure_and_function_declaration_part returns [EObject current=null] : ( ( ( (lv_procedures_0_0= ruleprocedure_declaration ) ) | ( (lv_functions_1_0= rulefunction_declaration ) ) ) otherlv_2= Semicolon )+ ;
    public final EObject ruleprocedure_and_function_declaration_part() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_procedures_0_0 = null;

        EObject lv_functions_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4960:28: ( ( ( ( (lv_procedures_0_0= ruleprocedure_declaration ) ) | ( (lv_functions_1_0= rulefunction_declaration ) ) ) otherlv_2= Semicolon )+ )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4961:1: ( ( ( (lv_procedures_0_0= ruleprocedure_declaration ) ) | ( (lv_functions_1_0= rulefunction_declaration ) ) ) otherlv_2= Semicolon )+
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4961:1: ( ( ( (lv_procedures_0_0= ruleprocedure_declaration ) ) | ( (lv_functions_1_0= rulefunction_declaration ) ) ) otherlv_2= Semicolon )+
            int cnt61=0;
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( ((LA61_0>=Procedure && LA61_0<=Function)) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4961:2: ( ( (lv_procedures_0_0= ruleprocedure_declaration ) ) | ( (lv_functions_1_0= rulefunction_declaration ) ) ) otherlv_2= Semicolon
            	    {
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4961:2: ( ( (lv_procedures_0_0= ruleprocedure_declaration ) ) | ( (lv_functions_1_0= rulefunction_declaration ) ) )
            	    int alt60=2;
            	    int LA60_0 = input.LA(1);

            	    if ( (LA60_0==Procedure) ) {
            	        alt60=1;
            	    }
            	    else if ( (LA60_0==Function) ) {
            	        alt60=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 60, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt60) {
            	        case 1 :
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4961:3: ( (lv_procedures_0_0= ruleprocedure_declaration ) )
            	            {
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4961:3: ( (lv_procedures_0_0= ruleprocedure_declaration ) )
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4962:1: (lv_procedures_0_0= ruleprocedure_declaration )
            	            {
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4962:1: (lv_procedures_0_0= ruleprocedure_declaration )
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4963:3: lv_procedures_0_0= ruleprocedure_declaration
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getProcedure_and_function_declaration_partAccess().getProceduresProcedure_declarationParserRuleCall_0_0_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleprocedure_declaration_in_ruleprocedure_and_function_declaration_part9907);
            	            lv_procedures_0_0=ruleprocedure_declaration();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getProcedure_and_function_declaration_partRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"procedures",
            	                    		lv_procedures_0_0, 
            	                    		"procedure_declaration");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4980:6: ( (lv_functions_1_0= rulefunction_declaration ) )
            	            {
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4980:6: ( (lv_functions_1_0= rulefunction_declaration ) )
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4981:1: (lv_functions_1_0= rulefunction_declaration )
            	            {
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4981:1: (lv_functions_1_0= rulefunction_declaration )
            	            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:4982:3: lv_functions_1_0= rulefunction_declaration
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getProcedure_and_function_declaration_partAccess().getFunctionsFunction_declarationParserRuleCall_0_1_0()); 
            	            	    
            	            pushFollow(FOLLOW_rulefunction_declaration_in_ruleprocedure_and_function_declaration_part9934);
            	            lv_functions_1_0=rulefunction_declaration();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getProcedure_and_function_declaration_partRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"functions",
            	                    		lv_functions_1_0, 
            	                    		"function_declaration");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    otherlv_2=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_ruleprocedure_and_function_declaration_part9948); 

            	        	newLeafNode(otherlv_2, grammarAccess.getProcedure_and_function_declaration_partAccess().getSemicolonKeyword_1());
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt61 >= 1 ) break loop61;
                        EarlyExitException eee =
                            new EarlyExitException(61, input);
                        throw eee;
                }
                cnt61++;
            } while (true);


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleprocedure_and_function_declaration_part"


    // $ANTLR start "entryRuleprocedure_declaration"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5015:1: entryRuleprocedure_declaration returns [EObject current=null] : iv_ruleprocedure_declaration= ruleprocedure_declaration EOF ;
    public final EObject entryRuleprocedure_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprocedure_declaration = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5016:2: (iv_ruleprocedure_declaration= ruleprocedure_declaration EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5017:2: iv_ruleprocedure_declaration= ruleprocedure_declaration EOF
            {
             newCompositeNode(grammarAccess.getProcedure_declarationRule()); 
            pushFollow(FOLLOW_ruleprocedure_declaration_in_entryRuleprocedure_declaration9987);
            iv_ruleprocedure_declaration=ruleprocedure_declaration();

            state._fsp--;

             current =iv_ruleprocedure_declaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleprocedure_declaration9997); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleprocedure_declaration"


    // $ANTLR start "ruleprocedure_declaration"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5024:1: ruleprocedure_declaration returns [EObject current=null] : ( ( (lv_heading_0_0= ruleprocedure_heading ) ) otherlv_1= Semicolon ( ( (lv_block_2_0= ruleblock ) ) | ( (lv_forward_3_0= Forward ) ) ) ) ;
    public final EObject ruleprocedure_declaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_forward_3_0=null;
        EObject lv_heading_0_0 = null;

        EObject lv_block_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5027:28: ( ( ( (lv_heading_0_0= ruleprocedure_heading ) ) otherlv_1= Semicolon ( ( (lv_block_2_0= ruleblock ) ) | ( (lv_forward_3_0= Forward ) ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5028:1: ( ( (lv_heading_0_0= ruleprocedure_heading ) ) otherlv_1= Semicolon ( ( (lv_block_2_0= ruleblock ) ) | ( (lv_forward_3_0= Forward ) ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5028:1: ( ( (lv_heading_0_0= ruleprocedure_heading ) ) otherlv_1= Semicolon ( ( (lv_block_2_0= ruleblock ) ) | ( (lv_forward_3_0= Forward ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5028:2: ( (lv_heading_0_0= ruleprocedure_heading ) ) otherlv_1= Semicolon ( ( (lv_block_2_0= ruleblock ) ) | ( (lv_forward_3_0= Forward ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5028:2: ( (lv_heading_0_0= ruleprocedure_heading ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5029:1: (lv_heading_0_0= ruleprocedure_heading )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5029:1: (lv_heading_0_0= ruleprocedure_heading )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5030:3: lv_heading_0_0= ruleprocedure_heading
            {
             
            	        newCompositeNode(grammarAccess.getProcedure_declarationAccess().getHeadingProcedure_headingParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleprocedure_heading_in_ruleprocedure_declaration10043);
            lv_heading_0_0=ruleprocedure_heading();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getProcedure_declarationRule());
            	        }
                   		set(
                   			current, 
                   			"heading",
                    		lv_heading_0_0, 
                    		"procedure_heading");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_ruleprocedure_declaration10056); 

                	newLeafNode(otherlv_1, grammarAccess.getProcedure_declarationAccess().getSemicolonKeyword_1());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5051:1: ( ( (lv_block_2_0= ruleblock ) ) | ( (lv_forward_3_0= Forward ) ) )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( ((LA62_0>=Procedure && LA62_0<=Function)||(LA62_0>=Begin && LA62_0<=Const)||LA62_0==Label||LA62_0==Type||LA62_0==Var) ) {
                alt62=1;
            }
            else if ( (LA62_0==Forward) ) {
                alt62=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }
            switch (alt62) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5051:2: ( (lv_block_2_0= ruleblock ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5051:2: ( (lv_block_2_0= ruleblock ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5052:1: (lv_block_2_0= ruleblock )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5052:1: (lv_block_2_0= ruleblock )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5053:3: lv_block_2_0= ruleblock
                    {
                     
                    	        newCompositeNode(grammarAccess.getProcedure_declarationAccess().getBlockBlockParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleblock_in_ruleprocedure_declaration10077);
                    lv_block_2_0=ruleblock();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getProcedure_declarationRule());
                    	        }
                           		set(
                           			current, 
                           			"block",
                            		lv_block_2_0, 
                            		"block");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5070:6: ( (lv_forward_3_0= Forward ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5070:6: ( (lv_forward_3_0= Forward ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5071:1: (lv_forward_3_0= Forward )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5071:1: (lv_forward_3_0= Forward )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5072:3: lv_forward_3_0= Forward
                    {
                    lv_forward_3_0=(Token)match(input,Forward,FOLLOW_Forward_in_ruleprocedure_declaration10102); 

                            newLeafNode(lv_forward_3_0, grammarAccess.getProcedure_declarationAccess().getForwardForwardKeyword_2_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getProcedure_declarationRule());
                    	        }
                           		setWithLastConsumed(current, "forward", true, "forward");
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleprocedure_declaration"


    // $ANTLR start "entryRuleprocedure_heading"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5094:1: entryRuleprocedure_heading returns [EObject current=null] : iv_ruleprocedure_heading= ruleprocedure_heading EOF ;
    public final EObject entryRuleprocedure_heading() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprocedure_heading = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5095:2: (iv_ruleprocedure_heading= ruleprocedure_heading EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5096:2: iv_ruleprocedure_heading= ruleprocedure_heading EOF
            {
             newCompositeNode(grammarAccess.getProcedure_headingRule()); 
            pushFollow(FOLLOW_ruleprocedure_heading_in_entryRuleprocedure_heading10149);
            iv_ruleprocedure_heading=ruleprocedure_heading();

            state._fsp--;

             current =iv_ruleprocedure_heading; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleprocedure_heading10159); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleprocedure_heading"


    // $ANTLR start "ruleprocedure_heading"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5103:1: ruleprocedure_heading returns [EObject current=null] : (otherlv_0= Procedure ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleformal_parameter_list ) )? ) ;
    public final EObject ruleprocedure_heading() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_parameters_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5106:28: ( (otherlv_0= Procedure ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleformal_parameter_list ) )? ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5107:1: (otherlv_0= Procedure ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleformal_parameter_list ) )? )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5107:1: (otherlv_0= Procedure ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleformal_parameter_list ) )? )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5108:2: otherlv_0= Procedure ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleformal_parameter_list ) )?
            {
            otherlv_0=(Token)match(input,Procedure,FOLLOW_Procedure_in_ruleprocedure_heading10197); 

                	newLeafNode(otherlv_0, grammarAccess.getProcedure_headingAccess().getProcedureKeyword_0());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5112:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5113:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5113:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5114:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleprocedure_heading10213); 

            			newLeafNode(lv_name_1_0, grammarAccess.getProcedure_headingAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getProcedure_headingRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5130:2: ( (lv_parameters_2_0= ruleformal_parameter_list ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==LeftParenthesis) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5131:1: (lv_parameters_2_0= ruleformal_parameter_list )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5131:1: (lv_parameters_2_0= ruleformal_parameter_list )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5132:3: lv_parameters_2_0= ruleformal_parameter_list
                    {
                     
                    	        newCompositeNode(grammarAccess.getProcedure_headingAccess().getParametersFormal_parameter_listParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleformal_parameter_list_in_ruleprocedure_heading10239);
                    lv_parameters_2_0=ruleformal_parameter_list();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getProcedure_headingRule());
                    	        }
                           		set(
                           			current, 
                           			"parameters",
                            		lv_parameters_2_0, 
                            		"formal_parameter_list");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleprocedure_heading"


    // $ANTLR start "entryRuleformal_parameter_list"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5156:1: entryRuleformal_parameter_list returns [EObject current=null] : iv_ruleformal_parameter_list= ruleformal_parameter_list EOF ;
    public final EObject entryRuleformal_parameter_list() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleformal_parameter_list = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5157:2: (iv_ruleformal_parameter_list= ruleformal_parameter_list EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5158:2: iv_ruleformal_parameter_list= ruleformal_parameter_list EOF
            {
             newCompositeNode(grammarAccess.getFormal_parameter_listRule()); 
            pushFollow(FOLLOW_ruleformal_parameter_list_in_entryRuleformal_parameter_list10275);
            iv_ruleformal_parameter_list=ruleformal_parameter_list();

            state._fsp--;

             current =iv_ruleformal_parameter_list; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleformal_parameter_list10285); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleformal_parameter_list"


    // $ANTLR start "ruleformal_parameter_list"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5165:1: ruleformal_parameter_list returns [EObject current=null] : (otherlv_0= LeftParenthesis ( (lv_parameters_1_0= ruleformal_parameter_section ) ) (otherlv_2= Semicolon ( (lv_parameters_3_0= ruleformal_parameter_section ) ) )* otherlv_4= RightParenthesis ) ;
    public final EObject ruleformal_parameter_list() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_parameters_1_0 = null;

        EObject lv_parameters_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5168:28: ( (otherlv_0= LeftParenthesis ( (lv_parameters_1_0= ruleformal_parameter_section ) ) (otherlv_2= Semicolon ( (lv_parameters_3_0= ruleformal_parameter_section ) ) )* otherlv_4= RightParenthesis ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5169:1: (otherlv_0= LeftParenthesis ( (lv_parameters_1_0= ruleformal_parameter_section ) ) (otherlv_2= Semicolon ( (lv_parameters_3_0= ruleformal_parameter_section ) ) )* otherlv_4= RightParenthesis )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5169:1: (otherlv_0= LeftParenthesis ( (lv_parameters_1_0= ruleformal_parameter_section ) ) (otherlv_2= Semicolon ( (lv_parameters_3_0= ruleformal_parameter_section ) ) )* otherlv_4= RightParenthesis )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5170:2: otherlv_0= LeftParenthesis ( (lv_parameters_1_0= ruleformal_parameter_section ) ) (otherlv_2= Semicolon ( (lv_parameters_3_0= ruleformal_parameter_section ) ) )* otherlv_4= RightParenthesis
            {
            otherlv_0=(Token)match(input,LeftParenthesis,FOLLOW_LeftParenthesis_in_ruleformal_parameter_list10323); 

                	newLeafNode(otherlv_0, grammarAccess.getFormal_parameter_listAccess().getLeftParenthesisKeyword_0());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5174:1: ( (lv_parameters_1_0= ruleformal_parameter_section ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5175:1: (lv_parameters_1_0= ruleformal_parameter_section )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5175:1: (lv_parameters_1_0= ruleformal_parameter_section )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5176:3: lv_parameters_1_0= ruleformal_parameter_section
            {
             
            	        newCompositeNode(grammarAccess.getFormal_parameter_listAccess().getParametersFormal_parameter_sectionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleformal_parameter_section_in_ruleformal_parameter_list10343);
            lv_parameters_1_0=ruleformal_parameter_section();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFormal_parameter_listRule());
            	        }
                   		add(
                   			current, 
                   			"parameters",
                    		lv_parameters_1_0, 
                    		"formal_parameter_section");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5192:2: (otherlv_2= Semicolon ( (lv_parameters_3_0= ruleformal_parameter_section ) ) )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==Semicolon) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5193:2: otherlv_2= Semicolon ( (lv_parameters_3_0= ruleformal_parameter_section ) )
            	    {
            	    otherlv_2=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_ruleformal_parameter_list10357); 

            	        	newLeafNode(otherlv_2, grammarAccess.getFormal_parameter_listAccess().getSemicolonKeyword_2_0());
            	        
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5197:1: ( (lv_parameters_3_0= ruleformal_parameter_section ) )
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5198:1: (lv_parameters_3_0= ruleformal_parameter_section )
            	    {
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5198:1: (lv_parameters_3_0= ruleformal_parameter_section )
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5199:3: lv_parameters_3_0= ruleformal_parameter_section
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFormal_parameter_listAccess().getParametersFormal_parameter_sectionParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleformal_parameter_section_in_ruleformal_parameter_list10377);
            	    lv_parameters_3_0=ruleformal_parameter_section();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFormal_parameter_listRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"parameters",
            	            		lv_parameters_3_0, 
            	            		"formal_parameter_section");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop64;
                }
            } while (true);

            otherlv_4=(Token)match(input,RightParenthesis,FOLLOW_RightParenthesis_in_ruleformal_parameter_list10392); 

                	newLeafNode(otherlv_4, grammarAccess.getFormal_parameter_listAccess().getRightParenthesisKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleformal_parameter_list"


    // $ANTLR start "entryRuleformal_parameter_section"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5228:1: entryRuleformal_parameter_section returns [EObject current=null] : iv_ruleformal_parameter_section= ruleformal_parameter_section EOF ;
    public final EObject entryRuleformal_parameter_section() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleformal_parameter_section = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5229:2: (iv_ruleformal_parameter_section= ruleformal_parameter_section EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5230:2: iv_ruleformal_parameter_section= ruleformal_parameter_section EOF
            {
             newCompositeNode(grammarAccess.getFormal_parameter_sectionRule()); 
            pushFollow(FOLLOW_ruleformal_parameter_section_in_entryRuleformal_parameter_section10426);
            iv_ruleformal_parameter_section=ruleformal_parameter_section();

            state._fsp--;

             current =iv_ruleformal_parameter_section; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleformal_parameter_section10436); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleformal_parameter_section"


    // $ANTLR start "ruleformal_parameter_section"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5237:1: ruleformal_parameter_section returns [EObject current=null] : ( ( (lv_value_0_0= rulevalue_parameter_section ) ) | ( (lv_variable_1_0= rulevariable_parameter_section ) ) | ( (lv_procedure_2_0= ruleprocedure_heading ) ) | ( (lv_function_3_0= rulefunction_heading ) ) ) ;
    public final EObject ruleformal_parameter_section() throws RecognitionException {
        EObject current = null;

        EObject lv_value_0_0 = null;

        EObject lv_variable_1_0 = null;

        EObject lv_procedure_2_0 = null;

        EObject lv_function_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5240:28: ( ( ( (lv_value_0_0= rulevalue_parameter_section ) ) | ( (lv_variable_1_0= rulevariable_parameter_section ) ) | ( (lv_procedure_2_0= ruleprocedure_heading ) ) | ( (lv_function_3_0= rulefunction_heading ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5241:1: ( ( (lv_value_0_0= rulevalue_parameter_section ) ) | ( (lv_variable_1_0= rulevariable_parameter_section ) ) | ( (lv_procedure_2_0= ruleprocedure_heading ) ) | ( (lv_function_3_0= rulefunction_heading ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5241:1: ( ( (lv_value_0_0= rulevalue_parameter_section ) ) | ( (lv_variable_1_0= rulevariable_parameter_section ) ) | ( (lv_procedure_2_0= ruleprocedure_heading ) ) | ( (lv_function_3_0= rulefunction_heading ) ) )
            int alt65=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt65=1;
                }
                break;
            case Var:
                {
                alt65=2;
                }
                break;
            case Procedure:
                {
                alt65=3;
                }
                break;
            case Function:
                {
                alt65=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }

            switch (alt65) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5241:2: ( (lv_value_0_0= rulevalue_parameter_section ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5241:2: ( (lv_value_0_0= rulevalue_parameter_section ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5242:1: (lv_value_0_0= rulevalue_parameter_section )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5242:1: (lv_value_0_0= rulevalue_parameter_section )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5243:3: lv_value_0_0= rulevalue_parameter_section
                    {
                     
                    	        newCompositeNode(grammarAccess.getFormal_parameter_sectionAccess().getValueValue_parameter_sectionParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_rulevalue_parameter_section_in_ruleformal_parameter_section10482);
                    lv_value_0_0=rulevalue_parameter_section();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFormal_parameter_sectionRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_0_0, 
                            		"value_parameter_section");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5260:6: ( (lv_variable_1_0= rulevariable_parameter_section ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5260:6: ( (lv_variable_1_0= rulevariable_parameter_section ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5261:1: (lv_variable_1_0= rulevariable_parameter_section )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5261:1: (lv_variable_1_0= rulevariable_parameter_section )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5262:3: lv_variable_1_0= rulevariable_parameter_section
                    {
                     
                    	        newCompositeNode(grammarAccess.getFormal_parameter_sectionAccess().getVariableVariable_parameter_sectionParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_rulevariable_parameter_section_in_ruleformal_parameter_section10509);
                    lv_variable_1_0=rulevariable_parameter_section();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFormal_parameter_sectionRule());
                    	        }
                           		set(
                           			current, 
                           			"variable",
                            		lv_variable_1_0, 
                            		"variable_parameter_section");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5279:6: ( (lv_procedure_2_0= ruleprocedure_heading ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5279:6: ( (lv_procedure_2_0= ruleprocedure_heading ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5280:1: (lv_procedure_2_0= ruleprocedure_heading )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5280:1: (lv_procedure_2_0= ruleprocedure_heading )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5281:3: lv_procedure_2_0= ruleprocedure_heading
                    {
                     
                    	        newCompositeNode(grammarAccess.getFormal_parameter_sectionAccess().getProcedureProcedure_headingParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleprocedure_heading_in_ruleformal_parameter_section10536);
                    lv_procedure_2_0=ruleprocedure_heading();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFormal_parameter_sectionRule());
                    	        }
                           		set(
                           			current, 
                           			"procedure",
                            		lv_procedure_2_0, 
                            		"procedure_heading");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5298:6: ( (lv_function_3_0= rulefunction_heading ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5298:6: ( (lv_function_3_0= rulefunction_heading ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5299:1: (lv_function_3_0= rulefunction_heading )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5299:1: (lv_function_3_0= rulefunction_heading )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5300:3: lv_function_3_0= rulefunction_heading
                    {
                     
                    	        newCompositeNode(grammarAccess.getFormal_parameter_sectionAccess().getFunctionFunction_headingParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_rulefunction_heading_in_ruleformal_parameter_section10563);
                    lv_function_3_0=rulefunction_heading();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFormal_parameter_sectionRule());
                    	        }
                           		set(
                           			current, 
                           			"function",
                            		lv_function_3_0, 
                            		"function_heading");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleformal_parameter_section"


    // $ANTLR start "entryRulevalue_parameter_section"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5324:1: entryRulevalue_parameter_section returns [EObject current=null] : iv_rulevalue_parameter_section= rulevalue_parameter_section EOF ;
    public final EObject entryRulevalue_parameter_section() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevalue_parameter_section = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5325:2: (iv_rulevalue_parameter_section= rulevalue_parameter_section EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5326:2: iv_rulevalue_parameter_section= rulevalue_parameter_section EOF
            {
             newCompositeNode(grammarAccess.getValue_parameter_sectionRule()); 
            pushFollow(FOLLOW_rulevalue_parameter_section_in_entryRulevalue_parameter_section10598);
            iv_rulevalue_parameter_section=rulevalue_parameter_section();

            state._fsp--;

             current =iv_rulevalue_parameter_section; 
            match(input,EOF,FOLLOW_EOF_in_entryRulevalue_parameter_section10608); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulevalue_parameter_section"


    // $ANTLR start "rulevalue_parameter_section"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5333:1: rulevalue_parameter_section returns [EObject current=null] : ( ( (lv_identifiers_0_0= ruleidentifier_list ) ) otherlv_1= Colon ( (lv_type_2_0= ruleparameter_type ) ) ) ;
    public final EObject rulevalue_parameter_section() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_identifiers_0_0 = null;

        EObject lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5336:28: ( ( ( (lv_identifiers_0_0= ruleidentifier_list ) ) otherlv_1= Colon ( (lv_type_2_0= ruleparameter_type ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5337:1: ( ( (lv_identifiers_0_0= ruleidentifier_list ) ) otherlv_1= Colon ( (lv_type_2_0= ruleparameter_type ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5337:1: ( ( (lv_identifiers_0_0= ruleidentifier_list ) ) otherlv_1= Colon ( (lv_type_2_0= ruleparameter_type ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5337:2: ( (lv_identifiers_0_0= ruleidentifier_list ) ) otherlv_1= Colon ( (lv_type_2_0= ruleparameter_type ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5337:2: ( (lv_identifiers_0_0= ruleidentifier_list ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5338:1: (lv_identifiers_0_0= ruleidentifier_list )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5338:1: (lv_identifiers_0_0= ruleidentifier_list )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5339:3: lv_identifiers_0_0= ruleidentifier_list
            {
             
            	        newCompositeNode(grammarAccess.getValue_parameter_sectionAccess().getIdentifiersIdentifier_listParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleidentifier_list_in_rulevalue_parameter_section10654);
            lv_identifiers_0_0=ruleidentifier_list();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getValue_parameter_sectionRule());
            	        }
                   		set(
                   			current, 
                   			"identifiers",
                    		lv_identifiers_0_0, 
                    		"identifier_list");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_Colon_in_rulevalue_parameter_section10667); 

                	newLeafNode(otherlv_1, grammarAccess.getValue_parameter_sectionAccess().getColonKeyword_1());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5360:1: ( (lv_type_2_0= ruleparameter_type ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5361:1: (lv_type_2_0= ruleparameter_type )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5361:1: (lv_type_2_0= ruleparameter_type )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5362:3: lv_type_2_0= ruleparameter_type
            {
             
            	        newCompositeNode(grammarAccess.getValue_parameter_sectionAccess().getTypeParameter_typeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleparameter_type_in_rulevalue_parameter_section10687);
            lv_type_2_0=ruleparameter_type();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getValue_parameter_sectionRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_2_0, 
                    		"parameter_type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "rulevalue_parameter_section"


    // $ANTLR start "entryRuleparameter_type"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5386:1: entryRuleparameter_type returns [EObject current=null] : iv_ruleparameter_type= ruleparameter_type EOF ;
    public final EObject entryRuleparameter_type() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleparameter_type = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5387:2: (iv_ruleparameter_type= ruleparameter_type EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5388:2: iv_ruleparameter_type= ruleparameter_type EOF
            {
             newCompositeNode(grammarAccess.getParameter_typeRule()); 
            pushFollow(FOLLOW_ruleparameter_type_in_entryRuleparameter_type10722);
            iv_ruleparameter_type=ruleparameter_type();

            state._fsp--;

             current =iv_ruleparameter_type; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleparameter_type10732); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleparameter_type"


    // $ANTLR start "ruleparameter_type"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5395:1: ruleparameter_type returns [EObject current=null] : ( ( (lv_array_0_0= ruleconformant_array_schema ) ) | ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleparameter_type() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_array_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5398:28: ( ( ( (lv_array_0_0= ruleconformant_array_schema ) ) | ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5399:1: ( ( (lv_array_0_0= ruleconformant_array_schema ) ) | ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5399:1: ( ( (lv_array_0_0= ruleconformant_array_schema ) ) | ( (lv_name_1_0= RULE_ID ) ) )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==Packed||LA66_0==Array) ) {
                alt66=1;
            }
            else if ( (LA66_0==RULE_ID) ) {
                alt66=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }
            switch (alt66) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5399:2: ( (lv_array_0_0= ruleconformant_array_schema ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5399:2: ( (lv_array_0_0= ruleconformant_array_schema ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5400:1: (lv_array_0_0= ruleconformant_array_schema )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5400:1: (lv_array_0_0= ruleconformant_array_schema )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5401:3: lv_array_0_0= ruleconformant_array_schema
                    {
                     
                    	        newCompositeNode(grammarAccess.getParameter_typeAccess().getArrayConformant_array_schemaParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleconformant_array_schema_in_ruleparameter_type10778);
                    lv_array_0_0=ruleconformant_array_schema();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getParameter_typeRule());
                    	        }
                           		set(
                           			current, 
                           			"array",
                            		lv_array_0_0, 
                            		"conformant_array_schema");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5418:6: ( (lv_name_1_0= RULE_ID ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5418:6: ( (lv_name_1_0= RULE_ID ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5419:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5419:1: (lv_name_1_0= RULE_ID )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5420:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleparameter_type10801); 

                    			newLeafNode(lv_name_1_0, grammarAccess.getParameter_typeAccess().getNameIDTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getParameter_typeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_1_0, 
                            		"ID");
                    	    

                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleparameter_type"


    // $ANTLR start "entryRuleconformant_array_schema"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5444:1: entryRuleconformant_array_schema returns [EObject current=null] : iv_ruleconformant_array_schema= ruleconformant_array_schema EOF ;
    public final EObject entryRuleconformant_array_schema() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleconformant_array_schema = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5445:2: (iv_ruleconformant_array_schema= ruleconformant_array_schema EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5446:2: iv_ruleconformant_array_schema= ruleconformant_array_schema EOF
            {
             newCompositeNode(grammarAccess.getConformant_array_schemaRule()); 
            pushFollow(FOLLOW_ruleconformant_array_schema_in_entryRuleconformant_array_schema10841);
            iv_ruleconformant_array_schema=ruleconformant_array_schema();

            state._fsp--;

             current =iv_ruleconformant_array_schema; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleconformant_array_schema10851); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleconformant_array_schema"


    // $ANTLR start "ruleconformant_array_schema"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5453:1: ruleconformant_array_schema returns [EObject current=null] : ( ( (lv_packed_0_0= rulepacked_conformant_array_schema ) ) | ( (lv_unpacked_1_0= ruleunpacked_conformant_array_schema ) ) ) ;
    public final EObject ruleconformant_array_schema() throws RecognitionException {
        EObject current = null;

        EObject lv_packed_0_0 = null;

        EObject lv_unpacked_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5456:28: ( ( ( (lv_packed_0_0= rulepacked_conformant_array_schema ) ) | ( (lv_unpacked_1_0= ruleunpacked_conformant_array_schema ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5457:1: ( ( (lv_packed_0_0= rulepacked_conformant_array_schema ) ) | ( (lv_unpacked_1_0= ruleunpacked_conformant_array_schema ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5457:1: ( ( (lv_packed_0_0= rulepacked_conformant_array_schema ) ) | ( (lv_unpacked_1_0= ruleunpacked_conformant_array_schema ) ) )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==Packed) ) {
                alt67=1;
            }
            else if ( (LA67_0==Array) ) {
                alt67=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }
            switch (alt67) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5457:2: ( (lv_packed_0_0= rulepacked_conformant_array_schema ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5457:2: ( (lv_packed_0_0= rulepacked_conformant_array_schema ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5458:1: (lv_packed_0_0= rulepacked_conformant_array_schema )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5458:1: (lv_packed_0_0= rulepacked_conformant_array_schema )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5459:3: lv_packed_0_0= rulepacked_conformant_array_schema
                    {
                     
                    	        newCompositeNode(grammarAccess.getConformant_array_schemaAccess().getPackedPacked_conformant_array_schemaParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_rulepacked_conformant_array_schema_in_ruleconformant_array_schema10897);
                    lv_packed_0_0=rulepacked_conformant_array_schema();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConformant_array_schemaRule());
                    	        }
                           		set(
                           			current, 
                           			"packed",
                            		lv_packed_0_0, 
                            		"packed_conformant_array_schema");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5476:6: ( (lv_unpacked_1_0= ruleunpacked_conformant_array_schema ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5476:6: ( (lv_unpacked_1_0= ruleunpacked_conformant_array_schema ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5477:1: (lv_unpacked_1_0= ruleunpacked_conformant_array_schema )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5477:1: (lv_unpacked_1_0= ruleunpacked_conformant_array_schema )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5478:3: lv_unpacked_1_0= ruleunpacked_conformant_array_schema
                    {
                     
                    	        newCompositeNode(grammarAccess.getConformant_array_schemaAccess().getUnpackedUnpacked_conformant_array_schemaParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleunpacked_conformant_array_schema_in_ruleconformant_array_schema10924);
                    lv_unpacked_1_0=ruleunpacked_conformant_array_schema();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConformant_array_schemaRule());
                    	        }
                           		set(
                           			current, 
                           			"unpacked",
                            		lv_unpacked_1_0, 
                            		"unpacked_conformant_array_schema");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleconformant_array_schema"


    // $ANTLR start "entryRulepacked_conformant_array_schema"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5502:1: entryRulepacked_conformant_array_schema returns [EObject current=null] : iv_rulepacked_conformant_array_schema= rulepacked_conformant_array_schema EOF ;
    public final EObject entryRulepacked_conformant_array_schema() throws RecognitionException {
        EObject current = null;

        EObject iv_rulepacked_conformant_array_schema = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5503:2: (iv_rulepacked_conformant_array_schema= rulepacked_conformant_array_schema EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5504:2: iv_rulepacked_conformant_array_schema= rulepacked_conformant_array_schema EOF
            {
             newCompositeNode(grammarAccess.getPacked_conformant_array_schemaRule()); 
            pushFollow(FOLLOW_rulepacked_conformant_array_schema_in_entryRulepacked_conformant_array_schema10959);
            iv_rulepacked_conformant_array_schema=rulepacked_conformant_array_schema();

            state._fsp--;

             current =iv_rulepacked_conformant_array_schema; 
            match(input,EOF,FOLLOW_EOF_in_entryRulepacked_conformant_array_schema10969); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulepacked_conformant_array_schema"


    // $ANTLR start "rulepacked_conformant_array_schema"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5511:1: rulepacked_conformant_array_schema returns [EObject current=null] : (otherlv_0= Packed otherlv_1= Array otherlv_2= LeftSquareBracket ( (lv_bound_3_0= rulebound_specification ) ) otherlv_4= RightSquareBracket otherlv_5= Of ( (lv_name_6_0= RULE_ID ) ) ) ;
    public final EObject rulepacked_conformant_array_schema() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_name_6_0=null;
        EObject lv_bound_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5514:28: ( (otherlv_0= Packed otherlv_1= Array otherlv_2= LeftSquareBracket ( (lv_bound_3_0= rulebound_specification ) ) otherlv_4= RightSquareBracket otherlv_5= Of ( (lv_name_6_0= RULE_ID ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5515:1: (otherlv_0= Packed otherlv_1= Array otherlv_2= LeftSquareBracket ( (lv_bound_3_0= rulebound_specification ) ) otherlv_4= RightSquareBracket otherlv_5= Of ( (lv_name_6_0= RULE_ID ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5515:1: (otherlv_0= Packed otherlv_1= Array otherlv_2= LeftSquareBracket ( (lv_bound_3_0= rulebound_specification ) ) otherlv_4= RightSquareBracket otherlv_5= Of ( (lv_name_6_0= RULE_ID ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5516:2: otherlv_0= Packed otherlv_1= Array otherlv_2= LeftSquareBracket ( (lv_bound_3_0= rulebound_specification ) ) otherlv_4= RightSquareBracket otherlv_5= Of ( (lv_name_6_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,Packed,FOLLOW_Packed_in_rulepacked_conformant_array_schema11007); 

                	newLeafNode(otherlv_0, grammarAccess.getPacked_conformant_array_schemaAccess().getPackedKeyword_0());
                
            otherlv_1=(Token)match(input,Array,FOLLOW_Array_in_rulepacked_conformant_array_schema11019); 

                	newLeafNode(otherlv_1, grammarAccess.getPacked_conformant_array_schemaAccess().getArrayKeyword_1());
                
            otherlv_2=(Token)match(input,LeftSquareBracket,FOLLOW_LeftSquareBracket_in_rulepacked_conformant_array_schema11031); 

                	newLeafNode(otherlv_2, grammarAccess.getPacked_conformant_array_schemaAccess().getLeftSquareBracketKeyword_2());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5530:1: ( (lv_bound_3_0= rulebound_specification ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5531:1: (lv_bound_3_0= rulebound_specification )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5531:1: (lv_bound_3_0= rulebound_specification )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5532:3: lv_bound_3_0= rulebound_specification
            {
             
            	        newCompositeNode(grammarAccess.getPacked_conformant_array_schemaAccess().getBoundBound_specificationParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_rulebound_specification_in_rulepacked_conformant_array_schema11051);
            lv_bound_3_0=rulebound_specification();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPacked_conformant_array_schemaRule());
            	        }
                   		set(
                   			current, 
                   			"bound",
                    		lv_bound_3_0, 
                    		"bound_specification");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,RightSquareBracket,FOLLOW_RightSquareBracket_in_rulepacked_conformant_array_schema11064); 

                	newLeafNode(otherlv_4, grammarAccess.getPacked_conformant_array_schemaAccess().getRightSquareBracketKeyword_4());
                
            otherlv_5=(Token)match(input,Of,FOLLOW_Of_in_rulepacked_conformant_array_schema11076); 

                	newLeafNode(otherlv_5, grammarAccess.getPacked_conformant_array_schemaAccess().getOfKeyword_5());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5558:1: ( (lv_name_6_0= RULE_ID ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5559:1: (lv_name_6_0= RULE_ID )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5559:1: (lv_name_6_0= RULE_ID )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5560:3: lv_name_6_0= RULE_ID
            {
            lv_name_6_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulepacked_conformant_array_schema11092); 

            			newLeafNode(lv_name_6_0, grammarAccess.getPacked_conformant_array_schemaAccess().getNameIDTerminalRuleCall_6_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPacked_conformant_array_schemaRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_6_0, 
                    		"ID");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "rulepacked_conformant_array_schema"


    // $ANTLR start "entryRulebound_specification"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5584:1: entryRulebound_specification returns [EObject current=null] : iv_rulebound_specification= rulebound_specification EOF ;
    public final EObject entryRulebound_specification() throws RecognitionException {
        EObject current = null;

        EObject iv_rulebound_specification = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5585:2: (iv_rulebound_specification= rulebound_specification EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5586:2: iv_rulebound_specification= rulebound_specification EOF
            {
             newCompositeNode(grammarAccess.getBound_specificationRule()); 
            pushFollow(FOLLOW_rulebound_specification_in_entryRulebound_specification11132);
            iv_rulebound_specification=rulebound_specification();

            state._fsp--;

             current =iv_rulebound_specification; 
            match(input,EOF,FOLLOW_EOF_in_entryRulebound_specification11142); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulebound_specification"


    // $ANTLR start "rulebound_specification"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5593:1: rulebound_specification returns [EObject current=null] : ( ( (lv_initial_0_0= RULE_ID ) ) otherlv_1= FullStopFullStop ( (lv_final_2_0= RULE_ID ) ) otherlv_3= Colon ( (lv_name_4_0= RULE_ID ) ) ) ;
    public final EObject rulebound_specification() throws RecognitionException {
        EObject current = null;

        Token lv_initial_0_0=null;
        Token otherlv_1=null;
        Token lv_final_2_0=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5596:28: ( ( ( (lv_initial_0_0= RULE_ID ) ) otherlv_1= FullStopFullStop ( (lv_final_2_0= RULE_ID ) ) otherlv_3= Colon ( (lv_name_4_0= RULE_ID ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5597:1: ( ( (lv_initial_0_0= RULE_ID ) ) otherlv_1= FullStopFullStop ( (lv_final_2_0= RULE_ID ) ) otherlv_3= Colon ( (lv_name_4_0= RULE_ID ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5597:1: ( ( (lv_initial_0_0= RULE_ID ) ) otherlv_1= FullStopFullStop ( (lv_final_2_0= RULE_ID ) ) otherlv_3= Colon ( (lv_name_4_0= RULE_ID ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5597:2: ( (lv_initial_0_0= RULE_ID ) ) otherlv_1= FullStopFullStop ( (lv_final_2_0= RULE_ID ) ) otherlv_3= Colon ( (lv_name_4_0= RULE_ID ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5597:2: ( (lv_initial_0_0= RULE_ID ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5598:1: (lv_initial_0_0= RULE_ID )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5598:1: (lv_initial_0_0= RULE_ID )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5599:3: lv_initial_0_0= RULE_ID
            {
            lv_initial_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulebound_specification11184); 

            			newLeafNode(lv_initial_0_0, grammarAccess.getBound_specificationAccess().getInitialIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getBound_specificationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"initial",
                    		lv_initial_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,FullStopFullStop,FOLLOW_FullStopFullStop_in_rulebound_specification11202); 

                	newLeafNode(otherlv_1, grammarAccess.getBound_specificationAccess().getFullStopFullStopKeyword_1());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5620:1: ( (lv_final_2_0= RULE_ID ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5621:1: (lv_final_2_0= RULE_ID )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5621:1: (lv_final_2_0= RULE_ID )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5622:3: lv_final_2_0= RULE_ID
            {
            lv_final_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulebound_specification11218); 

            			newLeafNode(lv_final_2_0, grammarAccess.getBound_specificationAccess().getFinalIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getBound_specificationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"final",
                    		lv_final_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,Colon,FOLLOW_Colon_in_rulebound_specification11236); 

                	newLeafNode(otherlv_3, grammarAccess.getBound_specificationAccess().getColonKeyword_3());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5643:1: ( (lv_name_4_0= RULE_ID ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5644:1: (lv_name_4_0= RULE_ID )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5644:1: (lv_name_4_0= RULE_ID )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5645:3: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulebound_specification11252); 

            			newLeafNode(lv_name_4_0, grammarAccess.getBound_specificationAccess().getNameIDTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getBound_specificationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_4_0, 
                    		"ID");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "rulebound_specification"


    // $ANTLR start "entryRuleunpacked_conformant_array_schema"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5669:1: entryRuleunpacked_conformant_array_schema returns [EObject current=null] : iv_ruleunpacked_conformant_array_schema= ruleunpacked_conformant_array_schema EOF ;
    public final EObject entryRuleunpacked_conformant_array_schema() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleunpacked_conformant_array_schema = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5670:2: (iv_ruleunpacked_conformant_array_schema= ruleunpacked_conformant_array_schema EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5671:2: iv_ruleunpacked_conformant_array_schema= ruleunpacked_conformant_array_schema EOF
            {
             newCompositeNode(grammarAccess.getUnpacked_conformant_array_schemaRule()); 
            pushFollow(FOLLOW_ruleunpacked_conformant_array_schema_in_entryRuleunpacked_conformant_array_schema11292);
            iv_ruleunpacked_conformant_array_schema=ruleunpacked_conformant_array_schema();

            state._fsp--;

             current =iv_ruleunpacked_conformant_array_schema; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleunpacked_conformant_array_schema11302); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleunpacked_conformant_array_schema"


    // $ANTLR start "ruleunpacked_conformant_array_schema"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5678:1: ruleunpacked_conformant_array_schema returns [EObject current=null] : (otherlv_0= Array otherlv_1= LeftSquareBracket ( (lv_bounds_2_0= rulebound_specification ) ) (otherlv_3= Semicolon ( (lv_bounds_4_0= rulebound_specification ) ) )* otherlv_5= RightSquareBracket otherlv_6= Of ( (lv_type_7_0= ruleparameter_type ) ) ) ;
    public final EObject ruleunpacked_conformant_array_schema() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_bounds_2_0 = null;

        EObject lv_bounds_4_0 = null;

        EObject lv_type_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5681:28: ( (otherlv_0= Array otherlv_1= LeftSquareBracket ( (lv_bounds_2_0= rulebound_specification ) ) (otherlv_3= Semicolon ( (lv_bounds_4_0= rulebound_specification ) ) )* otherlv_5= RightSquareBracket otherlv_6= Of ( (lv_type_7_0= ruleparameter_type ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5682:1: (otherlv_0= Array otherlv_1= LeftSquareBracket ( (lv_bounds_2_0= rulebound_specification ) ) (otherlv_3= Semicolon ( (lv_bounds_4_0= rulebound_specification ) ) )* otherlv_5= RightSquareBracket otherlv_6= Of ( (lv_type_7_0= ruleparameter_type ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5682:1: (otherlv_0= Array otherlv_1= LeftSquareBracket ( (lv_bounds_2_0= rulebound_specification ) ) (otherlv_3= Semicolon ( (lv_bounds_4_0= rulebound_specification ) ) )* otherlv_5= RightSquareBracket otherlv_6= Of ( (lv_type_7_0= ruleparameter_type ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5683:2: otherlv_0= Array otherlv_1= LeftSquareBracket ( (lv_bounds_2_0= rulebound_specification ) ) (otherlv_3= Semicolon ( (lv_bounds_4_0= rulebound_specification ) ) )* otherlv_5= RightSquareBracket otherlv_6= Of ( (lv_type_7_0= ruleparameter_type ) )
            {
            otherlv_0=(Token)match(input,Array,FOLLOW_Array_in_ruleunpacked_conformant_array_schema11340); 

                	newLeafNode(otherlv_0, grammarAccess.getUnpacked_conformant_array_schemaAccess().getArrayKeyword_0());
                
            otherlv_1=(Token)match(input,LeftSquareBracket,FOLLOW_LeftSquareBracket_in_ruleunpacked_conformant_array_schema11352); 

                	newLeafNode(otherlv_1, grammarAccess.getUnpacked_conformant_array_schemaAccess().getLeftSquareBracketKeyword_1());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5692:1: ( (lv_bounds_2_0= rulebound_specification ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5693:1: (lv_bounds_2_0= rulebound_specification )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5693:1: (lv_bounds_2_0= rulebound_specification )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5694:3: lv_bounds_2_0= rulebound_specification
            {
             
            	        newCompositeNode(grammarAccess.getUnpacked_conformant_array_schemaAccess().getBoundsBound_specificationParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_rulebound_specification_in_ruleunpacked_conformant_array_schema11372);
            lv_bounds_2_0=rulebound_specification();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUnpacked_conformant_array_schemaRule());
            	        }
                   		add(
                   			current, 
                   			"bounds",
                    		lv_bounds_2_0, 
                    		"bound_specification");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5710:2: (otherlv_3= Semicolon ( (lv_bounds_4_0= rulebound_specification ) ) )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==Semicolon) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5711:2: otherlv_3= Semicolon ( (lv_bounds_4_0= rulebound_specification ) )
            	    {
            	    otherlv_3=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_ruleunpacked_conformant_array_schema11386); 

            	        	newLeafNode(otherlv_3, grammarAccess.getUnpacked_conformant_array_schemaAccess().getSemicolonKeyword_3_0());
            	        
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5715:1: ( (lv_bounds_4_0= rulebound_specification ) )
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5716:1: (lv_bounds_4_0= rulebound_specification )
            	    {
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5716:1: (lv_bounds_4_0= rulebound_specification )
            	    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5717:3: lv_bounds_4_0= rulebound_specification
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUnpacked_conformant_array_schemaAccess().getBoundsBound_specificationParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulebound_specification_in_ruleunpacked_conformant_array_schema11406);
            	    lv_bounds_4_0=rulebound_specification();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getUnpacked_conformant_array_schemaRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"bounds",
            	            		lv_bounds_4_0, 
            	            		"bound_specification");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop68;
                }
            } while (true);

            otherlv_5=(Token)match(input,RightSquareBracket,FOLLOW_RightSquareBracket_in_ruleunpacked_conformant_array_schema11421); 

                	newLeafNode(otherlv_5, grammarAccess.getUnpacked_conformant_array_schemaAccess().getRightSquareBracketKeyword_4());
                
            otherlv_6=(Token)match(input,Of,FOLLOW_Of_in_ruleunpacked_conformant_array_schema11433); 

                	newLeafNode(otherlv_6, grammarAccess.getUnpacked_conformant_array_schemaAccess().getOfKeyword_5());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5743:1: ( (lv_type_7_0= ruleparameter_type ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5744:1: (lv_type_7_0= ruleparameter_type )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5744:1: (lv_type_7_0= ruleparameter_type )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5745:3: lv_type_7_0= ruleparameter_type
            {
             
            	        newCompositeNode(grammarAccess.getUnpacked_conformant_array_schemaAccess().getTypeParameter_typeParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleparameter_type_in_ruleunpacked_conformant_array_schema11453);
            lv_type_7_0=ruleparameter_type();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUnpacked_conformant_array_schemaRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_7_0, 
                    		"parameter_type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleunpacked_conformant_array_schema"


    // $ANTLR start "entryRulevariable_parameter_section"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5769:1: entryRulevariable_parameter_section returns [EObject current=null] : iv_rulevariable_parameter_section= rulevariable_parameter_section EOF ;
    public final EObject entryRulevariable_parameter_section() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariable_parameter_section = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5770:2: (iv_rulevariable_parameter_section= rulevariable_parameter_section EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5771:2: iv_rulevariable_parameter_section= rulevariable_parameter_section EOF
            {
             newCompositeNode(grammarAccess.getVariable_parameter_sectionRule()); 
            pushFollow(FOLLOW_rulevariable_parameter_section_in_entryRulevariable_parameter_section11488);
            iv_rulevariable_parameter_section=rulevariable_parameter_section();

            state._fsp--;

             current =iv_rulevariable_parameter_section; 
            match(input,EOF,FOLLOW_EOF_in_entryRulevariable_parameter_section11498); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulevariable_parameter_section"


    // $ANTLR start "rulevariable_parameter_section"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5778:1: rulevariable_parameter_section returns [EObject current=null] : (otherlv_0= Var ( (lv_identifiers_1_0= ruleidentifier_list ) ) otherlv_2= Colon ( (lv_type_3_0= ruleparameter_type ) ) ) ;
    public final EObject rulevariable_parameter_section() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_identifiers_1_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5781:28: ( (otherlv_0= Var ( (lv_identifiers_1_0= ruleidentifier_list ) ) otherlv_2= Colon ( (lv_type_3_0= ruleparameter_type ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5782:1: (otherlv_0= Var ( (lv_identifiers_1_0= ruleidentifier_list ) ) otherlv_2= Colon ( (lv_type_3_0= ruleparameter_type ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5782:1: (otherlv_0= Var ( (lv_identifiers_1_0= ruleidentifier_list ) ) otherlv_2= Colon ( (lv_type_3_0= ruleparameter_type ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5783:2: otherlv_0= Var ( (lv_identifiers_1_0= ruleidentifier_list ) ) otherlv_2= Colon ( (lv_type_3_0= ruleparameter_type ) )
            {
            otherlv_0=(Token)match(input,Var,FOLLOW_Var_in_rulevariable_parameter_section11536); 

                	newLeafNode(otherlv_0, grammarAccess.getVariable_parameter_sectionAccess().getVarKeyword_0());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5787:1: ( (lv_identifiers_1_0= ruleidentifier_list ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5788:1: (lv_identifiers_1_0= ruleidentifier_list )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5788:1: (lv_identifiers_1_0= ruleidentifier_list )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5789:3: lv_identifiers_1_0= ruleidentifier_list
            {
             
            	        newCompositeNode(grammarAccess.getVariable_parameter_sectionAccess().getIdentifiersIdentifier_listParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleidentifier_list_in_rulevariable_parameter_section11556);
            lv_identifiers_1_0=ruleidentifier_list();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVariable_parameter_sectionRule());
            	        }
                   		set(
                   			current, 
                   			"identifiers",
                    		lv_identifiers_1_0, 
                    		"identifier_list");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,Colon,FOLLOW_Colon_in_rulevariable_parameter_section11569); 

                	newLeafNode(otherlv_2, grammarAccess.getVariable_parameter_sectionAccess().getColonKeyword_2());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5810:1: ( (lv_type_3_0= ruleparameter_type ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5811:1: (lv_type_3_0= ruleparameter_type )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5811:1: (lv_type_3_0= ruleparameter_type )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5812:3: lv_type_3_0= ruleparameter_type
            {
             
            	        newCompositeNode(grammarAccess.getVariable_parameter_sectionAccess().getTypeParameter_typeParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleparameter_type_in_rulevariable_parameter_section11589);
            lv_type_3_0=ruleparameter_type();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVariable_parameter_sectionRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_3_0, 
                    		"parameter_type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "rulevariable_parameter_section"


    // $ANTLR start "entryRulefunction_heading"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5836:1: entryRulefunction_heading returns [EObject current=null] : iv_rulefunction_heading= rulefunction_heading EOF ;
    public final EObject entryRulefunction_heading() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefunction_heading = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5837:2: (iv_rulefunction_heading= rulefunction_heading EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5838:2: iv_rulefunction_heading= rulefunction_heading EOF
            {
             newCompositeNode(grammarAccess.getFunction_headingRule()); 
            pushFollow(FOLLOW_rulefunction_heading_in_entryRulefunction_heading11624);
            iv_rulefunction_heading=rulefunction_heading();

            state._fsp--;

             current =iv_rulefunction_heading; 
            match(input,EOF,FOLLOW_EOF_in_entryRulefunction_heading11634); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulefunction_heading"


    // $ANTLR start "rulefunction_heading"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5845:1: rulefunction_heading returns [EObject current=null] : (otherlv_0= Function ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleformal_parameter_list ) )? otherlv_3= Colon ( (lv_returnType_4_0= RULE_ID ) ) ) ;
    public final EObject rulefunction_heading() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token lv_returnType_4_0=null;
        EObject lv_parameters_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5848:28: ( (otherlv_0= Function ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleformal_parameter_list ) )? otherlv_3= Colon ( (lv_returnType_4_0= RULE_ID ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5849:1: (otherlv_0= Function ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleformal_parameter_list ) )? otherlv_3= Colon ( (lv_returnType_4_0= RULE_ID ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5849:1: (otherlv_0= Function ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleformal_parameter_list ) )? otherlv_3= Colon ( (lv_returnType_4_0= RULE_ID ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5850:2: otherlv_0= Function ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleformal_parameter_list ) )? otherlv_3= Colon ( (lv_returnType_4_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,Function,FOLLOW_Function_in_rulefunction_heading11672); 

                	newLeafNode(otherlv_0, grammarAccess.getFunction_headingAccess().getFunctionKeyword_0());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5854:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5855:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5855:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5856:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulefunction_heading11688); 

            			newLeafNode(lv_name_1_0, grammarAccess.getFunction_headingAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFunction_headingRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5872:2: ( (lv_parameters_2_0= ruleformal_parameter_list ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==LeftParenthesis) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5873:1: (lv_parameters_2_0= ruleformal_parameter_list )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5873:1: (lv_parameters_2_0= ruleformal_parameter_list )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5874:3: lv_parameters_2_0= ruleformal_parameter_list
                    {
                     
                    	        newCompositeNode(grammarAccess.getFunction_headingAccess().getParametersFormal_parameter_listParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleformal_parameter_list_in_rulefunction_heading11714);
                    lv_parameters_2_0=ruleformal_parameter_list();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFunction_headingRule());
                    	        }
                           		set(
                           			current, 
                           			"parameters",
                            		lv_parameters_2_0, 
                            		"formal_parameter_list");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,Colon,FOLLOW_Colon_in_rulefunction_heading11728); 

                	newLeafNode(otherlv_3, grammarAccess.getFunction_headingAccess().getColonKeyword_3());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5895:1: ( (lv_returnType_4_0= RULE_ID ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5896:1: (lv_returnType_4_0= RULE_ID )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5896:1: (lv_returnType_4_0= RULE_ID )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5897:3: lv_returnType_4_0= RULE_ID
            {
            lv_returnType_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulefunction_heading11744); 

            			newLeafNode(lv_returnType_4_0, grammarAccess.getFunction_headingAccess().getReturnTypeIDTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFunction_headingRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"returnType",
                    		lv_returnType_4_0, 
                    		"ID");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "rulefunction_heading"


    // $ANTLR start "entryRulefunction_declaration"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5921:1: entryRulefunction_declaration returns [EObject current=null] : iv_rulefunction_declaration= rulefunction_declaration EOF ;
    public final EObject entryRulefunction_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefunction_declaration = null;


        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5922:2: (iv_rulefunction_declaration= rulefunction_declaration EOF )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5923:2: iv_rulefunction_declaration= rulefunction_declaration EOF
            {
             newCompositeNode(grammarAccess.getFunction_declarationRule()); 
            pushFollow(FOLLOW_rulefunction_declaration_in_entryRulefunction_declaration11784);
            iv_rulefunction_declaration=rulefunction_declaration();

            state._fsp--;

             current =iv_rulefunction_declaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRulefunction_declaration11794); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulefunction_declaration"


    // $ANTLR start "rulefunction_declaration"
    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5930:1: rulefunction_declaration returns [EObject current=null] : ( ( (lv_heading_0_0= rulefunction_heading ) ) otherlv_1= Semicolon ( ( (lv_block_2_0= ruleblock ) ) | ( (lv_forward_3_0= Forward ) ) ) ) ;
    public final EObject rulefunction_declaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_forward_3_0=null;
        EObject lv_heading_0_0 = null;

        EObject lv_block_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5933:28: ( ( ( (lv_heading_0_0= rulefunction_heading ) ) otherlv_1= Semicolon ( ( (lv_block_2_0= ruleblock ) ) | ( (lv_forward_3_0= Forward ) ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5934:1: ( ( (lv_heading_0_0= rulefunction_heading ) ) otherlv_1= Semicolon ( ( (lv_block_2_0= ruleblock ) ) | ( (lv_forward_3_0= Forward ) ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5934:1: ( ( (lv_heading_0_0= rulefunction_heading ) ) otherlv_1= Semicolon ( ( (lv_block_2_0= ruleblock ) ) | ( (lv_forward_3_0= Forward ) ) ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5934:2: ( (lv_heading_0_0= rulefunction_heading ) ) otherlv_1= Semicolon ( ( (lv_block_2_0= ruleblock ) ) | ( (lv_forward_3_0= Forward ) ) )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5934:2: ( (lv_heading_0_0= rulefunction_heading ) )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5935:1: (lv_heading_0_0= rulefunction_heading )
            {
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5935:1: (lv_heading_0_0= rulefunction_heading )
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5936:3: lv_heading_0_0= rulefunction_heading
            {
             
            	        newCompositeNode(grammarAccess.getFunction_declarationAccess().getHeadingFunction_headingParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_rulefunction_heading_in_rulefunction_declaration11840);
            lv_heading_0_0=rulefunction_heading();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFunction_declarationRule());
            	        }
                   		set(
                   			current, 
                   			"heading",
                    		lv_heading_0_0, 
                    		"function_heading");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_rulefunction_declaration11853); 

                	newLeafNode(otherlv_1, grammarAccess.getFunction_declarationAccess().getSemicolonKeyword_1());
                
            // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5957:1: ( ( (lv_block_2_0= ruleblock ) ) | ( (lv_forward_3_0= Forward ) ) )
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( ((LA70_0>=Procedure && LA70_0<=Function)||(LA70_0>=Begin && LA70_0<=Const)||LA70_0==Label||LA70_0==Type||LA70_0==Var) ) {
                alt70=1;
            }
            else if ( (LA70_0==Forward) ) {
                alt70=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }
            switch (alt70) {
                case 1 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5957:2: ( (lv_block_2_0= ruleblock ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5957:2: ( (lv_block_2_0= ruleblock ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5958:1: (lv_block_2_0= ruleblock )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5958:1: (lv_block_2_0= ruleblock )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5959:3: lv_block_2_0= ruleblock
                    {
                     
                    	        newCompositeNode(grammarAccess.getFunction_declarationAccess().getBlockBlockParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleblock_in_rulefunction_declaration11874);
                    lv_block_2_0=ruleblock();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFunction_declarationRule());
                    	        }
                           		set(
                           			current, 
                           			"block",
                            		lv_block_2_0, 
                            		"block");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5976:6: ( (lv_forward_3_0= Forward ) )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5976:6: ( (lv_forward_3_0= Forward ) )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5977:1: (lv_forward_3_0= Forward )
                    {
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5977:1: (lv_forward_3_0= Forward )
                    // ../org.xtext.example.Pascal/src-gen/org/xtext/example/pascal/parser/antlr/internal/InternalPascalParser.g:5978:3: lv_forward_3_0= Forward
                    {
                    lv_forward_3_0=(Token)match(input,Forward,FOLLOW_Forward_in_rulefunction_declaration11899); 

                            newLeafNode(lv_forward_3_0, grammarAccess.getFunction_declarationAccess().getForwardForwardKeyword_2_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFunction_declarationRule());
                    	        }
                           		setWithLastConsumed(current, "forward", true, "forward");
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "rulefunction_declaration"

    // Delegated rules


    protected DFA23 dfa23 = new DFA23(this);
    static final String DFA23_eotS =
        "\14\uffff";
    static final String DFA23_eofS =
        "\1\uffff\1\13\12\uffff";
    static final String DFA23_minS =
        "\1\17\1\10\12\uffff";
    static final String DFA23_maxS =
        "\1\104\1\75\12\uffff";
    static final String DFA23_acceptS =
        "\2\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\11\1\12\1\10\1\1";
    static final String DFA23_specialS =
        "\14\uffff}>";
    static final String[] DFA23_transitionS = {
            "\1\7\10\uffff\1\6\7\uffff\1\5\1\11\12\uffff\1\10\6\uffff\1"+
            "\4\2\uffff\4\2\10\uffff\1\1\1\uffff\1\3",
            "\1\13\10\uffff\1\13\2\uffff\1\13\2\uffff\1\13\3\uffff\3\13"+
            "\1\uffff\1\13\6\uffff\1\13\1\uffff\4\13\1\12\3\13\1\uffff\5"+
            "\13\2\uffff\2\13\1\uffff\3\13",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA23_eot = DFA.unpackEncodedString(DFA23_eotS);
    static final short[] DFA23_eof = DFA.unpackEncodedString(DFA23_eofS);
    static final char[] DFA23_min = DFA.unpackEncodedStringToUnsignedChars(DFA23_minS);
    static final char[] DFA23_max = DFA.unpackEncodedStringToUnsignedChars(DFA23_maxS);
    static final short[] DFA23_accept = DFA.unpackEncodedString(DFA23_acceptS);
    static final short[] DFA23_special = DFA.unpackEncodedString(DFA23_specialS);
    static final short[][] DFA23_transition;

    static {
        int numStates = DFA23_transitionS.length;
        DFA23_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA23_transition[i] = DFA.unpackEncodedString(DFA23_transitionS[i]);
        }
    }

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = DFA23_eot;
            this.eof = DFA23_eof;
            this.min = DFA23_min;
            this.max = DFA23_max;
            this.accept = DFA23_accept;
            this.special = DFA23_special;
            this.transition = DFA23_transition;
        }
        public String getDescription() {
            return "1498:1: ( ( (lv_variable_0_0= rulevariable ) ) | ( (lv_number_1_0= rulenumber ) ) | ( (lv_string_2_0= RULE_STRING ) ) | ( (lv_set_3_0= ruleset ) ) | ( (lv_nil_4_0= Nil ) ) | ( (lv_boolean_5_0= True ) ) | ( (lv_boolean_6_0= False ) ) | ( (lv_function_7_0= rulefunction_designator ) ) | (otherlv_8= LeftParenthesis ( (lv_expression_9_0= ruleexpression ) ) otherlv_10= RightParenthesis ) | (otherlv_11= Not ( (lv_not_12_0= rulefactor ) ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_rulepascal_in_entryRulepascal67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulepascal77 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleprogram_in_rulepascal122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleprogram_in_entryRuleprogram156 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleprogram166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleprogram_heading_block_in_ruleprogram212 = new BitSet(new long[]{0x0000000802016030L});
    public static final BitSet FOLLOW_ruleblock_in_ruleprogram233 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_FullStop_in_ruleprogram246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleprogram_heading_block_in_entryRuleprogram_heading_block280 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleprogram_heading_block290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Program_in_ruleprogram_heading_block328 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleprogram_heading_block344 = new BitSet(new long[]{0x0002100000000000L});
    public static final BitSet FOLLOW_LeftParenthesis_in_ruleprogram_heading_block363 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleidentifier_list_in_ruleprogram_heading_block383 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_RightParenthesis_in_ruleprogram_heading_block396 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_Semicolon_in_ruleprogram_heading_block410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleidentifier_list_in_entryRuleidentifier_list444 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleidentifier_list454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleidentifier_list496 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleidentifier_list515 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleidentifier_list531 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_ruleblock_in_entryRuleblock573 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleblock583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelabel_declaration_part_in_ruleblock629 = new BitSet(new long[]{0x0000000802016030L});
    public static final BitSet FOLLOW_ruleconstant_definition_part_in_ruleblock651 = new BitSet(new long[]{0x0000000802016030L});
    public static final BitSet FOLLOW_ruletype_definition_part_in_ruleblock673 = new BitSet(new long[]{0x0000000802016030L});
    public static final BitSet FOLLOW_rulevariable_declaration_part_in_ruleblock695 = new BitSet(new long[]{0x0000000802016030L});
    public static final BitSet FOLLOW_ruleprocedure_and_function_declaration_part_in_ruleblock717 = new BitSet(new long[]{0x0000000802016030L});
    public static final BitSet FOLLOW_rulestatement_part_in_ruleblock739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatement_part_in_entryRulestatement_part774 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestatement_part784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Begin_in_rulestatement_part822 = new BitSet(new long[]{0x01400080444C2800L,0x0000000000000004L});
    public static final BitSet FOLLOW_rulestatement_sequence_in_rulestatement_part842 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_End_in_rulestatement_part855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatement_sequence_in_entryRulestatement_sequence889 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestatement_sequence899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatement_in_rulestatement_sequence945 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_Semicolon_in_rulestatement_sequence959 = new BitSet(new long[]{0x01400080444C2800L,0x0000000000000004L});
    public static final BitSet FOLLOW_rulestatement_in_rulestatement_sequence979 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_rulestatement_in_entryRulestatement1016 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestatement1026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelabel_in_rulestatement1073 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_Colon_in_rulestatement1086 = new BitSet(new long[]{0x01400080444C2800L,0x0000000000000004L});
    public static final BitSet FOLLOW_rulesimple_statement_in_rulestatement1109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestructured_statement_in_rulestatement1136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelabel_in_entryRulelabel1172 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulelabel1182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SIGNED_INTEGER_NUMBER_in_rulelabel1224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INTEGER_NUMBER_in_rulelabel1252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesimple_statement_in_entryRulesimple_statement1292 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesimple_statement1302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleassignment_statement_in_rulesimple_statement1348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunction_designator_in_rulesimple_statement1375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulegoto_statement_in_rulesimple_statement1402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulesimple_statement1425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleassignment_statement_in_entryRuleassignment_statement1466 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleassignment_statement1476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariable_in_ruleassignment_statement1522 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_ColonEqualsSign_in_ruleassignment_statement1535 = new BitSet(new long[]{0x0BC8100301008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_ruleexpression_in_ruleassignment_statement1555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariable_in_entryRulevariable1590 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevariable1600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulevariable1642 = new BitSet(new long[]{0x0028800000000000L});
    public static final BitSet FOLLOW_rulevar__in_rulevariable1668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevar__in_entryRulevar_1703 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevar_1713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LeftSquareBracket_in_rulevar_1752 = new BitSet(new long[]{0x0BC8100301008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_ruleexpression_list_in_rulevar_1772 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_RightSquareBracket_in_rulevar_1785 = new BitSet(new long[]{0x0028800000000000L});
    public static final BitSet FOLLOW_rulevar__in_rulevar_1805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FullStop_in_rulevar_1832 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RULE_ID_in_rulevar_1860 = new BitSet(new long[]{0x0028800000000000L});
    public static final BitSet FOLLOW_rulevar__in_rulevar_1886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CircumflexAccent_in_rulevar_1907 = new BitSet(new long[]{0x0028800000000000L});
    public static final BitSet FOLLOW_rulevar__in_rulevar_1927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpression_list_in_entryRuleexpression_list1964 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleexpression_list1974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpression_in_ruleexpression_list2020 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleexpression_list2034 = new BitSet(new long[]{0x0BC8100301008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_ruleexpression_in_ruleexpression_list2054 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_ruleexpression_in_entryRuleexpression2091 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleexpression2101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesimple_expression_in_ruleexpression2147 = new BitSet(new long[]{0x2004010000000002L});
    public static final BitSet FOLLOW_RULE_RELATIONAL_OPERATOR_in_ruleexpression2166 = new BitSet(new long[]{0x0BC8100301008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_In_in_ruleexpression2196 = new BitSet(new long[]{0x0BC8100301008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_EqualsSign_in_ruleexpression2232 = new BitSet(new long[]{0x0BC8100301008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_rulesimple_expression_in_ruleexpression2265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesimple_expression_in_entryRulesimple_expression2308 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesimple_expression2318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ADDITION_OPERATOR_in_rulesimple_expression2364 = new BitSet(new long[]{0x0BC8100301008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_ruleterm_in_rulesimple_expression2391 = new BitSet(new long[]{0x0BC0040000000002L});
    public static final BitSet FOLLOW_RULE_ADDITION_OPERATOR_in_rulesimple_expression2411 = new BitSet(new long[]{0x0BC8100301008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_Or_in_rulesimple_expression2442 = new BitSet(new long[]{0x0BC8100301008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_ruleterm_in_rulesimple_expression2475 = new BitSet(new long[]{0x0BC0040000000002L});
    public static final BitSet FOLLOW_rulesigned_number_in_rulesimple_expression2503 = new BitSet(new long[]{0x0BC0040000000002L});
    public static final BitSet FOLLOW_ruleterm_in_entryRuleterm2550 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleterm2560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefactor_in_ruleterm2610 = new BitSet(new long[]{0x1000000098000002L});
    public static final BitSet FOLLOW_RULE_MULTIPLICATION_OPERATOR_in_ruleterm2629 = new BitSet(new long[]{0x0BC8100301008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_Div_in_ruleterm2659 = new BitSet(new long[]{0x0BC8100301008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_Mod_in_ruleterm2695 = new BitSet(new long[]{0x0BC8100301008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_And_in_ruleterm2731 = new BitSet(new long[]{0x0BC8100301008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_rulefactor_in_ruleterm2764 = new BitSet(new long[]{0x1000000098000002L});
    public static final BitSet FOLLOW_rulefactor_in_entryRulefactor2805 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefactor2815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariable_in_rulefactor2861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenumber_in_rulefactor2888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulefactor2911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleset_in_rulefactor2943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Nil_in_rulefactor2968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_True_in_rulefactor3004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_False_in_rulefactor3040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunction_designator_in_rulefactor3078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LeftParenthesis_in_rulefactor3098 = new BitSet(new long[]{0x0BC8100301008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_ruleexpression_in_rulefactor3118 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_RightParenthesis_in_rulefactor3131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Not_in_rulefactor3151 = new BitSet(new long[]{0x0BC8100301008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_rulefactor_in_rulefactor3171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenumber_in_entryRulenumber3207 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulenumber3217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleany_number_in_rulenumber3262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleany_number_in_entryRuleany_number3296 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleany_number3306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleunsigned_number_in_ruleany_number3353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesigned_number_in_ruleany_number3380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleunsigned_number_in_entryRuleunsigned_number3414 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleunsigned_number3424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INTEGER_NUMBER_in_ruleunsigned_number3466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REAL_NUMBER_in_ruleunsigned_number3494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesigned_number_in_entryRulesigned_number3534 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesigned_number3544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SIGNED_INTEGER_NUMBER_in_rulesigned_number3586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SIGNED_REAL_NUMBER_in_rulesigned_number3614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleset_in_entryRuleset3654 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleset3664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LeftSquareBracket_in_ruleset3708 = new BitSet(new long[]{0x0BD8100301008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_ruleexpression_list_in_ruleset3740 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_RightSquareBracket_in_ruleset3760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunction_designator_in_entryRulefunction_designator3806 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefunction_designator3816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulefunction_designator3858 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_LeftParenthesis_in_rulefunction_designator3876 = new BitSet(new long[]{0x0BC8300301008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_ruleexpression_list_in_rulefunction_designator3896 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_RightParenthesis_in_rulefunction_designator3910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestructured_statement_in_entryRulestructured_statement3944 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestructured_statement3954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecompound_statement_in_rulestructured_statement4000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerepetitive_statement_in_rulestructured_statement4027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleconditional_statement_in_rulestructured_statement4054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulewith_statement_in_rulestructured_statement4081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecompound_statement_in_entryRulecompound_statement4116 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecompound_statement4126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Begin_in_rulecompound_statement4164 = new BitSet(new long[]{0x01400080444C2800L,0x0000000000000004L});
    public static final BitSet FOLLOW_rulestatement_sequence_in_rulecompound_statement4184 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_End_in_rulecompound_statement4197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerepetitive_statement_in_entryRulerepetitive_statement4231 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulerepetitive_statement4241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulewhile_statement_in_rulerepetitive_statement4287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerepeat_statement_in_rulerepetitive_statement4314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefor_statement_in_rulerepetitive_statement4341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulewhile_statement_in_entryRulewhile_statement4376 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulewhile_statement4386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_While_in_rulewhile_statement4424 = new BitSet(new long[]{0x0BC8100301008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_ruleexpression_in_rulewhile_statement4444 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_Do_in_rulewhile_statement4457 = new BitSet(new long[]{0x01400080444C2800L,0x0000000000000004L});
    public static final BitSet FOLLOW_rulestatement_in_rulewhile_statement4477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerepeat_statement_in_entryRulerepeat_statement4512 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulerepeat_statement4522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Repeat_in_rulerepeat_statement4560 = new BitSet(new long[]{0x01400080444C2800L,0x0000000000000004L});
    public static final BitSet FOLLOW_rulestatement_sequence_in_rulerepeat_statement4580 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_Until_in_rulerepeat_statement4593 = new BitSet(new long[]{0x0BC8100301008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_ruleexpression_in_rulerepeat_statement4613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefor_statement_in_entryRulefor_statement4648 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefor_statement4658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_For_in_rulefor_statement4696 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleassignment_statement_in_rulefor_statement4716 = new BitSet(new long[]{0x0000080000000100L});
    public static final BitSet FOLLOW_To_in_rulefor_statement4730 = new BitSet(new long[]{0x0BC8100301008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_Downto_in_rulefor_statement4748 = new BitSet(new long[]{0x0BC8100301008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_ruleexpression_in_rulefor_statement4769 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_Do_in_rulefor_statement4782 = new BitSet(new long[]{0x01400080444C2800L,0x0000000000000004L});
    public static final BitSet FOLLOW_rulestatement_in_rulefor_statement4802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleconditional_statement_in_entryRuleconditional_statement4837 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleconditional_statement4847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleif_statement_in_ruleconditional_statement4893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecase_statement_in_ruleconditional_statement4920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleif_statement_in_entryRuleif_statement4955 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleif_statement4965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_If_in_ruleif_statement5003 = new BitSet(new long[]{0x0BC8100301008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_ruleexpression_in_ruleif_statement5023 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_Then_in_ruleif_statement5036 = new BitSet(new long[]{0x01400080444C2800L,0x0000000000000004L});
    public static final BitSet FOLLOW_rulestatement_in_ruleif_statement5056 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_Else_in_ruleif_statement5070 = new BitSet(new long[]{0x01400080444C2800L,0x0000000000000004L});
    public static final BitSet FOLLOW_rulestatement_in_ruleif_statement5090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecase_statement_in_entryRulecase_statement5127 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecase_statement5137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Case_in_rulecase_statement5175 = new BitSet(new long[]{0x0BC8100301008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_ruleexpression_in_rulecase_statement5195 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_Of_in_rulecase_statement5208 = new BitSet(new long[]{0x0BC0000101008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_rulecase_limb_in_rulecase_statement5228 = new BitSet(new long[]{0x0002000020000000L});
    public static final BitSet FOLLOW_Semicolon_in_rulecase_statement5242 = new BitSet(new long[]{0x0BC0000101008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_rulecase_limb_in_rulecase_statement5262 = new BitSet(new long[]{0x0002000020000000L});
    public static final BitSet FOLLOW_Semicolon_in_rulecase_statement5278 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_End_in_rulecase_statement5292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecase_limb_in_entryRulecase_limb5326 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecase_limb5336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecase_label_list_in_rulecase_limb5382 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_Colon_in_rulecase_limb5395 = new BitSet(new long[]{0x01400080444C2800L,0x0000000000000004L});
    public static final BitSet FOLLOW_rulestatement_in_rulecase_limb5415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecase_label_list_in_entryRulecase_label_list5450 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecase_label_list5460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleconstant_in_rulecase_label_list5506 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_Comma_in_rulecase_label_list5520 = new BitSet(new long[]{0x0BC0000101008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_ruleconstant_in_rulecase_label_list5540 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_ruleconstant_in_entryRuleconstant5577 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleconstant5587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ADDITION_OPERATOR_in_ruleconstant5630 = new BitSet(new long[]{0x03C0000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleconstant5654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenumber_in_ruleconstant5686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleconstant5711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_True_in_ruleconstant5741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_False_in_ruleconstant5777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Nil_in_ruleconstant5813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulewith_statement_in_entryRulewith_statement5859 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulewith_statement5869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_With_in_rulewith_statement5907 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_rulevariable_in_rulewith_statement5927 = new BitSet(new long[]{0x0000404000000000L});
    public static final BitSet FOLLOW_Comma_in_rulewith_statement5941 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_rulevariable_in_rulewith_statement5961 = new BitSet(new long[]{0x0000404000000000L});
    public static final BitSet FOLLOW_Do_in_rulewith_statement5976 = new BitSet(new long[]{0x01400080444C2800L,0x0000000000000004L});
    public static final BitSet FOLLOW_rulestatement_in_rulewith_statement5996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulegoto_statement_in_entryRulegoto_statement6031 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulegoto_statement6041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Goto_in_rulegoto_statement6079 = new BitSet(new long[]{0x0140000000000000L});
    public static final BitSet FOLLOW_rulelabel_in_rulegoto_statement6099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelabel_declaration_part_in_entryRulelabel_declaration_part6134 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulelabel_declaration_part6144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Label_in_rulelabel_declaration_part6182 = new BitSet(new long[]{0x0140000000000000L});
    public static final BitSet FOLLOW_rulelabel_in_rulelabel_declaration_part6202 = new BitSet(new long[]{0x0002400000000000L});
    public static final BitSet FOLLOW_Comma_in_rulelabel_declaration_part6216 = new BitSet(new long[]{0x0140000000000000L});
    public static final BitSet FOLLOW_rulelabel_in_rulelabel_declaration_part6236 = new BitSet(new long[]{0x0002400000000000L});
    public static final BitSet FOLLOW_Semicolon_in_rulelabel_declaration_part6251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleconstant_definition_part_in_entryRuleconstant_definition_part6285 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleconstant_definition_part6295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Const_in_ruleconstant_definition_part6333 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleconstant_definition_in_ruleconstant_definition_part6354 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_Semicolon_in_ruleconstant_definition_part6367 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleconstant_definition_in_entryRuleconstant_definition6403 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleconstant_definition6413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleconstant_definition6455 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_EqualsSign_in_ruleconstant_definition6473 = new BitSet(new long[]{0x0BC0000101008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_ruleconstant_in_ruleconstant_definition6493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletype_definition_part_in_entryRuletype_definition_part6528 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletype_definition_part6538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Type_in_ruletype_definition_part6576 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruletype_definition_in_ruletype_definition_part6597 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_Semicolon_in_ruletype_definition_part6610 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruletype_definition_in_entryRuletype_definition6646 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletype_definition6656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruletype_definition6698 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_EqualsSign_in_ruletype_definition6716 = new BitSet(new long[]{0x0FE0100501209600L,0x0000000000000014L});
    public static final BitSet FOLLOW_ruletype_in_ruletype_definition6736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletype_in_entryRuletype6771 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletype6781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesimple_type_in_ruletype6827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestructured_type_in_ruletype6854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepointer_type_in_ruletype6881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesimple_type_in_entryRulesimple_type6916 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesimple_type6926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesubrange_type_in_rulesimple_type6972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleenumerated_type_in_rulesimple_type6999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulesimple_type7022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesubrange_type_in_entryRulesubrange_type7068 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesubrange_type7078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleconstant_in_rulesubrange_type7129 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_FullStopFullStop_in_rulesubrange_type7142 = new BitSet(new long[]{0x0BC0000101008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_ruleconstant_in_rulesubrange_type7162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMERIC_SUBRANGE_in_rulesubrange_type7187 = new BitSet(new long[]{0x0BC0000101008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_ruleconstant_in_rulesubrange_type7213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleenumerated_type_in_entryRuleenumerated_type7253 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleenumerated_type7263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LeftParenthesis_in_ruleenumerated_type7301 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleidentifier_list_in_ruleenumerated_type7321 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_RightParenthesis_in_ruleenumerated_type7334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestructured_type_in_entryRulestructured_type7368 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestructured_type7378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Packed_in_rulestructured_type7422 = new BitSet(new long[]{0x0000000400201600L});
    public static final BitSet FOLLOW_ruleunpacked_structured_type_in_rulestructured_type7455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleunpacked_structured_type_in_entryRuleunpacked_structured_type7490 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleunpacked_structured_type7500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulearray_type_in_ruleunpacked_structured_type7546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledynamic_array_type_in_ruleunpacked_structured_type7573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerecord_type_in_ruleunpacked_structured_type7600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleset_type_in_ruleunpacked_structured_type7627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefile_type_in_ruleunpacked_structured_type7654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulearray_type_in_entryRulearray_type7689 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulearray_type7699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Array_in_rulearray_type7737 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_LeftSquareBracket_in_rulearray_type7749 = new BitSet(new long[]{0x0FC0100101008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_ruleindex_type_in_rulearray_type7769 = new BitSet(new long[]{0x0010400000000000L});
    public static final BitSet FOLLOW_Comma_in_rulearray_type7783 = new BitSet(new long[]{0x0FC0100101008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_ruleindex_type_in_rulearray_type7803 = new BitSet(new long[]{0x0010400000000000L});
    public static final BitSet FOLLOW_RightSquareBracket_in_rulearray_type7818 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_Of_in_rulearray_type7830 = new BitSet(new long[]{0x0FE0100501209600L,0x0000000000000014L});
    public static final BitSet FOLLOW_ruletype_in_rulearray_type7850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledynamic_array_type_in_entryRuledynamic_array_type7885 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuledynamic_array_type7895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Array_in_ruledynamic_array_type7933 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_Of_in_ruledynamic_array_type7945 = new BitSet(new long[]{0x0FE0100501209600L,0x0000000000000014L});
    public static final BitSet FOLLOW_ruletype_in_ruledynamic_array_type7965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleindex_type_in_entryRuleindex_type8000 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleindex_type8010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesimple_type_in_ruleindex_type8055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerecord_type_in_entryRulerecord_type8089 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulerecord_type8099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Record_in_rulerecord_type8143 = new BitSet(new long[]{0x0000000020080000L,0x0000000000000004L});
    public static final BitSet FOLLOW_rulefield_list_in_rulerecord_type8175 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_End_in_rulerecord_type8195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefield_list_in_entryRulefield_list8241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefield_list8251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefixed_part_in_rulefield_list8299 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_Semicolon_in_rulefield_list8313 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000004L});
    public static final BitSet FOLLOW_rulevariant_part_in_rulefield_list8333 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_rulevariant_part_in_rulefield_list8363 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_Semicolon_in_rulefield_list8378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefixed_part_in_entryRulefixed_part8414 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefixed_part8424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerecord_section_in_rulefixed_part8470 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_Semicolon_in_rulefixed_part8484 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_rulerecord_section_in_rulefixed_part8504 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_rulevariable_identifier_list_in_entryRulevariable_identifier_list8541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevariable_identifier_list8551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulevariable_identifier_list8593 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_Comma_in_rulevariable_identifier_list8612 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RULE_ID_in_rulevariable_identifier_list8628 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_rulevariable_section_in_entryRulevariable_section8670 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevariable_section8680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariable_identifier_list_in_rulevariable_section8726 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_Colon_in_rulevariable_section8739 = new BitSet(new long[]{0x0FE0100501209600L,0x0000000000000014L});
    public static final BitSet FOLLOW_ruletype_in_rulevariable_section8759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerecord_section_in_entryRulerecord_section8794 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulerecord_section8804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleidentifier_list_in_rulerecord_section8850 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_Colon_in_rulerecord_section8863 = new BitSet(new long[]{0x0FE0100501209600L,0x0000000000000014L});
    public static final BitSet FOLLOW_ruletype_in_rulerecord_section8883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariant_part_in_entryRulevariant_part8918 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevariant_part8928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Case_in_rulevariant_part8966 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruletag_field_in_rulevariant_part8986 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RULE_ID_in_rulevariant_part9004 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_Of_in_rulevariant_part9022 = new BitSet(new long[]{0x0BC0000101008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_rulevariant_in_rulevariant_part9042 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_Semicolon_in_rulevariant_part9056 = new BitSet(new long[]{0x0BC0000101008000L,0x0000000000000014L});
    public static final BitSet FOLLOW_rulevariant_in_rulevariant_part9076 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_ruletag_field_in_entryRuletag_field9113 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletag_field9123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruletag_field9165 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_Colon_in_ruletag_field9183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariant_in_entryRulevariant9217 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevariant9227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecase_label_list_in_rulevariant9273 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_Colon_in_rulevariant9286 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_LeftParenthesis_in_rulevariant9298 = new BitSet(new long[]{0x0000200000080000L,0x0000000000000004L});
    public static final BitSet FOLLOW_rulefield_list_in_rulevariant9318 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_RightParenthesis_in_rulevariant9332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleset_type_in_entryRuleset_type9366 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleset_type9376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Set_in_ruleset_type9414 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_Of_in_ruleset_type9426 = new BitSet(new long[]{0x0FE0100501209600L,0x0000000000000014L});
    public static final BitSet FOLLOW_ruletype_in_ruleset_type9446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefile_type_in_entryRulefile_type9481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefile_type9491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_File_in_rulefile_type9529 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_Of_in_rulefile_type9541 = new BitSet(new long[]{0x0FE0100501209600L,0x0000000000000014L});
    public static final BitSet FOLLOW_ruletype_in_rulefile_type9561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepointer_type_in_entryRulepointer_type9596 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulepointer_type9606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CircumflexAccent_in_rulepointer_type9644 = new BitSet(new long[]{0x0FE0100501209600L,0x0000000000000014L});
    public static final BitSet FOLLOW_ruletype_in_rulepointer_type9664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariable_declaration_part_in_entryRulevariable_declaration_part9699 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevariable_declaration_part9709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Var_in_rulevariable_declaration_part9747 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_rulevariable_section_in_rulevariable_declaration_part9767 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_Semicolon_in_rulevariable_declaration_part9780 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_rulevariable_section_in_rulevariable_declaration_part9801 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_Semicolon_in_rulevariable_declaration_part9814 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleprocedure_and_function_declaration_part_in_entryRuleprocedure_and_function_declaration_part9850 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleprocedure_and_function_declaration_part9860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleprocedure_declaration_in_ruleprocedure_and_function_declaration_part9907 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_rulefunction_declaration_in_ruleprocedure_and_function_declaration_part9934 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_Semicolon_in_ruleprocedure_and_function_declaration_part9948 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_ruleprocedure_declaration_in_entryRuleprocedure_declaration9987 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleprocedure_declaration9997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleprocedure_heading_in_ruleprocedure_declaration10043 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_Semicolon_in_ruleprocedure_declaration10056 = new BitSet(new long[]{0x0000000802016070L});
    public static final BitSet FOLLOW_ruleblock_in_ruleprocedure_declaration10077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Forward_in_ruleprocedure_declaration10102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleprocedure_heading_in_entryRuleprocedure_heading10149 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleprocedure_heading10159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Procedure_in_ruleprocedure_heading10197 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleprocedure_heading10213 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_ruleformal_parameter_list_in_ruleprocedure_heading10239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleformal_parameter_list_in_entryRuleformal_parameter_list10275 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleformal_parameter_list10285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LeftParenthesis_in_ruleformal_parameter_list10323 = new BitSet(new long[]{0x0000000800000030L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleformal_parameter_section_in_ruleformal_parameter_list10343 = new BitSet(new long[]{0x0002200000000000L});
    public static final BitSet FOLLOW_Semicolon_in_ruleformal_parameter_list10357 = new BitSet(new long[]{0x0000000800000030L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleformal_parameter_section_in_ruleformal_parameter_list10377 = new BitSet(new long[]{0x0002200000000000L});
    public static final BitSet FOLLOW_RightParenthesis_in_ruleformal_parameter_list10392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleformal_parameter_section_in_entryRuleformal_parameter_section10426 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleformal_parameter_section10436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevalue_parameter_section_in_ruleformal_parameter_section10482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariable_parameter_section_in_ruleformal_parameter_section10509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleprocedure_heading_in_ruleformal_parameter_section10536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunction_heading_in_ruleformal_parameter_section10563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevalue_parameter_section_in_entryRulevalue_parameter_section10598 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevalue_parameter_section10608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleidentifier_list_in_rulevalue_parameter_section10654 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_Colon_in_rulevalue_parameter_section10667 = new BitSet(new long[]{0x0000000000001200L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleparameter_type_in_rulevalue_parameter_section10687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleparameter_type_in_entryRuleparameter_type10722 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleparameter_type10732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleconformant_array_schema_in_ruleparameter_type10778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleparameter_type10801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleconformant_array_schema_in_entryRuleconformant_array_schema10841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleconformant_array_schema10851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepacked_conformant_array_schema_in_ruleconformant_array_schema10897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleunpacked_conformant_array_schema_in_ruleconformant_array_schema10924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepacked_conformant_array_schema_in_entryRulepacked_conformant_array_schema10959 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulepacked_conformant_array_schema10969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Packed_in_rulepacked_conformant_array_schema11007 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_Array_in_rulepacked_conformant_array_schema11019 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_LeftSquareBracket_in_rulepacked_conformant_array_schema11031 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_rulebound_specification_in_rulepacked_conformant_array_schema11051 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_RightSquareBracket_in_rulepacked_conformant_array_schema11064 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_Of_in_rulepacked_conformant_array_schema11076 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RULE_ID_in_rulepacked_conformant_array_schema11092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulebound_specification_in_entryRulebound_specification11132 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulebound_specification11142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulebound_specification11184 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_FullStopFullStop_in_rulebound_specification11202 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RULE_ID_in_rulebound_specification11218 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_Colon_in_rulebound_specification11236 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RULE_ID_in_rulebound_specification11252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleunpacked_conformant_array_schema_in_entryRuleunpacked_conformant_array_schema11292 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleunpacked_conformant_array_schema11302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Array_in_ruleunpacked_conformant_array_schema11340 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_LeftSquareBracket_in_ruleunpacked_conformant_array_schema11352 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_rulebound_specification_in_ruleunpacked_conformant_array_schema11372 = new BitSet(new long[]{0x0012000000000000L});
    public static final BitSet FOLLOW_Semicolon_in_ruleunpacked_conformant_array_schema11386 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_rulebound_specification_in_ruleunpacked_conformant_array_schema11406 = new BitSet(new long[]{0x0012000000000000L});
    public static final BitSet FOLLOW_RightSquareBracket_in_ruleunpacked_conformant_array_schema11421 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_Of_in_ruleunpacked_conformant_array_schema11433 = new BitSet(new long[]{0x0000000000001200L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleparameter_type_in_ruleunpacked_conformant_array_schema11453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevariable_parameter_section_in_entryRulevariable_parameter_section11488 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevariable_parameter_section11498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Var_in_rulevariable_parameter_section11536 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleidentifier_list_in_rulevariable_parameter_section11556 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_Colon_in_rulevariable_parameter_section11569 = new BitSet(new long[]{0x0000000000001200L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleparameter_type_in_rulevariable_parameter_section11589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunction_heading_in_entryRulefunction_heading11624 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefunction_heading11634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Function_in_rulefunction_heading11672 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RULE_ID_in_rulefunction_heading11688 = new BitSet(new long[]{0x0001100000000000L});
    public static final BitSet FOLLOW_ruleformal_parameter_list_in_rulefunction_heading11714 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_Colon_in_rulefunction_heading11728 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RULE_ID_in_rulefunction_heading11744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunction_declaration_in_entryRulefunction_declaration11784 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefunction_declaration11794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunction_heading_in_rulefunction_declaration11840 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_Semicolon_in_rulefunction_declaration11853 = new BitSet(new long[]{0x0000000802016070L});
    public static final BitSet FOLLOW_ruleblock_in_rulefunction_declaration11874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Forward_in_rulefunction_declaration11899 = new BitSet(new long[]{0x0000000000000002L});

}