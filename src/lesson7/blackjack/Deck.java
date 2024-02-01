package lesson7.blackjack;

import java.util.concurrent.ThreadLocalRandom;

/**
 * класс колоды
 */
public class Deck {
    Card[] cards = new Card[54];
    public void prepare() {
        cards[0] = new Card("Двойка крести", 2);
        cards[1] = new Card("Двойка бубны", 2);
        cards[2] = new Card("Двойка пики", 2);
        cards[3] = new Card("Двойка черви", 2);

        cards[4] = new Card("Тройка крести", 3);
        cards[5] = new Card("Тройка бубны", 3);
        cards[6] = new Card("Тройка пики", 3);
        cards[7] = new Card("Тройка черви", 3);

        cards[8] = new Card("Четверка крести", 4);
        cards[9] = new Card("Четверка бубны", 4);
        cards[10] = new Card("Четверка пики", 4);
        cards[11] = new Card("Четверка черви", 4);

        cards[12] = new Card("Пятерка крести", 5);
        cards[13] = new Card("Пятерка бубны", 5);
        cards[14] = new Card("Пятерка пики", 5);
        cards[15] = new Card("Пятерка черви", 5);

        cards[16] = new Card("Шестерка крести", 6);
        cards[17] = new Card("Шестерка бубны", 6);
        cards[18] = new Card("Шестерка пики", 6);
        cards[19] = new Card("Шестерка черви", 6);

        cards[20] = new Card("Семерка крести", 7);
        cards[21] = new Card("Семерка бубны", 7);
        cards[22] = new Card("Семерка пики", 7);
        cards[23] = new Card("Семерка черви", 7);

        cards[24] = new Card("Восьмерка крести", 8);
        cards[25] = new Card("Восьмерка бубны", 8);
        cards[26] = new Card("Восьмерка пики", 8);
        cards[27] = new Card("Восьмерка черви", 8);

        cards[28] = new Card("Девятка крести", 9);
        cards[29] = new Card("Девятка бубны", 9);
        cards[30] = new Card("Девятка пики", 9);
        cards[31] = new Card("Девятка черви", 9);

        cards[32] = new Card("Десятка крести", 10);
        cards[33] = new Card("Десятка бубны", 10);
        cards[34] = new Card("Десятка пики", 10);
        cards[35] = new Card("Десятка черви", 10);

        cards[36] = new Card("Король крести", 10);
        cards[37] = new Card("Король бубны", 10);
        cards[38] = new Card("Король пики", 10);
        cards[39] = new Card("Король черви", 10);

        cards[40] = new Card("Дама крести", 10);
        cards[41] = new Card("Дама бубны", 10);
        cards[42] = new Card("Дама пики", 10);
        cards[43] = new Card("Дама черви", 10);

        cards[44] = new Card("Валет крести", 10);
        cards[45] = new Card("Валет бубны", 10);
        cards[46] = new Card("Валет пики", 10);
        cards[47] = new Card("Валет черви", 10);

        cards[48] = new Card("Туз крести", 10);
        cards[49] = new Card("Туз бубны", 10);
        cards[50] = new Card("Туз пики", 10);
        cards[52] = new Card("Туз черви", 10);

    }

    /**
     * Метод возвращает рандомную карту
     * @return
     */
    public Card getRandomCard(){
        int randomNum = ThreadLocalRandom.current().nextInt(0, 51 + 1);

        return cards[randomNum];
    }
}
