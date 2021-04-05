package interview_programmes;

import java.util.Arrays;

public class CheckFunnyString 
{
	public String checkIfFunny(String s)
	{
		String reverse="";
		for(int i=s.length()-1;i>=0;i--)
		{
			reverse+=s.charAt(i);
		}
		int [] arr1=new int [s.length()-1];	
		int [] arr2=new int [s.length()-1];		
//		for(int i=1;i<s.length();i++)
//		{
//			arr1[i-1]=Math.abs(s.charAt(i)-s.charAt(i-1));
//			arr2[i-1]=Math.abs(reverse.charAt(i)-reverse.charAt(i-1));
//			
//		}
		for(int i=0;i<s.length()-1;i++)
		{
			arr1[i]=Math.abs(s.charAt(i+1)-s.charAt(i));
			arr2[i]=Math.abs(reverse.charAt(i+1)-reverse.charAt(i));

		}
		if(Arrays.equals(arr1, arr2))
			return "funny";
		else
			return "not funny";
	}
	public static void main(String [] args)
	{
		CheckFunnyString obj=new CheckFunnyString();
		System.out.println(obj.checkIfFunny("acxz"));
		System.out.println(obj.checkIfFunny("bcxz"));
	}
}
