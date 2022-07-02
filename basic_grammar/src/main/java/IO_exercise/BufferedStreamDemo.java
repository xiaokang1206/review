package IO_exercise;

import java.io.*;
import java.util.Random;

public class BufferedStreamDemo {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw=new BufferedWriter(new FileWriter("D:\\io_test\\io_target\\java2.txt"));
        BufferedReader br=new BufferedReader(new FileReader("D:\\io_test\\io_source\\java2.txt"));
        String line;
        while ((line=br.readLine())!=null){
            bw.write(line);
            bw.newLine();

                    }
        bw.close();
        br.close();



    }
}
