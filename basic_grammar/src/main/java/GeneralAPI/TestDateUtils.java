package GeneralAPI;

import java.text.ParseException;
import java.util.Date;

public class TestDateUtils {

    public static void main(String[] args) throws ParseException {

        //创建时间对象
        Date date=new Date();
        String s="2020-12-20 12:12:12";
        Date stringtodate = DateUtils.Stringtodate(s, "yyyy-MM-dd HH:mm:ss");
        System.out.println(stringtodate);


        String time = DateUtils.dateotString(date, "yyyy年MM月dd日 HH时mm分ss秒");
        System.out.println(time);

    }
}
