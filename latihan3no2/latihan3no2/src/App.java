import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int truepin = 123456;
        int percobaan = 0;

     while (percobaan < 3) {

            System.out.print("Masukkan PIN: ");
            int pin = input.nextInt();

            if (pin == truepin) {
                System.out.println("Login berhasil");
                break;
            } else {
                System.out.println("PIN salah");
                percobaan++;
            }
        }

        if (percobaan == 3) {
            System.out.println("Akun terblokir.");
        }


        input.close();
    }
}
