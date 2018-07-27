import java.util.*;
import java.lang.*;
import java.io.*;
class test
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner (System.in);
		char m = s.next().charAt(0);
		 if ( (m >= 'a' && m  <= 'z') || (m >= 'A' && m <= 'Z' ) )
		 {
			 System.out.println("Alphabet");
		    }
		else
			 System.out.println("No");
	}
}
