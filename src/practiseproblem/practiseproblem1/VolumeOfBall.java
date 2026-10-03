package practiseproblem.practiseproblem1;

import java.util.Scanner;

public class VolumeOfBall {
    public static void main(String[] args){
        Scanner it=new Scanner(System.in);
        System.out.print("Enter Radius of the ball: ");
        double r=it.nextFloat();
        double v=(4/3)*3.1416*(r*r*r);
        System.out.print("Volume is: "+v);
    }


}
