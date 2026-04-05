package edu.wgu.d387_sample_code.i18n;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class TimeZoneConversionController {

    @GetMapping("/api/time-conversion")
    public String getTimes(){
        TimeConversion tc = new TimeConversion();
        return tc.getConvertedTimes();

    }
}
