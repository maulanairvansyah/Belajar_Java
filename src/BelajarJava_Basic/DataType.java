/**
 * 
 * @author Maulana Irvansyah
 * @2021
 * 
 */


 /**
  * Macam-Macam Type data
  * - int : untuk nilai angka
  * - String : untuk teks
  * - char : untuk nilai satu karakter
  * - boolean : untuk menentukan benar/salah
  * - float & double : untuk nilai angka dengan koma, float 32bit sedangkan double 128bit
  */

package BelajarJava_Basic;

public class DataType {

    public static void main(String[] args) {
        
        int nim = 2022191066;
        String nama = "Maulana Irvansyah";
        float ipk = 4f;
        char akreditasi = 'A';
        double noabsen = 66d;
        boolean lulus = true;

        System.out.println("Nama : " + nama);
        System.out.println("NIM  : "+ nim);
        System.out.println("IPK  : " + ipk);
        System.out.println("Akreditasi : " + akreditasi);
        System.out.println("No Absen : " + noabsen);
        System.out.println("Keterangan Lulus : " + lulus);
    }
    
}
