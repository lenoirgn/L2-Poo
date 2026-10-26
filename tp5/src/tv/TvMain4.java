package tv;
import java.util.Scanner;


public class TvMain4{
    public static void main(String[] args)throws java.io.IOException  {
        Scanner saisie= new Scanner(System.in);
        System.out.print("Entrez une marque de TV  : ");
        String marque = saisie.next();
        Tv tv=new Tv(marque);
        tv.on();
        System.out.println(tv.toString());
        boolean ok = false;
        int numChaine=0;
        while (!ok) {
            System.out.print("Entrez le numéro de chaîne : ");

            if (saisie.hasNextInt()) {
                numChaine = saisie.nextInt();
                ok = true;
            } else {
                System.out.println("Veuillez entrer un entier valide.");
                saisie.next(); // Élimine la saisie incorrecte
            }
        }
    tv.changeChannel(numChaine);
    System.out.println(tv.toString());
        



    
}
}