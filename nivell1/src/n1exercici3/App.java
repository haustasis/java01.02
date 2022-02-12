package n1exercici3;

public class App {

    public static void main(String[] args) {

        int arr[] = {1,2,3};

        try {
            System.out.println(arr[3]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.err.println("[-] Missatge Array out of Bounds: "+ ex.getMessage());
        }
    }
}
