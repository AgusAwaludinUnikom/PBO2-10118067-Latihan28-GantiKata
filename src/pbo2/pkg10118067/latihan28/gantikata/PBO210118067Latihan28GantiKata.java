/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118067.latihan28.gantikata;

import java.util.Scanner;
/**
 *
 *  Agus Awaludin
 *  IF2
 *  10118067
 *  Latihan ini besisi tentang bagaimana caranya mengganti kata dalam satu
 *  kalimat
 */
public class PBO210118067Latihan28GantiKata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        System.out.println("====Program Mengganti Kata====");
        System.out.println(" ");
        
        System.out.print("Masukkan Kalimat : ");
        Scanner scanner = new Scanner(System.in);
        String kalimat = scanner.nextLine();
        
        System.out.print("Ganti Kata : ");
        String find = scanner.next();
        
        System.out.print("Menjadi Kata : ");
        String replace = scanner.next();
        
        System.out.println(" ");
        System.out.println("====Hasil Formatting====");
        System.out.println("Kalimat Awal : " +kalimat);
        System.out.println("Kalimat Baru : " +kalimat.replace(find, replace));
    }
    
}
