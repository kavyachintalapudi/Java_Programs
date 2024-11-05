package Java_Programs;

public class Constructor_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor_String a1=new Constructor_String();
		Constructor_String c1=new Constructor_String(3,4);
		Constructor_String d1=new Constructor_String(4,5,88);
		Constructor_String e1=new Constructor_String(56,77,88,45);
	}
	public Constructor_String() {
		// TODO Auto-generated constructor stub
		System.out.println("default constructor");
	}
	public Constructor_String(int a,int b)
	{
		System.out.println("parameterized constructor");
	}
	public Constructor_String(int c,int x,int y)
	{
		System.out.println("values to be executed");
	}
	public Constructor_String(int z,int e,int d,int f)
	{
		System.out.println(666);
		System.out.println("values to be contudeted");
		System.out.println(5*19+5);
		System.out.println(99*5/98+590);
	}
}
