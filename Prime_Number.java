package Java_Programs;

public class Prime_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int start=10;
		int end=50;
		for(int i=start;i<=end;i++)
		{
			int count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.print(i+" ");
			}
		}

	}

}
