package ParsingTools;
/* Generated By:JJTree: Do not edit this line. ASTOperator_Unary.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTOperator_Unary extends SimpleNode {
  public ASTOperator_Unary(int id) {
    super(id);
  }

  public ASTOperator_Unary(PatternParser p, int id) {
    super(p, id);
  }
  
  @Override
 	public String generateJava() {
 		return this.value.toString();
 	}

}
/* JavaCC - OriginalChecksum=d3e2a1200bc1d261131972733d90271b (do not edit this line) */
