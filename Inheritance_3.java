package Java_Programs;

public class Inheritance_3 extends Inheritance_2{

	int k=300;
	int d=500;
	int g=400;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inheritance_3 obj = new Inheritance_3();
	    obj.add();
		obj.mul();		
		obj.mul(56, 56);
		obj.sub(5, 60, 30);
		

	}
	public void mul(int x,int y)
	{
		System.out.println(x*y);
	}
	public void sub(int z,int m,int n)
	{
		System.out.println(z*m/n);
	}

}
