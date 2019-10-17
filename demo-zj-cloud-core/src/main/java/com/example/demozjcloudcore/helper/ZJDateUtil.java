package com.example.demozjcloudcore.helper;

import org.joda.time.*;
import org.joda.time.format.DateTimeFormat;

import java.sql.Timestamp;
import java.util.Date;

public class ZJDateUtil {

    private static DateTime dateTime;

    /**
     * 前一个
     */
    private static final Integer PREVIOUS = -1;

    /**
     * 后一个
     */
    private static final Integer NEXT = 1;

    /**
     * Style : yyyy-MM-dd HH:mm:ss
     */
    public static final String FORMAT_TYPE_1 = "yyyy-MM-dd HH:mm:ss";
    /**
     * Style : yyyy-MM-dd
     */
    public static final String FORMAT_TYPE_2 = "yyyy-MM-dd";
    /**
     * Style : yyyyMMdd
     */
    public static final String FORMAT_TYPE_3 = "yyyyMMdd";
    /**
     * Style : yyyyMMddHHmmss
     */
    public static final String FORMAT_TYPE_4 = "yyyyMMddHHmmss";
    /**
     * Style : HH:mm:ss
     */
    public static final String FORMAT_TYPE_5 = "HH:mm:ss";
    /**
     * Style : HHmmss
     */
    public static final String FORMAT_TYPE_6 = "HHmmss";
    /**
     * Style : yyyy/MM/dd HH:mm:ss
     */
    public static final String FORMAT_TYPE_7 = "yyyy/MM/dd HH:mm:ss";
    /**
     * Style : yyyy/MM/dd
     */
    public static final String FORMAT_TYPE_8 = "yyyy/MM/dd";
    public static final String FORMAT_TYPE_9 = "yyyy-MM-dd-HH-mm-ss.SSS";
    public static final String FORMAT_TYPE_10 = "yyyyMMddHHmmssSSS";

    /**
     * 获取DateTime对象
     *
     * @return 返回一个joda的时间实例
     */
    public static DateTime getDateTime() {
        dateTime = new DateTime();
        return dateTime;
    }

    /**
     * 根据给定时间构建一个DateTime对象
     *
     * @param date
     * @return 返回一个joda的时间实例
     */
    public static DateTime getDateTime(Date date) {
        dateTime = new DateTime(date.getTime());
        return dateTime;
    }

    /**
     * 根据提供的时间构建一个时间点
     *
     * @param year  int
     * @param month int
     * @param day   int
     * @return 返回一个java.util.Date的时间实例
     */
    public static Date newDate(int year, int month, int day) {
        dateTime = new DateTime(year, month, day, 0, 0);
        return dateTime.toDate();
    }

    /**
     * 根据提供的时间构建一个时间点
     *
     * @param year
     * @param month
     * @param day
     * @param hour
     * @param minute
     * @param second
     * @return 返回一个java.util.Date的时间实例
     */
    public static Date newDate(int year, int month, int day, int hour, int minute, int second) {
        dateTime = new DateTime(year, month, day, hour, minute, second);
        return dateTime.toDate();
    }

    /**
     * 构建当前时间点
     *
     * @return 返回一个java.util.Date的时间实例
     */
    public static Date now() {
        return DateTime.now().toDate();
    }

    /**
     * 返回给定时间的step天,可以是前几天，也可以是后几天
     *
     * @param date
     * @param step
     * @return 返回一个java.util.Date的时间实例
     */
    public static Date offsetDate(Date date, int step) {
        dateTime = new DateTime(date.getTime());
        return dateTime.plusDays(step).toDate();
    }

    /**
     * 返回明天
     *
     * @return 返回一个java.util.Date的时间实例
     */
    public static Date tomorrow() {
        return offsetDate(now(), NEXT);
    }

    /**
     * 返回昨天
     *
     * @return 返回一个java.util.Date的时间实例
     */
    public static Date yesterday() {
        return offsetDate(now(), PREVIOUS);
    }

    /**
     * 返回给定时间的step月,可以是前几月，也可以是后几月
     *
     * @param date
     * @param step
     * @return 返回一个java.util.Date的时间实例
     */
    public static Date offsetMonth(Date date, int step) {
        dateTime = new DateTime(date.getTime());
        return dateTime.plusMonths(step).toDate();
    }

    /**
     * 返回前一个月
     *
     * @return 返回一个java.util.Date的时间实例
     */
    public static Date preMonth() {
        return offsetMonth(now(), PREVIOUS);
    }

    /**
     * 返回下一个月
     *
     * @return 返回一个java.util.Date的时间实例
     */
    public static Date nextMonth() {
        return offsetMonth(now(), NEXT);
    }

