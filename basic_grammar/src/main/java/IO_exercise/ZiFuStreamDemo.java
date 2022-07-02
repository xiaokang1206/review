package IO_exercise;

import java.io.*;
import java.util.Arrays;

public class ZiFuStreamDemo {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter  osw=new OutputStreamWriter(new FileOutputStream("D:\\io_test\\io_target\\java2.txt"));
        InputStreamReader isr=new InputStreamReader(new FileInputStream(  "D:\\io_test\\io_source\\java2.txt"));
       FileReader fr=new FileReader("D:\\io_test\\io_source\\java2.txt");
       FileWriter fw=new FileWriter("D:\\io_test\\io_target\\java2.txt");
        char[] chars=new char[1024];
        int lengh;
        while ((lengh=isr.read(chars))!=-1){
            System.out.println(new String(chars,0,lengh));//中国人不骗中国人
          osw.write(chars,0,lengh);
        }
        osw.close();
        isr.close();

    }
}
