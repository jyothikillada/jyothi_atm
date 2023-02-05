package myJava;

public class OverLoadingDemo {
	void hello()
	{
		System.out.println("hello with no parameters");
	}
	void hello(int a)
	{
		System.out.println("hello with one parameters of type integer" +a);
	}void hello(int a,int b)
	{
		System.out.println("hello with two parameters of type integer" +a+","+ b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverLoadingDemo obj1= new OverLoadingDemo();
		obj1.hello();
		obj1.hello(10);
		obj1.hello(10,20);
	}

}
