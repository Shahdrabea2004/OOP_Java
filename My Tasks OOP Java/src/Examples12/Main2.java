package Examples12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main2 {
    static int getNumbers() {
        try {
            return 1;
        } catch (Exception e) {
            return 2;
        } finally {
            System.out.println("Finally block runs");
            return 3;
        }
    }

    static void readFile(String filePath) {
        //code 1
//        try {
//            FileReader fileReader=new FileReader(filePath);
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }
        //code 2
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(filePath);
            System.out.println("File Content: ");
            int r = 0;
            while ((r = fileInputStream.read()) != -1) {
                System.out.print((char) r);
            }

        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        } catch (IOException ex) {
            System.out.println(ex);
        } finally {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    System.out.println(e);
                }
            }
        }
    }

    static void readFile2(String filePath) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(filePath);
        System.out.println("File Content: ");
        int r;
        while ((r = fileInputStream.read()) != -1) {
            System.out.print((char) r);
        }
        fileInputStream.close();
    }

    static void MultiReadFile(String filePath) {
        try {
            readFile(filePath);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public static void main(String[] Shahd) {
//        try {
//            var x=8/0;
//        }catch (Exception ex){
//            System.out.println(ex);
//            return;
//        }
//        finally {
//            System.out.println("Finally");
//        }

//        System.out.println(getNumbers());

//        readFile("C:\\Users\\Lenovo\\Desktop\\plan.txt");
        MultiReadFile("C:\\Users\\Lenovo\\Desktop\\plan.txt");
    }

}
