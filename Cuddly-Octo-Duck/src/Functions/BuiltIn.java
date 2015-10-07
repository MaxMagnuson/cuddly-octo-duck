package Functions;

import java.util.HashMap;

public class BuiltIn {

	public static HashMap<String, IStackObject> getFunction;
	static 
	{
		getFunction.put("add", new Add());
	}
}
