
/* Generated By:JJTree: Do not edit this line. ASTIfStatement.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public class ASTIfStatement extends SimpleNode {
	public ASTIfStatement(int id) {
		super(id);
	}

	public ASTIfStatement(PatternParser p, int id) {
		super(p, id);
	}

	@Override
	public String generateJava() {
		String s = "if (";
		SimpleNode cond = (SimpleNode) jjtGetChild(0);
		s += cond.generateJava();
		s += ") {";
		SimpleNode then = (SimpleNode) jjtGetChild(1);
		s += then.generateJava();
		
		if (jjtGetNumChildren() > 2) {
			SimpleNode _else = (SimpleNode) jjtGetChild(2);
			s += _else.generateJava();
		}
		
		s += "\t\t}";
		return s;
	}
}
/*
 * JavaCC - OriginalChecksum=64d743b480d89ff2d0b77c0c77d9fea9 (do not edit this
 * line)
 */
