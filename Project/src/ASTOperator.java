/* Generated By:JJTree: Do not edit this line. ASTOperator.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTOperator extends SimpleNode {
  public ASTOperator(int id) {
    super(id);
  }

  public ASTOperator(PatternParser p, int id) {
    super(p, id);
  }
  
  @Override
 	public String generateJava() {
 		// TODO Auto-generated method stub
 		return this.value.toString();
 	}

}
/* JavaCC - OriginalChecksum=53598755986a8eae494432c7da8a2d10 (do not edit this line) */
