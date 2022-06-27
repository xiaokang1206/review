package collection_excise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class PokerDemo {
    public static void main(String[] args) {
        //定义牌盒
        HashMap<Integer,String> map=new HashMap<>();
        //存储索引
        ArrayList<Integer> array=new ArrayList<>();
        String[] flowers={"♥","♠","♣","□"};
        String[] numbers ={"3","4","5","6","7","8","9","10","J","Q","K","A","2"};

        int  index=0;
        for (String number : numbers) {
            for (String flower: flowers) {
                String key =number+flower;
                map.put(index,key);
                index++;
            }
        }
           //存储大小王
        map.put(index,"小王");
        index++;
        map.put(index,"大王");
        //洗牌
        Collections.shuffle(array);

        TreeSet<Integer> lqxSet=new TreeSet<>();
        TreeSet<Integer> lySet=new TreeSet<>();
        TreeSet<Integer> fqySet=new TreeSet<>();
        TreeSet<Integer> dpSet=new TreeSet<>();

        for (int i = 0; i <array.size() ; i++) {
            Integer p = array.get(i);//拿到的是集合中的索引，集合中索引是
            if(i>=array.size()-3){
                dpSet.add(i);
            }


        }


    }

}
