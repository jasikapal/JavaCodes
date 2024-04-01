package OOPsinJava;

public class Employee {
     private String name;
     private String surname;
     private int age;
    public Employee(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
    public void work(){
        System.out.println(name+"is working");
    }
    public void showInfo(){
        System.out.println("name="+name);
        System.out.println("surname"+surname);
        System.out.println("age="+age);
    }

}
