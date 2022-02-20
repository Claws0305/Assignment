package A;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        x = sc.nextInt();
        int Factorial = 1;
        for (int i = 1;i <= x; i++){
            Factorial = Factorial*i;
        }
        System.out.println("Factorial = " + Factorial);
    }
}
