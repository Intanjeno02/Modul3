import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nilai ujian akhir :");
        int nilai = input.nextInt();

        System.out.println("Masukkan absen :");
        int absen = input.nextInt();

        String hasil = (nilai >= 75 && absen >= 80 ) ? "lulus" : "tidak lulus";
        System.out.println("Hasil anda : " + hasil);

        input.close();

    }
}
