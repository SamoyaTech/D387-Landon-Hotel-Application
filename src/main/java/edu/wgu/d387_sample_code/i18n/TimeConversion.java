package edu.wgu.d387_sample_code.i18n;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class TimeConversion {

    public String getConvertedTimes(){

        //base time (local system time)
        ZoneId systemZone = ZoneId.systemDefault();
        LocalDateTime localDateTime = LocalDateTime.now();
        ZonedDateTime zonedDateTime = localDateTime.atZone(systemZone);

        //time zones
        ZoneId eastern = ZoneId.of("America/New_York");
        ZoneId mountain = ZoneId.of("America/Denver");
        ZoneId utc = ZoneId.of("UTC");

        //convert times
        ZonedDateTime etTime = zonedDateTime.withZoneSameInstant(eastern);
        ZonedDateTime mtTime = zonedDateTime.withZoneSameInstant(mountain);
        ZonedDateTime utcTime = zonedDateTime.withZoneSameInstant(utc);

        //format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");

        String result;
        result = "Join us for an online live presentation held at the" +
                " Landon Hotel on May 20,2026 at " + etTime.format(formatter) +
                " ET | " + mtTime.format(formatter) + " MT | " +
                utcTime.format(formatter) + " UTC";

        return result;


    }
}
