import java.util.Scanner;
public class Max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number:");
        int a=sc.nextInt();
        System.out.println("Enter 2nd number:");
        int b=sc.nextInt();
        System.out.println("Enter 3rd number:");
        int c=sc.nextInt();
        sc.close();
        if(a>b && a>c){
            System.out.println("a is max");
        }
        else if(b>a && b>c){
            System.out.println("b is max");
        }
        else{
            System.out.println("c is max");
        }

}
}
