import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NumberPhoneRegex numberPhoneRegex = new NumberPhoneRegex();
        System.out.println("=== Input Number Phone ===");
        Scanner input = new Scanner(System.in);
        String numberPhoneInput = input.nextLine();
        boolean isValid = numberPhoneRegex.validate(numberPhoneInput);
        System.out.println("Number phone inputed is: " + numberPhoneInput + " - is valid: " + isValid);
    }
}
