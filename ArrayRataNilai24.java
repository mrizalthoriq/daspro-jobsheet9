import java.util.Scanner;
public class ArrayRataNilai24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jmlhMhs = sc.nextInt();
        int[] nilaiMhs = new int[jmlhMhs];
        int total = 0;
        double rata2;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = sc.nextInt();
            total += nilaiMhs[i];
        }
        rata2 = (double) total / nilaiMhs.length;
        System.out.println("Total nilai: " + total);
        System.out.println("Rata - rata: " + rata2);

        int lulus = 0;
        int tertinggi = nilaiMhs[0];
        int terendah = nilaiMhs [0];
        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > tertinggi) {
                tertinggi = nilaiMhs[i];
            }
            if (nilaiMhs[i] < terendah) {
                terendah = nilaiMhs[i];
            }

            if (nilaiMhs[i] > 70) {
                lulus++;
            }
        }
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);

        String predikat;
        if (rata2 >= 85) {
            predikat = "SANGAT BAIK";
        } else if (rata2 >= 70) {
            predikat =  "BAIK";
        } else {
            predikat = "PERLU PENDAMPINGAN";
        }
        System.out.println(String.format("Predikat kelas: %s", predikat));
        System.out.println(String.format("Banyak mahasiswa yang lulus: %s", lulus));
        sc.close();
    }
}
