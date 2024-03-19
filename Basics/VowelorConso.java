import java.util.Scanner;

public class VowelorConso {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter an alphabet:");
    char c = sc.next().charAt(0);
    sc.close();

    if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'||c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
      System.out.println("vowel");
    } else {
      System.out.println("consonent");
    }

  }
}