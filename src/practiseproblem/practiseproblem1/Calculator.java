package practiseproblem.practiseproblem1;

import java.util.Scanner;

import static java.lang.Math.abs;

public class Calculator {
    public static void main(String[] args) {
        Scanner it=new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a=it.nextInt();
        int b=it.nextInt();
        System.out.print("Enter Operation: ");
        char ch=it.next().charAt(0);
        switch (ch){
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(abs(a-b));
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                if(a!=0){
                    System.out.println(b/a);
                    break;
                }
            default:
                System.out.println("Invalid op");
        }


    }
}
