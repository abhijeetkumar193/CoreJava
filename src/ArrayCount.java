import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ArrayCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,1,1,5,6,2,3,4};
		Map<Integer, Integer> map= new HashMap<>();
		for(int i=0;i<arr.length;i++)
		{
			int count=0;
			for(int j=0;j<arr.length;j++)
			{
				
				if(arr[i]==arr[j])
				{
					count++;
					
				}
			}
			//System.out.println(arr[i]+"----->"+count);
			map.put(arr[i], count);
		}

		
		for (Entry<Integer,Integer> e:map.entrySet()) {
			System.out.println(e.getKey()+"---->"+e.getValue());
			
		}
	}

}
