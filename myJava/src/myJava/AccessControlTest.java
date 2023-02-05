package myJava;

public class AccessControlTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessControlDemo acDemo = new AccessControlDemo();
           acDemo.a=10;
           acDemo.b=20;
         acDemo.setC(30);
         
         System.out.println( acDemo.a);
         System.out.println( acDemo.b);
         System.out.println(acDemo.getC());
         
         
         
         
	}

}
