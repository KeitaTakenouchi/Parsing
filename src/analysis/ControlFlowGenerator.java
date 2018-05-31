package analysis;

import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RuleContext;

import antlr.gen.ToyParser.BlockContext;
import antlr.gen.ToyParser.IfThenElseContext;
import antlr.gen.ToyParser.StatementsContext;
import antlr.gen.ToyParser.StmtContext;
import antlr.gen.ToyParser.WhileContext;
import gfpa.graph.concrete.ControlFlowGraph;
import gnu.trove.map.hash.TIntObjectHashMap;

public class ControlFlowGenerator
{
	private TIntObjectHashMap<Node> id2Statement = new TIntObjectHashMap<>();
	private ControlFlowGraph cfgraph;

	public ControlFlowGenerator(StatementsContext ctx)
	{
		int entryId = createEntryNode();
		int exitNode = createExitNode();
		cfgraph = new ControlFlowGraph(entryId);
		
		IntPair stmtsSec = generateGraphComponent(ctx);

		addEdge(cfgraph.getEntryId(), stmtsSec.start);
		addEdge(stmtsSec.end, exitNode);
	}

	public ControlFlowGraph getCFG()
	{
		return cfgraph;
	}

	public Node getStatement(int nodeId)
	{
		return id2Statement.get(nodeId);
	}

	private IntPair generateGraphComponent(ParserRuleContext ctx)
	{
		print(ctx);

		if (ctx instanceof IfThenElseContext)
		{
			int ifStartNode = createStmtNode(ctx);
			int ifEndNode = createNewDummyNode();

			StmtContext thenStmt = ((IfThenElseContext) ctx).stmt(0);
			IntPair thenSec = generateGraphComponent(thenStmt);

			addEdge(ifStartNode, thenSec.start);
			addEdge(thenSec.end, ifEndNode);

			StmtContext elseStmt = ((IfThenElseContext) ctx).stmt(1);
			if (elseStmt != null)
			{
				IntPair elseSec = generateGraphComponent(elseStmt);

				addEdge(ifStartNode, elseSec.start);
				addEdge(elseSec.end, ifEndNode);
			} else
			{
				addEdge(ifStartNode, ifEndNode);
			}
			return new IntPair(ifStartNode, ifEndNode);
		} else if (ctx instanceof WhileContext)
		{
			int whileNode = createStmtNode(ctx);
			StmtContext subStmt = ((WhileContext) ctx).stmt();
			IntPair whileSec = generateGraphComponent(subStmt);

			addEdge(whileNode, whileSec.start);
			addEdge(whileSec.end, whileNode);

			return new IntPair(whileNode, whileNode);
		} else if (ctx instanceof BlockContext)
		{
			StatementsContext statements = ((BlockContext) ctx).statements();
			return generateGraphComponent(statements);
		} else if (ctx instanceof StatementsContext)
		{
			int startNode = -1;
			int endNode = -1;

			List<StmtContext> stmtList = ((StatementsContext) ctx).stmt();
			for (int i = 0; i < stmtList.size(); i++)
			{
				IntPair stmtSec = generateGraphComponent(stmtList.get(i));
				if (i == 0)
				{
					startNode = stmtSec.start;
				} else
				{
					addEdge(endNode, stmtSec.start);
				}
				endNode = stmtSec.end;
			}
			return new IntPair(startNode, endNode);
		} else
		{
			int newId = createStmtNode(ctx);
			return new IntPair(newId, newId);

		}
	}

	private void print(RuleContext ctx)
	{
		// for (int i = 0; i < ctx.depth(); i++)
		// System.out.print(" ");
		// System.out.println(ctx.getText());
	}

	private void addEdge(int from, int to)
	{
		cfgraph.putEdge(from, to);
	}

	private int nodeId = 1;

	private int createStmtNode(ParserRuleContext ctx)
	{
		nodeId++;
		Statement stmt = new Statement(ctx, nodeId);
		id2Statement.put(nodeId, stmt);
		return nodeId;
	}
	
	private int createNewDummyNode()
	{
		nodeId++;
		 Node dummyNode = new DummyNode(nodeId);
		id2Statement.put(nodeId, dummyNode);
		return nodeId;
	}
	
	private int createEntryNode()
	{
		int entryId = 0;
		 Node dummyNode = new DummyNode(entryId);
		id2Statement.put(entryId, dummyNode);
		return entryId;
	}
	
	private int createExitNode()
	{
		int exitId = 1;
		 Node dummyNode = new DummyNode(exitId);
		id2Statement.put(exitId, dummyNode);
		return exitId;
	}

	class IntPair
	{
		public final int start;
		public final int end;

		public IntPair(int start, int end)
		{
			this.start = start;
			this.end = end;
		}
	}

}
