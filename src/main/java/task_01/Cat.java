package task_01;

public class Cat {

    private String color;
    private int age;

    public Cat(String color, int age) {
        this.color = color;
        this.age = age;
    }

    public String getColor() {
        return this.color;
    }

    public int getAge() {
        return this.age;
    }

    public String toString() {
        return "Cat{color='" + this.color + "', age=" + this.age + "}";
    }
}
