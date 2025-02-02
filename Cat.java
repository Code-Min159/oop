public class Cat extends Animal {
    // class sub1
    //子類別有繼承父類別的東西有:
    // protected int number = 100;
    // 建構子1 public Animal()
    // 建構子2 public Animal(String name)
    //子類別無法繼承到父類別的「private成員」、「建構子」，以及被宣告為「final」的成員。

    //子類別自己的
    private String name = "Big Cat"; //如果CAT沒有設定name， name都是繼承父類別- animal


    //建構子1
    public Cat(){
        System.out.println("this is Cat");
    }
    //建構子2
    public Cat(String name){
        //super(name); //可以理解為到父類別Animal去執行 public Animal(String name) 這個方法
        this();
        System.out.println("this is Cat(String name) "+name);
        System.out.println("this is Cat(String name) this.name = " + this.name);//子類別的name

        //若父類別只有「有引數的建構元」，而子類別又沒透過 super 來呼叫特定的父類別建構元的話，
        //程式編譯時將會出錯！
        //因為無法找到父類別「沒有引數的建構元」。
        //https://ithelp.ithome.com.tw/m/articles/10184925
    }
    //建構子2
    public Cat(int h,int w){

        System.out.println("this is Cat(int h,int w)");
    }
    @Override
    public String Animal(String name){
        setName(name);
        return name;
    }
    @Override
    public void Animal(){
        this.height = -1;
        this.witght = -1;
        System.out.println("this is Animal in Cat");
    }
    @Override
    public void Animal(int h,int w){
        this.height = h;
        this.witght = w;
        totlePeople++;
    }
    @Override
    public void  Animal(int h){
        this.height = h;
        this.witght = -1;
        totlePeople++;
    }
    @Override
    public void move(){
        System.out.println("jump///");
    }
    @Override
    public String Info(){
        String msg = "身高: " + height + "體重: " + witght ;
        return msg;
    }
    @Override
    public String getName(){
        return this.name;
    }
    @Override
    public String setName(String str){
        this.name = str;
        return str;
    }
    @Override
    protected void sleep(){
        System.out.println("go sleep");
    }
    @Override
    public int getNumber(){
        return this.number;
    }
    @Override //複寫父類別的方法
    public void setNunber(int n){
        this.number = number * n;
        System.out.println(this.number);
    }

}
