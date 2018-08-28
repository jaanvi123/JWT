import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapDemo {

	public static void main(String[] args) {
		
		Map<String,String> stateCodes = new HashMap<>();
		stateCodes.put("MH", "Maharashtra");
		stateCodes.put("UP", "Uttar Pradesh");
		stateCodes.put("PB", "Punjab");
		
		System.out.println(stateCodes);
		System.out.println(stateCodes.get("MH"));
		
		for(Entry<String, String> entry:stateCodes.entrySet())
		{
			System.out.println(entry.getKey()+"="+entry.getValue());
		}
		
		for(String code:stateCodes.keySet())
		{
			System.out.println(code+"*******"+stateCodes.get(code));
		}
	}

}
