package practiseproblem.practiseproblem1;

import java.util.Scanner;

public class areaofcircle {
    public static void  main(String[] args){
        Scanner it=new Scanner(System.in);
        System.out.print("Enter Radius: ");
        double r=it.nextInt();
        double area=3.1416*r*r;
        System.out.println("Area of the practiseproblem.practiseproblem1.Circle: "+area+" sq");

    }
}
