import java.util.Scanner;

/*
* Swap numbers without using third variables
*/
public class SwapNumbers {
    static void swapNumbers(int a, int b) {
         a = a - b;
         b = a + b;
         a = b - a;
        System.out.println("After swap numbers: " + a + ", " + b);
    }

    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        a = sc.nextInt();

        System.out.println("Enter the second number: ");
        b = sc.nextInt();

        a = a - b;
        b = a + b;
        a = b - a;
        System.out.println("After swap numbers: " + a + ", " + b);

//        swapNumbers(a, b);

    }
}
