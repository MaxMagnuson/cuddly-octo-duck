package Functions;

import java.util.ArrayList;

import dataTypes.IDataType;

public class Equals implements IStackObject {

	@Override
	public ArrayList<String> Process(ArrayList<IDataType> input) {
		ArrayList<String> output = new ArrayList<String>();
		
		ArrayList<String> evalParams = sharedMethods.Parse.evaluateParams(input);
		if(evalParams.size() != 2)
		{
			System.out.println("Param count: " + evalParams.size());
			System.out.println("First Param: " + evalParams.get(0));
			//implement error stuff
		}
		
		if(evalParams.get(0).equals(evalParams.get(1)))
		{
			output.add("true");
		}
		else
		{
			output.add("false");
		}
		
		return output;
	}

}
