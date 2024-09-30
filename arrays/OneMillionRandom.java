package arrays;

import java.util.Random;

public class OneMillionRandom {
	public static void main(String[] args) {
        int numberOfNumbers = 1000000;
        int numberOfDigits = 7;
        Random random = new Random();
        for (int i = 0; i < numberOfNumbers; i++) {
            int number = random.nextInt((int) Math.pow(10, numberOfDigits));
            System.out.println(number);
        }
    }
}
