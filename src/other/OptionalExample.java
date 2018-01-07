package other;

import lautil.ELConstants;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        Optional<String> noValue = Optional.empty();
        Optional<String> hasValue = Optional.of(ELConstants.ALPHABET_ENGLISH_LOWER);
        if(noValue.isPresent()) {
            System.out.println("Is not printing");
        } else {
            System.out.println("Optional is empty");
        }
        if(hasValue.isPresent()){
            System.out.println("Has value: " + hasValue);
        }
        String defString = noValue.orElse("Default value");
        System.out.println(defString);
    }
}
