//public class change3df {
//
//    public static void main(String[] args) {
//        int a = 1234566;
//
//        int r = a % 1000;
//        int fd = a / 1000;
//
//        String result = Integer.toString(r) + Integer.toString(fd);
//
//        System.out.println(result);
//    }
//}
import java.math.*;
public class change3df {

    public static void main(String[] args) {
        int a = 1234566;
        //lAST 3 DIGITS 
        int numDigits = (int)Math.log10(a) + 1;
        System.out.println(numDigits);
        //last 3 digits
        int divisor = (int)Math.pow(10, numDigits-4);
        System.out.println(divisor);
        int fd = a / divisor;
        System.out.println(fd);
        int r = a % 1000;
        System.out.println(r);
        int divisors = (int)Math.pow(10, numDigits-3);
        int result = r * divisors + fd;
        
        System.out.println(result);
    }
}
