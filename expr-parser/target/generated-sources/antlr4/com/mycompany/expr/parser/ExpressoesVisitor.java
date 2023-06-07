// Generated from com\mycompany\expr\parser\Expressoes.g4 by ANTLR 4.7.2
package com.mycompany.expr.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExpressoesParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExpressoesVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ExpressoesParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(ExpressoesParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressoesParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressao(ExpressoesParser.ExpressaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressoesParser#expressao2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressao2(ExpressoesParser.Expressao2Context ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressoesParser#termo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermo(ExpressoesParser.TermoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressoesParser#termo2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermo2(ExpressoesParser.Termo2Context ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressoesParser#fator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFator(ExpressoesParser.FatorContext ctx);
}