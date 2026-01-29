package edu.wgu.d387_sample_code.locale;

import org.springframework.stereotype.Service;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@Service
public class TimeConversion {
    public List<String> getConvertedTimes() {
        List<String> times = new ArrayList<>();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mma z");

        //System default
//        ZonedDateTime systemNow = ZonedDateTime.now();
//        times.add(formatter.format(systemNow));

        //EST
        ZonedDateTime easternNow= ZonedDateTime.now(ZoneId.of("America/New_York"));
        times.add(formatter.format(easternNow));

        //MST
        ZonedDateTime mountainNow = ZonedDateTime.now(ZoneId.of("America/Denver"));
        times.add(formatter.format(mountainNow));

        //UTC
        ZonedDateTime utcNow = ZonedDateTime.now(ZoneId.of("UTC"));
        times.add(formatter.format(utcNow));

        return times;
    }
}
