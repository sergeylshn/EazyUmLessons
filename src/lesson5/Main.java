package lesson5;

public class Main {
    public static void main(String[] args) {
//        MathUtilis.calculateAreaOfTriangle(10, 1, 1);
//        System.out.println(MathUtilis.calculateAreaOfTriangleReturn(11, 12,13));
/**
 * nameOfHouse - camel case (названия шрифта в java)
 * NAME_OF_HOUSE - scream snake case(шрифт в бд)
 */
//        MathUtilis.fromCamelToScreamSnake("startDate");
        System.out.println("Выберите фигуру");
        System.out.println("1 - треугольник");
        System.out.println("2 - квадрат");
        System.out.println("3 - овал");
        System.out.println("4 - круг");
        System.out.println("5 - трапеция");

        MathUtilis.askFigureAndPrintArea();
    }
}
