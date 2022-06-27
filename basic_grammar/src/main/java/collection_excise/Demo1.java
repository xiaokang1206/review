package collection_excise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
//array套hash
public class Demo1 {
    public static void main(String[] args) {
        ArrayList<HashMap<String,String>> array=new ArrayList<>();
        HashMap<String,String> map=new HashMap<>();
        map.put("小黑1","20");
        map.put("小红1","30");
        map.put("小蓝1","40");
        HashMap<String,String> map2=new HashMap<>();
        map2.put("小黑2","20");
        map2.put("小红2","30");
        map2.put("小蓝2","40");
        HashMap<String,String> map3=new HashMap<>();
        map3.put("小黑3","20");
        map3.put("小红3","30");
        map3.put("小蓝3","40");

        array.add(map);
        array.add(map2);
        array.add(map3);


        for (HashMap hashMap : array) {
            Set<Map.Entry<String, String>> entries = map.entrySet();
            for (Map.Entry<String, String> entry : entries) {
                String key = entry.getKey();
                String value = entry.getValue();
                System.out.println(key+","+value);
            }


        }
    }
}
