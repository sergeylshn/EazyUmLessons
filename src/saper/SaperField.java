package saper;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class SaperField {

    int[][] fieldOfMines; // оставляем данное поле пустым, т.к неизвестен уровень сложности

    int countOfMines = 0;

    private boolean[][] fieldToOpen;

    private int countClosedCellsToWin = 0; // количество открытых ячеек для победы

    public SaperField(String level) {
        if (level.equals("1") || level.equalsIgnoreCase("Новичок")) {
            fieldOfMines = new int[9 + 2][9 + 2];
            fieldToOpen = new boolean[9 + 2][9 + 2];
            countOfMines = 10;
            countClosedCellsToWin = 9 * 9 - countOfMines;

        } else if (level.equals("2") || level.equalsIgnoreCase("Любитель")) {
            fieldOfMines = new int[16 + 2][16 + 2];
            fieldToOpen = new boolean[16 + 2][16 + 2];
            countOfMines = 40;
            countClosedCellsToWin = 16 * 16 - countOfMines;

        } else if (level.equals("3") || level.equalsIgnoreCase("Профессионал")) {
            fieldOfMines = new int[16 + 2][32 + 2];
            fieldToOpen = new boolean[16 + 2][16 + 2];
            countOfMines = 99;
            countClosedCellsToWin = 16 * 32 - countOfMines;

        } else if (level.equals("4") || level.equalsIgnoreCase("Особый")) {
            System.out.println("Введите кол-во строк:");
            Scanner scanner = new Scanner(System.in);

            int rows = scanner.nextInt();
            System.out.println("Введите кол-во cтолбцов:");
            int columns = scanner.nextInt();
            System.out.println("Введите кол-во мин");
            countOfMines = scanner.nextInt();
            countClosedCellsToWin = rows * columns - countOfMines;
            fieldOfMines = new int[rows + 2][columns + 2];
            fieldToOpen = new boolean[rows + 2][columns + 2];
        }
    }

    public void toMinIt() {
        for (int i = 0; i < countOfMines; i++) {
            int rows = ThreadLocalRandom.current().nextInt(1, fieldOfMines.length - 2);
            int column = ThreadLocalRandom.current().nextInt(1, fieldOfMines[0].length - 2);
            if (fieldOfMines[rows][column] == -1) {
                i--;
            } else {
                fieldOfMines[rows][column] = -1;
            }
        }
    }

    public void addRandomMines() {
        for (int i = 0; i < fieldOfMines.length; i++) {
            for (int j = 0; j < fieldOfMines[i].length; j++) {
                // заполняем всех соседей +1 к числу, если в клетке мина
                if (fieldOfMines[i][j] == -1) {
                    if (fieldOfMines[i - 1][j - 1] != -1) {
                        fieldOfMines[i - 1][j - 1] = fieldOfMines[i - 1][j - 1] + 1;
                    }
                    if (fieldOfMines[i - 1][j] != -1) {
                        fieldOfMines[i - 1][j] = fieldOfMines[i - 1][j] + 1;
                    }
                    if (fieldOfMines[i - 1][j + 1] != -1) {
                        fieldOfMines[i - 1][j + 1] = fieldOfMines[i - 1][j + 1] + 1;
                    }
                    if (fieldOfMines[i + 1][j + 1] != -1) {
                        fieldOfMines[i + 1][j + 1] = fieldOfMines[i + 1][j + 1] + 1;
                    }
                    if (fieldOfMines[i][j - 1] != -1) {
                        fieldOfMines[i][j - 1] = fieldOfMines[i][j - 1] + 1;
                    }
                    if (fieldOfMines[i + 1][j] != -1) {
                        fieldOfMines[i + 1][j] = fieldOfMines[i + 1][j] + 1;
                    }
                    if (fieldOfMines[i][j + 1] != -1) {
                        fieldOfMines[i][j + 1] = fieldOfMines[i][j + 1] + 1;
                    }
                    if (fieldOfMines[i + 1][j - 1] != -1) {
                        fieldOfMines[i + 1][j - 1] = fieldOfMines[i + 1][j - 1] + 1;
                    }


                }
            }

        }
    }

    public void printField() {
        System.out.println("------------ Ваше поле: ------------");
        for (int i = 1; i < fieldOfMines.length - 1; i++) { //обходим первую и последнюю строчку
            for (int j = 1; j < fieldOfMines[0].length - 1; j++) { //обходим первую и последнюю колонку
                if (fieldToOpen[i][j]) {//если ячейка открыта
                    System.out.print(fieldOfMines[i][j] + "  ");
                } else {
                    System.out.print("X" + "  ");
                }
            }
            System.out.println();
        }
    }

    public boolean doStep() {
        if (countClosedCellsToWin == this.countClosedCells()) {
            System.out.println("----- ВЫ ВЫИГРАЛИ -----");
            this.printFieldEndGame();
            return false;
        }


        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите строку: ");
        int row = scanner.nextInt();

        System.out.println("Выберите колонку: ");
        int column = scanner.nextInt();

        if (row <= 0 || row > fieldOfMines.length - 1 || column <= 0 || column > fieldOfMines[0].length - 1) {
            System.out.println("Вы ввели некорректные индексы! Повторите ввод.");
            this.doStep(); // Рекурсия - метод вызывает себя самого внутри себя при выполнении определенных условий

        }
        if (fieldToOpen[row][column]) {
            System.out.println("Вы уже ранее открыли эту ячейку");
            this.doStep();
        }

        // Пользователь ввел верные координаты
        if (fieldOfMines[row][column] == -1) {
            System.out.println("Вы проиграли!");
            this.printFieldEndGame();
            return false;
        } else {
            fieldToOpen[row][column] = true;
            return true;
        }
    }

    private int countClosedCells() {
        int count = 0;
        for (int i = 1; i < fieldToOpen.length - 1; i++) {
            for (int j = 1; j < fieldToOpen[0].length - 1; j++) {
                if (fieldToOpen[i][j]) {
                    count++;
                }
            }
        }
        return count;
    }

    private void printFieldEndGame() {
        System.out.println("------------ Ваше поле: ------------");
        for (int i = 1; i < fieldOfMines.length - 1; i++) { //обходим первую и последнюю строчку
            for (int j = 1; j < fieldOfMines[0].length - 1; j++) { //обходим первую и последнюю колонку
                if (fieldToOpen[i][j] || fieldOfMines[i][j] == -1) {//если ячейка открыта
                    System.out.print(fieldOfMines[i][j] + "  ");
                } else {
                    System.out.print("X" + "  ");
                }
            }
            System.out.println();
        }
    }

}


