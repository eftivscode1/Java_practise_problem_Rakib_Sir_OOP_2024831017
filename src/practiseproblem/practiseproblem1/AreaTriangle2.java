package practiseproblem.practiseproblem1;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class AreaTriangle2 {
     public static  void main(String[] args) {
         Scanner it=new Scanner(System.in);
         System.out.print("Enter the  3 arm of the triangle: ");
         double a=it.nextDouble();
         double b=it.nextDouble();
         double c=it.nextDouble();
         double s=(a+b+c)/2;
         double area=sqrt(s*(s-a)*(s-b)*(s-c));
         if(area==0) System.out.println("Invalid Triange");
         else System.out.println("Area: "+area);

     }
}
