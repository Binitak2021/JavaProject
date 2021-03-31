package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CostOfCopyingString 
{
	public int findCopyingCost(String s)
	{
		int cost=0;
		if(s.length()>0)
		{
			cost++;
			if(s.length()>1)
			{
				String p=s.charAt(0)+"";//p="a"
				for(int i=1;i<s.length();i++)
				{
					
					if(!p.contains(s.charAt(i)+""))
					{
						cost++;
					}
					p+=s.charAt(i);
					
				}
			}
		}
		
		
		return cost;
	}
	@Test
	public void checkCopyingCost()
	{
		Assert.assertEquals(findCopyingCost(""), 0);
		Assert.assertEquals(findCopyingCost("a"), 1);
		Assert.assertEquals(findCopyingCost("abcabc"), 3);
		Assert.assertEquals(findCopyingCost("abcd"), 4);
	}

}
