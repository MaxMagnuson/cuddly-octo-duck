package Functions;
import dataTypes.IDataType;
import java.util.ArrayList;

public class Multiply implements IStackObject {
	
	public Multiply()
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
			total *= Double.parseDouble(evalParams.get(i));
		}
		
		output.add(total + "");
		return output;
	}
}
