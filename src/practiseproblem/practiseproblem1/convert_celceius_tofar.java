package practiseproblem.practiseproblem1;

import java.util.Scanner;

public class convert_celceius_tofar {
    public static void  main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter Temperature in Celcius: ");
        float c= in.nextFloat();
        float f=((9*c)/5)+32;
        System.out.print("temp is f: "+f);

    }
}
