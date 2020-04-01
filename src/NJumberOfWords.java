import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NJumberOfWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="I am Abhijeet     kumar";
		System.out.println(str1.replaceAll("\\s+", ""));
		
		String[] data=str1.split("\\s+");
		System.out.println(data.length);
		
		int[] i= {1,4,5,8,7,6,9,2,10,54};
		/*Arrays.sort(i);
		for (int j : i) {
			System.out.println(j);
		}*/
		
		List<Integer> i1= new ArrayList<>();
		for (Integer integer : i) {
			i1.add(integer);
		}
		Collections.sort(i1);
		for (Integer integer : i1) {
			System.out.println(integer);
		}
		

	}

}
