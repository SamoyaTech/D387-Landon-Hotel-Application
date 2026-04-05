package edu.wgu.d387_sample_code.i18n;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Locale;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class WelcomeController {

    @Autowired
    private DisplayMessage displayMessage; //autowire to DisplayMessage class

    @GetMapping("/welcome-messageUS")
    public String getWelcomeMessageUS(Locale locale) {
        locale = Locale.US;
        //get welcome message using DisplayMessage
        return displayMessage.getWelcomeMessage(locale);
    }

    @GetMapping("/welcome-messageFr")
    public String getWelcomeMessageFr(Locale locale) {
        locale = Locale.CANADA_FRENCH;
        return displayMessage.getWelcomeMessage(locale);
    }

}
