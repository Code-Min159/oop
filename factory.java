public class factory{
    //常數final，這裡用來規定 重量=25公斤;繼承的子物件再做其他規格
    final static int deliverWeight = 25;
    public String factoryName;

    // 建構子
    public factory(String factoryName){
        //this指定自己(factoryName)
        this.factoryName = factoryName;
    }
    // 建構子
    public factory(){
        factoryName = "味全";
    }
}
    /**
     * get and set
    **/

    public String getFactoryName() {
        return factoryName;
    }

    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName;
    }

    public int getDeliverWeight() {
        return deliverWeight;
    }

    public void setDeliverWeight(int deliverWeight) {
        this.deliverWeight = deliverWeight;
    }
}



