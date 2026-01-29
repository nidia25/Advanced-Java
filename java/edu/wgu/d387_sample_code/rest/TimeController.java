package edu.wgu.d387_sample_code.rest;

import edu.wgu.d387_sample_code.locale.TimeConversion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

@RestController
@CrossOrigin
@RequestMapping("/time")

public class TimeController {
    @Autowired
    private TimeConversion timeConversion;

    @GetMapping("/presentation")
   public List<String>getConvertedTimes() {
        return timeConversion.getConvertedTimes();
    }
}











//@CrossOrigin(origins = "*")
//@RestController
//
//
//public class TimeController {
//    final private String startTime = "7:00PM EST";
//    final private String dateTimeFormat = "hh:mma z";
//    final private String[] timeZones = new String[]{"EST", "MST", "UTC"};
//    private SimpleDateFormat timeFormater = new SimpleDateFormat(dateTimeFormat);
//
//    @GetMapping("/presentation")
//    public ResponseEntity<List<String>> getPresentationTimes() {
//        List<String> presentationTimes = new ArrayList<String>();
//
//        try {
//            Date date = timeFormater.parse(startTime);
//
//            for (String t : timeZones) {
//                //Set timezone
//                TimeZone tz = TimeZone.getTimeZone(t);
//                timeFormater.setTimeZone(tz);
//                //startDate to timeZone
//                String dateOut = timeFormater.format(date);
//                presentationTimes.add(dateOut);
//            }
//
//            //EST
//            TimeZone tzEST = TimeZone.getTimeZone("EST");
//            timeFormater.setTimeZone(tzEST);
//
//            TimeZone tzMST = TimeZone.getTimeZone("MST");
//
//            TimeZone tzUTC = TimeZone.getTimeZone("UTC");
//
//        } catch (Exception e) {
//            System.out.println(e.toString());
//            presentationTimes.add(e.toString());
//        }
//        return ResponseEntity.ok(presentationTimes);
//    }
//}
//
//
//

