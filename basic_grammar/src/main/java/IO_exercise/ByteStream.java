package IO_exercise;

import java.io.*;

public class ByteStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fs=null;
       try {
           fs=new FileOutputStream("D:\\io_test\\io_source\\java.txt",true);

           byte[] bt={97,98,99,100};
           byte[] bytes = "abcd".getBytes();

         //  fs.write(bytes);

       }catch (Exception e){
           e.printStackTrace();
       }finally {
           if(fs!=null){
               try {
                   fs.close();
               }catch (Exception e){
                   e.printStackTrace();
               }

           }


       }


       //字节输入流
        FileInputStream fs2 =new FileInputStream("D:\\io_test\\io_source\\java.txt");

       int by;
       while ((by=fs2.read())!=-1){

           System.out.print((char)by);
       }

    }
}
