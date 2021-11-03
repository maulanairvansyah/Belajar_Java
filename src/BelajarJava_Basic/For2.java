/**
 * 
 * @author Maulana Irvansyah
 * @2021
 * 
 */

 
package BelajarJava_Basic;
import java.util.Scanner;



public class For2 {
    public static void main(String[] args){
        Scanner Input = new Scanner(System.in);
        
        System.out.print("Masukan Nilai j :");

        int j = Input.nextInt();
        for (int i=0;i<=j; i++){
            for (int k=0;k<i;k++){
                System.out.print("*");
            }
            System.out.println("");
        }
        Input.close();
    }
}
