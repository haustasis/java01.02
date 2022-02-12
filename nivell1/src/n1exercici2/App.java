package n1exercici2;

public class App {

    public static void main(String[] args) {

        try {
            String str1 = null;
            str1.length();
        } catch (NullPointerException ex) {
            System.err.println("[-] Missatge excepció Null: "+ ex.getMessage());
        }
    }

}
