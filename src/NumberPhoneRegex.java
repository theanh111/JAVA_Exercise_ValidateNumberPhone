import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberPhoneRegex {

    private static final String NUMBER_PHONE_REGEX = "^\\([0-9]{2}\\)-\\([0-9]{9,10}\\)$";

    public NumberPhoneRegex() {
    }

    public boolean validate(String numbers) {
        Pattern pattern = Pattern.compile(NUMBER_PHONE_REGEX);
        Matcher matcher = pattern.matcher(numbers);
        return matcher.matches();
    }
}
