package analysis;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import antlr.gen.ToyParser.BlockContext;
import antlr.gen.ToyParser.StmtContext;
import gnu.trove.set.TIntSet;
import gnu.trove.set.hash.TIntHashSet;

public class AntlrUtils
{
	public static int[] getStatementLines(ParserRuleContext ctx)
	{
		TIntSet lines = new TIntHashSet();
		for (int i = 0; i < ctx.getChildCount(); i++)
		{
			ParseTree child = ctx.getChild(i);
			List<Token> tokens = getTokensOtherThanStmt(child);
			for (Token t : tokens)
				lines.add(t.getLine());
		}
		return lines.toArray();
	}

	private static List<Token> getTokensOtherThanStmt(ParseTree ctx)
	{
		if (ctx instanceof StmtContext && !(ctx instanceof BlockContext))
			return Collections.emptyList();

		List<Token> tokens = new ArrayList<Token>();

		if (ctx instanceof TerminalNode)
		{
			TerminalNode t = (TerminalNode) ctx;
			tokens.add(t.getSymbol());
			return tokens;
		}

		for (int i = 0; i < ctx.getChildCount(); i++)
		{
			ParseTree child = ctx.getChild(i);
			tokens.addAll(getTokensOtherThanStmt(child));
		}
		return tokens;
	}

}
