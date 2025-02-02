public class Human {
    String name;
    int age;
    static int totlePeople = 0;//在main Run起來的時候 totalCount先載入到記憶體位置


    // 建構子->想成是 json
    public Human(){
        name = "untitled";
        age = -1; //用來表示沒有被設定
        totlePeople++;
    }
    public Human(String str){
        this();//去呼叫 自己的這個Human()，先把這個建構子初始化
        this.name = str; //再把傳進來的值用this.設定到name
    }
    public Human(String str,int age){
        this(str);
        this.age = age;
    }
    //把要印出來的資訊單獨寫，不燃會很多 System.out.println 在外面
    public String printInfo(){
        return name +" 年齡: " + age + "目前人數: " + totlePeople;
    }

}
