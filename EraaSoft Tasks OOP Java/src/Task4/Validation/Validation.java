package Task4.Validation;

import Task4.model.Player;
import Task4.model.Student;

public class Validation {
    public static boolean validatePlayer(Player player){
        if(player.getId()>0&&(player.getNumber()>0&&player.getNumber()<=99)){
            return true;
        }
        return false;
    }

    public static boolean validateStudent(Student student){
        if(student.getId()>0&&(student.getAge()>7&&student.getAge()<30)){
            return true;
        }
        return false;
    }
}
