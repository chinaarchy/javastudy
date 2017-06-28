import java.util.Scanner;

public class Main
{
	public static boolean IsPrime(int x)
	{
		int y =2;
		boolean Isprime =true;
		
		for(;y<x;y++)
		{
			if(x%y == 0)
			{
				Isprime = false;
				break;
			}
		}
		if(x == y+1)
		{
			Isprime = true;
		}
		return Isprime;
	}

	public static void IsHeshu(int x)
	{
		int j =2;
		int newnum = x;  
		int []sum = new int[10]; 
		int i =0;
		for(;x != 1;)
		{
			for(j=2;x!=1;j++)
			{
				if(x%j==0)
				{
					sum[i] = j;
					break;
				}
			}
			x = x / sum[i];
			i++;
		}
		System.out.print(newnum+"=");
		for(int ig = 0;ig<i;ig++)
		{
			if(ig == i -1)
			{
				System.out.print(sum[ig]);
			}
			else{
				System.out.print(sum[ig]+"x");
			}
			
		}
	}
	
	public static void main(String[] args)
	{
		
	//初始化
	Scanner in = new Scanner(System.in);
	int count = in.nextInt();
	if(IsPrime(count))
		System.out.print(count);
	else
	{
		IsHeshu(count);
	}
	}
}