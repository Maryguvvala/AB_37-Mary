package arraysprogram;

public class Functions_of_String
{

	public static void main(String[] args) 
	{
	String name= "Mary";
	System.out.println(name.toLowerCase());
	System.out.println(name.toUpperCase());
	System.out.println(name.length());
	String s1="      Mary     Kumari        ";
	System.out.println(s1.trim());
	String s2="Mary";
	String s3="Kumari";
	System.out.println(s2.concat(s3));
	System.out.println(s2.concat(" ").concat(s3));
	System.out.println(s3.charAt(3));
	System.out.println(s2.indexOf('y'));
	System.out.println(s3.substring(3));
	System.out.println(s1.substring(6, 17));
	System.out.println(name.contains("m"));
	System.out.println(name.contains("M"));
	System.out.println(name.contains("Mar"));
	System.out.println(name.contains("May"));
	System.out.println(name.matches("Mry"));
	System.out.println(name.contains("ary"));
	String s4="";
	System.out.println(s4.isEmpty());
	System.out.println(name.endsWith("ry"));
	System.out.println(name.endsWith("r"));
	}

}
