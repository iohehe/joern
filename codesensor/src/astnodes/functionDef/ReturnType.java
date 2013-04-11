package astnodes.functionDef;

import astnodes.ASTNode;

public class ReturnType extends ASTNode
{
	String completeType;
	String baseType;
	
	public void setCompleteType(String aCompleteType)
	{
		completeType = aCompleteType;
	}

	public void setBaseType(String aBaseType)
	{
		baseType = aBaseType;
	}

}
