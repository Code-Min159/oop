public class orangeCat extends Cat {
    //「多層」繼承: 繼承爸爸又繼承阿公


    public orangeCat(){
        System.out.println("this is orangeCat");
    }
    public orangeCat(String name){
        super(name);
        System.out.println("this is orangeCat(String name)" + name);
    }
    //覆寫父類別的方法權限(protected->public
    public void sleep(){
        System.out.println("go sleep for 3 hr");
    }

}
