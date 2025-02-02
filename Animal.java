abstract class Animal {//抽象類別:抽象是一個概念，而不是一個存在的實體。同樣的，抽象類別不能被實體化->new() (抽象類別是用來被繼承的
    //父類別
    //控制修飾子: 4種 private(只有自己可以用，需要透過get、set取用，繼承後不給用)
    //              <default(預設值，不同套件不給用)<protected(不需要透過get、set取用，繼承後的套件漢子類別可以用)
    //              <public(全部都可以用)
    public String name = "animal";
    public int height;
    public int witght;
    int totlePeople = 0;
    protected int number = 100;



    //建構子變成抽象類別方法
    abstract String Animal(String name); //由繼承的人去實作{setName(name);}
    abstract void Animal(); //{ this(-1,-1); System.out.println("this is Animal");}
    abstract void Animal(int h,int w); //{ this.height = h;this.witght = w;totlePeople++;}
    abstract void  Animal(int h); //{this(h,-1);}

    //抽象的方法: 只定義原型(可以有參數)，不過不做本體->{}
    abstract void move();
    abstract String Info(); //{String msg = "身高: " + height + "體重: " + witght ;return msg;}
    abstract void sleep(); //{System.out.println("no sleep");}
    abstract String setName(String name);// {return name;}
    abstract String getName();// {return name;}

    abstract int getNumber(); //{return number;}
    abstract void setNunber(int input); //{number = input;}
}
