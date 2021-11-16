package com.amazon.spapi.util;

import org.apache.commons.lang3.StringUtils;
import org.threeten.bp.LocalDateTime;
import org.threeten.bp.OffsetDateTime;
import org.threeten.bp.ZoneId;
import org.threeten.bp.format.DateTimeFormatter;

public class OffSetDateTimeConverter {

    /**
     * yyyy-MM-dd
     *
     * @param date
     * @return
     */
    public static OffsetDateTime convertDate(String date) {
        if (StringUtils.isBlank(date)) {
            return null;
        }
        LocalDateTime localDateTime = LocalDateTime.parse(date, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        return OffsetDateTime.of(localDateTime, ZoneId.systemDefault().getRules().getOffset(localDateTime));
    }
    /**
     * "yyyy-MM-dd HH:mm:ss"
     *
     * @param dateTime
     * @return
     */
    public static OffsetDateTime convertDateTime(String dateTime) {
        if (StringUtils.isBlank(dateTime)) {
            return null;
        }
        LocalDateTime localDateTime = LocalDateTime.parse(dateTime, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        return OffsetDateTime.of(localDateTime, ZoneId.systemDefault().getRules().getOffset(localDateTime));
    }
}
