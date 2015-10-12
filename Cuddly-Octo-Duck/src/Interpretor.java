import java.util.ArrayList;
import java.util.Scanner;


public class Interpretor {

	public static void main(String[] args)
	{
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
