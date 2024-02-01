package lesson6;

import java.util.Scanner;

public class ScannerUtils {

    public static void searchByPrice(String[][] tours){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введи свой бюджет:\n");
        int price = sc.nextInt();
        ToursUtils.printToursByPrice(tours, price);
    }

    public static int chooseFilter(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Вас приветствует турагенство! Меню для выбора находится ниже");
        System.out.println("1 - подобрать тур по стране");
        System.out.println("2 - подобрать тур по бюджету\n");

        return sc.nextInt();
    }
    public static void searchByCountry(String[][] tours){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введи страну для поиска:\n");

        String country = sc.nextLine();
        ToursUtils.printToursByCountry(tours, country);
    }
}
