package Task_1;
import java.util.*;
public class Courses {
    private String course;
    private int courseCode;

    private static int no=0;

    private static HashMap<Integer, String> allCourse = new HashMap<>();

    public Courses() {
    }

    public Courses(String course) {
        this.course = course;
        ++no;
        this.courseCode = no;
        this.allCourse.put(courseCode,course);
    }
    public static void displayCourses() {
        System.out.println("Available Courses");
        int cnt=1;
        for (Map.Entry<Integer, String> entry : allCourse.entrySet()) {
            System.out.println(cnt+"."+"Code: " + entry.getKey() + ", Course: " + entry.getValue());
            ++cnt;
        }
    }
    public static String getCourseByCode(int code) {
        return allCourse.getOrDefault(code, null);
    }

}
