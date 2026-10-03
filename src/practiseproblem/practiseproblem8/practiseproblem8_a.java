package practiseproblem.practiseproblem8;

class employee{
String name;
int id;
String dept;
employee(String name,int id,String dept){
    this.name=name;
    this.id=id;
    this.dept=dept;
}
void calcpay(){
    System.out.println("pay nothing");
}

}
class full_time_employee extends employee{
    double fixedsalary=10000;

    full_time_employee(String name, int id, String dept) {
        super(name, id, dept);
    }

    void calcpay(){
        System.out.println("Payable: "+fixedsalary);
    }
}
class part_time_employee extends employee{

    double hourly_rate;
    int hoursworked;

    part_time_employee(String name, int id, String dept,double hourly_rate,int hoursworked) {
        super(name, id, dept);
        this.hourly_rate=hourly_rate;
        this.hoursworked=hoursworked;

    }
    @Override
    void calcpay() {
        System.out.println("Payable: "+hourly_rate*hoursworked);
    }
}
class contract_employee extends employee{
    String project_name;
    double contact_ammount;

    contract_employee(employee e1,String project_name,double contact_ammount) {
        super(e1.name, e1.id, e1.dept);
        this.project_name=project_name;
        this.contact_ammount=contact_ammount;
    }
    void calcpay(){
        System.out.println("Payable: "+contact_ammount);;
    }
}
public class practiseproblem8_a {
    public static void main(String[] args) {
        full_time_employee f1=new full_time_employee("ilhum,",1,"SWE");
        f1.calcpay();
        part_time_employee p1=new part_time_employee("Annono",2,"bcs",10.5,10);
        p1.calcpay();
        contract_employee c1=   new contract_employee(f1,"hakaluki",500);
c1.calcpay();
    }
}
