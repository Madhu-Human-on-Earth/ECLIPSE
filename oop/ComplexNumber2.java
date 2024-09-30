package oop;

import java.util.Scanner;

public class ComplexNumber2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r1 = sc.nextInt();
        int i1 = sc.nextInt();
        int r2 = sc.nextInt();
        int i2 = sc.nextInt();
        int choice = sc.nextInt();
       
        ComplexNumber4 c1 = new ComplexNumber4(r1, i1);
        ComplexNumber4 c2 = new ComplexNumber4(r2, i2);
       
        if (choice == 1) {
            c1.plus(c2);
            c1.print();
           // c2.print();
        } else if (choice == 2) {
            c1.multiply(c2);
            c1.print();
            //c2.print();
        }
    }
}

class ComplexNumber4 {
    private int real;
    private int imaginary;
    
    public ComplexNumber4(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    
    public void plus(ComplexNumber4 other) {
        this.real += other.real;
        this.imaginary += other.imaginary;
    }
    
    public void multiply(ComplexNumber4 other) {
        int newReal = this.real * other.real - this.imaginary * other.imaginary;
        int newImaginary = this.real * other.imaginary + this.imaginary * other.real;
        this.real = newReal;
        this.imaginary = newImaginary;
    }
    
    public void print() {
        System.out.println(real + " + i" + imaginary);
    }
}
