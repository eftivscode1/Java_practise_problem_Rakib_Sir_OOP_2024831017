package practiseproblem.practiseproblem4;

import java.util.Scanner;

public class CheckOccurance {
    public static void main(String[] args) {
        String s;
        Scanner it=new Scanner(System.in);
        System.out.println("Enter String: ");
        s=it.nextLine();
        char c;
        System.out.println("Enter the char for checking occurance: ");
        char ch = it.next().charAt(0);
        int cnt=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==ch){
                cnt++;
            }
        }
        System.out.println("num of occurance: "+cnt);

    }

}

