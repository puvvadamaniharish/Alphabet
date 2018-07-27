import java.util.*;
import java.lang.*;
import java.io.*;
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner h = new Scanner (System.in);
		int m = h.nextInt();
		   if ( m > 0 )
		    {
		    	if ( m % 2 == 0 )
		    	 {
		    	 	System.out.println("Even");
		    	 }
		    	 else
		    	 {
		    	 	System.out.println("Odd");
		    	 }
		    }
		    else
		    {
		    	System.out.println("invalid");
		    }
	}
}
