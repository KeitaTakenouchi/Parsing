package main;

import java.io.File;
import java.io.IOException;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;

import analysis.ControlFlowGenerator;
import analysis.Node;
import antlr.gen.ToyLexer;
import antlr.gen.ToyParser;
import gfpa.graph.concrete.ControlFlowGraph;
import gfpa.graph.search.EdgeVisitor;

public class ParsingMain
{
	public static void main(String[] args)
	{
		File file = new File("grammar/sample.toy");
		new ParsingMain().run(file);
	}

	public void run(File file)
	{
		try
		{
			CharStream stream = CharStreams.fromFileName(file.getAbsolutePath());
			ToyLexer lexer = new ToyLexer(stream);

			 /**
			Token token = lexer.nextToken();
			while (token.getType() != ToyLexer.EOF)
			{
				System.out.println("(" + token.getLine() + ")" + lexer.getVocabulary().getDisplayName(token.getType())
						+ ":" + token.getText());
				token = lexer.nextToken();
			}
			lexer.reset();
			// **/

			CommonTokenStream cStream = new CommonTokenStream(lexer);
			ToyParser parser = new ToyParser(cStream);

			// RuleContext start = parser.start();
			// ParseTreeWalker.DEFAULT.walk(new MyListener(), start);

			ControlFlowGenerator gen = new ControlFlowGenerator(parser.statements());
			ControlFlowGraph cfgraph = gen.getCFG();
			cfgraph.forEachEdge(new EdgeVisitor()
			{
				@Override
				public boolean perform(int from, int to)
				{
					Node fromStmt = gen.getStatement(from);
					Node toStmt = gen.getStatement(to);
					if (fromStmt != null && toStmt != null)
						System.out.println(fromStmt + " -> " + toStmt);
					else if (fromStmt != null)
						System.out.println(fromStmt + " ->" + to);
					else if (toStmt != null)
						System.out.println(from + " -> " + toStmt);
					else
						System.out.println(from + " ->" + to);
					return true;
				}
			});

		} catch (IOException e)
		{
			e.printStackTrace();
		}

	}

}
