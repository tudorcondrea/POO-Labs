package lab2.task1;

public class Complex {
    private int real, imaginary;

    public Complex(int r, int i) {
        this.real = r;
        this.imaginary = i;
    }

    public Complex() {
        this(0, 0);
    }

    public Complex(Complex nr) {
        this.real = nr.real;
        this.imaginary = nr.imaginary;
    }

    public int getImaginary() {
        return imaginary;
    }

    public int getReal() {
        return real;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public void setImaginary(int imaginary) {
        this.imaginary = imaginary;
    }

    public void addWithComplex(Complex adder) {
        this.real += adder.real;
        this.imaginary += adder.imaginary;
    }

    public void showNumber() {
        System.out.println(this.real + "+" + this.imaginary + "i");
    }
}
