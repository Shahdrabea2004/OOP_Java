package Examples;

import Examples.OuterClass;
import Examples.Student;

public class Main {
    //Note in static method and static variable
    static int x=0;
    static{
        System.out.println("static block");
        x+=20;
    }
    {
        System.out.println("block");
        x+=10;//not see in main
    }
    public static void main(String[] args) {
        // because Examples.Main is static method
        x+=5;
        System.out.println(x);
        //Static Variable
        Student student1=new Student("shahd","12359");
        Student student2=new Student("Abdo","123445");
        System.out.println(student1.isLoggedIn("422101","12359"));//true
        System.out.println(Student.validatePassword("123"));//false
        System.out.println(Student.validatePassword("123896"));//true
        System.out.println(student2.isLoggedIn("422102","1234"));//false
        System.out.println(student1.toString());
        System.out.println(student2.toString());
        {
            x=0;
            System.out.println("hello world");
        }


        //Examples.OuterClass Static
        OuterClass.InnerClass obj=new OuterClass.InnerClass();
        obj.print();
        //Examples.OuterClass Non_Static
        OuterClass outer = new OuterClass();
        OuterClass.InnerClassNonStatic obj2 = outer.new InnerClassNonStatic();
        obj2.print();




        //System.out.println(Examples.Student.college);

        //static method
        /*
        git add .
        git commit -m "update All"
        git push

         */

    }
}