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
     * @return
     */
    public static String getNowYearStr(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
        return sdf.format(date);
    }
}
