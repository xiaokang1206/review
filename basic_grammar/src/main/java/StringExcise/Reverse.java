package StringExcise;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        System.out.println("请输入字符串");
        Scanner sc =new Scanner(System.in);
        String line = sc.nextLine();

        StringBuilder sb=new StringBuilder(line);
        StringBuilder reverse = sb.reverse();

        //  String reverse = reverse(line);
        System.out.println(reverse);


    }

    public static String reverse(String line){
StringBuilder sb=new StringBuilder();
sb.append("[");


        for(int i=line.length()-1;i>=0;i--){
            //line.length()-1 代表最后一个字符的索引
            if(i<=0){
                //第一个字符
                sb.append(line.charAt(i)) ;

            }else {
                sb.append(line.charAt(i)) ;
             sb.append(",");

            }




        }
        String ss = sb.toString();
        return ss;
    }
}
