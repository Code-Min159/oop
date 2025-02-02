public class Person extends Animal{// //「多層」繼承: 繼承爸爸又繼承阿公
    public String hairColor;

    public void move(){
        System.out.println("walk///");

    }

    public Person(){
        this(-1,-1,"black");
    }
    public Person(int h, int w){
        super(h, w);
        this.hairColor = "red";//使用父類別的建構子
    }
    public Person(int h,int w, String hairColor){
        super(h, w);
        this.hairColor = hairColor;
    }

    public String getInfo(){
        String msg = "髮色 :" + this.hairColor + super.Info();

        System.out.println("msg :" + msg);
        return msg;

    }



}
