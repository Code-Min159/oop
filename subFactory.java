public class subFactory extends factory{
    private String nickName;
    public float weight;
    //call father's name

    //要修改的值可以在建構子這邊修改嗎?函示要到下面實作的地方才能修改?
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
