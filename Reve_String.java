package Java_Programs;

public class Reve_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="mada";
		String rev=" ";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
	
		
		

	}

}
