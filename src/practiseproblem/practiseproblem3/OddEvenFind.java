package practiseproblem.practiseproblem3;

public class OddEvenFind {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        int evencnt=0;
        int n=a.length;
        for(int i=0;i<n;i++){
            if(i%2==0) evencnt++;
        }
        System.out.println("Even Count: "+evencnt+" Odd count:  "+(n-evencnt));
    }
}
