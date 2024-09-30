package recurssion;

public class karatSubaAlgo2 {

	public static void main(String[] args) {
	    long x = 146123;
	    long y = 352120;

	    long product = karatsuba(x, y);

	    System.out.println("Product of " + x + " and " + y + " is " + product);
	
	}


public static long karatsuba(long x, long y) {
    int n = Math.max(Long.toString(x).length(), Long.toString(y).length());
    if (n < 2) {
        return x * y;
    }
    n = (n + 1) / 2;

    long a = x / (long) Math.pow(10, n);
    long b = x % (long) Math.pow(10, n);
    long c = y / (long) Math.pow(10, n);
    long d = y % (long) Math.pow(10, n);

    long ac = karatsuba(a, c);
    long bd = karatsuba(b, d);
    long abcd = karatsuba(a + b, c + d);

    return (long) (ac * Math.pow(10, 2 * n) + (abcd - ac - bd) * Math.pow(10, n) + bd);
}
}