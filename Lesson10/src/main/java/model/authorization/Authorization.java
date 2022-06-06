package model.authorization;

public class Authorization {

    private static boolean isAuthorized;

    public static boolean checkAuthorization(String login, String password, String confirmPassword) {
        try {
            if ((login.length() > 20
                    || login.length() == 0
                    || !login.matches("([a-zA-Z]*\\d*_*)*")))
                throw new WrongLoginException("Login is incorrect!");
            if (password.length() > 20
                    || password.length() == 0
                    || !password.matches("([a-zA-Z]*\\d*_*)*")
                    || !password.equals(confirmPassword))
                throw new WrongPasswordException("Password is incorrect!");
            isAuthorized = true;

        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
        }
        return isAuthorized;
    }

}
