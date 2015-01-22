package org.xtext.example.pascal.ui;

import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultAntlrTokenToAttributeIdMapper;

public class MyAntlrTokenToAttributeIdMapper extends DefaultAntlrTokenToAttributeIdMapper {

	@Override
	protected String calculateId(String tokenName, int tokenType) {
		if ("RULE_IDENTIFIER".equals(tokenName)) {
			return MyHighLightingConfiguration.LAYOUT_ID;
		} else if ("RULE_BEGIN_KEYWORD".equals(tokenName) || "RULE_END_KEYWORD".equals(tokenName) || "RULE_GOTO_KEYWORD".equals(tokenName) || "RULE_LABEL_KEYWORD".equals(tokenName)) {
			return MyHighLightingConfiguration.KEYWORD_ID;
		} else if ("RULE_INTEGER_NUMBER".equals(tokenName) || "RULE_SIGNED_INTEGER_NUMBER".equals(tokenName) || "RULE_REAL_NUMBER".equals(tokenName) || "RULE_SIGNED_REAL_NUMBER".equals(tokenName)) {
			return MyHighLightingConfiguration.NUMBER_ID;
		} else if ("'['".equals(tokenName) || "']'".equals(tokenName) || "':'".equals(tokenName) || "','".equals(tokenName) || "':='".equals(tokenName) || "'('".equals(tokenName) || "')'".equals(tokenName) || "';'".equals(tokenName)) {
			return MyHighLightingConfiguration.PUNCTUATION_ID;
		}
		return super.calculateId(tokenName, tokenType);
	}
	
}