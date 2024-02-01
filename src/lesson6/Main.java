package lesson6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[][] tours = new String[100][10]; // База данных туров

        //Напоняем БД турами
        ToursUtils.addTour("Италия", "Рим", "Самолет", "6", "140000", "5", "завтрак", tours);
        ToursUtils.addTour("Греция", "Афины", "Самолет", "6", "120000", "4", "все включено", tours);
        ToursUtils.addTour("Чехия", "Прага", "Автобус", "3", "50000", "5", "завтрак", tours);
        ToursUtils.addTour("Германия", "Мюнхен", "Самолет", "10", "250000", "5", "завтрак и обед", tours);
        ToursUtils.addTour("Россия", "Москва", "Самолет", "15", "250000", "4", "все включено", tours);
        ToursUtils.addTour("Россия", "Москва", "Самолет", "15", "200000", "4", "все включено", tours);
        ToursUtils.addTour("Германия", "Нюрнберг", "Самолет", "7", "100000", "4", "все включено", tours);
        ToursUtils.addTour("Италия", "Милан", "Самолет", "10", "120000", "5", "завтрак", tours);

        int choose = ScannerUtils.chooseFilter();
        if (choose == 1) {
            ScannerUtils.searchByCountry(tours);
        } else if (choose == 2) {
            ScannerUtils.searchByPrice(tours);
        }
    }

}
