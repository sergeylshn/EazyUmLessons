package lesson3;

public class Task2 {
    public static void main(String[] args) {
        //Нужно вывести на консоль только четные числа в обратном порядке
        int[] arr = {1, 4, 5, 78, 4, 1, 8, 56};
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i]);
            }
        }
    }
}
