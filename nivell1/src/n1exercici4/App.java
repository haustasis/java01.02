package n1exercici4;
/*
Exercici 4. Crea la teva pròpia classe d'excepcions, heretant de la classe Exception.
 Utilitza el constructor d'aquesta classe per emmagatzemar dins Exception,
 el missatge personalitzat que farà servir aquesta excepció.
 Crea una clàusula try-catch per a provar la nova excepció.
 Captura i mostra el missatge emmagatzemat.
 Mostra també la classe de l'excepció.
 */

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
