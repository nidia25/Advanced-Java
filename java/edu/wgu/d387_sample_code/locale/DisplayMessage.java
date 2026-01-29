package edu.wgu.d387_sample_code.locale;

import java.util.ResourceBundle;
import java.util.Locale;

public class DisplayMessage {
    private Locale locale;
    private ResourceBundle resourceBundle;

    public String getWelcomeMessages() {
        return resourceBundle.getString("welcome");
    }

    public DisplayMessage() {
    }

    public DisplayMessage(String language, String country) {
        locale = new Locale(language, country);
        resourceBundle = ResourceBundle.getBundle("Translation", locale);
        System.out.printf("%s, %s%n", language, country);
    }
}

