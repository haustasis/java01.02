package n1exercici5;

public class App {

    public static void main(String[] args) {

        int arr[] = {1,2,3};
        int num = 5;

        while(arr.length < num) {
            arr[num] = 0;
            num--;
        }
    }
}
