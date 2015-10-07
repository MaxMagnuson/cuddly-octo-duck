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
			String fn = parseFun(line);
			ArrayList<String> params = parseColl(line);
			IStackObject function = funMap.get(fn);
			String result = function.Process(params).get(0).toString();

			System.out.print("-> " + result);
		}
	}

	private static String parseFun(String input)
	{
		String output = "";
		int index = 1;
		char cur = ' ';
		while((cur = input.charAt(index++)) != ' ')
		{
			output += cur;
		}
		return output;
	}

	private static ArrayList<String> parseColl(String input)
	{
		ArrayList<String> output = new ArrayList<String>();
		int index = 0;
		char cur;
		//Get To Args
		while((cur = input.charAt(index++)) != ' ')
		{
		}

		String nextEle = "";
		while(index < input.length())
		{
			cur = input.charAt(index);
			if(cur == ' ' && nextEle.length() > 0)
			{
				output.add(nextEle);
				nextEle = "";
			} 
			else if(Character.isDigit(cur))
			{
				nextEle += cur;
			}
			index++;
		}
		if(nextEle.length() > 0)
		{
			output.add(nextEle);
		}


		return output;
	}
}
