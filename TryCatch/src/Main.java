import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] arr = new int[10];
        int a = 2;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = a;
            a *= 2;
        }
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen 0 - 9 arası bir rakam giriniz : ");
        int b = input.nextInt();

        try {
            System.out.println("[ " + arr[b] + " ]");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.toString());


        } finally {
            System.out.println("İşlem tamamlandı.");
        }
    }
}
