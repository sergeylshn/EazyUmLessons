package lesson5;

import javax.swing.*;
import java.util.Scanner;

public class MathUtilis {
    /**
     * Создание метода
     * 1 - модификатор доступа (слово определяющее область видимости)
     * public - доступен внутри всего проекта
     * protected - доступен только внутри текущей папки и наследникам текущего класса
     * -------(package) - доступен только внутри текущей папки
     * private - доступен только внутри текущего класса
     * <p>
     * Где можно ставить модификатор доступа:
     * - перед классом
     * - перед методом (там где создаете метод)
     * <p>
     * 2 - static (может быть или нет)
     * 3 - указываем возвращаем тип(или слово void, если ничего не возвращает)
     * 4 - название метода
     * 5 - входящие параметры (Всегда в () через , и с указанием типа и названия переменной
     * 6 - тело выполнения данного метода
     */


    public static void calculateAreaOfCircle(int r) {
        System.out.println("Площадь круга = " + Math.PI * Math.pow(r, 2));
    }

    public static void calculateAreaOfTrapezoid(int a, int b, int h) {
        System.out.println("Площадь трапеции = " + (0.5 * h * (a + b)));
    }

    public static void calculateAreaOfEllipce(int a, int b) {
        System.out.println("Площадь овала = " + Math.PI * a * b);
    }

    public static void calculateAreaOfSquare(int a) {
        System.out.println("Площадь квадрата = " + Math.pow(a, 2));
    }

    public static void calculateAreaOfTriangle(int a, int b, int c) {
        double area = (a + b + c) / 2.0;
        System.out.println("Площадь треугольника = " + Math.sqrt(area * (area - a) * (area - b) * (area - c)));
    }

//    public static double calculateAreaOfTriangleReturn(int a, int b, int c) {
//        double area = (a + b + c) / 2.0;
//        double result = Math.sqrt(area * (area - a) * (area - b) * (area - c));
//        return result;
//    }

    //Метод печатает на консоль площадь фигуры на выбор
    public static void askFigureAndPrintArea() {

        Scanner scanner = new Scanner(System.in);
        String choose = scanner.nextLine();

        switch (choose) {
            case "1", "треугольник" -> {
                System.out.println("Введите сторону а:");
                int a = scanner.nextInt();
                System.out.println("Введите сторону b:");
                int b = scanner.nextInt();
                System.out.println("Введите сторону c:");
                int c = scanner.nextInt();
                calculateAreaOfTriangle(a, b, c);
            }
            case "2", "квадрат" -> {
                System.out.println("Введите сторону квадрата:");
                int a = scanner.nextInt();
                calculateAreaOfSquare(a);
            }
            case "3", "овал", "эллипс" -> {
                System.out.println("Введите полуось а:");
                int a = scanner.nextInt();
                System.out.println("Введите полуось b:");
                int b = scanner.nextInt();
                calculateAreaOfEllipce(a, b);
            }
            case "4", "круг" -> {
                System.out.println("Введите радиус круга:");
                int a = scanner.nextInt();
                calculateAreaOfCircle(a);
            }
            case "5", "трапеция" -> {
                System.out.println("Введите основание трапеции a:");
                int a = scanner.nextInt();
                System.out.println("Введите основание трапеции b:");
                int b = scanner.nextInt();
                System.out.println("Введите высоту трапеции h:");
                int h = scanner.nextInt();
                calculateAreaOfTrapezoid(a, b, h);
            }
            default -> JOptionPane.showMessageDialog(null, "Вы ввели некорректное значение! Попробуйте заново.");
        }


        /**
         * метод котвертирующий из Camel Case в Snake Cream Case
         */
//        public static void fromCamelToScreamSnake (String text){
//            char[] chars = text.toCharArray();
//
//            //Одно и то же
////        for (int i = 0; i < chars.length; i++) {
////            chars[i] = '1';
////        }
//            StringBuilder stringBuilder = new StringBuilder();
//            for (char currentChar : chars) {//Особый цикл(тип данных, элемент массива, из какого массива берем значения)
//                if (Character.isUpperCase(currentChar) == true) { //Смотрим большая или маленькая буква
//                    stringBuilder.append("_" + currentChar);
//                } else {
//                    stringBuilder.append(Character.toUpperCase(currentChar));
//                }
//            }
//            System.out.println(stringBuilder);
//        }
    }
}
