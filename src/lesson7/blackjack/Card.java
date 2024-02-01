package lesson7.blackjack;

import java.util.Objects;

public class Card {
    private String mast;
    private int value;

    /**
     * Конструктор для создания экземпляра класса без параметров
     */
    public Card(){

    }

    /**
     * Конструктор для создания экземпляра класса
     * @param mast
     * @param value
     */
    public Card(String mast, int value){
        this.mast = mast;
        this.value = value;
    }

    public String getMast() {
        return mast;
    }

    public void setMast(String mast) {
        this.mast = mast;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return value == card.value && Objects.equals(mast, card.mast);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mast, value);
    }

    @Override
    public String toString() {
        return  "Карта\n " + mast +
                ", Значение " + value;
    }
}
