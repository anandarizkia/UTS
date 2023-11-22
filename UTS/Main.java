package UTS;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama = "";
        String periode = "";
        String total = "";
        boolean pembayaranBerhasil = false;

        Metode_Pembayaran debit = new Debit("123-456-789");
        Metode_Pembayaran kredit = new Kredit("0123-4567-89");
        debit.SetPin("1234");
        kredit.SetPin("5678");

        System.out.println("\n \tPembayaran Tagihan Listrik\n");
        System.out.println("Masukkan ID Pelanggan : ");
        String id = input.nextLine();

        switch (id) {
            case "101":
                nama = "Ananda Rizki Amelia";
                periode = "November 2023";
                total = "250000";
                break;
            case "102":
                nama = "Nova Aulia";
                periode = "November 2023";
                total = "350000";
                break;
            default:
                System.out.println("ID Pelanggan belum terdaftar.");
                System.exit(0);
        }
        System.out.println("\nID Pelanggan = " + id);
        System.out.println("Nama Pelanggan = " + nama);
        System.out.println("Periode = " + periode);
        System.out.println("Total Tagihan = " + total);

        while (!pembayaranBerhasil) {
            System.out.println("\nPilihan Pembayaran");
            System.out.println("1. Kartu Debit");
            System.out.println("2. Kartu Kredit");
            System.out.println("0. Keluar");
            System.out.println("\nPilihan Anda :");
            String tombol = input.nextLine();

            switch (tombol) {
                case "1":
                    System.out.print("Masukkan PIN untuk Kartu Debit: ");
                    String debitPin = input.nextLine();
                    if (debitPin.equals(debit.GetPin())) {
                        debit.prosesPembayaran(Double.parseDouble(total));
                        pembayaranBerhasil = true;
                    } else {
                        System.out.println("PIN salah. Pembayaran tidak dapat diproses.");
                    }
                    break;
                case "2":
                    System.out.print("Masukkan PIN untuk Kartu Kredit: ");
                    String kreditPin = input.nextLine();
                    if (kreditPin.equals(kredit.GetPin())) {
                        kredit.prosesPembayaran(Double.parseDouble(total));
                        pembayaranBerhasil = true;
                    } else {
                        System.out.println("PIN salah. Pembayaran tidak dapat diproses.");
                    }
                    break;
                case "0":
                    System.exit(0);
                default:
                    System.out.println("Angka yang Anda tekan salah");
                    break;
            }
        }
    }
}
