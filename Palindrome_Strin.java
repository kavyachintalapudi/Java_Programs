package Java_Programs;

public class Palindrome_Strin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="madam";
		String rev=" ";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		if(str.equals(rev))
		{
			System.out.println("Palindrome string");
		}
		else {
			System.out.println("Not palindrome string");
		}

	}

	

}
