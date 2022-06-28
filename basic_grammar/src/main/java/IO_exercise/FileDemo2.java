package IO_exercise;

import java.io.File;
import java.io.IOException;

public class FileDemo2 {
    public static void main(String[] args) throws IOException {


        File f1 = new File("D:\\io_test\\io_source\\java.txt");
        boolean newFile = f1.createNewFile();
        System.out.println(newFile);
        f1.mkdirs();//创建多级文件夹
        f1.mkdir();

File f2 =new File("..\\java.txt");//相对当前模块的路径

        System.out.println(f2.createNewFile());


    }

}
