/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6.pkg1_struktur_kawalan_pilihan_if;

/**
 *
 * @author Dell
 */
import java.util.Scanner;
public class kawalanif {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Berapakah umur anda: ");
        int jawapan = input.nextInt();
        
        if (jawapan > 20)
        System.out.println("Anda berada di usia dewasa");
        
        if (jawapan >= 12)
        System.out.println("Anda berada di usia remaja");
        
        if (jawapan <= 12)
        System.out.println("Anda berada di usia kanak-kanak");
    }
}
