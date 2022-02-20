package A;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int y, sum = 0;
        int x;
        int temp;
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y=x;    // y=153
        while (y != 0) {
            temp = y % 10; //y=3
            sum = sum + (temp * temp * temp);    //sum=27
            y = y / 10;

        }
        if (sum == x) {
            System.out.println("given number us armstrong");
        } else {
            System.out.println("Given number is not a armstroing");
        }
    }
}

