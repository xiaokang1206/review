package StringExcise;

import javax.jws.soap.SOAPBinding;
import java.util.Scanner;

public class JudgeWord {
    public static void main(String[] args) {


        int bigWord=0;
        int smallWord=0;
        int number=0;

        Scanner sc =new Scanner(System.in);
        System.out.println("请输入字符串");
        String line = sc.nextLine();
        sc.nextInt();


        for (int i=0;i<line.length();i++){
            char ch =line.charAt(i);
            if(ch>='A' && ch<='Z'){
                //大写字母
                bigWord++;
            }else if(ch>='a' && ch<='z'){
                smallWord++;
            }else  if(ch>='0' && ch<='9'){
                number++;
            }

        }

/*
        for (int i=0;i<line.length();i++){
            char ch =line.charAt(i);
            if(ch>='A' && ch<='Z'){
                //大写字母
                bigWord++;
            }else if(ch>='a' && ch<='z'){
                   smallWord++;
            }else  if(ch>='0' && ch<='9'){
                 number++;
            }

        }*/
        System.out.println("大写字母："+bigWord+"小写字母:"+smallWord+"数字:"+number);
    }


}
