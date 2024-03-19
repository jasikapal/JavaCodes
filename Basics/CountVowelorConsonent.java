import java.util.Scanner;

public class CountVowelorConsonent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        String str = sc.nextLine();
        sc.close();
        int vow = 0;
        int cons = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o'
                    || ch == 'u') {
                vow++;
            } else if (ch != ' ') {
                cons++;
            }

        }
        System.out.println("vowel=" + vow);
        System.out.println("consonent=" + cons);

    }
}
