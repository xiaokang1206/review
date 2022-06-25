package collection_excise;

import domain.Student;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListDemo1 {
    public static void main(String[] args)  {
        ArrayList<String> arrayList=new ArrayList<String>();

        arrayList.add("hello1");
        arrayList.add("hello2");
        arrayList.add("hello3");
        arrayList.add("hello4");

   /*    arrayList.remove(2);//删除索引为2处的元素
        arrayList.get(2);//获取指定索引的元素
        int hello1 = arrayList.indexOf("hello1");//返回指定元素第一次出现的索引
        int hello2 = arrayList.lastIndexOf("hello2");//返回指定元素最后一次出现的索引
        arrayList.set(2,"dd");//修改指定索引位置的元素
        arrayList.get(3);//获得指定索引处的元素
        Object clone = arrayList.clone();
        System.out.println(clone==arrayList);*/

        for(int i=0;i<arrayList.size();i++){
            String s = arrayList.get(i);
            System.out.println(s);
        }

        System.out.println(arrayList);

        ArrayList<Student> saveStudent=new ArrayList<Student>();
        Student student=new Student();
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入姓名：");
        String name = sc.nextLine();
        student.setName(name);
        System.out.println("请输入年龄：");
        int age =sc.nextInt();
        student.setAge(age);
        saveStudent.add(student);

        for(int i =0;i<saveStudent.size();i++){

            Student s = saveStudent.get(i);
            System.out.println(s.getName()+s.getAge());
        }


    }
}
