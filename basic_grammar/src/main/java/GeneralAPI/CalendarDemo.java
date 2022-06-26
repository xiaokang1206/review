package GeneralAPI;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarDemo {

    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();

    /*    int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH) + 1;//月份从0开始
        int date = c.get(Calendar.DATE);

        System.out.println(year+"年"+month+"月"+date+"日");*/

        //打印五年前的 上个月的昨天 即2017-5-25
    /*    c.add(Calendar.YEAR,-5);
        c.add(Calendar.DATE,-1);


        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH) ;
        int date = c.get(Calendar.DATE);
        System.out.println(year+"年"+month+"月"+date+"日");*/


        c.set(2020,11,11);

       // int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH) ;
        int date = c.get(Calendar.DATE);
        //System.out.println(year+"年"+month+"月"+date+"日");


//计算一年中2月的天数
        Scanner sc=new Scanner(System.in);
       int year = sc.nextInt();

        c.set(year,2,1);
        c.add(Calendar.DATE,-1);//3月份减一日时二月份最后一天
        int i = c.get(Calendar.DATE);
        System.out.println(year+"年的二月份有"+i+"天");


    }


}
