package practiseproblem.practiseproblem3;

public class Average {
     public static void main(String[] args) {
        float[] a={1,2,3,4,5,6};
        float sum=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
        }
         System.out.println(sum/a.length);
    }
}
