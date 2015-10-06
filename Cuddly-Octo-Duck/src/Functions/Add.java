package Functions;

import java.util.ArrayList;

public class Add implements IStackObject {
	
	public Add()
	{
		
	}
	
	@Override
	public ArrayList<String> Process(ArrayList<dataTypes.IDataType> input)
	{
		ArrayList<String> output = new ArrayList<String>();
		
		ArrayList<String> evalParams = new ArrayList<String>();
		for(dataTypes.IDataType param : input)
		{
			ArrayList<String> temp = param.evaluate();
			for(String tempParam : temp)
			{
				evalParams.add(tempParam);
			}
		}
		
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
