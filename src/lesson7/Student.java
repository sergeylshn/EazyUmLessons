package lesson7;

public class Student {
    /**
     * 1- переменные / поля класса / свойства
     */
    private int age;
    private String fullName;
    private String address;
    private String phoneNumber;

    public Student() {

    }

    public Student(String fullName, int age) {
        this.age = age;
        this.fullName = fullName;
    }

    /**
     * метод который позволяет задать возраст (getter)
     * this - age из этого класса
     *
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * метод который позволяет получить возраст (setter)
     *
     * @return
     */
    public int getAge() {
        return this.age;
    }
}
