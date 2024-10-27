package on.focus0147.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * Проверим пароль на условия
 */

public class PasswordCheck {
    private static final String SPECIAL_CHARS = "!@#$%^&*()-+";
    private static final String REGEXP = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[" + SPECIAL_CHARS + "]).{8,}$";
    private static final Pattern pattern = Pattern.compile(REGEXP, Pattern.CASE_INSENSITIVE);

    public static void main( String[] args ) {
        run("1Password1 Pass@word 12345 pass!word Passw@rd Password1!");
    }

    public static void run(String input){
        String[] passwords = input.split(" ");

        //через for
        List<String> res1 = new ArrayList<>();
        for (String password : passwords) {
            if (isValidPassword(password)) {
                res1.add(password);
            }
        }
        System.out.println(String.join(" ", res1));

        //через stream
        String res2 = Arrays.stream(passwords).filter(str -> isValidPassword(str)).collect(Collectors.joining(" "));
        System.out.println(res2);

        //через stream и regex
        String res3 = Arrays.stream(passwords).filter(str -> pattern.matcher(str).matches()).collect(Collectors.joining(" "));
        System.out.println(res3);
    }

    /**
     * Проверим, что пароль больше 8 символов.
     * Содержит букву верхнего регистра
     * Содержит букву нижнего регистра
     * Содержит особый символ
     * Содержит цифру
     * @param password пароль
     * @return прошел ли проверку
     */
    private static boolean isValidPassword(String password){
        boolean hasUp = false;
        boolean hasLow = false;
        boolean hasSpecial = false;
        boolean hasDigit = false;

        if(password.length() <8){
            return false;
        }

        for(int i = 0; i< password.length(); i++){
            char symbol = password.charAt(i);

            if(Character.isUpperCase(symbol)){
                hasUp = true;
            } else if(Character.isLowerCase(symbol)){
                hasLow = true;
            } else if(SPECIAL_CHARS.contains(String.valueOf(symbol))){
                hasSpecial = true;
            }
            else if (Character.isDigit(symbol)) {
                hasDigit = true;
            }
        }

        return hasUp && hasLow && hasSpecial && hasDigit;
    }
}
