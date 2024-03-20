import java.util.Scanner;
public class Powerofnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int a=sc.nextInt();
        System.out.println("Enter the power:");
        int p=sc.nextInt();
        sc.close();
        int res=1;
        for(int i=1;i<=p;i++){
            res=res*a;

        }System.out.println(res);
    }
    
}
                              