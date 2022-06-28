package collection_exercise;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

    public static void main(String[] args) {


        Set<String> set =new HashSet<String>();

        set.add("hello");
        set.add("world");
        set.add("java");

        for (String s : set) {

            System.out.println(s);
        }

        System.out.println("你好".hashCode());
        System.out.println("哈哈".hashCode());


        HashSet<String> hashSet=new HashSet<String>();
        hashSet.add("hello");

    }






}
