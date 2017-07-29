// Generated from Prism.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PrismParser}.
 */
public interface PrismListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PrismParser#prismfile}.
	 * @param ctx the parse tree
	 */
	void enterPrismfile(PrismParser.PrismfileContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrismParser#prismfile}.
	 * @param ctx the parse tree
	 */
	void exitPrismfile(PrismParser.PrismfileContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrismParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(PrismParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrismParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(PrismParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrismParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(PrismParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrismParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(PrismParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrismParser#filetype}.
	 * @param ctx the parse tree
	 */
	void enterFiletype(PrismParser.FiletypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrismParser#filetype}.
	 * @param ctx the parse tree
	 */
	void exitFiletype(PrismParser.FiletypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrismParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(PrismParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrismParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(PrismParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrismParser#const_statement}.
	 * @param ctx the parse tree
	 */
	void enterConst_statement(PrismParser.Const_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrismParser#const_statement}.
	 * @param ctx the parse tree
	 */
	void exitConst_statement(PrismParser.Const_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrismParser#const_type}.
	 * @param ctx the parse tree
	 */
	void enterConst_type(PrismParser.Const_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrismParser#const_type}.
	 * @param ctx the parse tree
	 */
	void exitConst_type(PrismParser.Const_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrismParser#condition_op}.
	 * @param ctx the parse tree
	 */
	void enterCondition_op(PrismParser.Condition_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrismParser#condition_op}.
	 * @param ctx the parse tree
	 */
	void exitCondition_op(PrismParser.Condition_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrismParser#term_op}.
	 * @param ctx the parse tree
	 */
	void enterTerm_op(PrismParser.Term_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrismParser#term_op}.
	 * @param ctx the parse tree
	 */
	void exitTerm_op(PrismParser.Term_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrismParser#formula_statement}.
	 * @param ctx the parse tree
	 */
	void enterFormula_statement(PrismParser.Formula_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrismParser#formula_statement}.
	 * @param ctx the parse tree
	 */
	void exitFormula_statement(PrismParser.Formula_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrismParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(PrismParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrismParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(PrismParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrismParser#atomic_condition}.
	 * @param ctx the parse tree
	 */
	void enterAtomic_condition(PrismParser.Atomic_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrismParser#atomic_condition}.
	 * @param ctx the parse tree
	 */
	void exitAtomic_condition(PrismParser.Atomic_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrismParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(PrismParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrismParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(PrismParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrismParser#range}.
	 * @param ctx the parse tree
	 */
	void enterRange(PrismParser.RangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrismParser#range}.
	 * @param ctx the parse tree
	 */
	void exitRange(PrismParser.RangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrismParser#condition_expand}.
	 * @param ctx the parse tree
	 */
	void enterCondition_expand(PrismParser.Condition_expandContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrismParser#condition_expand}.
	 * @param ctx the parse tree
	 */
	void exitCondition_expand(PrismParser.Condition_expandContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrismParser#module}.
	 * @param ctx the parse tree
	 */
	void enterModule(PrismParser.ModuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrismParser#module}.
	 * @param ctx the parse tree
	 */
	void exitModule(PrismParser.ModuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrismParser#entries}.
	 * @param ctx the parse tree
	 */
	void enterEntries(PrismParser.EntriesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrismParser#entries}.
	 * @param ctx the parse tree
	 */
	void exitEntries(PrismParser.EntriesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrismParser#entrie}.
	 * @param ctx the parse tree
	 */
	void enterEntrie(PrismParser.EntrieContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrismParser#entrie}.
	 * @param ctx the parse tree
	 */
	void exitEntrie(PrismParser.EntrieContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrismParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(PrismParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrismParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(PrismParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrismParser#transition}.
	 * @param ctx the parse tree
	 */
	void enterTransition(PrismParser.TransitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrismParser#transition}.
	 * @param ctx the parse tree
	 */
	void exitTransition(PrismParser.TransitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrismParser#transition_rules}.
	 * @param ctx the parse tree
	 */
	void enterTransition_rules(PrismParser.Transition_rulesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrismParser#transition_rules}.
	 * @param ctx the parse tree
	 */
	void exitTransition_rules(PrismParser.Transition_rulesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrismParser#transition_assign}.
	 * @param ctx the parse tree
	 */
	void enterTransition_assign(PrismParser.Transition_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrismParser#transition_assign}.
	 * @param ctx the parse tree
	 */
	void exitTransition_assign(PrismParser.Transition_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrismParser#global}.
	 * @param ctx the parse tree
	 */
	void enterGlobal(PrismParser.GlobalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrismParser#global}.
	 * @param ctx the parse tree
	 */
	void exitGlobal(PrismParser.GlobalContext ctx);
}