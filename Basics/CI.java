import java.lang.Math;
import java.util.Scanner;
public class CI {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the principle amount");
        double p=sc.nextDouble();
        System.out.println("enter the rate of interest");
        double r=sc.nextDouble();
        System.out.println("enter the year");
        double t=sc.nextDouble();
        sc.close();
        double amt;
        double ci;
        amt=p*Math.pow((1+r/100),t);
        ci=amt-p;
        System.out.println("compound interest="+ci);

        

    }
}
