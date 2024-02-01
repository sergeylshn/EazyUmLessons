package lesson3;

public class Task3 {
    //Есть два массива, одним циклом сделать из них общий массив
    public static void main(String[] args) {

        char[] array1 = {'a', 'b', 'c', 'd'};
        char[] array2 = {'q', 'w', 'e', 'r'};
        char[] sumArray = new char[array1.length + array2.length];

        for (int i = 0; i < sumArray.length; i++) {
            if (i < array1.length) {
                sumArray[i] = array1[i];
            } else {
                sumArray[i] = array2[i - array1.length];
            }
            System.out.println(sumArray[i]);
        }

    }
}
