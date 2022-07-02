package IO_exercise;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetToFileDemo {
    public static void main(String[] args) throws IOException {
        TreeSet<Student> set=new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                //总分从高到低
                int num = s2.getSum() - s1.getSum();
                int num2 = num==0 ? s2.getEnglish() - s1.getEnglish():num;
                int num3=num2==0 ? s2.getChinese()-s1.getChinese():num2;
                int num4 =num3==0?s2.getName().compareTo(s1.getName()):num3;
                return num4;
            }
        });



         //键盘录入5个学生数据

        for (int i = 0; i < 3; i++) {
            Scanner sc=new Scanner(System.in);
            System.out.println("请录入第"+(i+1)+"位学生信息");
            System.out.println("姓名：");
            String name = sc.nextLine();
            System.out.println("请录入语文成绩");
            int chinese = sc.nextInt();
            System.out.println("请录入数学成绩");
            int math = sc.nextInt();
            System.out.println("请录入英语成绩");
            int english = sc.nextInt();

            Student student=new Student();
                    student.setName(name);
                    student.setChinese(chinese);
                    student.setEnglish(english);
                    student.setMath(math);
                     set.add(student);
        }

        BufferedWriter bw=new BufferedWriter(new FileWriter("D:\\io_test\\io_target\\java2.txt",true));
        for (Student student1 : set) {
                 StringBuilder sb=new StringBuilder();

            sb.append(student1.getName()).append(",").append(student1.getChinese()).append(",").
             append(student1.getMath()).append(",").append(student1.getEnglish());

            bw.write(sb.toString());
            bw.newLine();
            bw.flush();


        }

         bw.close();

    }
}
