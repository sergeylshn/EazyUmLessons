package lesson3;

public class Task1 {
    //Массивы
    public static void main(String[] args) {
        int[] numbers = new int[6];
        numbers[0] = 1;
        numbers[3] = 3;
        int[] numbers2 = {1, 2, 3, 4, 5, 6};
        for (int i = 0; i < numbers2.length; i++){
            System.out.println(numbers2[i]);
        }
        System.out.println(numbers2.length);

    }
}
