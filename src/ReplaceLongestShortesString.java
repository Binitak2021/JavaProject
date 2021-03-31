package interview_programmes;

public class ReplaceLongestShortesString 
{
	public String interchangeShortestLongest(String s)
	{
		String str;
		String[] words=s.split(" ");
		if(words.length==0||words.length==1)
		{
			System.out.println("invalid string");
		}
		String shortest=words[0];
		String longest="";
		for(String word:words)
		{
			if(word.length()<shortest.length())
				shortest=word;
		
		
			if(word.length()>longest.length())
				longest=word;
		}
		str=s.replaceAll(shortest,"-");
		str=str.replaceAll(longest,shortest);
		str=str.replaceAll("-",longest);
		return str;
	}
	public static void main(String[]args)
	{
		ReplaceLongestShortesString obj=new ReplaceLongestShortesString();
		System.out.println(obj.interchangeShortestLongest("my name is ankit raj"));
	}
	

}
