package lesson7.blackjack;

import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player();
        Player player2 = new Player();
        Player player3 = new Player();
        Diller diller = new Diller();

        player1.setUserName("Ричард");
        player2.setUserName("Зина");
        player3.setUserName("Антон");
        diller.setUserName("Диллер");

        Game blackJack = new Game();

        blackJack.addPlayerToGame(player1);
        blackJack.addPlayerToGame(player2);
        blackJack.addPlayerToGame(player3);
        blackJack.addPlayerToGame(diller);

        blackJack.dealCardsToPlayers();
        blackJack.dealRestCards();
        blackJack.printWinner();
    }

}
