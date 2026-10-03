package practiseproblem.javabaddesign;

import java.util.ArrayList;
abstract class employee1 {
 private String name;
 private double salaryorhourlyrate;
 private int workunit;
 private int rating;
 private String employeetype;

 String getname(){
  return name;
 }
 void setemployeetype(String name){
   employeetype=name;
 }
 double getSalaryorhourlyrate(){
  return salaryorhourlyrate;
 }
 int getworkunit(){
  return workunit;
 }
 int getRating(){
  return rating;
 }
 public employee1(String name, double salaryorhourlyrate, int workunit,int rating) {
  this.name=name;
  this.salaryorhourlyrate=salaryorhourlyrate;
  this.workunit=workunit;
  this.rating=rating;
 }

 public abstract double calculateMonthlySalary();

 public abstract double calculateTax();

 public abstract double calculateBonus();

 public double calculateNetPay() {
  return calculateMonthlySalary()+calculateBonus()-calculateTax();
 }

 public String getEmployeetype() {
  return employeetype;
 }
}
 class parttimeemployee extends employee1{

 parttimeemployee(String name,double hourlyrate,int workunit,int rating){

super(name,hourlyrate,workunit,rating);
super.setemployeetype("PARTTIME");}
  final double rate=0.05;
 @Override
 public double calculateMonthlySalary() {

  return getSalaryorhourlyrate() * getworkunit();
 }
 @Override
 public double calculateTax() {
 return this.calculateMonthlySalary()*rate;
 }
 @Override
 public double calculateBonus() {
  return  (this.calculateMonthlySalary()*rate*(getRating()/3.0));
 }
}
 class fulltimeemployee extends employee1{
  final double minsal=4000;
  final double rate1=.2;
  final double rate2=0.1;

 fulltimeemployee(String name,double hourlyrate,int workunit,int rating){

  super(name,hourlyrate,workunit,rating);
super.setemployeetype("FullTime");

 }
 @Override
 public double calculateMonthlySalary() {
  return  getSalaryorhourlyrate() / 12;
 }
 @Override
 public double calculateTax() {


  if(calculateMonthlySalary()>minsal){
   return this.calculateMonthlySalary()*rate1;
  }
  else{
   return this.calculateMonthlySalary()*rate2;
  }
 }

 @Override
 public double calculateBonus() {
  return this.calculateMonthlySalary()*rate2*(getRating()/3.0);
 }
}
class contractor extends employee1{
 final double taxrate=.08;

 contractor(String name,double hourlyrate,int workunit,int rating){
  super(name,hourlyrate,workunit,rating);
super.setemployeetype("Contractor");

 }
 @Override
 public double calculateMonthlySalary() {
  return getSalaryorhourlyrate()*getworkunit();
 }
 @Override
 public double calculateTax() {
return this.calculateMonthlySalary()*taxrate;
 }

 @Override
 public double calculateBonus() {
  return 0;
 }
}
 class processpayroller{
 private  ArrayList<employee1> pp= new ArrayList<>();



  public void addemployee(employee1 e){
 pp.add(e);

}
 public  void printinfo() {
  System.out.println("========================================");
  System.out.println("          MONTHLY PAYROLL REPORT        ");
  System.out.println("========================================");
  double totalpay=0;
  for(employee1 w: pp){
   totalpay+=w.calculateNetPay();
   System.out.println("Name   : " + w.getname());
   System.out.println("Type   : " + w.getEmployeetype());
   System.out.printf( "Salary : %.2f%n", w.calculateMonthlySalary());
   System.out.printf( "Tax    : %.2f%n", w.calculateTax());
   System.out.printf( "Bonus  : %.2f%n", w.calculateBonus());
   System.out.printf( "Net Pay: %.2f%n", w.calculateNetPay());
   System.out.println("----------------------------------------");
  }


  System.out.println("Totalpay: "+totalpay);
 }
}
public class JavaBadDesign{
 public static  void main(String[] args) {
  processpayroller swe=new processpayroller();
  fulltimeemployee f1=new fulltimeemployee("Alice johnson",72000,0,1);
  fulltimeemployee f2=new fulltimeemployee("Carol White",54000,0,2);
parttimeemployee pp1=new parttimeemployee("bob smith",25.0,60,3);
  parttimeemployee pp2=new parttimeemployee("David lee",18.0,60,4);
  contractor c1=new contractor("eve torres",350,20,0);
swe.addemployee(f1);
swe.addemployee(f2);
swe.addemployee(pp1);
swe.addemployee(pp2);
swe.addemployee(c1);
//  processpayroller cse=new processpayroller();
//
//  parttimeemployee p1=new parttimeemployee("Zakaria",10,30,1);
//  parttimeemployee p2=new parttimeemployee("zak",150,30,2);
//  parttimeemployee p3=new parttimeemployee("mak",250,30,3);
//  parttimeemployee p4=new parttimeemployee("lak",350,30,4);
//  parttimeemployee p5=new parttimeemployee("sa",450,30,5);
//  fulltimeemployee p6=new fulltimeemployee("za",550,30,6);
//  fulltimeemployee p7=new fulltimeemployee("ba",650,30,7);
//  fulltimeemployee p8=new fulltimeemployee("sha",750,30,8);
//  fulltimeemployee p9=new fulltimeemployee("ba",850,30,9);
//  fulltimeemployee p10=new fulltimeemployee("ha",950,30,10);
//  contractor p11=new contractor("ba",850,30,9);
//  contractor p12=new contractor("ha",950,30,10);
//swe.addemployee(p1);
//  swe.addemployee(p2);
//  swe.addemployee(p3);
//  swe.addemployee(p4);
//  swe.addemployee(p5);
//  cse.addemployee(p6);
//  cse.addemployee(p7);
//  cse.addemployee(p8);
//  cse.addemployee(p9);
//  swe.addemployee(p10);
//  cse.addemployee(p11);
//  cse.addemployee(p12);
//cse.printinfo();
swe.printinfo();
 }
}





