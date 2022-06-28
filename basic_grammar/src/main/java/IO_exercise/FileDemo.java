package IO_exercise;

import java.io.File;

public class FileDemo {
    public static void main(String[] args) {


        File f1 = new File("D:\\io_test\\io_source");
        File f2 = new File("D:\\io_test","io_source");
        File f3 = new File("D:\\io_test");
        File f4 = new File(f3,"java.txt");
        System.out.println(f4);
        System.out.println(f1+","+f2);

    }

}
