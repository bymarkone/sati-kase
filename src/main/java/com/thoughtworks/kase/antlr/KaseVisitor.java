// Generated from /Users/msilveir/personal/Dropbox/marcos/source/sati/kase/src/main/antlr/Kase.g4 by ANTLR 4.2.2
package com.thoughtworks.kase.antlr;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link KaseParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface KaseVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link KaseParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(@NotNull KaseParser.ParamContext ctx);

	/**
	 * Visit a parse tree produced by {@link KaseParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(@NotNull KaseParser.NameContext ctx);

	/**
	 * Visit a parse tree produced by {@link KaseParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(@NotNull KaseParser.ParamsContext ctx);

	/**
	 * Visit a parse tree produced by {@link KaseParser#commands}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommands(@NotNull KaseParser.CommandsContext ctx);

	/**
	 * Visit a parse tree produced by {@link KaseParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand(@NotNull KaseParser.CommandContext ctx);
}