package dataTypes;

import java.util.ArrayList;

public class Value implements IDataType {
	private String value;
	
	public Value(String val)
	{
		this.value = val;
	}
	
	public String getType()
	{
		return "Value";
	}
	
	@Override
	public ArrayList<String> evaluate()
	{
		ArrayList<String> output = new ArrayList<String>();
		output.add(this.value);
		
		return output;
	}
}
