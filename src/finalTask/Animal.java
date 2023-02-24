package finalTask;

import java.util.List;

public abstract class Animal {
    private String name;
    private int age;
    private Sex sex;

    private List<Command> listCommand;


//    public Animal (){}

    public Animal (String name, int age, Sex sex, List<Command> listCommand){
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.listCommand = listCommand;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public String getListCommand() {
        return listCommand.toString();
    }
    public void setListCommand(List<Command> listCommand) {
        this.listCommand = listCommand;
    }

}
