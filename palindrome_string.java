package Java_Programs;

public class palindrome_string {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//CKOKRO4EMFRRRRRRRKOEKR,GTFYKITYOITOHKIOPDRUJEOAPDLSKZD,SL;AQPWO0EIRX,SWOQWIEORFJKWP-Q[WP;AS.
		String str="madam mam are good friends";
		String[] x=str.split(" ");
		for(int i=0;i<x.length;i++)
		{
			String rev=" ";
			for(int j=x[i].length()-1;j>=0;j--)
			{
				rev=rev+x[i].charAt(j);
			}
			if (x[i].equals(rev))
			{
				System.out.println("palindrome string");
			}
			else
			{
				System.out.println("not palindrome string");		
			}
		}
	}

}
