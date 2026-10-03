package practiseproblem.practiseproblem5;

class Carr{
    String owner,brandname,serial_number;
    boolean running;
    double fuel;
    Carr(String owner,String brandname,String serial_number,double fuel){
        this.owner=owner;
        this.brandname=brandname;
        this.serial_number=serial_number;
        running=false;
        this.fuel=fuel;
    }
    void start(){
        if(fuel>0){
            running=true;
            System.out.println(brandname+" Started");
        }
        else System.out.println("Not Enough fuel to start");
    }
    void stop(){
        running=false;
        System.out.println(brandname+" stopped");

    }
    void checkfuel(){
        System.out.println(fuel);
    }
    void detail(){
        System.out.println("owner: "+owner);
        System.out.println("brandname: "+brandname);
        System.out.println("serial_number: "+serial_number);
        System.out.println("fuel: "+fuel+" unit");



    }

}
public class practise_problm_5_p_90 {
    public static void main(String[] args) {
        Carr c1=new Carr("Zakaria","Merchedez","F15",100);
        c1.start();
        c1.stop();
        c1.detail();
    }
}
