package collection_exercise;

import java.util.*;

public class GenericDemo {
    public static void main(String[] args) {

        Generic generic = new Generic();
        generic.show(55);

        List<? extends Number> list1 =new ArrayList<Number>();//上限

        List<? super Number> list2 =new ArrayList<Number>();//下限

        //可变参数
                 sum(10,20,30,40,50);

        //可变参数的使用
  /*      List<String> list = Arrays.asList("hello", "world", "java");
        //list.add("javaee");//不支持添加和删除操作

        list.set(1,"javaee");
        System.out.println(list);

*/




    }
    //可变参数放最后
    public static void sum(int b,int... a){

        for (int i=0;i<a.length;i++){

            System.out.println(a[i]);
        }
           int sum =0;
        for (int i : a) {
           sum+=i;
        }
        System.out.println(sum);
    }
}
