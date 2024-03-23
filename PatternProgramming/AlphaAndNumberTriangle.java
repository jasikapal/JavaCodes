package PatternProgramming;

import java.util.Scanner;

public class AlphaAndNumberTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        sc.close();
        for (int i = 1; i <= num; i++) {
            char a='A';
            int b=1;
            for (int j = 1; j <= i; j++) {
                if(i%2==0){
                    System.out.print(a);
                    a++;
                }
                else
                {
                    System.out.print(b);
                    b++;
                }
            }
            System.out.println();
        }
    }
}
