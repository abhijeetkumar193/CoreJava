
public class SeleniumPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "fgdsdfgdfg   gdfgdfsg g dsg dsgdg  \r\n" + " gdfsgsfdgd \r\n"
				+ "dfgdfsgsdfgdf    gdfgdfg gdfsgdfsg gdfgdfs\r\n" + "gdfsgdfg  gdfgdfsgd gfdgdfgdf dfgdg";
		/*
		 * String split = str1.replaceAll("[^\\d]", ""); System.out.println(split);
		 * System.out.println("hello world");
		 */
		System.out.println(str1.replaceAll("\\n\\t\\b", "*"));
		String str2="Abhijheet is an employee of Infosys (724983) and also have 12345";
		String[] split = str2.split("\\s+");
		for (String string : split) {
			if(string.startsWith("(") && string.endsWith(""))
			{
				//System.out.println(string.replaceAll("[()]", ""));
				System.out.println(string.substring(1, string.length()-1));
			}
		}
		
		
		
		

	}

}
