package practiseproblem.practiseproblem3;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6};
        rev(a);
        System.out.println(Arrays.toString(a));
    }
    static void rev(int[] a){
        int n=a.length;
        for(int i=0;i<n/2;i++){
            int temp=a[i];
            a[i]=a[n-1-i];
            a[n-1-i]=temp;

        }
    }
}
