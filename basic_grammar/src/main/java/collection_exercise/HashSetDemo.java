package collection_exercise;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Student> hashSet=new HashSet<Student>();

        Student s1 = new Student("小黑",20);
        Student s2 = new Student("小红",30);
        Student s3 = new Student("小黑",20);

        hashSet.add(s1);
        hashSet.add(s2);
        hashSet.add(s3);

        for (Student student : hashSet) {

            System.out.println(student.getName()+" , "+student.getAge());
        }

        LinkedHashSet<Student> linkedHashSet=new LinkedHashSet<Student>();
        linkedHashSet.add(s1);
        linkedHashSet.add(s2);
        linkedHashSet.add(s3);

        for (Student student : linkedHashSet) {

            System.out.println(student.getName()+" , "+student.getAge());
        }


    }
}
