public class Animal {

    //父類別
    private int number = 10; //inside only if want to use,use getter and setter method
    public String name;
    protected int number1 = 100;

    //建構子
    public Animal(String name) {
        setName(name);
    }

    //how to use if var is private
    public int getNumber() {
        return number;
    }

    public void setNunber(int input) {
        number = input;
        System.out.println("setNunber inside = " + number);
    }

    public int setNumberB(int input) {
        return number + input;
    }

    //設定建構子的使用方法
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
