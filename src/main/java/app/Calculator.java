package app;

public class Calculator {
	
	public int add(int i,int j)
	{
		return i+j;
	}
	public int multiply(int i,int j)
	{
		return i*j;
	}
	public int divide(int i,int j)
	{
		return i/j;
	}
	public int subtract(int i,int j)
	{
		if(i>j)
		{
		  return i-j;

		}
		else
		{
			return j-i;
		}
		
		
		}


}
