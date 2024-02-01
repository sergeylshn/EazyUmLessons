package lesson10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double[][] numbersForMatrixA = {
                {3, 5, 7, 8},
                {1, 3, 6, 8},
                {2, 4, 6, 8},
                {3, 5, 7, 8}
        };

        double[][] numbersForMatrixB = {
                {1, 2, 5, 8},
                {5, 3, 6, 9},
                {2, 3, 4, 1},
                {3, 5, 7, 8}
        };
        //        System.out.println(a.getRows());
        //        System.out.println(a.getColumns());
        //        System.out.println(a.getValueAt(-1, 10));
        //        System.out.println(a.getValueAt(1, 1));
        //        a.setValueAt(1, 1, 2);
        //        System.out.println(a.getValueAt(1, 1));

        Matrix a = new Matrix(numbersForMatrixA);
        Matrix b = new Matrix(numbersForMatrixB);


        Scanner scanner = new Scanner(System.in);
        String choose = scanner.nextLine();

        switch (choose){
            case "1":
                a.mul(b);
                break;
            case "2":
                System.out.println("Введите значение");
                double number = scanner.nextDouble();
                a.mul(number);

        }



        //Умножение матриц
        Matrix c = (Matrix) a.mul(3);
        System.out.println("РЕЗУЛЬТАТ УМНОЖЕНИЯ ДВУХ МАТРИЦ:\u001B[35m ");
        c.printToConsole();

    }
}
