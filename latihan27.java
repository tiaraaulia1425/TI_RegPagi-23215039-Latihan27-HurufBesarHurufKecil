package pertemuan5new;

/**
 *
 * 
 * Nama : Tiara Aulia Maharani
 * NIM  : 23215039
 * TEKNIK INFORMATIKA
 * latihan untuk menampilkan huruf besar dan huruf kecil
 */
  import java.util.Scanner;
public class latihan27 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Kalimat: ");
        String kalimat = scanner.nextLine();

        System.out.println("====Hasil Formatting====");
        System.out.println("Huruf Besar : " + kalimat.toUpperCase());
        System.out.println("Huruf Kecil : " + kalimat.toLowerCase());

        scanner.close();
        System.out.println("BUILD SUCCESSFUL (total time: 2 menit)");
    }
}
    

