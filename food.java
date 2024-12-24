public class food{
    String foodName;
    int foodId;
    // 建構子
    public food(String name){
        foodName = name;
    }

    //only here 
    private class innerCheck{
        private bloon isAddtivite = 'F';
        private String addtiviteArea = "non-addtivite";

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

