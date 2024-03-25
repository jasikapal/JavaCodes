package PatternProgramming;

import java.util.Scanner;

public class StarCross {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        sc.close();
        if (num % 2 != 0) {
            for (int i = 1; i <= num; i++) {
                for (int j = 1; j <= num; j++) {
                    if (i == j || i + j == num + 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}
