package org.ebs.util;

import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Component;

@Component
public class DateTimeCoercing extends DateCoercing {

    public static final DateTimeFormatter DATETIME_FORMAT = DateTimeFormatter.ISO_LOCAL_DATE_TIME.withZone(ZoneOffset.UTC);
    public DateTimeCoercing() {
        super.dateFormat = DATETIME_FORMAT;
    }


}