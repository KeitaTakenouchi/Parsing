package antlr.gen;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import antlr.gen.ToyParser.StatementsContext;

public class MyListener extends ToyBaseListener
{
	private int depth = 0;

	
	
	@Override
	public void enterStatements(StatementsContext ctx)
	{
//		System.err.println(ctx.getText());
	}

	@Override
	public void enterEveryRule(ParserRuleContext ctx)
	{
		String ruleName = ctx.getClass().getName();
		String rule = ruleName.substring(ruleName.lastIndexOf("$") + 1, ruleName.lastIndexOf("Context"));

		ParserRuleContext p = ctx.getParent();
		if (p == null)
		{
			printSpaces();
			System.out.println(rule);
			return;
		}

		ParseTree lastChild = p.getChild(p.getChildCount() - 1);
		if (ctx == lastChild)
		{
			printSpaces();
			System.out.print("└─ ");
			// System.out.println();
			System.out.println(rule);
		} else
		{
			printSpaces();
			System.out.print("├─ ");
			// System.out.println();
			System.out.println(rule);
		}
		depth++;
	}

	@Override
	public void visitTerminal(TerminalNode node)
	{

		ParseTree p = node.getParent();
		ParseTree lastChild = p.getChild(p.getChildCount() - 1);
		if (node == lastChild)
		{
			printSpaces();
			System.out.print("└── ");
			System.out.println(node.getText());
		} else
		{
			printSpaces();
			System.out.print("├── ");
			System.out.println(node.getText());
		}
	}

	@Override
	public void exitEveryRule(ParserRuleContext ctx)
	{
		depth--;
	}

	private void printSpaces()
	{
		for (int i = 0; i < depth; i++)
			System.out.print("   ");
	}

}
