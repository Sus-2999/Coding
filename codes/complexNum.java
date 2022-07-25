import java.lang.Math;

class Complex {
    double real;
    double imaginary;

    Complex(double r, double i) {
        this.real = r;
        this.imaginary = i;
    }

    void display() {
        System.out.printf("%+.2f%+.2fi\n", this.real,this.imaginary);
    }

    void divide(Complex c1, Complex c2) {
        Complex result = new Complex(0.0, 0.0);
        result.real = ((c1.real * c2.real) + (c1.imaginary * c2.imaginary))/(Math.pow((c1.real),2.0) + Math.pow((c2.real),2.0));
        result.imaginary = ((c1.real * c2.imaginary) - (c2.real * c1.imaginary))/(Math.pow((c1.real), 2.0) + Math.pow((c2.real), 2.0));
        System.out.printf("Result = %+.2f%+.2fi\n",result.real,result.imaginary);
    }
}

public class complexNum {
    public static void main(String[] args) {
        Complex n1 = new Complex(2.65, -4.01);
        n1.display();
        Complex n2 = new Complex(-0.68, 2.99);
        n2.display();

        //Creating an empty "result" object
        Complex res = new Complex(0.0, 0.0);

        //Passing objects as arguments
        res.divide(n1, n2);
    }    
}