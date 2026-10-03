package practiseproblem.practiseproblem4;

class ecom{
        String category;
        String brand;
        int range1,range2;
        boolean b1;
        void filterproduct(String category){
            this.category=category;
            System.out.println(category);

        }
        void filterproduct(int range1,int range2){
    this.range1=range1;
    this.range2=range2;
            System.out.println(range1+" "+range2);

        }
        void filterproduct(String brand,boolean b1){
            this.brand=brand;
            System.out.println(brand);
        }
        void filterproduct(String category,int range1,int range2){
            this.category=category;
            this.range1=range1;
            this.range2=range2;
            System.out.println(category+" "+range1+" "+range2);
        }
        void filterproduct(String category,int range1,int range2,String brand){
            this.category=category;
            this.range1=range1;
            this.range2=range2;
            this.brand=brand;
            System.out.println(category+" "+range1+" "+range2+" "+brand);

        }
    }
    public class practise_probelm_p67 {
    public static void main(String[] args) {
        ecom p1=new ecom();
        p1.filterproduct("Fashion");
        p1.filterproduct("nike",true);
        p1.filterproduct(100,200);
        p1.filterproduct("fashion",100,200);
        p1.filterproduct("fashion",100,200,"NIKE");


    }



    }
