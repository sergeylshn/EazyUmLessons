package lesson7.blackjack;

public class Diller extends Player{
    @Override
    public boolean yesOrNo() {
        if (countValueInHand() < 17){
            return true;
        }
        return false   ;
    }
}
