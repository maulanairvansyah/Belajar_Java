/**
 * 
 * @author Maulana Irvansyah
 * @2021
 * 
 */
package BelajarJava_Basic;
import java.util.Scanner;


public class Inputdata {


    /* Berikut contoh code untuk memasukan suatu String 
    */
    public static void main(String[] args){
    Scanner Input = new Scanner(System.in);
    System.out.println("Selamat Belajar Java!");
    System.out.println("Silahkan Masukan Nama Anda : ");
    String nama = Input.nextLine();

    System.out.println("Nama kamu adalah : " + nama);
    
    }
}
