package model.authorization;

public class Authorization {

    private static boolean isAuthorized;

    private Authorization() {
    }

    public static boolean checkAuthorization(String login, String password, String confirmPassword) {
        try {
            if (!login.matches("\\w{0,20}")) {
                throw new WrongLoginException("Login is incorrect!");
            }
            if (!password.matches("\\w{0,20}") || !password.equals(confirmPassword)) {
                throw new WrongPasswordException("Password is incorrect!");
            }
            isAuthorized = true;

        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
        }
        return isAuthorized;
    }

}
