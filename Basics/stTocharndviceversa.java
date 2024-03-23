import java.util.Scanner;

public class StTocharndviceversa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter your option,choose \n 1 for string to char \n 2 for char to string");
        int option = sc.nextInt();
        sc.nextLine();
        switch (option) {
            case 1:
                System.out.println("Enter a string:");
                String sent = sc.nextLine();
                for (int i = 0; i < sent.length(); i++) {
                    System.out.println("string to char=" + sent.charAt(i));
                }
                break;
            case 2:
                System.out.println("enter a char");
                char c = sc.next().charAt(0);
                String st = " " + c;
                System.out.println("char to string=" + st);
                break;
            default:
                System.out.println("option does not exist");
                break;

        }
        sc.close();
    }

}
