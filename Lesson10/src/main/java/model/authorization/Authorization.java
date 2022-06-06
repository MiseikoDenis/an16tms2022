package model.authorization;

public class Authorization {

    static boolean check;

    public static boolean authorization(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (login.length() > 20 || !login.matches("([a-zA-Z]*\\d*_*)*"))
            throw new WrongLoginException("Login is incorrect!");
        if (password.length() > 20
                || !password.matches("([a-zA-Z]*\\d*_*)*")
                || !password.equals(confirmPassword))
            throw new WrongPasswordException("Password is incorrect!");
        check = true;
        return check;
    }
}
