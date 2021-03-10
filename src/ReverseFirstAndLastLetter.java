
	public class ReverseFirstAndLastLetter 
	{
		public String reverseCharacters(String s)
		{
			String reverse=s.charAt(s.length()-1)+"";
			reverse+=s.substring(1, s.length()-1)+s.charAt(0);
			return reverse; 
		}
	public static void main(String[]args)
	{
		ReverseFirstAndLastLetter obj=new ReverseFirstAndLastLetter();
		System.out.println(obj.reverseCharacters("java"));
	}
	}



