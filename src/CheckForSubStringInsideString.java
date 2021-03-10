//3. WRITE A JAVA PROGRAM TO CHECK IF THE SUBSTRING IS PRESENT ON THE STRING
//"JAVACODE","JAVA"-->YES
//"JAVACODE","JAVA"-->YES
//"JAVACODE","SELENIUM"-->NO
//"JAVACODE","SELENIUM"-->NO
public class CheckForSubStringInsideString 
{
	public void containsSubstring(String s,String x)
	{
		if(s.contains(x))
			System.out.println("YES");
		else
			System.out.println("NO");
	}
   public static void main(String[]args)
   {
	   CheckForSubStringInsideString obj=new CheckForSubStringInsideString();
	   obj.containsSubstring("JAVACODE", "JAVA");
	   obj.containsSubstring("JAVACODE", "SELENIUM");

   }
}
