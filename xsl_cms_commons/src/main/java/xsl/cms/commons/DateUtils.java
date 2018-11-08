package xsl.cms.commons;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 时间工具类
 */
public class DateUtils {
    private static String format = "yyyy-MM-dd hh-mm-ss";

    private static SimpleDateFormat sdf = new SimpleDateFormat(format);

    private DateUtils(){

    }

    private static String getStrTime(Date date){
        return sdf.format(date);
    }

    private static Date getDateTime(String date){
        Date time = null;
        try {
            time = sdf.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return time;
    }

    public static int getDaysOfMonth(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
    }
}
