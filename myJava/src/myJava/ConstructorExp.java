package myJava;

public class ConstructorExp {
 private String name;
 private int houseNo;
 private static String appartmentname;
 static void change()
 {
	appartmentname="kmc"; 
 
 }
  ConstructorExp(String a, int b)
 {
	 houseNo =b;
	 name = a;
 }
  void display()
  {
	  System.out.println(name + "" + houseNo + appartmentname );
	  
  }
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		change();
      ConstructorExp h1 = new ConstructorExp("janakiram", 207 );
      h1.display();
      ConstructorExp h2 = new ConstructorExp("jyothi",  208 );
      h2.display();
      
	}

}
