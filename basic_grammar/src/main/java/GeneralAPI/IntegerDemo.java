package GeneralAPI;

import java.util.Arrays;

public class IntegerDemo {
    public static void main(String[] args) {

       Integer integer = Integer.valueOf(100);

       //int --> string
        //方式1
        int nuber=100;
        String s=""+100;

        //方式2
        String s1 = String.valueOf(nuber);

       //string -->int
        String s2="100";
        int i = Integer.parseInt(s2);



        //将字符串类型的数组转换为int类型的数组，并排序
        String s3 ="91 27 64 38 50";
        String[] strings = s3.split(" ");
        int[]  arry =new int[strings.length];

            for (int k = 0; k < arry.length; k++) {
               arry[k] =  Integer.parseInt(strings[k]);

            }
        Arrays.sort(arry);

            StringBuilder sb =new StringBuilder();
        for (int j = 0; j < arry.length; j++) {
            if(j==arry.length-1){
                sb.append(arry[j]);

            }else {
                sb.append(arry[j]).append(" ");
            }
        }
        String result = sb.toString();

        System.out.println(result);
    }
}
