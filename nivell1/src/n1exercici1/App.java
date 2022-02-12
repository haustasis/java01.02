package n1exercici1;

public class App {

    public static void main(String[] args) {

        try {
            divisio();
        } catch (ArithmeticException ex) {
            System.err.println("[-] Missatge especific de l'excepció: "+ ex.getMessage());
        } finally {
            System.out.println("[+] Finally");
        }

    }

    static void divisio() throws ArithmeticException {
        System.out.println("[+] Metode divisio");
        int num = 10 / 0;
        System.out.println(num);
    }

}
