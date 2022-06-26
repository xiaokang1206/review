package GeneralAPI;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) throws ParseException {


        Date d1=new Date();
        System.out.println(d1);//输出的是当前时间

        long date = 1000*60*60;
        Date d2=new Date(date);
        System.out.println(d2);//Thu Jan 01 09:00:00 CST 1970  (伦敦时间)


        System.out.println(d1.getTime());//1970年到现在的毫秒值

        //给定毫秒值，设置从1970年到该指定毫秒值时间
        d1.setTime(date);//Thu Jan 01 09:00:00 CST 1970
        System.out.println(d1);

        long time =System.currentTimeMillis();
        System.out.println(time);//1656228365918
        d1.setTime(time);
        System.out.println(d1);//Sun Jun 26 15:25:39 CST 2022


        SimpleDateFormat sdf=new SimpleDateFormat();
        String format = sdf.format(d1);
        System.out.println(format);

        SimpleDateFormat sdf2=new SimpleDateFormat("yyyy年MM月dd日HH时mm分ss秒");
        String format2 = sdf2.format(d1);
        System.out.println(format2);

        String ss="2020-6-26 11:11:11";
        SimpleDateFormat sdf3=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date format3 = sdf3.parse(ss);
        System.out.println(format3);


    }
}
