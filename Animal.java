public class Animal {
    //父類別
    //控制修飾子: 4種 private(只有自己可以用，需要透過get、set取用，繼承後不給用)
    //              <default(預設值，不同套件不給用)<protected(不需要透過get、set取用，繼承後的套件漢子類別可以用)
    //              <public(全部都可以用)
    public String name = "animal";
    public int height;
    public int witght;
    public int age;
    int totlePeople = 0;


    public void move(){
        System.out.println("move///");

    }

    protected int number = 100;

    //建構子
    public Animal() {
        this(-1,-1);
        System.out.println("this is Animal");
    }
    public Animal(int h,int w) {
        this.height = h;
        this.witght = w;
        totlePeople++;
    }
    public Animal(int h) {
        this(h,-1);
    }
    public String Info(){
       String msg = "身高: " + height + "體重: " + witght ;
        return msg;
    }
    protected void sleep(){
        System.out.println("no sleep");
    }



    //建構子

    public Animal(String name) {
        setName(name);
    }
    //設定建構子的使用方法
    public String setName(String name) {
        return name;
    }
    public String getName() {
        return name;
    }



    /////////////////////////////////////////////////
    public int getNumber() {
        return number;
    }
    public void setNunber(int input) {
        number = input;
    }
}
