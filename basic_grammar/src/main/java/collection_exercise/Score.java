package collection_exercise;

public class Score  {
   private String name ;
   private int chinese;
   private  int math;

   public Score(){

   }

    public Score(String name, int chinese, int math) {
        this.name = name;
        this.chinese = chinese;
        this.math = math;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChinese() {
        return chinese;
    }

    @Override
    public String toString() {
        return "Score{" +
                "name='" + name + '\'' +
                ", chinese=" + chinese +
                ", math=" + math +
                '}';
    }

    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }
}
