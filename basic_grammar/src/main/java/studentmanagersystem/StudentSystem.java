package studentmanagersystem;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystem {

    public static void main(String[] args) {
        ArrayList<Student> array=new ArrayList<Student>();
         Student stu = new Student();
         Scanner sc =new Scanner(System.in);

        int i=1;
        while (i>=1&&i<=5) {
            System.out.println("------------欢迎来到学生管理系统---------------");
            System.out.println("1.添加学生");
            System.out.println("2.查看所有学生");
            System.out.println("3.删除学生");
            System.out.println("4.修改学生");
            System.out.println("5.退出");
            System.out.println("请输入你的选择：");
             i = sc.nextInt();

            switch (i) {
                case 1: {
                    addStudent(array);//添加学生
                    i=1;
                    break;
                }
                case 2: {
                    findStudent(array);//查看学生
                    i=2;
                    break;
                }
                case 3: {
                    deleteStudent(array);//删除学生
                    i=3;
                    break;
                }
                case 4: {
                    modifyStudent(array);//修改学生
                    i=4;
                    break;
                }
                case 5: {
                    System.exit(0);//退出
                    i=5;
                    break;
                }
                default: {
                    System.out.println("对不起，您的输入有误！");
                }

            }

        }

    }
    //添加学生
    public static void addStudent(ArrayList<Student> array){

        Scanner sc =new Scanner(System.in);
        Student stu = new Student();

        System.out.println("请输入学生学号：");
        String sid = sc.nextLine();

        System.out.println("请输入学生姓名：");
        String name = sc.nextLine();

        System.out.println("请输入学生年龄：");
        String age = sc.nextLine();

        System.out.println("请输入学生地址：");
        String address = sc.nextLine();
        for (int i=0;i<array.size();i++){
            Student student = array.get(i);
            if(sid.equals(student.getSid())){
                //学号已存在
                System.out.println("你输入的学号已存在，请重新输入");
                break;
            }
        }

        //封装对象
        stu.setSid(sid);
        stu.setName(name);
        stu.setAge(age);
        stu.setAddress(address);

        //将对象存入集合
        array.add(stu);
        System.out.println("保存成功");

    };
    //查看所有学生
    public static void findStudent(ArrayList<Student> array){
        if(array.size()==0){
            System.out.println("请输入学生数据后再查询");
            return;
        }
            //遍历集合
            for (int i = 0; i < array.size(); i++) {
                Student student = array.get(i);
                System.out.println("学号：" + student.getSid() + "  姓名：" + student.getName() + "  年龄：" + student.getAge() +
                        "  家庭住址：" + student.getAddress());


        }
    };
    //删除学生
    public static void deleteStudent(ArrayList<Student> array){
        System.out.println("请输入你要删除学生的学号：");
        Scanner sc =new Scanner(System.in);
        String delsid = sc.nextLine();
        int index = -1;

        for (int i = 0; i < array.size(); i++) {
            Student student = array.get(i);
            String sid = student.getSid();
            if (delsid.equals(sid)){
                index =i;
                break;
            }
        }

        if (index!=-1){

              array.remove(index);
            System.out.println("删除成功");

        }else {
            System.out.println("您输入的学号不存在，请重新输入");
        }
    };
    //修改学生
    public static void modifyStudent(ArrayList<Student> array){
        System.out.println("请输入你要修改学生的学号：");
        Student student=new Student();
        Scanner sc =new Scanner(System.in);
        String sid = sc.nextLine();

        System.out.println("请输入新姓名");
        String newname = sc.nextLine();
        System.out.println("请输入新年龄");
        String newage = sc.nextLine();
        System.out.println("请输入新地址");
        String newaddress = sc.nextLine();

        student.setSid(sid);
        student.setName(newname);
        student.setAge(newage);
        student.setAddress(newaddress);




        for(int i=0;i<array.size();i++){
            Student s = array.get(i);
            if(sid.equals(s.getSid())){
                array.set(i,student);
                System.out.println("修改成功");
                break;
            }else {
                System.out.println("你输入的学号不存在");
            }

        }
    };
}
