import java.util.Map;
import java.util.TreeMap;

// Program to create a TreeMap of employees and print names in Ascending order

public class Question3 {
	
	public static void main(String[] args) {
		
		Map<String, Integer> map = new TreeMap<>(); // Declaring TreeMap
		map.put("David", 11221);
		map.put("Surya", 11223);
		map.put("Vignesh", 11225);
		map.put("Aswin", 11222);
		map.put("Karthik", 11224);
		map.put("Praveen", 11228);
		map.put("Harini", 11226);
		map.put("Gautham", 11227);
		
		System.out.println(map);
		
	}
	
	

}
