package IO_exercise;

import java.io.*;

public class ObjectSerializable {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
              seria();
              unSeria();
    }
    //序列化对象

    public static void seria() throws IOException {

        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("D:\\io_test\\io_target\\java2.txt"));
        Student student=new Student("老王",30,40,50);

        oos.writeObject(student);
        oos.close();

    }

    //反序列化
    public static void unSeria() throws IOException, ClassNotFoundException {
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("D:\\io_test\\io_target\\java2.txt"));
        Object o = ois.readObject();
        Student s = (Student) o;
        Student s2=new Student();
        System.out.println(s2==s);//false

        System.out.println(s.getName());
    }
}
