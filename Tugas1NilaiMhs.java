import java.util.Scanner;

public class Tugas1NilaiMhs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa     : ");
        int jmlhMhs = sc.nextInt();
        int nilaiMhs [] = new int[jmlhMhs];
        
        int totNilai =  0;
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.printf("Masukkan nilai mahasiswa ke-%d : ", (i+1));    
            nilaiMhs[i] = sc.nextInt();

            totNilai += nilaiMhs[i];
        }

        double rata2 = (double) totNilai/jmlhMhs;

        int terbesar = nilaiMhs[0], terendah = nilaiMhs[0];
        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > terbesar) {
                terbesar = nilaiMhs[i];
            }
            if (nilaiMhs[i] < terendah) {
                terendah = nilaiMhs[i];
            }
        }
        System.out.println("==============================================================");
        System.out.println(String.format("Nilai tertinggi: %d\nNilai terendah  : %d", terbesar, terendah));
        for (int i = 0; i < nilaiMhs.length; i++) {
            String status = (nilaiMhs[i] >= 70) ? "LULUS" : "TIDAK LULUS";
            System.out.println(String.format("Nilai mahasiswa ke-%d: %d  Status: %s", (i+1), nilaiMhs[i], status));
        }
        System.out.println("==============================================================");
        System.out.println("Rata-rata Nilai Seluruh Mahasiswa: " + rata2);

        sc.close();
    }
}
// Memasukkan banyaknya nilai mahasiswa yang akan diinput.
// • Memasukkan setiap nilai mahasiswa satu per satu.
// • Menghitung nilai rata-rata dari seluruh nilai yang dimasukkan.
// • Menampilkan nilai tertinggi dan nilai terendah.
// • Menampilkan semua nilai yang telah dimasukkan, beserta status kelulusannya (LULUS / TIDAK LULUS)