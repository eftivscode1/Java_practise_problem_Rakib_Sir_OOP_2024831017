package practiseproblem.practiseproblem1;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class areaoftriangle {
    public void main(String[] args) {
        Scanner it=new Scanner(System.in);
        System.out.print("Enter arm of the equiletarel Triangle: ");
        double a= it.nextDouble();
        double area=(sqrt(3)/4)*a*a;
        System.out.println("Area: "+area);
    }
}
