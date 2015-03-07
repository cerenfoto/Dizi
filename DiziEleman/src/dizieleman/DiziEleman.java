package dizieleman;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Sinarik
 */
public class DiziEleman {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dizi[], diziElamanSayisi, eleman;

        Random rnd = new Random();
        Scanner scan = new Scanner(System.in);

        System.out.println("Diziniz kaç elemanlı olsun?");
        diziElamanSayisi = scan.nextInt();

        System.out.println("Kaçıncı elemanı öğrenmek istiyorsunuz?");
        eleman = scan.nextInt();

        dizi = new int[diziElamanSayisi];
        System.out.println("Diziniz:");

        for (int i = 0; i < diziElamanSayisi; i++) {
            dizi[i] = rnd.nextInt(101);
            System.out.print(dizi[i] + "-");
        }
        for (int j = 0; j < diziElamanSayisi; j++) {
            if (eleman == j) {
                eleman = dizi[j];
            }

        }
        System.out.println("\nAradığınız eleman:");
        System.out.println(eleman);
    }

}
