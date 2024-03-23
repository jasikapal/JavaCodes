package PatternProgramming;
import java.util.Scanner;
public class AlphabetSquare {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        sc.close();
        for (int i = 1; i <= num; i++) {
            char a='A';
            for (int j = 1; j <=num ; j++) {
                System.out.print(a);
                a++;
            }
            System.out.println();
        }
    }
}
