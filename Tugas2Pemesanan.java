import java.util.Scanner;

public class Tugas2Pemesanan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        int[] harga = {15000, 13000, 10000, 12000, 8000, 18000, 20000};

        System.out.println("===================== MENU =====================");
        for (int i = 0; i < harga.length; i++) {
            System.out.printf("%d. %-22s Rp. %,d\n", (i + 1), menu[i], harga[i]);
        }
        System.out.println("================================================\n");

        System.out.print("Masukkan nama menu yang dicari: ");
        String key = sc.nextLine();
        boolean ditemukan = false;

        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(key)) {
                System.out.printf("Menu %s tersedia dengan harga Rp. %,d\n", menu[i], harga[i]);
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Menu yang dicari tidak tersedia.");
        }

        System.out.print("\nMasukkan jumlah item yang ingin dipesan: ");
        int jmlPesan = sc.nextInt();
        sc.nextLine();

        String[] pesanan = new String[jmlPesan];
        int[] hargaPesanan = new int[jmlPesan];
        int totalBiaya = 0;

        for (int i = 0; i < jmlPesan; i++) {
            boolean valid = false;

            while (!valid) {
                System.out.print("Masukkan pesanan ke-" + (i + 1) + ": ");
                String inputMenu = sc.nextLine();

                for (int j = 0; j < menu.length; j++) {
                    if (menu[j].equalsIgnoreCase(inputMenu)) {
                        pesanan[i] = menu[j];
                        hargaPesanan[i] = harga[j];
                        totalBiaya += harga[j];
                        valid = true;
                        break;
                    }
                }

                if (!valid) {
                    System.out.println("Menu tidak tersedia, silakan masukkan menu yang ada di daftar.");
                }
            }
        }

        System.out.println("\n================ DAFTAR PESANAN ================");
        for (int i = 0; i < pesanan.length; i++) {
            System.out.printf("%d. %-22s Rp. %,d\n", (i + 1), pesanan[i], hargaPesanan[i]);
        }
        System.out.println("------------------------------------------------");
        System.out.printf("Total Biaya               Rp. %,d\n", totalBiaya);
        System.out.println("================================================");

        sc.close();
    }
}
// Buat program yang dapat mengelola pemesanan makanan dan minuman di kafe kampus. Program
// menyediakan daftar menu yang sudah ditentukan, memungkinkan pengguna memilih menu melalui fitur
// pencarian, mencatat pesanan, serta menghitung total biaya.
// Daftar menu kafe (inisialisasi array of String saat deklarasi):
// String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh
// Tarik", "Cappucino", "Chocolate Ice"};
// int[] harga = {15000, 13000, 10000, 12000, 8000, 18000, 20000};
// Program yang dibuat wajib mencakup ketentuan berikut:
// • Fitur pencarian menu: pengguna memasukkan nama makanan/minuman yang ingin dipesan, program
// mencari nama tersebut di dalam array menu menggunakan algoritma linear search. Apabila
// ditemukan, tampilkan harganya; apabila tidak ditemukan, beri tahu pengguna bahwa menu tersebut
// tidak tersedia.
// • Fitur pemesanan: pengguna memasukkan jumlah item yang ingin dipesan, lalu untuk setiap item
// memilih nama menu (yang harus tervalidasi ada dalam daftar menu). Simpan nama pesanan dalam
// array satu dimensi terpisah dari array menu utama.
// • Hitung dan tampilkan total biaya dari seluruh pesanan yang dimasukkan pengguna.
// • Tampilkan daftar pesanan yang telah dibuat beserta total biayanya, dengan format tampilan yang rapi
// dan mudah dibaca.