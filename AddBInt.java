package bigintdemo;

import java.math.BigInteger;

public class AddBInt {

	static BigInteger cal2(String a, String b)
    {
        
        BigInteger bg = new BigInteger(a);
        BigInteger bg2 = new BigInteger(b);
        BigInteger b3 = new BigInteger("1");
        
        b3 = bg.add(bg2);
        return b3;
    }
    
	static BigInteger cal3(String a, String b)
    { 
        BigInteger bg = new BigInteger(a);
        BigInteger bg2 = new BigInteger(b);
        BigInteger b3 = new BigInteger("1");
        
        b3 = bg.multiply(bg2);
        return b3;
    }
}
