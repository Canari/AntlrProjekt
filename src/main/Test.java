package main;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;

public final class Test {
	public static void main(String[] args) throws Exception {
		ANTLRStringStream input = new ANTLRStringStream("A-B=C\n+++\nD+E=F\n===\nG+H=I\n");
		// Create an input character stream from standard in
		//ANTLRInputStream input = new ANTLRInputStream(System.in);
		// Create an ExprLexer that feeds from that stream
		symbolraetselV3Lexer lexer = new symbolraetselV3Lexer(input);
		// Create a stream of tokens fed by the lexer
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		// Create a parser that feeds off the token stream
		symbolraetselV3Parser parser = new symbolraetselV3Parser(tokens);
		// Begin parsing at rule prog, get return value structure
		symbolraetselV3Parser.prog_return r = parser.prog();
		// WALK RESULTING TREE
		CommonTree t = (CommonTree)r.getTree(); // get tree from parser
		System.out.println(t.toStringTree());
		// Create a tree node stream from resulting tree
		//CommonTreeNodeStream nodes = new CommonTreeNodeStream(t);
		
		//symbolraetselV2TreeGrammar walker = new symbolraetselV2TreeGrammar(nodes); // create a tree parser
		//walker.prog(); // launch at start rule prog
	}
}