package collection_exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class PokerDemo {
    public static void main(String[] args) {


        //定义牌盒
        HashMap<Integer, String> map = new HashMap<>();
        //存储索引
        ArrayList<Integer> array = new ArrayList<>();
        String[] flowers = {"♥", "♠", "♣", "□"};
        String[] numbers = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};

        int index = 0;
        for (String number : numbers) {
            for (String flower : flowers) {
                String key = number + flower;
                map.put(index, key);
                array.add(index);
                index++;
            }
        }
        //存储大小王
        map.put(index, "小王");
        array.add(index);
        index++;
        map.put(index, "大王");
        array.add(index);
        //洗牌
        Collections.shuffle(array);

        TreeSet<Integer> lqxSet = new TreeSet<>();
        TreeSet<Integer> lySet = new TreeSet<>();
        TreeSet<Integer> fqySet = new TreeSet<>();
        TreeSet<Integer> dpSet = new TreeSet<>();

        for (int i = 0; i < array.size(); i++) {
            Integer p = array.get(i);//拿到的是集合中的索引，集合中索引是被打乱的
            if (i >= array.size() - 3) {
                dpSet.add(p);//最后三张
            }
            if (i % 3 == 2) {
                lqxSet.add(p);
            }
            if (i % 3 == 1) {
                lySet.add(p);
            }
            if (i % 3 == 0) {
                fqySet.add(p);
            }
        }

//调用看牌方法
        lookPorke("小黑",lqxSet,map);
        lookPorke("小红",lySet,map);
        lookPorke("小蓝",fqySet,map);
        lookPorke("小紫",dpSet,map);




    }
    //看牌方法
    public  static  void lookPorke(String name,TreeSet<Integer> key,HashMap<Integer, String> map){

        System.out.print(name+"的牌是：");
        for (Integer integer : key) {
            String porke = map.get(integer);
            System.out.print(porke +" ");

        }
        System.out.println();
    }

}
