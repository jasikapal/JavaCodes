import java.util.Scanner;
public class SI {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the principle amount");
        double p=sc.nextDouble();
        System.out.println("enter the rate of interest");
        double r=sc.nextDouble();
        System.out.println("enter the year");
        double t=sc.nextDouble();
        sc.close();
        double si;
        si=(p*r*t)/100;
        System.out.println("simple interest="+si);
    }
}
