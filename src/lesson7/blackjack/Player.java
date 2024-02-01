package lesson7.blackjack;

import java.util.ArrayList;
import java.util.Scanner;

public class Player {
    private String userName;
    private ArrayList<Card> hand = new ArrayList<>();

    private boolean canWin = true;

    public boolean isCanWin() {
        return canWin;
    }

    public void setCanWin(boolean canWin) {
        this.canWin = canWin;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void addCardToHand(Card randomCard) {
        hand.add(randomCard);
    }

    public int countValueInHand() {
        int count = 0;
        for (Card card : hand) {
            count += card.getValue();
        }

        return count;
    }

    public boolean yesOrNo() {
        System.out.println();
        System.out.println(userName + ", Ваши карты:");
        openHand();
        System.out.println("Взять карту?");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("Да")) {
            return true;
        }
        return false;
    }

    public void openHand() {
        for (Card card : hand) {
            System.out.println(card);
            System.out.println("----------------------");
        }
        System.out.println("Общее значение: " + countValueInHand());
    }


}
