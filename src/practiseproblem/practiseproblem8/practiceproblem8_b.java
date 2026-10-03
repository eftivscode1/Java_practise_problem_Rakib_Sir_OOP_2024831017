package practiseproblem.practiseproblem8;

class restaurant{
    String name;
    restaurant(String name){
        this.name=name;
    }
     final int tax=10;

    double calculatebill(int foodprice){
return foodprice+(foodprice*((double)tax/100));

    }
    int time;
   void estimatedelivary(){
       System.out.println("40 minutes");
   }

}
class fastfood extends restaurant{
    fastfood(String name) {
super(name);
    }

    void estimatedelivary(){
        System.out.println("20 minutes");
    }
final int tax=15;
    double calculatebill(int foodprice){
        return foodprice+(foodprice*((double) tax /100));
    }
}
class finedining extends  restaurant{
    finedining(String name) {
        super(name);
    }

    void estimatedelivary(){
        System.out.println("60 minutes");
    }

}
public class practiceproblem8_b {
    public static void main(String[] args) {
        fastfood f1=new fastfood("Sustff");
        System.out.println(f1.name);
        finedining f2=new finedining("sust tong b");
        System.out.println(f2.name);
        System.out.println(f2.calculatebill(100));
        System.out.println(f1.calculatebill(100));
    }


}