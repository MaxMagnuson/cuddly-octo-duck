package dataTypes;

import java.util.ArrayList;

public class Function implements IDataType {

	private String value;
	
	public Function(String input)
	{
		this.value = input;
	}
	
	public String getType()
	{
		return "Function";
	}
	
	@Override
	public ArrayList<String> evaluate() {
		String funName = "";
		char cur;
		int index = 1;
		while((cur = value.charAt(index++)) != ' ')
		{
			funName += cur;
		}
		ArrayList<IDataType> params = sharedMethods.Parse.stringToDataTypes(value);
		
		Functions.IStackObject fun = new Functions.Add();//Functions.BuiltIn.getFunction.get(funName);
		ArrayList<String> output = fun.Process(params);
		return output;
	}

	
}
