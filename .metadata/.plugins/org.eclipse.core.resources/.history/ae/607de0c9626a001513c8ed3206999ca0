package Functions;

import java.util.ArrayList;

public class Add implements IStackObject<String> {
	
	public Add()
	{
		
	}
	
	@Override
	public ArrayList<String> Process(ArrayList<String> input)
	{
		ArrayList<String> output = new ArrayList<String>();
		
		double total = 0;
		int bound = input.size();
		for(int i = 0; i < bound; i++)
		{
			total += Double.parseDouble(input.get(i));
		}
		
		output.add(total + "");
		return output;
	}
}
