package interview_programmes;

public class FindUniqueElement 
{
	public void identifyUniqueElement(int[] a)
	{   
		for(int num:a)
		{
			int frequency=0;
			for(int temp:a)
			{
				if(temp==num)
					frequency++;
			}
			if(frequency==1)
				System.out.print(num+" ");
		}
	}
	public static void main(String[]args)
	{
	FindUniqueElement obj =new FindUniqueElement();
	obj.identifyUniqueElement(new int [] {0,0,1,2,1});
	}
}
