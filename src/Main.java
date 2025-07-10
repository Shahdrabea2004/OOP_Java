public class Main {
    public static void main(String[] args) {

        //Static Variable
        Student student1=new Student("shahd","12359");
        Student student2=new Student("Abdo","123445");
        System.out.println(student1.isLoggedIn("422101","12359"));//true
        System.out.println(Student.validatePassword("123"));//false
        System.out.println(Student.validatePassword("123896"));//true
        System.out.println(student2.isLoggedIn("422102","1234"));//false
        System.out.println(student1.toString());
        System.out.println(student2.toString());

        //System.out.println(Student.college);

        //static method
        /*
        git add .
        git commit -m "update All"
        git push

         */

    }
}