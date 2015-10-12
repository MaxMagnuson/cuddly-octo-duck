import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import Functions.IStackObject;


public class Interpretor {

	private static HashMap<String, IStackObject> funMap = new HashMap<String, IStackObject>();

	public static void main(String[] args)
	{
		funMap.put("add", new Functions.Add());
		Scanner scan = new Scanner(System.in);

		String line;
		while(!(line = scan.nextLine()).equals("end"))
		{	
			dataTypes.IDataType fun = new dataTypes.Function(line);
			ArrayList<String> result = fun.evaluate();

			System.out.print("-> " + result.get(0));
		}
	}
}