    /**
     * 返回给定时间的step小时,可以是前小时，也可以是后小时
     *
     * @param date
     * @param step
     * @return 返回一个java.util.Date的时间实例
     */
    public static Date offsetHour(Date date, int step) {
        dateTime = new DateTime(date.getTime());
        return dateTime.plusHours(step).toDate();
    }

    /**
     * 返回前一个小时
     *
     * @return 返回一个java.util.Date的时间实例
     */
    public static Date preHour() {
        return offsetHour(now(), PREVIOUS);
    }

    /**
     * 返回指定时间的前一个小时
     *
     * @return 返回一个java.util.Date的时间实例
     */
    public static Date preHour(Date date) {
        return offsetHour(date, PREVIOUS);
    }

    /**
     * 返回下一个小时
     *
     * @return 返回一个java.util.Date的时间实例
     */
    public static Date nextHour() {
        return offsetHour(now(), NEXT);
    }

    /**
     * 返回指定时间的下一个小时
     *
     * @return 返回一个java.util.Date的时间实例
     */
    public static Date nextHour(Date date) {
        return offsetHour(date, NEXT);
    }

    /**
     * 返回给定时间的step分钟,可以是前几分钟，也可以是后几分钟
     *
     * @param date
     * @param step
     * @return 返回一个java.util.Date的时间实例
     */
    public static Date offsetMinus(Date date, int step) {
        dateTime = new DateTime(date.getTime());
        return dateTime.plusMinutes(step).toDate();
    }

    /**
     * 返回指定时间的前一分钟
     *
     * @param date
     * @return 返回一个java.util.Date的时间实例
     */
    public static Date preMinus(Date date) {
        return offsetDate(date, PREVIOUS);
    }

    /**
     * 返回当前时间的前一分钟
     *
     * @return 返回一个java.util.Date的时间实例
     */
    public static Date preMinus() {
        return offsetMinus(now(), PREVIOUS);
    }

    /**
     * 返回指定时间的后一分钟
     *
     * @param date
     * @return 返回一个java.util.Date的时间实例
     */
    public static Date nextMinus(Date date) {
        return offsetMinus(date, NEXT);
    }

    /**
     * 返回当前的时间的后一分钟
     *
     * @return 返回一个java.util.Date的时间实例
     */
    public static Date nextMinus() {
        return offsetMinus(now(), NEXT);
    }

    /**
     * 解析字符串为日期,使用的日期格式默认为yyyy-MM-dd HH:mm:ss
     *
     * @param dateStr
     * @return 返回一个java.util.Date的时间实例
     */
    public static Date parseDate(String dateStr) {
        return parseDate(dateStr, FORMAT_TYPE_1);
    }

    /**
     * 根据指定的时间格式解析字符串成日期
     *
     * @param dateStr
     * @param pattern
     * @return 返回一个java.util.Date的时间实例
     */
    public static Date parseDate(String dateStr, String pattern) {
        return DateTimeFormat.forPattern(pattern).parseDateTime(dateStr).toDate();
    }

    /**
     * 根据指定的格式将日期转换成字符串
     *
     * @param date    Date
     * @param pattern
     * @return 返回一个时间给定的字符串格式
     */
    public static String formatDate(Date date, String pattern) {
        dateTime = new DateTime(date.getTime());
        return dateTime.toString(pattern);
    }

    /**
     * 根据指定的格式将日期转换成字符串
     *
     * @param date    Long
     * @param pattern
     * @return 返回一个时间给定的字符串格式
     */
    public static String formatDate(Long date, String pattern) {
        dateTime = new DateTime(date);
        return dateTime.toString(pattern);
    }

    /**
     * 判断start是否在end之前
     *
     * @param start
     * @param end
     * @return 返回两个时间的比较结果
     */
    public static boolean compareDate(Date start, Date end) {
        dateTime = new DateTime(start.getTime());
        return dateTime.isBefore(end.getTime());
    }

    /**
     * 返回start和end日期之间相隔的月数
     *
     * @param start
     * @param end
     * @return int 返回start和end日期之间相隔的月数
     */
    public static int getMonthNum(Date start, Date end) {
        int num = Months.monthsBetween(getDateTime(start), getDateTime(end)).getMonths();
        return Math.abs(num);
    }

    /**
     * 返回start和end日期之间相隔的天数
     *
     * @param start
     * @param end
     * @return int 返回两个时间相隔多少天
     */
    public static int getDayNum(Date start, Date end) {
        int num = Days.daysBetween(getDateTime(start), getDateTime(end)).getDays();
        return Math.abs(num);
    }

