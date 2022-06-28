package IO_exercise;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos=new FileOutputStream("D:\\io_test\\io_target\\java2.txt");
        FileInputStream fis=new FileInputStream("D:\\io_test\\io_source\\java.txt");

        int  by;

        while((by=fis.read())!=-1){
            fos.write(by);
        }
        fis.close();
        fos.close();

    }
}
