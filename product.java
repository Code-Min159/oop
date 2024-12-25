public class product extends food{
  public String name;
  public int price;

  //建構子，繼承Food的時候也會有Food的 setName、getName建構子，怎麼直接拿來用?
  public setName(String name){
    this.name = name;
  }
  public getName(){
    return name;
  }
}
//if today is holiday then half price
public salesPrice(int price,boolean isHoliday){
  if(isHoliday){
    price = price/2;
  }
  return price;
}

public getPrice(){
  return price;
}
    
