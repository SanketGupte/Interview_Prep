import java.util.Scanner;

public class OddEvenApproach4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        if(n != 0){
            if(Integer.toBinaryString(n).endsWith("0")){
                System.out.println("Number is even");
            } else {
                System.out.println("Number is odd");
            }
        } else {
            System.out.println("Number is Zero");
        }
    }
}
