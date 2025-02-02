import java.util.ArrayList;
import java.util.List;

/**
 * my first java program
 */


public class hello {
    public static void main (String[] args){
        System.out.println("物件導向練習!");

        //this
        Human human1 = new Human();
        human1.printInfo();
        Human human2 = new Human("Ann");
        human2.printInfo();
        Human human3 = new Human("Tina", 30);
        human3.printInfo();
        //super*****
        Person person1 = new Person();
        person1.getInfo();
        Person person2 = new Person(150,40);
        person2.getInfo();
        Person person3 = new Person(180, 75, "orange");
        person3.getInfo();


        //呼叫父類別
        Animal animal = new Animal("test");
        // call sub1
        Cat catA = new Cat("small");
        Cat catB = new Cat();
        //改寫父類別的getName()方法
        System.out.println("catB :" + catB.getName());
        // call sub2
        orangeCat cat2 = new orangeCat();
        orangeCat cat3 = new orangeCat("pink cat");

        //多型，指同一個行為，但有不同的結果*******
        Person person = new Person();
        Dog dog = new Dog();
        Cat cat = new Cat();

        move(person);
        move(dog);
        move(cat);




        // call private var ----OK
        System.out.println("call animal.getNumber() = " +animal.getNumber());

        // give something to try how to use private var
        animal.setNunber(20);

        //call 建構子方法
        List<Animal> animalList = new ArrayList<Animal>();
        animalList.add(new Animal("test"));
        animalList.add(new Cat("outSideCat"));
        for(int i = 0; i<animalList.size(); i++){
            try {
                System.out.println("animalList :" + animalList.get(i));
            } catch (Exception e) {
                //如果用i<=animalList.size();會跑出錯誤，因為List只放2個東西，但i跑到3，超過list的長度
                System.out.println("Exception :" + e.getMessage());
            }
        }
        //父類別的number 可以直接使用不需要透過getter、setter用----OK
        //System.out.println("animal.number1 :" + animal.number);

    }
    //多型
    static void move(Animal ani){ //為什麼這裡用public會出現 non-static method move(Animal) cannot be referenced from a static context 錯誤
                                  //  ->因為main 是 static 方法，在這裡只能使用 static
        ani.move();
    }
}