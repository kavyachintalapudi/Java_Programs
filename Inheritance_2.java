package Java_Programs;

public class Inheritance_2 extends Inheritance_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inheritance_2 d1=new Inheritance_2();
		d1.add();
		d1.display();
		d1.mul();
		d1.sub();
		System.out.println(d1.x);
		System.out.println(d1.y);
		d1.values(100, 600);
		d1.information(2, 5, 100);
		

	}
	public void values(int x,int y)
	{
		System.out.println(x+y);
	}
	public void information(int a,int b,int c) {
		System.out.println(a*b+c);
	}
	

}
