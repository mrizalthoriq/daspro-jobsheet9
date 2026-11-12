import java.util.Scanner;

public class Tugas1NilaiMhs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jmlhMhs = sc.nextInt();

        int nilaiMhs [] = new int[jmlhMhs];

        for (int i = 0; i < args.length; i++) {
            System.out.print("Masukkan nilai mahasiswa: ");    
            nilaiMhs[i] = sc.nextInt();
            
        }
    }
}
// Memasukkan banyaknya nilai mahasiswa yang akan diinput.
// • Memasukkan setiap nilai mahasiswa satu per satu.
// • Menghitung nilai rata-rata dari seluruh nilai yang dimasukkan.
// • Menampilkan nilai tertinggi dan nilai terendah.
// • Menampilkan semua nilai yang telah dimasukkan, beserta status kelulusannya (LULUS / TIDAK LULUS