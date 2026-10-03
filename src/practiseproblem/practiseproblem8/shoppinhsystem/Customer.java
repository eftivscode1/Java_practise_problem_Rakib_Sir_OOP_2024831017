package practiseproblem.practiseproblem8.shoppinhsystem;

import java.util.ArrayList;

public class Customer {
private int userid;
private String name;
private String phonenum;
private ArrayList<ShoppingCart>carts;
Customer(int userid, String name,String phonenum){
    this.name=name;
    this.phonenum=phonenum;
    this.userid=userid;
    carts=new ArrayList<>();
}
public void addcart(ShoppingCart c1){
    carts.add(c1);
}
public ArrayList<ShoppingCart>getcart(){
    return carts;
}

 public int getuserid(){
    return userid;
 }
    public String  getName(){
        return name;
    }
    public String  getphonenumber(){
        return phonenum;
    }
}
