import java.util.Scanner;
public class Tugas3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah toko : ");
        int jumlahToko = sc.nextInt();

        int totalBarangSeluruhToko = 0;
        int maxBarang = -1;
        int tokoTerbanyak = 0;

        for (int i = 1; i <= jumlahToko; i++) {
            System.out.println("\nToko " + i);
            System.out.print("Masukkan jumlah pelanggan : ");
            int jumlahPelanggan = sc.nextInt();

            int totalBarangToko = 0;
            for (int j = 1; j <= jumlahPelanggan; j++) {
                System.out.print("Masukkan jumlah barang pelanggan " + j + " : ");
                int barang = sc.nextInt();
                totalBarangToko += barang;
            }
            System.out.println("pelanggan : " + jumlahPelanggan + ", total barang : " + totalBarangToko);
            totalBarangSeluruhToko += totalBarangToko;

            if (totalBarangToko > maxBarang) {
                maxBarang = totalBarangToko;
                tokoTerbanyak = i;
            }
        }
        System.out.println("\nTotal barang seluruh toko : " + totalBarangSeluruhToko);
        System.out.println("Toko dengan barang terbanyak : " + tokoTerbanyak);
        sc.close();
    }
}