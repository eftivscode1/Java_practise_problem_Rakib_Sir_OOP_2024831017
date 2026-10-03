package practiseproblem.practiseproblem3;

import java.util.Scanner;

public class Fib {
    static int fibo(int n){
if(n==0) return 0;
if(n==1) return 1;
return fibo(n-1)+fibo(n-2);
    }
    public static void main(String[] args) {
        Scanner it=new Scanner(System.in);
        System.out.print("Enter the numer: ");
        int c=it.nextInt();
        for(int i=0;i<c;i++){
            System.out.print(fibo(i)+" ");
        }
        System.out.println();
    }
}
