package practiseproblem.practiseproblem8.shoppinhsystem;

public class Product {
    private int id;
    private String productname;
    private int priceperunit;

    public Product(int idi, String productname, int priceperunit) {
        this.id=idi;
        this.productname=productname;
        this.priceperunit=priceperunit;
    }

    int getId(){
    return id;
}
int getPriceperunit(){
    return priceperunit;
}
String getProductname(){
    return productname;
}

}
