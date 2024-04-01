package OOPsinJava;

public class Account {
    private String name;
    private String surname;
    private String email;
    private int balance;
    private int accountNo;
    private int tel;
    public Account(){

    }
    public void putMoney(int money){
        balance=balance+money;
        System.out.println("your new balance="+balance);

    }
    public void takeMoney(int money){
        balance=balance-money;
        System.out.println("your new balance="+balance);

    }
    public Account(String name,String surname,String email,int balance,int accountNo,int tel)
    {
        this.tel=tel;
        this.accountNo=accountNo;
        this.balance=balance;
        this.email=email;
        this.name=name;
        this.surname=surname;
    }
    public int getBalance(){
        return balance;
    }
    public void setBalance(int balance){
        this.balance=balance;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getSurname(){
        return surname;
    }
    public void setSurname(String surname){
        this.surname=surname;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }
    public void setTel(int tel) {
        this.tel = tel;
    }
    public int AccountNo(){
        return accountNo;
    }
    public int tel(){
        return tel;
    }

}
