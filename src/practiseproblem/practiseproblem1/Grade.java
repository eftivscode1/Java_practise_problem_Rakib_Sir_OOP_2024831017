package practiseproblem.practiseproblem1;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner it=new Scanner(System.in);
        System.out.print("Enter Grade: ");
        int grade=it.nextInt();
        switch (grade/10){
            case 10:
            case 9:
                System.out.println("A+");
                break;
            case 8:
                System.out.println("A");
                break;
            case 7:
                System.out.println("A-");
                break;
            case 6:
                System.out.println("B");
                break;
            case 4:
            case 5:
                System.out.println("C+");
                break;
            default:
                if(grade>=0&&grade<=39) System.out.println("F");
        }

    }
}
