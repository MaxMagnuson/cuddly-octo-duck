package dataTypes;

import java.util.ArrayList;

public class Collection implements IDataType {
	
	private String value;
	public Collection(String val)
	{
		this.value = val;
	}
	
	public String getType()
	{
		return "Collection";
	}
	
	@Override
	public ArrayList<String> evaluate() {
		ArrayList<String> output = new ArrayList<String>();
		int bound = this.value.length();
		String curElement = "";
		for(int i = 1; i < bound; i++)
		{
			char cur = this.value.charAt(i);
			if(cur != ' ' && cur != ']')
			{
				curElement += cur;
			} 
			else if(curElement.length() > 0)
			{
				output.add(curElement);
				curElement = "";
			}
		}
		if(curElement.length() > 0)
		{
			output.add(curElement);
		}
		return output;
	}

}
