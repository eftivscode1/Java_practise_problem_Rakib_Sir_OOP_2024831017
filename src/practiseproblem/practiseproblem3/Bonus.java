package practiseproblem.practiseproblem3;

import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {
        Scanner it = new Scanner(System.in);
        System.out.print("Enter targetsale in %: ");
        int tg = it.nextInt();
        System.out.print("Enter Attendance in %: ");
        int a = it.nextInt();
        int bonus = 0;
        if (tg >= 95 && a == 100) {
            bonus = 60;
        } else if (tg >= 95 && a == 90) {
            bonus = 40;
        } else if (tg == 80 && a == 100) {
            bonus = 40;
        } else if (tg == 80 && a == 90) {
            bonus = 20;
        } else {
            bonus = 5;
        }
        System.out.println("bonus: " + bonus);
    }
}
