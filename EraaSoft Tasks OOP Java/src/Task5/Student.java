package Task5;

public class Student extends ShareData {
    private int age;

    public Student(int id, String name, String phone, int age) {
        super(id, name, phone);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void print() {
        super.print();
        System.out.println("{ Student: "+"Age: "+age+" }");
    }
}
