package AnimalsType;

import finalTask.Animal;
import finalTask.Command;
import finalTask.Sex;

import java.util.List;

public class Horse extends Animal {

    private String breed;
    private String color;

    public Horse(String name, int age, Sex sex, List<Command> listCommand, String breed, String color) {
        super(name, age, sex, listCommand);
        this.breed = breed;
        this.color = color;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Horse: name - " + getName() +
                ", age - " + getAge() +
                ", sex - " + getSex() +
                ", breed - " + getBreed() +
                ", color - " + getColor();
    }
}
