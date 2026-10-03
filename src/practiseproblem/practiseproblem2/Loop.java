package practiseproblem.practiseproblem2;

public class Loop {
    public static void main(String[] args) {
        for(int i=2;i<=20;i+=2){
            System.out.print(i+" ");
        }
        System.out.println();
        int i=2;

        while(i<=20){
            System.out.print(i+" ");
            i+=2;
        }
        System.out.println();
         i=2;
        do{
            System.out.print(i+" ");
            i+=2;
        }while(i<=20);
        System.out.println();
        for( i=1;i<=20;i+=2){
            System.out.print(i+" ");
        }
        System.out.println();
        i=1;

        while(i<=20){
            System.out.print(i+" ");
            i+=2;
        }
        System.out.println();
        i=1;
        do{
            System.out.print(i+" ");
            i+=2;
        }while(i<=20);
        int sum=0;
        System.out.println();
        for(i=2;i<=20;i+=2){
            sum+=i;
        }
        System.out.println("Even Sum: "+sum);
        sum=0;

        for(i=1;i<=20;i+=2){
            sum+=i;
        }
        System.out.println("Odd Sum: "+sum);
    }
}
