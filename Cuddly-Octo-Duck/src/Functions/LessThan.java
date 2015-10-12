package Functions;

import java.util.ArrayList;

import dataTypes.IDataType;
import sharedMethods.Constants;

public class LessThan implements IStackObject {

	@Override
	public ArrayList<String> Process(ArrayList<IDataType> input) {
		ArrayList<String> output = new ArrayList<String>();
		
		ArrayList<String> evalParams = sharedMethods.Parse.evaluateParams(input);
		if(evalParams.size() != 2)
		{
			//implement error stuff
		}
		
		double paramOne = Double.parseDouble(evalParams.get(0));
		double paramTwo = Double.parseDouble(evalParams.get(1));
		double diff = paramOne - paramTwo;
		
		if(diff < 0)
		{
			output.add(Constants.TRUE);
		}
		else
		{
			output.add(Constants.FALSE);
		}
		
		return output;
	}
}