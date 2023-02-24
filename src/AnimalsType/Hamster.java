package AnimalsType;

import finalTask.Animal;
import finalTask.Command;
import finalTask.Sex;

import java.util.List;

public class Hamster extends Animal {

    private String color;

    public Hamster(String name, int age, Sex sex, List<Command> listCommand, String color) {
        super(name, age, sex, listCommand);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Hamster: name - " + getName() +
                ", age - " + getAge() +
                ", sex - " + getSex() +
                ", color - " + getColor();
    }
}
