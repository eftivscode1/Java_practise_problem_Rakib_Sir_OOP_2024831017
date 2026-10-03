package practiseproblem.practiseproblem5;

class dog{
        String name,breed;
        double age;
        dog(String name,double age,String breed){
            this.name=name;
            this.age=age;
            this.breed=breed;
        }
        void bark(){
            System.out.println(name+" is barking");
        }
        void spin(){
            System.out.println(name+" is spinnig");
        }
        void run(){
            System.out.println(name+" is running");
        }
        void details(){
            System.out.println(name);
            System.out.println(age);
            System.out.println(breed);
        }
    }
    class oop{
    public static void main(String[] args) {
        dog d1=new dog("fahim",21,"chandpuira");
        d1.details();
        d1.run();
        d1.spin();
        d1.bark();
    }
    }

