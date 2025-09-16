package Examples12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main3 {
    public static void validated(int num){
        if(num<0){
            ArithmeticException arithmeticException=new ArithmeticException("Noooooo");
            throw arithmeticException;

        }
        else{
            System.out.println("Yesssssssssss");
        }
    }
    public static void read(int num)throws FileNotFoundException  {
        if(num<0){
           FileInputStream fileInputStream=new FileInputStream("File not found");
           //or
            throw new FileNotFoundException("file Not Found using throw");
        }
        else{
            System.out.println("Yesssssssssss");
        }
    }

    public static void main(String[] shra) {
        try {
            validated(-1);
        }catch (ArithmeticException ex){
            System.out.println(ex);
        }

        try {
            read(-5);
        } catch (FileNotFoundException e) {
            System.out.println("Caught: " + e);
        }


    }
}
