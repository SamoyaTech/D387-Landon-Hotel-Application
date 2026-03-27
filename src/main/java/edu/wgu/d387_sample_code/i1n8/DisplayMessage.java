package edu.wgu.d387_sample_code.i1n8;

import org.springframework.stereotype.Component;
import java.util.Locale;
import java.util.ResourceBundle;

@Component
public class DisplayMessage {
    public String getWelcomeMessage(Locale locale) {
        ResourceBundle bundle = ResourceBundle.getBundle("translation", locale);
        return bundle.getString("welcomeMessage");
    }
}
