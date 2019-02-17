/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6.pkg7.struktur.kawalan.ulangan;

/**
 *
 * @author Dell
 */
import java.util.Scanner;
public class ContohFor {
    public static void main(String[] args){
        String perkataan;
        Scanner taip = new Scanner(System.in);
        System.out.println("Taipkan satu perkataan.");
        perkataan = taip.next();
        char[] hurufv = perkataan.toCharArray();
        int vokal = 0;
        
        for (char h: hurufv) {
            if(h == 'a' || h == 'A' || h == 'e' || h == 'E' || h == 'i' || h == 'I' || h == 'o' || h == 'O' || h == 'u' || h == 'U') {
                
                vokal ++;
            }
        }
        
        System.out.println("Bilangan huruf vokal dalam " + perkataan + "adalah: " + vokal);
        System.out.println("Bilangan huruf konsonan dalam " + perkataan + "adalah: " + (hurufv.length - vokal));
    } 
}
