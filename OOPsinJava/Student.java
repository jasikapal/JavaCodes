package OOPsinJava;

public class Student {
    // Creatin a new data type with multiple attribute
    public static class Student1{
        String name;
        double percentage;
        int roll;
    }
    public static void main(String[] args) {
        Student1 x = new Student1(); //declaration
        x.name="jasika";              /*initialization */
        x.percentage=67.9;              /*initialization */
        x.roll=10;                       /*initialization */
        System.out.println(x.name);
    }
}
