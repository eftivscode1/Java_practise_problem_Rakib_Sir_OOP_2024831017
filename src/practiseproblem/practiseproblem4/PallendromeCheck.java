package practiseproblem.practiseproblem4;

public class PallendromeCheck {
    static boolean checkpall(String s){
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-1-i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s="nasa";
        if(checkpall(s)){
            System.out.println("Pallendrome");
        }
        else{
            System.out.println("Not Pallendrome");
        }
        char c='l';
        int cnt=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==c){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
