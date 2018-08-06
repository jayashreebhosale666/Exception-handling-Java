
public class FinallyExample {  
		  public static void main(String args[]){  
		  try{  
		   int data=25/5;  
		   System.out.println(data);  
		  }  
		  catch(NullPointerException e){System.out.println(e);}  
		  finally{System.out.println("finally block is always executed");}  
		  System.out.println("rest of the code...");  
		  }  
}
/*OUTPUT:
5
finally block is always executed
rest of the code...
*/