package practiseproblem.practiseproblem3;

public class GreatestNumberInseries
{
    public static void main(String[] args) {
        int[] a ={-1,-2,-3,-4,-5,-6};
        int mx=Integer.MIN_VALUE;
        for(int i=0;i<6;i++){
if(mx<a[i]){
    mx=a[i];
}
        }
        System.out.println("Max_Val: "+mx);

    }
}
