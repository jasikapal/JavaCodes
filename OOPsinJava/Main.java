package OOPsinJava;

public class Main {
    public static void main(String[] args) {
       Account account=new Account("jasika","pal","jasikapal@gmail.com",20000,112233,987967688);
        System.out.println(account.getName());
        account.takeMoney(500 );
       
    }
}
