import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class mapRelated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Map<String, String> map= new HashMap<>(); 
		/*map.put(1, "abhijeet1");
		map.put(1, "abhijeet2");
		map.put(3, "abhijeet3");
		map.put(2, "abhijeet4");
		map.put(null, "abhijeet5");map.put(1, "abhijeet6");
		map.put(null, "abhijeet7");
		map.put(,abhijeet7");
*/		
		
		map.put("ab1", "abb1");
		map.put("ab1", "abb1");
		map.put("ab2", "abb1");
		map.put(" ", "abb1");
		map.put(null ,"abb1");
		
		/*for(Entry<String, String> entry: map.entrySet())
		{
			System.out.println(entry.getKey()+"--->"+entry.getValue());
		}
		*/
		Set<String> set= new TreeSet<>();
		set.add("a");
		set.add("a1");
		set.add("a");
		set.add("a2");
		set.add("a2");
		set.add(null);
		set.add(null);
		
		
		
		for (String string : set) {
			System.out.println(string);
		}
		
		
		
		
	}

}
