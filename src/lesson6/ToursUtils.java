package lesson6;

public class ToursUtils {
    /**
     * Метод сохраняет тур в переданный массив
     *
     * @param country   страна назначения
     * @param city      город назначения
     * @param transport транспорт
     * @param days      кол-во дней
     * @param price     цена туров
     * @param stars     кол-во звезд
     * @param food      питание
     * @param tours     массив с турами куда мы записываем туры
     */
    public static void addTour(String country, String city, String transport, String days, String price, String stars, String food, String[][] tours) {
        //Ищем первую свободную строчку с помощью цикла for
        for (int i = 0; i < tours.length; i++) {
            if (tours[i][0] == null) {
                tours[i][0] = String.valueOf(i + 1);
                tours[i][1] = country;
                tours[i][2] = city;
                tours[i][3] = transport;
                tours[i][4] = days;
                tours[i][5] = price;
                tours[i][6] = stars;
                tours[i][7] = food;
                break;
            }
        }
    }

    public static void printToursByCountry(String[][] tours, String country) {
        for (String[] tour : tours) {
            if (tour[1] != null && tour[1].equalsIgnoreCase(country)) {
                System.out.printf("""
                        Тур №%s
                         страна: %s
                         город: %s
                         транспорт: %s
                         кол-во дней: %s
                         цена тура: %s руб.
                         кол-во звезд: %s
                         питание: %s""", tour[0], tour[1], tour[2], tour[3], tour[4], tour[5], tour[6], tour[7]);
                System.out.println();
            }
        }
    }
    public static void printToursByPrice(String[][] tours, int price) {
        for (String[] tour : tours) {
            if (tour[5] != null) {

                String stringPrice = tour[5];
                int intPrice = Integer.parseInt(stringPrice);

                if (intPrice <= price) {
                    System.out.printf("""
                            Тур №%s
                             страна: %s
                             город: %s
                             транспорт: %s
                             кол-во дней: %s
                             цена тура: %s руб.
                             кол-во звезд: %s
                             питание: %s""", tour[0], tour[1], tour[2], tour[3], tour[4], tour[5], tour[6], tour[7]);
                    System.out.println();
                }
            }
        }
    }
}
