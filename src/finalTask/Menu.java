package finalTask;

import AnimalsType.Cat;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.SplittableRandom;

public class Menu {

    List<Cat> catList = new ArrayList<>();
    public void menu(){
        System.out.println("Введите:\n1 - чтобы завести новое животное\n" +
                "2 - чтобы увидеть команды, которые выполняет животное\n" +
                "3 - обучить животное новым командам\n");
        Scanner sc = new Scanner(System.in);
        if(!(sc.hasNextInt())){
            System.out.println("Введите номер команды цифрами");
            menu();
        }else{
            int answer = sc.nextInt();
            switch (answer){
                case 1:
                    addAnimal();
                    break;
                case 2:
                    viewCommands();
                    break;
                case 3:
                    System.out.println("Введите имя питомца - ");
                    String name = sc.nextLine();
                    System.out.println("Введите команду для изучения - ");
                    String command = sc.nextLine();
                    System.out.println("Введите:\n1 - Cat\n2 - Dog\n3 - Hamster\n4 - Horse");
                    String ans = sc.nextLine();
                    if(ans.equals("1")){
                        //TODO
                    }
                    break;
            }
        }
        sc.close();
    }

    public void addAnimal(){
        Counter counter = new Counter();
        counter.add();
    }
    public List<String> viewCommands(){
        //TODO
        return null;
    }
    public void addNewCommand(List<Animal> list, String name, String command){
        for (Animal item: list) {
            if(item.getName().equals(name)){

            }
        }
    }
}
