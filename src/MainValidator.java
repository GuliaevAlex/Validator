import custom_exceptions.InvalidDataException;
import data_input.InputData;
import data_input.InputDataFromConsole;
import regular_expressions.RegularExpressions;
import validation_tools.LoginValidator;
import validation_tools.PasswordValidator;

import java.io.IOException;

public class MainValidator {


    public static void main(String[] args) {

        InputData input = new InputDataFromConsole();
        LoginValidator loginValidator = new LoginValidator();
        PasswordValidator passwordValidator = new PasswordValidator();
        RegularExpressions regex = new RegularExpressions();


        try {
            System.out.println("Input e-mail");
            String inputLogin = input.inputData();
            loginValidator.validate(inputLogin, regex.simpleLoginRegex);

            System.out.println("Input password");
            String inputPassword = input.inputData();
            passwordValidator.validate(inputPassword, regex.simplePasswordRegex);

            input.streamClose();

        } catch (InvalidDataException | IOException e) {
            e.printStackTrace();

        }

    }
}
