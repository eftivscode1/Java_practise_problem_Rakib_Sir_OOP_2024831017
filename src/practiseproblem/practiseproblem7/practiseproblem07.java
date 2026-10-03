package practiseproblem.practiseproblem7;

import java.util.ArrayList;

class student {
    private int id;
    private String name;
    private String programme;
    private ArrayList<courseoffering> cs = new ArrayList<>();

    student(int id, String name, String programme) {
        this.id = id;
        this.name = name;
        this.programme = programme;
    }
    void addcouseoffering(courseoffering cc){
        cs.add(cc);
    }
    void print(){
        System.out.println("     student        ");
        System.out.println("id: "+this.id);
        System.out.println("name: "+this.name);
        System.out.println("programme: "+this.programme);
        for(courseoffering x:cs){
            x.printcouseoffering();
        }

    }
}
    class courseoffering{
        int studentid;
        int instructorid;
        int courseid;
        String time;
        int roomid;
        int year;
        char Sem;
        int sectionno;
        private course c;
        courseoffering(int studentid,int instructorid,int courseid,String time,int roomid,int year,char sem,int sectionno){
            this.studentid=studentid;
            this.Sem=sem;
            this.courseid=courseid;
            this.time=time;
            this.year=year;
            this.roomid=roomid;
            this.instructorid=instructorid;
            this.sectionno=sectionno;
        }
void addcourse(course cp){
            c=cp;
}
        void printcouseoffering(){
            System.out.println("studentid: "+studentid);
            System.out.println("Sem: "+Sem);
            System.out.println("room: "+roomid);
            System.out.println("courseid: "+courseid);
            System.out.println("instructorid: "+instructorid);
            System.out.println("Sectionid: "+sectionno);
            System.out.println("time: "+time);
            System.out.println("year: "+year);
            System.out.println("course details");
            System.out.println("Title: "+c.title);
            System.out.println("Prequisite"+c.prequisite);
            System.out.println("Syllbus: "+c.syllbus);
            System.out.println("credits: "+c.credits);

        }
    }

class instructor{
    int id;
    String name;
    String dept;
    String title;
    private ArrayList<courseoffering>cs=new ArrayList<>();
    instructor(int id,String name,String dept,String title){
        this.id=id;
        this.name=name;
        this.dept=dept;
        this.title=title;
    }
void addcourseoffering(courseoffering c){
cs.add(c);
}
    void print(){
        System.out.println("-------------------------------------------------------------");
        System.out.println("                        instructor                           ");
        System.out.println("-------------------------------------------------------------");
        System.out.println("name: "+name);
        System.out.println("dept: "+dept);
        System.out.println("title: "+title);
        for(courseoffering x:cs){
         x.printcouseoffering();
        }
    }
}
class course{
    String syllbus;
    String title;
    String credits;
    String prequisite;
    ArrayList<courseoffering>cs=new ArrayList<>();
    course(String syllbus,String  title,String credit,String prequisite){
        this.syllbus=syllbus;
        this.title=title;
        this.credits=credit;
        this.prequisite=prequisite;
    }
    void addcourseoffering(courseoffering c){
        cs.add(c);
    }
}
public class practiseproblem07 {
    public static void main(String[] args) {
student s1=new student(1,"Zakcy","varchar2");
courseoffering c1=new courseoffering(1,10,10,"date",10,10,  '2',5);
        courseoffering c2=new courseoffering(2,11,11,"date1",110,110,  '3',6);
        courseoffering c3=new courseoffering(233,131,131,"date13",1103,1310,  '4',76);

instructor i1=new instructor(10,"rakib sir","SWE","varchar(2");
course cc1=new course("varchar(2)","varchar2(255)","varchar2(255)","varchar2(255");
        course cc2=new course("ch 1-10","Introduction to cp","3","none");
        course cc3=new course("full book","oop","7)","c++");
c1.addcourse(cc1);
c2.addcourse(cc2);
c3.addcourse(cc3);
   s1.addcouseoffering(c1);
   cc1.addcourseoffering(c1);
   cc2.addcourseoffering(c2);
   cc3.addcourseoffering(c3);
        s1.addcouseoffering(c2);
        s1.addcouseoffering(c3);
        s1.print();
        i1.addcourseoffering(c1);
        i1.addcourseoffering(c2);
        i1.addcourseoffering(c3);
i1.print();
    }

}
