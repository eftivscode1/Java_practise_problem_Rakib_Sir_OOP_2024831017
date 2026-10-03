package practiseproblem.practiseproblem8.shoppinhsystem;

import java.util.ArrayList;

public class Payment {
    private int paymentid;
    private double totalAmount;
    private boolean status;
    Payment(int paymentid) {
        this.paymentid=paymentid;
        this.status=false;
    }

    public int getPaymentid(){
        return paymentid;
    }
    double gettotalamount(){
        return totalAmount;
    }
    public boolean getStatus(){
        return status;
    }
    double calculateprice(ArrayList<ShoppingCart>c1){
        double amount=0;
        for(ShoppingCart x:c1){
            for(Product p1: x.getProductlist()){
                amount+=p1.getPriceperunit();

            }
        }
        totalAmount=amount;
        return totalAmount;
    }
    void makepayment(){
        status=true;
        System.out.println("payment done");
    }

}
