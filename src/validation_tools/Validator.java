package validation_tools;

import custom_exceptions.InvalidDataException;

import java.util.regex.Pattern;

public interface Validator {

    void validate(String  input, String pattern) throws InvalidDataException;


}
