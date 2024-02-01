package lesson7.blackjack;

import java.util.ArrayList;

public class Game {
    private Deck deck = new Deck();
    private ArrayList<Player> players = new ArrayList<>();

    public Game(){
        deck.prepare();
    }

    public void addPlayerToGame(Player player){
        players.add(player);
    }
    public void dealCardsToPlayers(){
        for (Player player : players) {
            player.addCardToHand(deck.getRandomCard());
            player.addCardToHand(deck.getRandomCard());
        }
    }

    public void dealRestCards(){
        for (Player player : players) {
            while(player.isCanWin() && player.yesOrNo()){
                player.addCardToHand(deck.getRandomCard());
            }
        }
    }

    public void printWinner(){
        for (Player player : players) {
            if (player.countValueInHand() > 21){
                player.setCanWin(false);
            }
        }

        if(countPlayersWhoCanWin() == 0) {
            for (Player player : players) {
              if(player instanceof Diller){
                  System.out.println("Выиграл " + player.getUserName());
                  player.openHand();
                  return;
              }
            }
        }

        int winnerValue = 0;
        for (Player player : players) {
            if (player.isCanWin() && player.countValueInHand() > winnerValue){
                winnerValue = player.countValueInHand();
            }
        }
        for (Player player : players) {
            if (player.countValueInHand() == winnerValue){
                System.out.println("Выиграл " + player.getUserName());
                player.openHand();
            }
        }
    }

    public int countPlayersWhoCanWin(){
        int count = 0;
        for (Player player : players) {
            if (player.isCanWin()){
            count++;
            }
        }
        return count;
    }
}
