package Examples6;


public class Main {
    //local final variable
    static void fun(final String s1) {
     final String s2=s1;
        System.out.println(s1+" "+s2);
    }
    static public void main(String []args){
        final long A_B=55;
        //A_B=66; --->Error
      Student student=new Student();
        System.out.println(student);
        Student student2=new Student(55);
        student2=new Student(99);
        System.out.println(student2);


        final Student student3=new Student(87);
        System.out.println(student3);
        System.out.println(student3.STUDENT_ID);

        fun("oop");


    }


}
