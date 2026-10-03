package practiseproblem.practiseproblem4;

//task1
    class wallett {
        int balance=0;

        static int deposit(int balance, int amount) {
            return balance += amount;
        }

        static int withdraw(int balance, int amount) {
            if(amount>balance){
                System.out.println("Insufficient balance");
                return balance;
            }
            return balance -= amount;
        }


        public  static void main(String[] args) {
            int balance_1=0,balance_2=0;
            balance_1=deposit(balance_1,200);
            balance_1=withdraw(balance_1,150);
    balance_2=deposit(balance_2,90);
            balance_2=withdraw(balance_2,20);
            System.out.println(balance_2);

        }


    }
    //Task#2
    class wallettask2{
        private int balance;
       int deposit(int amount){
           return  balance+=amount;
       }
        int withdraw(int amount){
            return  balance-=amount;
        }
        void statement(){
            System.out.println("balance: "+balance);
        }

    }
    class demo{
        public void main(String[] args) {
            wallettask2 w1=new wallettask2();
            w1.deposit(100);
            w1.withdraw(99);
            w1.statement();
        }
    }
    class wallettask3{
        private int balance;
        static int cnt=0;
        final String uid;
        wallettask3(){
            balance=0;
            cnt++;
            uid="n"+cnt;
        }
        wallettask3(int balance){
            this.balance=balance;
            cnt++;
            uid="n"+cnt;
        }
    int deposit(int amount){
            return balance+=amount;
    }
        int withdraw(int amount){
            return balance-=amount;
        }
        void statement(){
            System.out.println(balance+" ");
            System.out.println(uid);
        }
    }
    class task3{
        public static void main(String[] args) {
            wallettask3 w1=new wallettask3();
            w1.statement();
            wallettask3 w2=new wallettask3(1000);
            w2.statement();
            System.out.println(wallettask3.cnt);
        }
    }
    //task4
    class wallettask4{
        private int balance;
        static int cnt=0;
        final String uid;
        String mode;
        wallettask4(){
            balance=0;
            cnt++;
            uid="n"+cnt;
        }
        wallettask4(int balance){
            this.balance=balance;
            cnt++;
            uid="n"+cnt;
        }
        int deposit(int amount){
            return balance+=amount;
        }
        int withdraw(int amount){
            return balance-=amount;
        }
        int withdraw(int amount,String mode){
            this.mode=mode;
            return balance-=amount;
        }
        void statement(){
            System.out.println(balance+" ");
            System.out.println(uid);
            System.out.println(mode);
        }
    }
    class task4{
        public static void main(String[] args) {
            wallettask4 w1=new wallettask4();
            w1.statement();
            wallettask4 w2=new wallettask4(1000);
            w2.withdraw(10,"ATM");
            w2.statement();
            System.out.println(wallettask4.cnt);
        }
    }
    //task5
    class wallettask5 {
        int balance = 0;

        wallettask5(int balance) {
            this.balance = balance;
        }


             static void swap(wallettask5 w1,wallettask5 w2){
            wallettask5 temp=w1;
            w1=w2;
            w2=temp;
            }
            void statement(){
                System.out.println(balance);
            }

    }
    class  utility{
        static  int addbonus (wallettask5 w,int amount) {
            return w.balance += amount;
        }
    }
    class task5{
        public static void main(String[] args) {
            wallettask5 w1=new wallettask5(10);
            wallettask5 w2=new wallettask5(110);

            utility.addbonus(w1,1000);
            w1.statement();
            wallettask5.swap(w1,w2);
            w1.statement();
            w2.statement();



        }

    }