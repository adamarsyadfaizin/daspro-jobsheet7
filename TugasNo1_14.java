import java.util.Scanner;

public class TugasNo1_14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double hargaTiket = 50000, diskon = 0, jmlPelanggan, i = 0, jmlTiketYgDibeli, total = 0, totalPenjualan;
        int _i = (int) i;
        System.out.print("Masukkan jumlah pelanggan hari ini : ");
        jmlPelanggan = sc.nextDouble();
        while (jmlPelanggan > i) {
            System.out.print("Masukkan jumlah tiket yang dibeli oleh pelanggan ke-" + (_i ++ ) + (": "));
            jmlTiketYgDibeli = sc.nextDouble();
            if (jmlTiketYgDibeli < 0) {
                System.out.println("Input jumlah tiket tidak valid, Tolong masukkan lagi");
                continue;
            }
            if (jmlTiketYgDibeli > 10) {
                System.out.println("Dapat diskon 15%");
                total = (jmlTiketYgDibeli * hargaTiket) - (0.15 * (jmlTiketYgDibeli * hargaTiket));
            }
            else if (jmlTiketYgDibeli > 4) {
                System.out.println("Dapat diskon 10%");
                total = (jmlTiketYgDibeli * hargaTiket) - (0.10 * (jmlTiketYgDibeli * hargaTiket));
            }
            else if (jmlTiketYgDibeli <= 4 && jmlTiketYgDibeli > 0) {
                total = jmlTiketYgDibeli * hargaTiket;
            }
            i++;
        }
        totalPenjualan = total * jmlPelanggan;
        System.out.println("Total Penjualan hari ini : " + totalPenjualan);
    }
}