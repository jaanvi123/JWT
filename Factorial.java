
package bigintdemo;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {
	
	static BigInteger cal(int n)
	{
		BigInteger bi = new BigInteger("1");
		
		for(int i = 2; i<=n; i++ )
		{
			bi = bi.multiply(BigInteger.valueOf(i));
		}
		
		return bi;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter the integer value:");
		int n = sobj.nextInt();
		
		System.out.println("Factorial: "+cal(n));

	}

}
