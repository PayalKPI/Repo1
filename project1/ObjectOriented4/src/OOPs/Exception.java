package OOPs;

public class Exception {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a=5, b=0;
        final int a1=7;
        final String test="saregama";
        
        try{
        	System.out.println(a/b);
        }
        
        catch(ArithmeticException e) {
        	e.printStackTrace();
        }
        
         finally {
        	 System.out.println("I will be there even if no on is there");
         }
	}
	
}
         
        
	


