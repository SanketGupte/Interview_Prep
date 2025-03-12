import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BiggestOfThreeApproach3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("Enter third number: ");
        int c = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        list.add(a);
        list.add(b);
        list.add(c);

        System.out.println("Largest: " + Collections.max(list));
    }
}
