package Task_1;

public class Main {
    public static void main(String []args){
        Courses courses1=new Courses("Math");
        Courses courses2=new Courses("C++");
        Courses courses3=new Courses("CS");
        Courses courses4=new Courses("Java");
        //-----------------------------------
        Student student1=new Student("Shahd",18,"14785236987","dfv@gam.com","CS");
        Student student2=new Student("Abdo",18,"14785236974","dfv@gam.com","CS");
        Student student3=new Student("Hala",18,"14785236987","dfv@gam.com","CS");
        Student student4=new Student("Rabea",18,"14523698745","dfv@gam.com","CS");
        //------------------------------------------------------------------------------------------------------------
        student1.ChooseCourses();
        student2.ChooseCourses();
        student3.ChooseCourses();
        student4.ChooseCourses();
        //-----------------------
        System.out.println(student1.toString());
        System.out.println(student2.toString());
        System.out.println(student3.toString());
        System.out.println(student4.toString());
        //--------------------------------------
        System.out.println(Student.getNoCount());
        //--------------------------------------

    }
}
