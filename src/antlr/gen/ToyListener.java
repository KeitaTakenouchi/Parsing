// Generated from Toy.g4 by ANTLR 4.7.1
package antlr.gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ToyParser}.
 */
public interface ToyListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ToyParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(ToyParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToyParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(ToyParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToyParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(ToyParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToyParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(ToyParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifThenElse}
	 * labeled alternative in {@link ToyParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterIfThenElse(ToyParser.IfThenElseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifThenElse}
	 * labeled alternative in {@link ToyParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitIfThenElse(ToyParser.IfThenElseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifThen}
	 * labeled alternative in {@link ToyParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterIfThen(ToyParser.IfThenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifThen}
	 * labeled alternative in {@link ToyParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitIfThen(ToyParser.IfThenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code while}
	 * labeled alternative in {@link ToyParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhile(ToyParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code while}
	 * labeled alternative in {@link ToyParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhile(ToyParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code block}
	 * labeled alternative in {@link ToyParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterBlock(ToyParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code block}
	 * labeled alternative in {@link ToyParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitBlock(ToyParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignment}
	 * labeled alternative in {@link ToyParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(ToyParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignment}
	 * labeled alternative in {@link ToyParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(ToyParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code print}
	 * labeled alternative in {@link ToyParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterPrint(ToyParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code print}
	 * labeled alternative in {@link ToyParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitPrint(ToyParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToyParser#comparativeExpr}.
	 * @param ctx the parse tree
	 */
	void enterComparativeExpr(ToyParser.ComparativeExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToyParser#comparativeExpr}.
	 * @param ctx the parse tree
	 */
	void exitComparativeExpr(ToyParser.ComparativeExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToyParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(ToyParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToyParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(ToyParser.ExprContext ctx);
}