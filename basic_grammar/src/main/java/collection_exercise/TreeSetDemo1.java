package collection_exercise;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo1 {
    public static void main(String[] args) {

        TreeSet<Student> treeSet=new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                    //this.age-s.age  升序
                int num = s1.getAge() - s2.getAge();
                int num2 = num == 0 ? s1.getName().compareTo(s2.getName()) : num;

                return num2;


            }
        });

        Student s1 = new Student("小黑",25);
        Student s2 = new Student("小红",20);
        Student s3 = new Student("小蓝",40);
        Student s4 = new Student("小紫",40);
        treeSet.add(s1);
        treeSet.add(s2);
        treeSet.add(s3);
        treeSet.add(s4);

        for (Student student : treeSet) {

            System.out.println(student);
        }

    }
}
