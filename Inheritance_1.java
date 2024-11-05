package Java_Programs;

public class Inheritance_1 extends Inheritance{
              int x=100;
              int y=500;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inheritance_1 c1=new Inheritance_1();
		c1.add();
		c1.display();
		c1.sub();
		c1.mul();
		System.out.println(c1.x);
		System.out.println(c1.y);
		

	}
	public void sub() {
		System.out.println("This is a sub method");
	}
	public void mul() {
		System.out.println("This is a mul method");
	}

}
