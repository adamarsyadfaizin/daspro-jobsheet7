import java.util.Scanner;

public class TugasNo2_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jenis, durasi;
        int total = 0;
        System.out.print("Masukkan jenis kendaraan (1 Mobil, 2 Motor, 0 Keluar) : ");
        jenis = scanner.nextInt();
        while (jenis != 0) { 
            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan durasi : ");
                durasi = scanner.nextInt();
                if (durasi > 5) {
                    total += 12500; 
                } else {
                    if (jenis == 1) {
                        total += durasi * 3000; 
                    } else if (jenis == 2) {
                        total += durasi * 2000; 
                    }
                }
            } else {
                System.out.println("Jenis kendaraan tidak valid. Silakan coba lagi.");
            }
            System.out.print("Masukkan jenis kendaraan (1 Mobil, 2 Motor, 0 Keluar) : ");
            jenis = scanner.nextInt();
        }
        System.out.println("Total pembayaran parkir: Rp " + total);
        scanner.close();
    }
}
