package AnimalsType;

import finalTask.Animal;
import finalTask.Command;
import finalTask.Sex;

import java.util.List;

public class Dog extends Animal {
    private String breed;

    public Dog(String name, int age, Sex sex, List<Command> listCommand, String breed) {
        super(name, age, sex, listCommand);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Dog: name - " + getName() + ", age - " + getAge() + ", sex - " + getSex() + ", breed - " + getBreed();
    }
}
