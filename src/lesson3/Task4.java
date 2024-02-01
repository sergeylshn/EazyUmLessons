package lesson3;

public class Task4 {
    //Есть массив чисел, если ячейка кратная 3 то вывести соседа справа
    public static void main(String[] args) {
        int[] numbers = {45, 43, 3, 2, 7, 3, 4, 5, 6, 7, 9, 4};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 3 == 0 && i < numbers.length - 1) {
                System.out.println(numbers[i + 1]);
            }
        }
    }
}
