import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ListHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("a");
		list.add("b");
		list.add("v");
		list.add("d");
		list.add("");
		list.add("");

		list.add(null);
		list.add(null);
		list.add(null);
		for (String s1 : list) {
			System.out.println(s1);
		}
		System.out.println("==========================*****************=============");
		Set<String> s = new HashSet<String>();
		s.addAll(list);
		Iterator<String> it = s.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("==========================*****************=============");
		Map<Integer, String> map = new HashMap<Integer, String>();
		for (int i = 0; i < list.size(); i++) {
			map.put(i, list.get(i));
		}
		for (int j = 0; j <= map.size(); j++) {
			System.out.println(map.get(j));
		}

		System.out.println(";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;");
		Map<Integer, String> map1 = new HashMap<Integer, String>();
		// map1.put(key, value)
	}

}
