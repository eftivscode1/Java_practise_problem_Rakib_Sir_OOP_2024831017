package practiseproblem.practiseproblem8.shoppinhsystem;

public class main {
    public static void main(String[] args) {
        Customer c1=new Customer(101,"Zakay","01711589878");
        ShoppingCart s2=new ShoppingCart(111,c1.getuserid());

        c1.addcart(s2);
        Product p1=new Product(1,"Victus",10000);
        Product p2=new Product(2,"loq",20000);

        ShoppingCart s1=new ShoppingCart(999,c1.getuserid());
        s1.createcart(p1);
        s2.createcart(p2);
        c1.addcart(s1);
    Payment P1=new Payment(67);
        System.out.println(P1.calculateprice(c1.getcart()));


    }

}
