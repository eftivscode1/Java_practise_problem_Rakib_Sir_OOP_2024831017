package practiseproblem.practiseproblem3;

import java.util.Scanner;
public class Medel {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.print("Enter Your  CG: ");
        double marks=input.nextDouble();
        boolean com;
        System.out.println("have u completed semster (true/false): ");

com=input.nextBoolean();
if(marks>=3.5){
    if(com==true){
        System.out.println("you will get medel");
    }
    else{
        System.out.println("Not worth for medel");
    }
}
    }





}
