package arraysprogram;

public class Assignment_74 
{

	public static void main(String[] args)
	{
		String name = "GroTechMinds";
		String a= name.replaceAll("[a-z]", "");
		String b=name.replaceAll("[A-Z]", "");
		System.out.println("String a: "+a);
		System.out.println("String b: "+b);

	}

}
