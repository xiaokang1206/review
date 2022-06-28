package collection_exercise;

import java.util.*;

public class ListIteratorDemo {
    public static void main(String[] args) {

        Collection<String> c = new ArrayList<String>();


        List<String> list=new ArrayList<String>();

        list.add("hello");
        list.add("world");
        list.add("java");

        Iterator<String> iterator = list.iterator();
        ListIterator<String> listIterator = list.listIterator();



        while (listIterator.hasNext()){
            String next = listIterator.next();
          //  System.out.println(next);
        }

        while(listIterator.hasPrevious()){
            String previous = listIterator.previous();
           // System.out.println(previous);//倒着遍历集合

        }

//三种方式遍历集合
        for (int i = 0; i < list.size(); i++) {

            String s = list.get(i);
            System.out.println(s);
        }
        System.out.println("-----------------");
        for (String s : list) {
            System.out.println(s);

        }
        System.out.println("-----------------");

        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
        }

    }

}
