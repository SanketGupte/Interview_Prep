public class ComplexNumbers {

    int real, imaginary;

    public ComplexNumbers(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public void showC() {
        System.out.println(this.real + " +i" + this.imaginary);
    }

    public static ComplexNumbers sum(ComplexNumbers a, ComplexNumbers b) {
        ComplexNumbers res = new ComplexNumbers(0, 0);
        res.real = a.real + b.real;
        res.imaginary = a.imaginary + b.imaginary;
        return res;
    }

    public static void main(String[] args) {
        ComplexNumbers a = new ComplexNumbers(4, 5);
        ComplexNumbers b = new ComplexNumbers(10, 5);
        System.out.println("First complex number: ");
        a.showC();
        System.out.println("Second complex number: ");
        b.showC();

        ComplexNumbers res = sum(a, b);

        System.out.println("Addition is: ");
        res.showC();
    }
}
