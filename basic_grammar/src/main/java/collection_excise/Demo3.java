package collection_excise;

import java.util.HashMap;
import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String line = sc.nextLine();
        System.out.println("请输入一个字符串");


        HashMap<Character,Integer> map=new HashMap<>();

        for (int i = 0; i <line.length(); i++) {
            char key = line.charAt(i);
            Integer value = map.get(key);
            if(value==null){
          //是第一次存
                map.put(key,1);
            }else {
                //不是第一次存
                value++;
                map.put(key,value);
            }
        }
        StringBuilder sb=new StringBuilder();
        for (Character character : map.keySet()) {

            Integer value = map.get(character);
            sb.append(character).append("(").append(value).append(")");

        }
 System.out.println(sb.toString());

    }
}
