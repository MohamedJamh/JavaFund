package functionalinterface;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
//        System.out.println(isPhoneNumberValidPredicate.and(containNumber3Predicate).test("0600000000"));
        System.out.println(isPhoneNumberValidPredicate.or(containNumber3Predicate).test("0600000000"));
        System.out.println(phoneLengthIsValid.test("0600000000",11));

    }
    static Predicate<String> isPhoneNumberValidPredicate = phone -> phone.startsWith("06") && phone.length() == 10;
    static Predicate<String> containNumber3Predicate = phone -> phone.contains("3");
    static boolean isPhoneNumberValid(String phone){
        return phone.startsWith("06") && phone.length() == 10;
    }
    static BiPredicate<String, Integer> phoneLengthIsValid = (phone, length) ->
            phone.length() == length;

}
