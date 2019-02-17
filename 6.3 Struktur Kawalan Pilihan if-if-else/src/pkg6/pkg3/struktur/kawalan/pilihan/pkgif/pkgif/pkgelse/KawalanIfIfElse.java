/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6.pkg3.struktur.kawalan.pilihan.pkgif.pkgif.pkgelse;

/**
 *
 * @author Dell
 */
import java.util.Scanner;
public class KawalanIfIfElse {
    public static void main(String[] args){
     
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nombor Pertama: ");
        
        int nom1 = input.nextInt();
        
        System.out.print("Masukkan nombor Kedua: ");
        
        int nom2 = input.nextInt();
        
             System.out.print("Masukkan nombor Ketiga: ");
        
        int nom3 = input.nextInt();
        
        if (nom1 > nom3){
            
        }if (nom2 > nom3){
            
            System.out.println("Nombor pertama dan nombor ke-2 adalah lebih besar dari nombor ke-3");
        }
        else
            System.out.println("Nombor pertama adalah kurang atau sama dari nombor ke-3");
    }
}
