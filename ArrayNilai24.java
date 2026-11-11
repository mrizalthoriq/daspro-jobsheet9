import java.util.Scanner;

public class ArrayNilai24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nilaiAkhir = new int[10];
        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiAkhir[i] = sc.nextInt();  
        }

        int mahasiswa = 1, lulus = 0, tidak = 0;

        for (int i : nilaiAkhir) {
            if (i > 70) {
                System.out.println("Mahasiswa ke-" + mahasiswa + ": " + i + " LULUS");
                lulus++;
            } else {
                tidak++;
            }
            mahasiswa++; 
        }
        System.out.println("Mahasiswa lulus: " + lulus + "  Mahasiswa tidak lulus: " + tidak);
        sc.close();
    }
}

        // for (int i = 0; i < nilaiAkhir.length; i++) {
        //     String status = (nilaiAkhir[i] > 70) ? "LULUS" : "TIDAK LULUS";
        //     if (status.equals("LULUS")) {
        //         System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilaiAkhir[i] + " (" +
        //         status + ")");   
        //     }
        // }