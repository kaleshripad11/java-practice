package oops.inheritance;

/**
 * Multi-level inheritance
 */
class Subjects{
    String subjects_graduation[] = {"C Programming Basics", "C++ Programming", "DBMS", "Software Development"};
    String subjects_post_graduation[] = {"Datastructures using C","Web Technologies", "PPMOB", "OT", "Software Testing", "Cyber Security"};
}

class Graduation extends Subjects{
    String grad_degree = "B.Sc(Computer Science)";
    int i = 1;
    void display_Graduation_Syllabus(){
        System.out.println("Below are the subjects for degree : "+grad_degree);
        for (String s : subjects_graduation) {
            System.out.println(i+". "+s);
            i++;
        }
    }
}

class Post_Graduation extends Graduation{
    String pgrad_degree = "MCA";
    int i = 1;
    void display_Post_Graduation_Syllabus(){
        System.out.println("Below are the subjects for degree : "+pgrad_degree);
        for (String s : subjects_post_graduation) {
            System.out.println(i+". "+s);
            i++;
        }
    }
}
public class MultiLevelInheritance extends Post_Graduation{
    public static void main(String[] args) {
        MultiLevelInheritance mli = new MultiLevelInheritance();
        System.out.println("Below are the details of degree programs : ");
        mli.display_Graduation_Syllabus();
        mli.display_Post_Graduation_Syllabus();
    }
}
