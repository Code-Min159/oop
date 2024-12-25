public class subFactory extends factory{
    private String nickName;
    public float weight;
    //call father's name

    public subFactory(){
        this.nickName = "little momo" + super.factoryName;
    }

}

//修改定重
public int deliverWeight = (super.deliverWeight +5); 

//get father's method and chang the value
public String titleName;

public void setName{
    titleName = super.factoryName + "(" + nickName + ")";
}
public getName(){
    return this.titleName;
}
