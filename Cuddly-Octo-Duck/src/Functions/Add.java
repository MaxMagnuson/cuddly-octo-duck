package Functions;

import dataTypes.IDataType;
import java.util.ArrayList;

public class Add implements IStackObject {
	
	public Add()
	{
		
	}
	
	@Override
	public ArrayList<String> Process(ArrayList<IDataType> input)
	{
		ArrayList<String> output = new ArrayList<String>();
		
		ArrayList<String> evalParams = sharedMethods.Parse.evaluateParams(input);
		
		double total = 0;
		int bound = evalParams.size();
		for(int i = 0; i < bound; i++)
		{
			total += Double.parseDouble(evalParams.get(i));
		}
		
		output.add(total + "");
		return output;
	}
}
