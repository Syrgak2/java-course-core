package exception;

import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        try {
            authorization("fuze_tee", "green_tee", "green_tee");
        } catch (WrongLoginException e) {
            System.out.println("логин может содержать только латинские буквы, цифры , знак подчеркивания и 20 символов");
        } catch (WrongPasswordException e) {
            System.out.println("попробуйте другой пароль");
        }

    }

    public static void authorization(String login, String password, String confirmPassword) {
        boolean isCorrectLogin = Pattern.matches("\\w{0,20}", login);
        if (isCorrectLogin != true) {
            throw new WrongLoginException();

        }

        boolean isCorrectPassword = Pattern.matches("\\w{8,20}$", password);
        if (isCorrectPassword != true) {
            throw new WrongPasswordException();
        }

        if (confirmPassword.equals(password) != true) {
            throw new WrongPasswordException();
        }
    }
}
