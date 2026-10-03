package practiseproblem.practiseproblem4;

public class rev_a_string {
   public static void main(String[] args) {
       String a="radar";
       String rev=new StringBuilder(a).reverse().toString();
       System.out.println(rev);
       String rev1="";
       for(int i=a.length()-1;i>=0;i--){
           rev1+=a.charAt(i);
       }
       System.out.println(rev1);
   }
}
