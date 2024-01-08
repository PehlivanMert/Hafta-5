import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] arr = new int[10];
        int a = 2;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = a;
            a *= 2;
        }

        int b;
        do {

            Scanner input = new Scanner(System.in);

            System.out.print("Lütfen 0 - 9 arası bir rakam giriniz : ");
            b = input.nextInt();

            try {
                System.out.println("[ " + arr[b] + " ]");

            } catch (Exception e) {
                System.out.println(e.getMessage());

            }
        } while (b < 50);
        System.out.println("Bitti");
    }
}
