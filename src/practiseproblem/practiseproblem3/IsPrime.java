package practiseproblem.practiseproblem3;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner it=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=it.nextInt();
        boolean ans= isprime(num);
        if(ans){
            System.out.println(num+" is Prime Number");
        }
        else System.out.println(num+" is  Not Prime Number");
    }
    static boolean isprime(int n){
        if(n<=1) return false;
        int v=2;
        while(v*v<=n){
            if(n%v==0) return false;
            v++;
        }
        return  v*v>n;
    }
}
