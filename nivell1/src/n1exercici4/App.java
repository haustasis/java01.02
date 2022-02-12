package n1exercici4;

public class App {

    private static String password = "1234";

    public static void main(String[] args) {

        try {
            setPassword("123456");
        } catch (PasswordLengthException ex) {
            System.err.println("[-] Missatge Error PassWord: " + ex.getMessage());
            System.err.println("[-] Classe excepció: " + ex.getClass());
        }
    }

    public static String setPassword(String newPassword) throws PasswordLengthException{
        if(newPassword.length() > 5) {
            throw new PasswordLengthException("Wrong password length");
        }

        return password = newPassword;
    }
}
