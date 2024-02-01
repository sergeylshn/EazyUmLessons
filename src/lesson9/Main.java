package lesson9;

public class Main {
    public static void main(String[] args) {
        Tiger tiger1 = new Tiger();
        Tiger tiger2 = new Tiger();

        Monkey monkey1 = new Monkey();
        Monkey monkey2 = new Monkey();

        Animal[] animals = new Animal[4];
        animals[0] = tiger1;
        animals[1] = tiger2;
        animals[2] = monkey1;
        animals[3] = monkey2;

        for (Animal animal : animals) {
            animal.voice();
        }
    }
}
