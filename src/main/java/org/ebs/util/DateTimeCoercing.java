package org.ebs.util;

import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

public class DateTimeCoercing extends DateCoercing {

    public DateTimeCoercing() {
        super.dateFormat = DateTimeFormatter.ISO_LOCAL_DATE_TIME.withZone(ZoneOffset.UTC);
    }
    

}