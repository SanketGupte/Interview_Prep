import java.util.Scanner;

public class BiggestOfThreeApproach1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first numbers: ");
        int a = sc.nextInt();

        System.out.println("Enter second numbers: ");
        int b = sc.nextInt();

        System.out.println("Enter third numbers: ");
        int c = sc.nextInt();

        System.out.println("Largest: " + (c>(a>b?a:b)?c:((a>b)?a:b)));
    }
}
