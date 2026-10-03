package practiseproblem.practiseproblem8;

import java.util.Scanner;

public class practise8c {
    public static void main(String[] args) {
        double[][] a =new double[2][5];
        Scanner it=new Scanner(System.in);
        System.out.print("Enter grade points: ");
        double sum=0;
        for(int i=0;i<2;i++){
            for(int j=0;j<5;j++) {
                a[i][j] = it.nextDouble();

            }
            System.out.print("Enter credit points: ");
        }
double sum_credit=0;
   for(int i=1;i<2;i++){
        for(int j=0;j<5;j++){
sum_credit+=a[i][j];
        }

    }
   double sum_grad=0;

            for(int j=0;j<5;j++) {
sum_grad+=a[0][j]*a[1][j];
            }
        System.out.println(sum_grad);
        System.out.println(sum_credit);
        System.out.println("Cgpa: "+sum_grad/sum_credit);

}

}
