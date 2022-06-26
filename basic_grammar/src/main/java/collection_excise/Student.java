package collection_excise;



public class Student implements Comparable<Student> {
   private String name ;
   private int age;

   public Student(){

   }
   public Student(String name , int age){
       this.name=name;
       this.age=age;
   }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }






    public int compareTo(Student s) {
        //return 0; 不比较，只输出一个对象
      // return 1;  //与后面的数比较hash值，升序输出
       //return -1; //降序输出
        //int num = this.age - s.age;//升序s2-s1

        int num = this.age-s.age;
        //年龄相同时按字母排序,compareTo() 返回 0 或者正数/负数字符串本身的排序方法
        int num2 = this.age - s.age == 0 ? this.name.compareTo(s.name) : num;
        return num2;


    }
}
