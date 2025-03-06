import java.util.Scanner;

public class OddEvenApproach2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        //Bitwise Or
        if((n | 1) > n){
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
    }
}
