
/**
 * The following is an array declared with 2 elements. 
 * Then the code tries to access the 3rd element of the array which throws an exception.
 */
public class ArrayBound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]=new int[2];
arr[0]=1;
arr[1]=2;
	try
	{
	System.out.println("Accessing element 2: "+arr[2]);//java.lang.ArrayIndexOutOfBoundsException: 2
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	try
	{
		System.out.println("Accessing element 2: "+arr[(Integer)null]);//	
	}
	catch (Exception e) {
System.out.println("\n"+e);	//java.lang.NullPointerException
}
}
}
/*output
  java.lang.ArrayIndexOutOfBoundsException: 2
	at ArrayBound.main(ArrayBound.java:15)
	
java.lang.NullPointerException
*/
 