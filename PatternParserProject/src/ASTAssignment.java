
/* Generated By:JJTree: Do not edit this line. ASTAssignment.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTAssignment extends SimpleNode {
	
  public ASTAssignment(int id) {
    super(id);
  }

  public ASTAssignment(PatternParser p, int id) {
    super(p, id);
  }
  
  public String generateJava() {
	  SimpleNode assign_operator = (SimpleNode) jjtGetChild(0);
	  SimpleNode expr = (SimpleNode) jjtGetChild(1);
	  return "\t" + value.toString().replace("@", "_at_") + " " + assign_operator.generateJava() + " " + expr.generateJava() + ";\n";
	}
}
/* JavaCC - OriginalChecksum=b46d9c98d7fcf9337c8e142f48933236 (do not edit this line) */
