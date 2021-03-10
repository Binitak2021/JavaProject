
public class Palindrome {
	public void checkIfPalindrome(String s)
	{
		boolean flag=false;
		for(int i=0;i<s.length()/2;i++)
		{
			if (s.charAt(i)==s.charAt(s.length()-1))
			{
			  flag=true;
			}
		}
		if(flag)
			System.out.println("\""+s+"\" is a palindrome");
		else
			System.out.println("\""+s+"\" is not a palindrome");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Palindrome obj=new Palindrome();
	    obj.checkIfPalindrome("racecar");
		obj.checkIfPalindrome("english");
				

	}

}
