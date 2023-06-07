/*
 * generated by Xtext 2.31.0
 */
package com.mycompany.alguma2.parser.antlr;

import com.google.inject.Inject;
import com.mycompany.alguma2.parser.antlr.internal.InternalAlguma2Parser;
import com.mycompany.alguma2.services.Alguma2GrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class Alguma2Parser extends AbstractAntlrParser {

	@Inject
	private Alguma2GrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalAlguma2Parser createParser(XtextTokenStream stream) {
		return new InternalAlguma2Parser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Programa";
	}

	public Alguma2GrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(Alguma2GrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
