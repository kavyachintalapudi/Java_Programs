package Java_Programs;

public class Palindrome_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=985466;
		int temp,r,sum=0;
		temp=n;
		while(n>0)
		{
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(temp==sum)
		{
			System.out.println("palindrome number");
		}
		else
		{
			System.out.println("not palindrome number");
		}

	}

}
