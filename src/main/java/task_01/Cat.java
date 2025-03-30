package task_01;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age && Objects.equals(color, cat.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, age);
    }
}
