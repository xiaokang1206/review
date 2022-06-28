package IO_exercise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyPicture {
    public static void main(String[] args) throws IOException {

        FileInputStream fis=new FileInputStream("D:\\io_test\\io_source\\pdx.jpg");
        FileOutputStream fos=new FileOutputStream( "D:\\io_test\\io_target\\pdx.jpg");
        byte[] bytes=new byte[1024];
        int len;
        while ((len=fis.read(bytes))!=-1){
            fos.write(bytes,0,len);
        }
         fis.close();
        fos.close();
    }
}
