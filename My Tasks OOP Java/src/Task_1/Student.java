package Task_1;

import java.util.*;

public class Student {
    private String name;
    private String id;
    private static int noCount=0;
    private int Age;
    private String phoneNumber;
    private String Email;
    private String department;

    private HashMap<Integer, String> allCourseForStudent = new HashMap<>();

    public Student(String name, int age, String phoneNumber, String email, String department) {
        this.name = name;
        noCount++;
        this.id = "42210"+noCount;
        Age = age;
        if(!validatePhone(phoneNumber)){
            System.out.println("Phone Number must 11 Length");
        }else {
            this.phoneNumber = phoneNumber;
        }
        if(!validateEmail(email)){
            System.out.println("Email must contains special character");
        }else {
            Email = email;
        }
        this.department = department;
    }

    public static int getNoCount() {
        System.out.print("Number of Student: ");
        return noCount;
    }

    public static boolean validatePhone(String phoneNumber){
        return phoneNumber.length()==11;
    }
    public static boolean validateEmail(String email){
        return email.contains("@");
    }
    public void ChooseCourses(){
        Courses.displayCourses();
        Scanner input=new Scanner(System.in);
        System.out.print("Enter number of courses you want to choose: ");
        int n= input.nextInt();
        for(int i=0;i<n;i++){
            System.out.print("Enter course code to enroll in: ");
            int code= input.nextInt();
            String courseName = Courses.getCourseByCode(code);
            if(courseName!=null){
                allCourseForStudent.put(code,courseName);
                System.out.println("Enrolled in: " + courseName);
            }
            else{
                System.out.println("Invalid course code. Try again.");
                i--;
            }
        }
    }
    public void displayCourses() {
        System.out.println("Your Courses");
        int cnt=1;
        for (Map.Entry<Integer, String> entry : allCourseForStudent.entrySet()) {
            System.out.println(cnt+"."+"Code: " + entry.getKey() + ", Course: " + entry.getValue());
            ++cnt;
        }
    }

    @Override
    public String
    toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", Age=" + Age +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", Email='" + Email + '\'' +
                ", department='" + department + '\'' +
                ", allCourseForStudent=" + allCourseForStudent +
                '}'+"\n --------------------------------------------------------------------------------------------------------------------------------";
    }
}
