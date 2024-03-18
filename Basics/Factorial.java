import java.util.Scanner;
public class Factorial {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number:");
    int a=sc.nextInt();
    int p =1;
    for(int i=1;i<=a;i++){
        p=p*i;
    }
    System.out.println(p);
}
}
