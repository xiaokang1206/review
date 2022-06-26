package collection_excise;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {

        TreeSet<Integer> treeSet=new TreeSet<Integer>();

        treeSet.add(12);
        treeSet.add(13);
        treeSet.add(14);
        treeSet.add(15);

        for (Integer integer : treeSet) {
           // System.out.println(integer);
        }

        TreeSet<Student> treeSet1 =new TreeSet<Student>();
        Student s1 = new Student("小黑",20);
        Student s2 = new Student("小红",30);
        Student s3 = new Student("小蓝",40);
        Student s4 = new Student("小紫",40);
        treeSet1.add(s1);
        treeSet1.add(s2);
        treeSet1.add(s3);
        for (Student student : treeSet1) {
            System.out.println(student.getName()+","+student.getAge());

        }


    }
}
