package Functions;

import java.util.ArrayList;

import sharedMethods.Constants;

import dataTypes.IDataType;

public class Equals implements IStackObject {

	@Override
	public ArrayList<String> Process(ArrayList<IDataType> input) {
		ArrayList<String> output = new ArrayList<String>();
		
		ArrayList<String> evalParams = sharedMethods.Parse.evaluateParams(input);
		if(evalParams.size() != 2)
		{
			//implement error stuff
		}
		
		if(evalParams.get(0).equals(evalParams.get(1)))
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