    /**
     * 返回start和end日期之间相隔的小时数
     *
     * @param start
     * @param end
     * @return 返回两个时间相隔多少小时
     */
    public static int getHourNum(Date start, Date end) {
        int num = Hours.hoursBetween(getDateTime(start), getDateTime(end)).getHours();
        return Math.abs(num);
    }

    /**
     * 返回start和end日期之间相隔的分钟数
     *
     * @param start
     * @param end
     * @return 返回两个时间相隔多少分钟
     */
    public static int getMinusNum(Date start, Date end) {
        int num = Minutes.minutesBetween(getDateTime(start), getDateTime(end)).getMinutes();
        return Math.abs(num);
    }

    /**
     * 返回start和end日期之间相隔的秒数
     *
     * @param start
     * @param end
     * @return 返回两个时间相隔多少秒
     */
    public static int getSecondNum(Date start, Date end) {
        int num = Seconds.secondsBetween(getDateTime(start), getDateTime(end)).getSeconds();
        return Math.abs(num);
    }

    /**
     * 返回当前时间的Timestamp类型
     *
     * @return 返回一个当前时间的java.sql.Timestamp形式
     */
    public static Timestamp getTimestamp() {
        return new Timestamp(now().getTime());
    }

    /**
     * 返回指定日期的timestamp类型
     *
     * @param date
     * @return 返回指定日期的java.sql.Timestamp形式
     */
    public static Timestamp getTimestamp(Date date) {
        return new Timestamp(date.getTime());
    }

    /**
     * 判断当前传入的时间是否是闰年
     *
     * @param date
     * @return boolean 返回是否是闰年
     */
    public static Boolean isLeapYear(Date date) {
        return getDateTime(date).yearOfEra().isLeap();
    }

    /**
     * 判断当前传入的时间是否是闰月
     *
     * @param date
     * @return boolean 判断是否是闰月
     */
    public static Boolean isLeapMonth(Date date) {
        return getDateTime(date).monthOfYear().isLeap();
    }

    /**
     * 获取当前传入时间的月份X
     *
     * @param date
     * @return int 获取当前时间的月份
     */
    public static int getMonthNum(Date date) {
        return getDateTime(date).monthOfYear().get();
    }

    /**
     * 获取传入时间是星期X
     *
     * @param date
     * @return int 获取当前时间的是一周的第几天
     */
    public static int getWeekNum(Date date) {
        return getDateTime(date).dayOfWeek().get();
    }

    /**
     * 获取当前时间的字符串，格式为yyyyMMddHHmmssSSS
     *
     * @return String 获取当前时间的字符串，格式为yyyyMMddHHmmssSSS
     */
    public static String getNowDateString() {
        return formatDate(now(), "yyyyMMddHHmmssSSS");
    }


    /**
     * Description: 获取当前年份
     *
     * @param date
     * @return
     * @Version1.0 2017年4月14日 上午10:11:59 by wanggengwu (wanggengwu@csii.com.cn)
     */
    public static String getYear(Date date) {
        String year = formatDate(date, "yyyy");
        return year;
    }

    /**
     * Description: 获取当前月份
     *
     * @param date
     * @return
     * @Version1.0 2017年4月14日 上午10:11:59 by wanggengwu (wanggengwu@csii.com.cn)
     */
    public static String getMonth(Date date) {
        String month = formatDate(date, "MM");
        return month;
    }

    /**
     * Description: 获取当前天数
     *
     * @param date
     * @return
     * @Version1.0 2017年4月14日 上午10:11:59 by wanggengwu (wanggengwu@csii.com.cn)
     */
    public static String getDay(Date date) {
        String day = formatDate(date, "dd");
        return day;
    }

    /**
     * Description: 获取当前小时
     *
     * @param date
     * @return
     * @Version1.0 2017年4月14日 上午10:11:59 by wanggengwu (wanggengwu@csii.com.cn)
     */
    public static String getHour(Date date) {
        String hour = formatDate(date, "HH");
        ;
        return hour;
    }

    /**
     * Description: 获取分钟
     *
     * @param date
     * @return
     * @Version1.0 2017年4月14日 上午10:11:59 by wanggengwu (wanggengwu@csii.com.cn)
     */
    public static String getMinute(Date date) {
        String minute = formatDate(date, "mm");
        ;
        return minute;
    }

    /**
     * Description: 获取秒数
     *
     * @param date
     * @return
     * @Version1.0 2017年4月14日 上午10:11:59 by wanggengwu (wanggengwu@csii.com.cn)
     */
    public static String getSecond(Date date) {
        String second = formatDate(date, "ss");
        ;
        return second;
    }

}
