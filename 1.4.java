import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
// 初始化
		Scanner in = new Scanner(System.in);
		int [] numberx1 = new int [101];
		int [] numberx2 = new int [101];
		int [] numberx3 = new int [101];
	//读入方程组	
		int x =0;
		do
		{
			x = in.nextInt();
			int y = in.nextInt();
			numberx1[x]=y;
		}while(x!=0);
		x=0;
		do
		{
			x = in.nextInt();
			int y = in.nextInt();
			numberx2[x]=y;
		}while(x!=0);
	//进行合并
		for(int x1=100;x1>=0;x1--)
		{
			numberx3[x1]=numberx2[x1]+numberx1[x1];
		}
	//输出
		int count =0;
		for(int x2=100;x2>=0;x2--)
		{
			if(numberx3[x2]!=0)
				{
				count = x2;
				break;
				}
		}	
		//输出第一位
		System.out.print(numberx3[count]+"x"+count);
		
		for (int x2 = (count-1);x2>=0;x2--)
		{
			if(numberx3[x2]==1)
			{
				System.out.print("+");	

				if(x2!=0&&x2!=1)
				{
					System.out.print("x"+x2);
				}
				else if(x2 == 0)
				{
					System.out.print("1");
				}
				else
				{
					System.out.print("x");
						
				}
			}
			else if(numberx3[x2]==-1)
			{
				if(x2!=0&&x2!=1)
				{
					System.out.print("-x"+x2);
				}
				else if(x2 == 0)
				{
					System.out.print("-1");
				}
				else
				{
					System.out.print("-x");
						
				}
			}
			
			
			
			
			else if(numberx3[x2]>0)
				{
				
				System.out.print("+");	

				if(x2!=0&&x2!=1)
				{
					System.out.print(numberx3[x2]+"x"+x2);
				}
				else if(x2 == 0)
				{
					System.out.print(numberx3[x2]);
				}
				else
				{
					System.out.print(numberx3[x2]+"x");
						
				}
				}
		
//			
			else if(numberx3[x2]<0)
			{
				if(x2!=0&&x2!=1)
				{
					System.out.print(numberx3[x2]+"x"+x2);
				}
				else if(x2 == 0)
				{
					System.out.print(numberx3[x2]);
				}
				else
				{
					System.out.print(numberx3[x2]+"x");
				}
			}
		
		}
	
	
	
}
	}