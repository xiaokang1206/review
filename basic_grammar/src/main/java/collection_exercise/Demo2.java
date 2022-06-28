package collection_exercise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//hashmap套ArrayList
public class Demo2 {
    public static void main(String[] args) {

        ArrayList<String> arrayList1 = new ArrayList<>();
        ArrayList<String> arrayList2 = new ArrayList<>();
        HashMap<ArrayList<String>, ArrayList<String>> map = new HashMap<>();

        arrayList1.add("小黑");
        arrayList1.add("小红");
        arrayList1.add("小蓝");

        arrayList2.add("20");
        arrayList2.add("30");
        arrayList2.add("40");
        map.put(arrayList1, arrayList2);

        //获取所有map集合的键
        for (Map.Entry<ArrayList<String>, ArrayList<String>> array : map.entrySet()) {
            ArrayList<String> key = array.getKey();
            for (String s : key) {

                System.out.println(s);
            }
            ArrayList<String> value = array.getValue();
            for (String s : value) {
                System.out.println(s);
            }

        }


    }
}
