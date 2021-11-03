/**
 * 
 * @author Maulana Irvansyah
 * @2021
 * 
 */


 /**
  * Contoh penggunaan if, jika memenuhi suatu syarat yang ditentukan maka akan menjalankan script sesuai yang di tentukan
  * jika tidak memenuhi syarat maka akan menjalan script yang lain yang sudah ditentukan juga.
  */

package BelajarJava_Basic;
import java.util.Scanner;
public class If {
    
    public static void main(String[] args) {

    Scanner Input = new Scanner(System.in);
    int i;
    System.out.println("Kerjakan Soal berikut");
    System.out.println("1 + 2 =");
    i = Input.nextInt();

    if(i == 3){
        System.out.println("Selamat Jawaban Anda Benar");
    } else {
        System.out.println("Maaf, Jawaban Anda Salah!");
    }
    
    Input.close();
        
    }
}
