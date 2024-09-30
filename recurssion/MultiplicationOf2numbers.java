package recurssion;

import java.math.BigInteger;

public class MultiplicationOf2numbers {
	public static void main(String[] args) {
	    BigInteger x = new BigInteger("3141592653589793238462643383279502884197169399375105820974944592");
	    BigInteger y = new BigInteger("2718281828459045235360287471352662497757247093699959574966967627");

	    BigInteger product = karatsuba(x, y);

	    System.out.println("Product of " + x + " and " + y + " is " + product);
	}
//O(n^log2(3)), which is also more efficient than the traditional algorithm, which has a space complexity of O(n^2).

	public static BigInteger karatsuba(BigInteger x, BigInteger y) {
	    int n = Math.max(x.toString().length(), y.toString().length());
	    if (n < 2) {
	        return x.multiply(y);
	    }
	    n = (n + 1) / 2;

	    BigInteger a = x.divide(BigInteger.TEN.pow(n));//left
	    BigInteger b = x.mod(BigInteger.TEN.pow(n));//right
	    BigInteger c = y.divide(BigInteger.TEN.pow(n));
	    BigInteger d = y.mod(BigInteger.TEN.pow(n));

	    BigInteger ac = karatsuba(a, c);
	    BigInteger bd = karatsuba(b, d);
	    BigInteger abcd = karatsuba(a.add(b), c.add(d));

	    return ac.multiply(BigInteger.TEN.pow(2 * n))
	            .add(abcd.subtract(ac).subtract(bd).multiply(BigInteger.TEN.pow(n)))
	            .add(bd);
	}

	
}
