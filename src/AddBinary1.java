import java.util.Scanner;

public class AddBinary1 {
    static String addBinary(String a, String b) {
        int num1 = Integer.parseInt(a, 2);// convert binary to decimal
        int num2 = Integer.parseInt(b, 2);//convert binary to decimal
        int sum = num1 + num2; //perform addition

        String res = Integer.toBinaryString(sum);

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first binary number: ");
        String a = sc.nextLine();
        System.out.println("Enter second binary number: ");
        String b = sc.nextLine();
        System.out.println("Addition is : " + addBinary(a, b));
    }
}
