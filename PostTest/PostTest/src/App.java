import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int saldo = 500000; 

        do {
            System.out.println("=== Menu Mesin ATM ===");
            System.out.println("1. cek saldo");
            System.out.println("2. setor tunai");
            System.out.println("3. tarik tunai");
            System.out.println("4. keluar");
            System.out.println("pilih menu di atas (1-4) :");
            int pilih = input.nextInt();
            

            switch (pilih){

                case 1: 
                    System.out.println("saldo yang tersisa adalah :" + saldo );
                    break;
                
                case 2:
                    System.out.println("Masukkan jumlah yang ingin anda setorkan : ");
                    int jumsetoran = input.nextInt();
                    saldo += jumsetoran;
                    System.out.println("Uang yang di setorkan telah berhasil masuk.");
                    break;

                case 3:
                    System.out.print("Masukkan jumlah yang ingin ditarik: ");
                    int tarik = input.nextInt();

                    if (saldo - tarik >= 50000) {
                        saldo -= tarik;
                        System.out.println("Penarikan saldo berhasil.");
                        System.out.println("Saldo ATM sekarang adalah: Rp " + saldo);
                    } else {
                    System.out.println("Mohon maaf saldo tidak mencukupi atau saldo minimal Rp 50.000.");
                    }
                    break;

                case 4:
                System.out.println("anda telah selesai menggunakan mesin ATM.");
                break;

                default:
                    System.out.println("tidak ada nomer terdaftar.");
            }
        } while (pilih != 4);
            input.close();
    } 
}
