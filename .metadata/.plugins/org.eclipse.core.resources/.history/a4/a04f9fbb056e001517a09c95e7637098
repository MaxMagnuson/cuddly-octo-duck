package dataTypes;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class DataTypeTests {

	@Test
	public void CollectionEvaluate()
	{
		ArrayList<String> expected = new ArrayList<String>();
		expected.add("1");
		expected.add("2");
		expected.add("3");
		expected.add("4");
		expected.add("23");
		
		String input = "[1 2    3   4  23]";
		IDataType test = new Collection(input);
		ArrayList<String> output = test.evaluate();
		
		for(int i = 0; i < expected.size(); i++)
		{
			assertEquals(expected.get(i), output.get(i));
		}
	}
}
