import java.util.Arrays;

public class AscendingString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abcddabx";
		char[] charArray = str.toCharArray();
		Arrays.sort(charArray);
		for (char c : charArray) {
			System.out.println(c);
			
		}
		

	}

}
