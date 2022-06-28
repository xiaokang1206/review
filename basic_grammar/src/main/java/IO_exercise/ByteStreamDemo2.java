package IO_exercise;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ByteStreamDemo2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("D:\\io_test\\io_source\\java.txt");
        byte[] by=new byte[1024];//存储读取到的数据
        int len;//实际读取数据的个数，存储空间位1024是，一次性最多可以都1024个字节
        while((len=fis.read(by))!=-1){

            System.out.println(new String(by,0,len));
        }
    }
}
