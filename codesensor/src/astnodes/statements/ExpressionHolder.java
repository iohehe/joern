package astnodes.statements;

import astnodes.expressions.Expression;

// By default, Expressions holding only a single
// child are replaced by their child during
// consolidation. ExpressionHolders are never removed.

public class ExpressionHolder extends Expression
{	
	public String getCodeStr()
	{
		if(codeStr != null)
			return codeStr;
		
		Expression expr = getExpression();
		if(expr == null) return "";
		
		codeStr = expr.getCodeStr();
		return codeStr;
	}
	
	public Expression getExpression()
	{
		if(children == null) return null;
		return (Expression) children.get(0);
	}
	
}
