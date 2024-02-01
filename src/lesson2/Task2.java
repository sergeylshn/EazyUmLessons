package lesson2;

public class Task2 {
    public static void main(String[] args) {
        //Tryangle
        int a = 7;
        int b = 9;
        int c = 5;

        if (a == b && b == c && c == a) {
            System.out.println("Треугольник равносторонний");
        } else if (a != b && b != c && c != a) {
            System.out.println("Треугольник разносторонний");
        } else {
            System.out.println("Треугольник равнобедренный");
        }
    }
}
