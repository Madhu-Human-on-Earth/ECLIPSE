package Cegg;
import java.util.Objects;

public class Complex implements Cloneable, Comparable<Complex> {
    private double a;
    private double b;

    public Complex(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Complex(double a) {
        this(a, 0);
    }

    public Complex() {
        this(0, 0);
    }

    public Complex add(Complex c2) {
        double aSum = a + c2.a;
        double bSum = b + c2.b;
        return new Complex(aSum, bSum);
    }

    public Complex subtract(Complex c2) {
        double aSub = a - c2.a;
        double bSub = b - c2.b;
        return new Complex(aSub, bSub);
    }

    public Complex multiply(Complex c2) {
        double aMul = (a * c2.a - b * c2.b);
        double bMul = (b * c2.a + a * c2.b);
        return new Complex(aMul, bMul);
    }

    public Complex divide(Complex c2) {
        double div = c2.a * c2.a + c2.b * c2.b;
        double aDiv = (a * c2.a + b * c2.b) / div;
        double bDiv = (b * c2.a - a * c2.b) / div;
        return new Complex(aDiv, bDiv);
    }

    public double abs() {
        return Math.sqrt(a * a + b * b);
    }

    public double getRealPart() {
        return a;
    }

    public double getImaginaryPart() {
        return b;
    }

    @Override
    protected Object clone() {
        return new Complex(a, b);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Complex complex = (Complex) obj;
        return Double.compare(complex.a, a) == 0 &&
                Double.compare(complex.b, b) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }

    @Override
    public int compareTo(Complex o) {
        return Double.compare(this.abs(), o.abs());
    }

    @Override
    public String toString() {
        if (b != 0) {
            return a + " + " + b + "i";
        } else {
            return Double.toString(a);
        }
    }
}

