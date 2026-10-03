package practiseproblem.practiseproblem2;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner it=new Scanner(System.in);
        System.out.print("Enter Year: ");
        int y=it.nextInt();
        if(y%400==0||y%4==0&&y%100!=0) System.out.println(y+" Leap Year");
        else System.out.print(y+" Not Leap Year");
    }
}
