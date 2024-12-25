public class subFactory extends factory{
    private String nickName;
    public float weight;
    //call father's name
    public subFactory(){
        this.nickName = "little momo" + super.factoryName;
    }

}

//修改定重
public int deliveryWeight = (super.deliveryWeight+5); 

//get father's method and chang the value
public void setWeight{
    weight = 2*super.getWeight;
}
