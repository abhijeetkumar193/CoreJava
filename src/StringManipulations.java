import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringManipulations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Amazon is an american company   and is having the    80000 Employees in the    18 states in india#$%^&^";
		System.out.println(str1);
		/*
		 * String str2=str1.replaceAll("[a-zA-Z0-9]+[\\s]+","");
		 * System.out.println(str2); String Email ="abhijeetkumar@infosys.com";
		 * 
		 * String[] split = str1.split(
		 * "\\s++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++"
		 * ); for(String s1:split) { System.out.println(s1.replaceAll("#$", "**")); }
		 */
		System.out.println(str1.replaceAll("\\s*", ":"));
		String str3 = "Abhijeet";
		System.out.println(str3.replaceAll("[Ajt]", "%"));
		String Email = "abhijeet.kumar@infosys.com";
		String pattern = "[a-z.]+@[a-z]+.[a-z]+{2,3}";
		Pattern compile = Pattern.compile(pattern);
		Matcher matcher = compile.matcher(Email);
		System.out.println(matcher.matches());

	}

}
