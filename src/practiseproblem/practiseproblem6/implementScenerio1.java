package practiseproblem.practiseproblem6;
class books{
    int bookid;
    String bookname;
    String author;
    String yearOfPublish;
    float price;
    String status;
    books(int bookid,String bookname,String author,String yearOfPublish,float price,String status){
        this.bookname=bookname;
        this.bookid=bookid;
        this.author=author;
        this.yearOfPublish=yearOfPublish;
        this.price=price;
        this.status=status;
    }
    void AddnewBook(){
        System.out.println("Book added");
    }
    void DeleteBook(){
        System.out.println("Book deleted");
    }
    void DisplayBooksDetail(){
        System.out.println("bookid: "+bookid);
        System.out.println("Author: "+author);
        System.out.println("YearOfPublish: "+yearOfPublish);
        System.out.println("Price: "+price);
        System.out.println("Status: "+status);

    }
    void inquirybook(){
        System.out.println("books inquired");
    }
}
class librariabn{
    int id;
    String name;
    books book;
    user u;

    public librariabn( int id, String name) {

        this.id = id;
        this.name = name;
    }

    void searchbook(String name){
if(book.bookname.equals(name)){
    System.out.println("found");
}
else{
    System.out.println("Not found");
}
    }
    boolean verifymember(int id){
        if(u.id==id)return  true;
        else return  false;

    }
    void orderbooks(){
        System.out.println("books ordered");
    }
    void sellbooks(){
        System.out.println("Books sold");
    }
        }
        class user{
        int id;
        String Username;
        String UserAdress;
        String phonenum;
        user(int id, String Username, String adress, String phonenum){
            this.id=id;
            this.Username=Username;
            this.UserAdress=UserAdress;
            this.phonenum=phonenum;
        }
        void returnbook(){
            System.out.println("book returned");
        }
        void payfine(int date){
            System.out.println("date: "+date+" paid");

        }
        void addnewuser(){
            System.out.println("User added");
        }
        void deluser(){
            System.out.println("user deleted");
        }
        void updatedetails(){
            System.out.println("Details updated");
        }
        void bookpurchase(){
            System.out.println("Books purchased");
        }
        }
        class publisher{
    int id;
    String name;
    String adress;
    int phoneno;
    publisher(int id,String name,String adress,int phoneno){
        this.id=id;
        this.name=name;
        this.adress=adress;
        this.phoneno=phoneno;
    }
    void addpub(){
        System.out.println("pub added");
    }
    void modifypub(){
        System.out.println("pub modified");
    }
    void delpub(){
        System.out.println("pub deleted");
    }
    void orderstatus(){
        System.out.println("Status delivered");
    }
        }
public class implementScenerio1 {
public static void main(String[] args) {
books b1=new books(1,"Tale of zakaria","Zakaria","2026", 167.67F,"Sold");
librariabn l1=new librariabn(1,"Ten");
user u1=new user(1,"Sheylet","Zaka_kaka","01711589878");
l1.u=u1;
l1.book=b1;
    System.out.println(l1.verifymember(1));
l1.searchbook("Tale of zakaria");
}
}
