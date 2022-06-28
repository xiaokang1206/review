package collection_exercise;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Norepeat {
    public static void main(String[] args) {

        Set<Integer> set=new TreeSet<>();


        Random r=new Random();

        while (set.size()<10){
            int i = r.nextInt(20)+1;
            set.add(i);

        }

        System.out.println(set);

    }
}
