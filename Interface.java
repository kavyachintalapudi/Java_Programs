package Java_Programs;

interface i1
{
	abstract public void test1();  //nothing   100% abstraction 
}

abstract class A
{
	abstract public void test1();           //0 to 100% abstraction
	public void fun()
	{
		System.out.println("Hello world ");
	}
	
}

public class Interface implements i1{

	
	public void test1()
	{
		System.out.println("welcome to java ");
	}
	public void fun()
	{
		System.out.println("Hello world ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
