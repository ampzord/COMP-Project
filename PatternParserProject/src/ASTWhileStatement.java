
/* Generated By:JJTree: Do not edit this line. ASTWhileStatement.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTWhileStatement extends SimpleNode {
	public ASTWhileStatement(int id) {
		super(id);
	}

	public ASTWhileStatement(PatternParser p, int id) {
		super(p, id);
	}

	@Override
	public String generateJava() {
		String s = "while (";
		SimpleNode cond = (SimpleNode) jjtGetChild(0);
		s += cond.generateJava();
		s += ") {";
		SimpleNode block = (SimpleNode) jjtGetChild(1);
		s += block.generateJava();
		return s;
	}

}
/* JavaCC - OriginalChecksum=b6006887c3b689f2bf7be87fffb37e97 (do not edit this line) */
