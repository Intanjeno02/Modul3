import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int TVIP = 5;
        int TFest = 15;
        int TTrib = 30;
        boolean MesinOn = true;
        int usia;

        while (MesinOn){
        System.out.println("=== Pembelian Tiket Universitas Pertamina SoundFest 2026 ===");
        System.out.println("1. Tiket VIP (tiket yang tersisa :" + TVIP + ")");
        System.out.println("2. Tiket Festival (tiket yang tersisa :" + TFest + ")");
        System.out.println("3. Tiket Tribun (tiket yang tersisa :" + TTrib + ")");
        System.out.println("4. Matikan Mesin");
        System.out.println("Masukkan Pilihan Anda : "); 
        int pilih = input.nextInt();

        if(pilih == 4){
                MesinOn = false;
                System.out.println("Mesin dimatikan.");
                break;
            }
        
        int stok = 0;
        int harga = 0;

        switch (pilih){

                case 1:
                    System.out.print("Masukkan Jumlah Tiket: ");
                    int tiket = input.nextInt();

                    if (tiket > TVIP){
                        System.out.println("Tiket tidak mencukupi.");
                        continue;
                    }

                    int berhasilVIP = 0;

                    for (int i = 0; i < tiket; i++){

                        while (true){
                            System.out.print("Masukkan usia pemilik tiket ke " + (i+1) + ": ");
                            usia = input.nextInt();

                            if (usia == -1){
                                System.out.println("Pesanan dibatalkan.");
                                break;
                            }

                            if (usia <= 0 || usia > 100){
                                System.out.println("Usia tidak logis. Silakan masukkan kembali");
                            }
                            else{
                                break;
                            }
                            if (usia == -1){
                                System.out.println("Pesanan dibatalkan.");
                                break;
                                }
                        }

                        if (usia == -1) 
                        break;

                        if (usia < 18){
                            System.out.println("Tiket ditolak. Usia minimal 18 tahun.");
                        }
                        else{
                            System.out.println("Tiket diterima.");
                            berhasilVIP++;
                            TVIP--;
                        }
                    }

                    System.out.println("Total tiket VIP berhasil: " + berhasilVIP);
                    System.out.println("Total bayar: Rp " + (berhasilVIP * 1500000));
                    break;

                case 2:
                    System.out.print("Masukkan Jumlah Tiket: ");
                    tiket = input.nextInt();

                    if (tiket > TFest){
                        System.out.println("Tiket tidak mencukupi.");
                        continue;
                    }

                    int berhasilFest = 0;

                    for (int i = 0; i < tiket; i++){

                        while (true){
                            System.out.print("Masukkan usia pemilik tiket ke " + (i+1) + ": ");
                            usia = input.nextInt();

                            if (usia == -1){
                                System.out.println("Pesanan dibatalkan.");
                                break;
                            }

                            if (usia <= 0 || usia > 100){
                                System.out.println("Usia tidak logis.");
                            }
                            else{
                                break;
                            }
                            if (usia == -1){
                                System.out.println("Pesanan dibatalkan.");
                                break;
                            }
                        }

                        if (usia == -1) break;

                        if (usia < 15){
                            System.out.println("Tiket ditolak. Usia minimal 15 tahun.");
                        }
                        else{
                            System.out.println("Tiket diterima.");
                            berhasilFest++;
                            TFest--;
                        }
                    }

                    System.out.println("Total tiket Festival berhasil: " + berhasilFest);
                    System.out.println("Total bayar: Rp " + (berhasilFest * 800000));
                    break;

                case 3:
                    System.out.print("Masukkan Jumlah Tiket: ");
                    tiket = input.nextInt();

                    if (tiket > TTrib){
                        System.out.println("Tiket tidak mencukupi.");
                        continue;
                    }

                    int berhasilTrib = 0;

                    for (int i = 0; i < tiket; i++){

                        while (true){
                            System.out.print("Masukkan usia pemilik tiket ke " + (i+1) + ": ");
                            usia = input.nextInt();

                            if (usia == -1){
                                System.out.println("Pesanan dibatalkan.");
                                break;
                            }

                            if (usia <= 0 || usia > 100){
                                System.out.println("Usia tidak logis.");
                            }
                            else{
                                break;
                            }
                            if (usia == -1){
                                System.out.println("Pesanan dibatalkan.");
                                break;
                            }
                        }

                        if (usia == -1) break;

                        System.out.println("Tiket diterima.");
                        berhasilTrib++;
                        TTrib--;
                    }

                    System.out.println("Total tiket Tribun berhasil: " + berhasilTrib);
                    System.out.println("Total bayar: Rp " + (berhasilTrib * 500000));
                    break;

                case 4:
                    MesinOn = false;
                    System.out.println("Mesin telah dimatikan.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }

        input.close();
    }
}
