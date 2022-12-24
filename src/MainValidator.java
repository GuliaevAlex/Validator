import custom_exceptions.InvalidDataException;
import data_input.InputData;
import data_input.InputDataFromConsole;
import regular_expressions.RegularExpressions;
import validation_tools.LoginValidator;

import java.io.IOException;

public class MainValidator {


    public static void main(String[] args) {
//        String email = "test@gmail.com";
//        boolean isMaches = email.matches(".+@\\w{2,6}\\.com");
//        System.out.println(isMaches);

        InputData input = new InputDataFromConsole();
        LoginValidator loginValidator = new LoginValidator();
        RegularExpressions regex = new RegularExpressions();


        try {
            System.out.println("Введите пожалуйста свой login (e-mail адрес)");
            String inputLogin = input.inputData();
            loginValidator.validate(inputLogin, regex.simpleLoginRegex);

            System.out.println("Введите пожалуйста свой password");
            String inputpassword = input.inputData();
            loginValidator.validate(inputpassword, regex.simplePasswordRegex);

            input.streamClose();

        } catch (InvalidDataException | IOException e) {
            e.printStackTrace();

        }

    }
}
