package GeneralAPI;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
    //字符串转日期
    public static Date Stringtodate(String s,String format) throws ParseException {
        SimpleDateFormat sdf=new SimpleDateFormat(format);
        return sdf.parse(s);
    }
//日期转字符串

    public static String dateotString(Date date,String format){
        SimpleDateFormat sdf=new SimpleDateFormat(format);
        return  sdf.format(date);
    }

}
