package practiseproblem.practiseproblem4;

public class librarySystem {
    static class library{
        String name;
        static int TotalBook=0;
        int bookinividual=0;
        library(String librayname) {
            name = librayname;
        }
           void issuebook(){
               TotalBook++;
               bookinividual++;
                System.out.println(name+" "+"Issued book");
            }

        }

    public static void main(String[] args) {
library central=new library("Central Library");
        library IICT=new library("IICt Libary");
        library Cse=new library("Cse Library");
central.issuebook();
IICT.issuebook();
Cse.issuebook();
        IICT.issuebook();
        System.out.println("Total Issued Book: "+" "+ library.TotalBook);
        System.out.println("Book issued by IICT "+Cse.bookinividual);
    }
}
