
import java.util.*;
class VowelENcryption {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String vowel = "aeiou";
        
        char arr[] = new char[10];
        arr[2] = 'a';
        arr[3] = 'e';
        arr[5] = 'i';
        arr[7] = 'o';
        
        
        char ch = 'b';
        for (int i = 1; i < arr.length; i++) {
            if (vowel.indexOf(ch) != -1) { //it isa  vowel
                ch++;
                continue;
            }
            //not a prime
            else if (arr[i] == 0)
                arr[i] = (char) ch++;
        }
        
        
        int temp = n;
        int res = 0;
        
        while (temp != 0) {  //reverse of a number
            res = res * 10 + temp % 10;
            temp = temp / 10;
        }
        int i = 1;
        while (res != 0) {
            System.out.print(arr[res % 10]);
            res = res / 10;
        }
    }

}
