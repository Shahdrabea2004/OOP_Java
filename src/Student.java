public class Student {
    private String id;
    private static int no=0;
    private String name;

    static String college="IT";

    public Student(String name) {
        ++no;
        this.id = "42210"+no;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", college='" + college + '\'' +
                '}';
    }
}
