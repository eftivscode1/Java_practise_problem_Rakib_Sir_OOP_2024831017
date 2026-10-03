package practiseproblem.practiseproblem8.shoppinhsystem;

import java.util.ArrayList;

public class ShoppingCart {
    private int cartid;
    private int userid;
    private ArrayList<Product>productlist;
    ShoppingCart(int cartid,int userid){
        this.cartid=cartid;
        this.userid=userid;
        productlist=new ArrayList<>();
    }
    public int getCartid(){
        return  cartid;
    }
    public int getUserid(){
        return  userid;
    }

    public ArrayList<Product> getProductlist(){
        return  productlist;
    }
    public  void createcart(Product product){
        productlist.add(product);
    }


}
