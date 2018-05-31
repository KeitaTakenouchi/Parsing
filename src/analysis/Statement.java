package analysis;

import org.antlr.v4.runtime.ParserRuleContext;

public class Statement implements Node
{
	private final ParserRuleContext ctx;
	private final int id;

	public Statement(ParserRuleContext ctx, int id)
	{
		this.ctx = ctx;
		this.id = id;
	}

	public ParserRuleContext getCtx()
	{
		return ctx;
	}

	public int getStartLine()
	{
		return ctx.start.getLine();
	}

	public int getEndLine()
	{
		return ctx.stop.getLine();
	}

	@Override
	public int getId()
	{
		return id;
	}

	@Override
	public String toString()
	{
		return "[@_" + ctx.start.getLine() + "] " ;//+ ctx.getText();
	}

}
