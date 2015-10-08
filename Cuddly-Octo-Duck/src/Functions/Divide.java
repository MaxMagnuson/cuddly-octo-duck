package Functions;

import java.util.ArrayList;

import dataTypes.IDataType;

public class Divide implements IStackObject {
	public Divide()
	{
		
	}
	
	@Override
	public ArrayList<String> Process(ArrayList<IDataType> input)
	{
		ArrayList<String> output = new ArrayList<String>();
		
		ArrayList<String> evalParams = sharedMethods.Parse.evaluateParams(input);
		
		double total = Double.parseDouble(evalParams.get(0));
		int bound = evalParams.size();
		for(int i = 1; i < bound; i++)
		{
			total /= Double.parseDouble(evalParams.get(i));
		}
		
		output.add(total + "");
		return output;
	}
}
