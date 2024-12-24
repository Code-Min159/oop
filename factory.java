public class factory{
    public String factoryName;
    public float deliverWeight;

    // 建構子
    public factory(String factoryName){
        //指定自己(factoryName)
        this.factoryName = factoryName;
    }

    // 建構子
    public factory(){
        factoryName = "味全";
    }

    public class getWeight(){
        return deliverWeight = 2.28;
}


/**
 * TODO
 * 轉型
**/



    /**
     * get and set
    **/

    public String getFactoryName() {
        return factoryName;
    }

    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName;
    }

    public float getDeliverWeight() {
        return deliverWeight;
    }

    public void setDeliverWeight(float deliverWeight) {
        this.deliverWeight = deliverWeight;
    }
}



