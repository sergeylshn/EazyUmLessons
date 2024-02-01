package lesson2;

public class Task5 {
    //Сколько денег м вынесесм из банка, если у нас уже есть 10 млн и мы будем 15 дней печатать деньги,
    // так , что сумма удет увеличиваться по 13% в день
    public static void main(String[] args) {
        double money = 10000000;


        for (int days = 0; days < 15; days++) {
            money += money * 0.13;
        }
        System.out.println(money);
    }
}
