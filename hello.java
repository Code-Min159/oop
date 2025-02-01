import java.util.ArrayList;
import java.util.List;

/**
 * my first java program
 */


public class hello {
    public static void main (String[] args){
        System.out.println("物件導向練習!");
        //呼叫父類別
        Animal animal = new Animal("test");
        animal.getNumber();// call private var
        System.out.println(animal.getNumber());
        animal.setNunber(20);// give something to try how to use private var
        System.out.println(animal.setNumberB(2));
        animal.getName();
        System.out.println(animal.getName());

        List<Animal> animalList = new ArrayList<Animal>();
        animalList.add(new Animal("test"));
        animalList.add(new Cat("cat"));
        for(int i = 0; i<=animalList.size(); i++){
            System.out.println("animalList :" + i);
        }



        // call sub1
        Cat cat = new Cat("cat");
        // call sub2
        // give var to sub1
        //return something in sub2
        //call father class to @overwrite



    }
}