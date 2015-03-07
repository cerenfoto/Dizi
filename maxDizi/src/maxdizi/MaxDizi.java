/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maxdizi;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Sinarik
 */
public class MaxDizi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int maxEleman = 0, diziElamanSayisi, dizi[];
        Scanner scan = new Scanner(System.in);
        Random rnd = new Random();

        System.out.println("Diziniz kaç elemanlı olsun?");
        diziElamanSayisi = scan.nextInt();

        dizi = new int[diziElamanSayisi];
        System.out.println("Diziniz:");

        for (int i = 0; i < diziElamanSayisi; i++) {
            dizi[i] = rnd.nextInt(1001);
            System.out.print(dizi[i] + "-");
        }

        for (int i = 0; i < diziElamanSayisi; i++) {
            if (maxEleman < dizi[i]) {
                maxEleman = dizi[i];
            }
        }
        System.out.println("\nDizinin en büyük elemanı:");
        System.out.println(maxEleman);
    }

}
