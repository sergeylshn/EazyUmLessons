package lesson8;

public class Main {
    public static void main(String[] args) {
        Student richard = new Student(30 , "Ричард Сапогов");
        System.out.println(richard.getName());

        Object object = new Object();
        System.out.println(richard.toString());
    }


}
