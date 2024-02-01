package saper;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Выберите уровень игры:");
        System.out.println("1 - Новичок");
        System.out.println("2 - Любитель");
        System.out.println("3 - Профессионал");
        System.out.println("4 - Особый");

        Scanner scanner = new Scanner(System.in);
        String level = scanner.nextLine(); // Считываем "1" или "Новичок"

        SaperField saperField = new SaperField(level);
        saperField.toMinIt();
        saperField.addRandomMines();
        saperField.printField();
        while (saperField.doStep()) {
            saperField.printField();
        }
        System.out.println();
    }
}
