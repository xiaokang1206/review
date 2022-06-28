package collection_exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {

    public static void main(String[] args) {


        Map<String,Student> map=new HashMap<>();

        Student student = new Student("小黑",20);
        Student student1 = new Student("小黑",20);

        map.put("1号",student);
        map.put("2号",student1);

        //方式1
        Set<Map.Entry<String, Student>> entries = map.entrySet();

        for (Map.Entry<String, Student> entry : entries) {
            String key = entry.getKey();//获取键
            Student value = entry.getValue();
            System.out.println(key+","+value);


        }
        //方式2
        Set<String> keys = map.keySet();//获取所有键
        for (String key : keys) {
            Student integer = map.get(key);
            System.out.println(key+","+integer);


        }

    }
}
