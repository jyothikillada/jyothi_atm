package myJava;

public class twodimarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int twodarray [] [];
twodarray =new int [4][5];
int k=0;
for( int i=0;i<4;i++)
{
	
	for( int j=0;j<5;j++)
	{
	
	twodarray[i][j]=k;
	
	System.out.println("valueod twodarray is ["+i+"][" + j+ "]:" + " is " +twodarray[i][j]);
	
	k++;
	
	}
	System.out.println("......");
}
}
}