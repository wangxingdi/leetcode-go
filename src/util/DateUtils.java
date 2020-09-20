package util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 日期工具类
 */
public class DateUtils {

    /**
     * 默认的时间戳格式
     */
    private static final String DEFAULT_TIMESTAMP_FORMATTER = "yyyyMMddHHmmss";

    /**
     * 默认的时间戳格式
     * @return
     */
    public static String getTimestamp(){
        return getTimestamp(DEFAULT_TIMESTAMP_FORMATTER);
    }

    /**
     * 生成当前时间戳
     * @param formatter 时间戳格式
     * @return
     */
    public static String getTimestamp(String formatter){
        LocalDateTime now = LocalDateTime.now();
        return DateTimeFormatter.ofPattern(formatter).format(now);
    }
}
