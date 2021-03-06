package sharedMethods;
import java.util.ArrayList;
import java.util.Stack;
import java.util.zip.DataFormatException;

import dataTypes.IDataType;

public class Parse {

	public static ArrayList<IDataType> stringToDataTypes(String input)
	{
		ArrayList<IDataType> output = new ArrayList<IDataType>();
		int index = 1;
		char cur;
		//Get past function name
		while((cur = input.charAt(index++)) != ' '){}
		
		int bound = input.length() - 1;
		while(index < bound)
		{
			cur = input.charAt(index);
			if(cur == ' ' || cur == ')')
			{
				index++;
			}
			else if(cur == '[')
			{
				String result = captureElement(input, index, ']');
				IDataType temp = new dataTypes.Collection(result);
				output.add(temp);
				index += result.length();
			}
			else if(cur == '(')
			{
				String result = captureElement(input, index, ')');
				IDataType temp = new dataTypes.Function(result);
				output.add(temp);
				index += result.length();
			}
			else
			{
				String nextElement = "";
				while((cur = input.charAt(index)) != ' ' && cur != ')')
				{
					nextElement += cur;
					index++;
				}
				IDataType temp = new dataTypes.Value(nextElement);
				output.add(temp);
			}
		}
		
		return output;
	}
	
	private static String captureElement(String input, int index, char delimiter)
	{
		String ele = "";
		index++;
		char cur;
		Stack delimStack = new Stack();
		if(delimiter == ')')
		{
			delimStack.add('(');
			ele += '(';
		}
		else
		{
			delimStack.add('[');
			ele += '[';
		}
		
		while(!delimStack.isEmpty())
		{
			cur = input.charAt(index);
			if(cur == delimiter)
			{
				delimStack.pop();
			}
			else if(cur == '(')
			{
				delimStack.add('(');
			}
			else if(cur == '[')
			{
				delimStack.add('[');
			}
			ele += cur;
			index++;
		}
		
		return ele;
	}
	
	public static ArrayList<String> evaluateParams(ArrayList<dataTypes.IDataType> input)
	{
		ArrayList<String> evalParams = new ArrayList<String>();
		ArrayList<IDataType> tempParams = new ArrayList<IDataType>();
		for(IDataType d : input)
		{
			String type = d.getType();
			if(type.equals("Function")) 
			{
				tempParams.add(d);
			}
			else
			{
				ArrayList<String> tempVal = d.evaluate();
				evalParams.addAll(tempVal);
			}
		}
		
		while(tempParams.size() > 0)
		{
			IDataType tempData = tempParams.remove(0);
			ArrayList<String> tempStrings = tempData.evaluate();
			///////////////////////////////////////////////////////////////
			//Does not currently handle collections returned from functions
			///////////////////////////////////////////////////////////////
			for(String s : tempStrings)
			{
				if(s.startsWith("("))
				{
					ArrayList<IDataType> tempDataList = sharedMethods.Parse.stringToDataTypes(s);
					for(IDataType d : tempDataList)
					{
						if(d.getType().equals("Function"))
						{
							tempParams.add(0, d);
						}
						else
						{
							ArrayList<String> tempVal = d.evaluate();
							evalParams.addAll(tempVal);
						}
					}	
				}
				else
				{
					evalParams.add(s);
				}
			}
		}
		return evalParams;
	}
}
