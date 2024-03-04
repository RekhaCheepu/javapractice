package dynamic_array;

import java.util.HashMap;

public class HashMapTest {

	public static void main(String[] args) {
		HashMap<String,String>map=new HashMap<String,String>();
		
		map.put("TOM", "IBM");
		map.put("JOHN", "GOOGLE");
		map.put("NICK", "CTS");
		map.put("SARA", "APPLE");
		map.put("TED", "AMAZON");
		//map.put("KAREN", null);
		//map.put(null, null);
//		map.put(null, "SITA");
		
		System.out.println(map.get("SARA"));
		
		System.out.println(map.get("KAREN"));
		System.out.println(map);
//		System.out.println(map);
//		System.out.println(map);
//		System.out.println(map);

	}

}
