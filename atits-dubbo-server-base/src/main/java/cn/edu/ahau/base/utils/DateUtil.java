package cn.edu.ahau.base.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author zhangys
 * @date 2020/4/21
 */
public class DateUtil {

    /**
     * 获取当前年份字符串
     * @return String 年份
     */
    public static String getStringForNowY() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
        return sdf.format(new Date());
    }

    /**
     * 获取当前（年月日 时分秒）字符串
     * @return String 年月日 时分秒
     */
    public static String getStringForNowYMDHMS() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(new Date());
    }

}
