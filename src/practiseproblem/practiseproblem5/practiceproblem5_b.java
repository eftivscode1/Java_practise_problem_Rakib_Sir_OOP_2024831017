package practiseproblem.practiseproblem5;

class libaraysystem{


        String title;
        String author;
        libaraysystem(String title){
            this.title=title;
        }
        libaraysystem(String title,String author){
            this.author=author;
            this.title=title;
        }
        void detail(){
            System.out.println("Author: "+author);
            System.out.println("Title: "+title);
        }

}
    public class practiceproblem5_b {
    public static void main(String[] args) {
        libaraysystem l1=new libaraysystem("No time to die");
        libaraysystem l2=new libaraysystem("Atomic habits","Charle");
        l1.detail();
        l2.detail();
    }
    }
