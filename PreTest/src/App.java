import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan usia anda : ");
        int usia = input.nextInt();

        System.out.println("Masukkan berat badan anda : ");
        float berat = input.nextFloat();

        System.out.println("Masukkan kadar hemoglobin anda : ");
        float hemo = input.nextFloat();

        if (usia < 17){
            System.out.println("Maaf umur anda belum cukup untuk melakukan donor darah.");
        } else if (usia > 60){
            System.out.println("Maaf umur anda sudah tidak bisa melakukan donor darah.");
        } else {
            System.out.println("Anda memenuhi syarat usia untuk donor darah.");
        }
        
        
        if (berat < 45){
            System.out.println("Maaf berat badan anda belum memasuki syarat donor darah.");
        } else {
            System.out.println("Anda memenuhi syarat berat badan untuk donor darah.");
        }

        if (hemo < 12.5){
            System.out.println("Maaf hemoglobin anda terlalu rendah untuk melakukan donor darah.");
        } else if (hemo > 17.0){
            System.out.println("Maaf hemoglobin anda terlalu tinggi untuk melakukan donor darah.");
        } else {
            System.out.println("Kadar hemoglobin anda telah memenuhi syarat untuk donor darah.");
        }

        input.close();
    }
}
