package lesson2;

public class Task4 {
    //напечатать числа от 30 до 300, кратные 3 и 5
    public static void main(String[] args) {
        for (int i = 30; i < 300; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
            }
        }
    }

}
