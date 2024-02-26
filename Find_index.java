package arraysprogram;

public class Find_index 
{

  public static void main(String[] args) 
  {
	/*String name="Mary123"; //finding the index
	char c1[]=name.toCharArray();
	for (int i=0;i<name.length();i++)
	{
      boolean answer= Character.isDigit(c1[i]);
	  if(answer==true)
      {
	    System.out.println("The numeric value is present at index:" +i);
      }
    }*/

    String inputString = "Mary123"; //finding no; of chars & numbers

    int charCount = 0;
    int digitCount = 0;

    for (char ch : inputString.toCharArray())
    {
        if (Character.isLetter(ch))
        {
            charCount++;
        } 
        else if (Character.isDigit(ch))
        {
            digitCount++;
        }
    }

    System.out.println("Number of characters: " + charCount);
    System.out.println("Number of digits: " + digitCount);




  }

}
