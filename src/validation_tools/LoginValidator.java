package validation_tools;

import custom_exceptions.InvalidDataException;

import java.util.regex.Pattern;

public class LoginValidator implements Validator{

    @Override
    public void validate(String input, String pattern) throws InvalidDataException {
        boolean isMatches = input.matches(pattern);
        if(!isMatches){
            throw new InvalidDataException("Invalid login");
        }
    }
}
