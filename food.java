public class food{
    String name;
    int price;
    // 建構子
    public void setFoodName(String name){
        this.name = name;
    }

    public getName(){
        return name;
    }

    public setPrice(int price){
        this.price = price;
    }
    
    //private is only here 
    private class innerCheck{
        public bloon isAddtivite = 'F';
        private String addtiviteArea = "non-addtivite";
        //
        public void foodArea{
            System.out.println("foodArea =" + addtiviteArea);
        }
    }
}

// when run the code, init this and put into memory without use new()..... 
static void sayHello{
    System.out.println("hello, this is food.")
}

// call funtion()-innerCheck
public void callInnerCheck(){
    innerCheck check = new innerCheck();
    check.foodArea();
}



