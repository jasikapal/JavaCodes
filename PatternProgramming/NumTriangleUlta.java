package PatternProgramming;

import java.util.Scanner;
public class NumTriangleUlta {
    
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        sc.close();

        for (int i = 1; i <= num; i++) {
            for (int j =1; j<=(num+1-i); j++) {
                System.out.print(j );
            }
            System.out.println();
        }
    }
}  

    

