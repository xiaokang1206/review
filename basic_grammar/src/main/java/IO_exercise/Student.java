package IO_exercise;

import java.io.Serializable;

public class Student implements Serializable {
    private static final long serialVersionUID =42L;

   private String name ;
   private int chinese;
   private int english;
   private int math;


    public Student(String name, int chinese, int english, int math) {
        this.name = name;
        this.chinese = chinese;
        this.english = english;
        this.math = math;
    }
    public Student(){

    }

    public int getChinese() {
        return chinese;
    }

    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public String getName(){

        return this.name=name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSum() {
        return this.english+this.chinese+this.math;
    }


}
