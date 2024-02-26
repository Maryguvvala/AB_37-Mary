package arraysprogram;

public class Functions 
{

	public static void main(String[] args) 
	{
		String a= "abhishek";
		System.out.println(a.replaceAll("a", ""));
		System.out.println(a.replaceAll("a", "A"));
		String quote="i love my country";
		System.out.println(quote.replaceAll(" ", ""));
		String name="mary12345";
		System.out.println(name.replaceAll("[a-z]", ""));
		String name1="MARY12345";
		System.out.println(name1.replaceAll("[A-Z]", ""));
		String a1= "My Name Is Mary";
		System.out.println(a1.replaceAll("[A-Z]", ""));
		System.out.println(a1.replaceAll("[a-z]", ""));
		String b="MaRy";
		System.out.println(b.replaceAll("[a-z]", ""));
		System.out.println(b.replaceAll("[A-Z]", ""));
		System.out.println(a1.repeat(3));
	}

}
