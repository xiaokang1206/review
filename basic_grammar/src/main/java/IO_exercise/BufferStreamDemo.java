package IO_exercise;

import java.io.*;

public class BufferStreamDemo {
    public static void main(String[] args) throws IOException {


        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("D:\\io_test\\io_target\\java2.txt"));
        BufferedInputStream bis=new BufferedInputStream(new FileInputStream("D:\\io_test\\io_source\\java2.txt"));
//内置一个8192个字节的缓冲区
        byte[] by=new byte[1024];
        int len ;
        while ( (len=bis.read(by))!=-1){

            bos.write(by,0,len);
        }
        bos.close();
        bis.close();

//bos.write("hello");

    }
}
