package collection_exercise;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo3 {
//给学生的分数排名，名词一样按名字排名
    public static void main(String[] args) {

        TreeSet<Score> treeSet=new TreeSet<>(new Comparator<Score>() {
            @Override
            public int compare(Score s1, Score s2) {

                //降序
                int num = (s2.getChinese() + s2.getMath()) - (s1.getChinese() + s1.getMath());
                int num2 = num == 0 ? s1.getName().compareTo(s2.getName()) : num;
                return num2;
            }
        });

        Score score1 = new Score("小黑",20,50);
        Score score2 = new Score("小红",22,50);
        Score score3 = new Score("小蓝",20,40);
        Score score4 = new Score("小绿",70,50);
        treeSet.add(score1);
        treeSet.add(score2);
        treeSet.add(score3);

        treeSet.add(score4);


        for (Score score : treeSet) {

          //  System.out.println(score);
        }

    }
}
