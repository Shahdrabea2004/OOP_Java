public class Student {
    private String id;
    private static int no=0;
    private String name;
    static String college="IT";
    private String password;
    private boolean loggedIn;
    private static int minPassword=6;
    public Student(String name,String password) {
        if (!validatePassword(password)) {
            System.out.println("Warning: Weak password!");
        }
        ++no;
        this.id = "42210"+no;
        this.name = name;
        this.password=password;
    }

    public boolean isLoggedIn(String id,String password){
        if(id.equals(this.id) &&password.equals(this.password)){
            loggedIn=true;
            return true;
        }
        return false;
    }
    public static boolean validatePassword(String password){
        if(password.length()>=minPassword)return true;
        return false;
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
