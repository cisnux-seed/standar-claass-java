package dev.cisnux.standards.app;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class RegexApp {
    public static boolean isEmailAddressValid(String emailAddress) {
        if (emailAddress == null || emailAddress.isEmpty()) {
            return false; // Handle empty email addresses
        }

        // Regular expression for RFC 5322 compliant email addresses
        String emailRegex = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*$";

        // Compile the regular expression to improve efficiency
        Pattern pattern = Pattern.compile(emailRegex);
        return pattern.matcher(emailAddress).matches();
    }


    public static void main(String[] args) {
        final String query = "Fajra Risqulla Cisnux Java Programming";
        final Pattern pattern = Pattern.compile("[a-zA-Z]*s[a-zA-Z]*");
        final Matcher matcher = pattern.matcher(query);
        System.out.println(matcher.hasMatch());
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
        System.out.println(matcher.matches());
        System.out.println(isEmailAddressValid("fajra@gmail.com"));
        System.out.println(isEmailAddressValid("fajragm.ail.co"));
    }
}
