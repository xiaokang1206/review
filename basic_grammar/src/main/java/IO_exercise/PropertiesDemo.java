package IO_exercise;

import java.io.*;
import java.util.*;

public class PropertiesDemo {
    public static void main(String[] args) throws IOException {
      myLoad();
        //myStore();
    }
    private static void myLoad() throws IOException {
        Properties properties=new Properties();
        FileReader fr=new FileReader("D:\\io_test\\io_target\\java2.txt");
        properties.load(fr);//将文件中的键值对，加载到集合
        fr.close();
        System.out.println(properties);
    }

    private static void myStore() throws IOException {
        Properties properties=new Properties();
          properties.setProperty("老表","hhh");

        FileWriter fw=new FileWriter("D:\\io_test\\io_target\\java2.txt");

        properties.store(fw,null);//将集合中的键值对，写到文件中
        fw.close();

    }
}
