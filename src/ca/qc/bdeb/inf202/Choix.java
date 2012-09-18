/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.qc.bdeb.inf202;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

/**
 *
 * @author Martin Grégoire
 */
public class Choix
{
private Ingredients ingredients;
private Menu menu;

public Choix(Ingredients ingredients,Menu menu){
    this.menu=menu;
    this.ingredients=ingredients;
}
    /**
     * afficher les choix du menu, prendre une commande, signaler une perte,
     * sortir une facture, quitter le porgramme
     */
    public void affChoix()
    {
        System.out.println("1- Prendre une commande;\n2- Signaler une perte;\n3- Afficher une facture;\n4- Quitter le programme.");
    }

    /**
     * Prendre et effectuer les actions selon les choix de l'utillisateur
     */
    public void getChoix()
    {
        String choix;
       affChoix();
       choix=lectureClavier();
       switch (choix){
           case "1":
               commande();
               break;
           case "2":
               break;
           case "3":
               break;
           case "4":
               System.exit(0);
               break;
           default:
               System.out.println("Entrez un chifre de 1 à 4 pour effectuer un choix.");
       }
    }
    public void getItems(){
        List<String>noms;
        noms=Items.getNoms();
        System.out.println("Un item avec un '#' signigie qu'il n'y a pas assez d'un ingrédient pour le produire.");
        for (int i = 0; i < noms.size(); i++)
        {
            if (menu.estProductible(noms.get(i)))
            {
            System.out.println((i+1)+"- "+noms.get(i));
            }
            else
            {
                System.out.println("#"+noms.get(i));
            }
            
        }
        
    }
     public static String lectureClavier()
    {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        try
        {
            String choix = r.readLine();
            return choix;
        }
        catch (IOException e)
        {
            System.out.println("Une erreur est survenue.");
            return null;
        }
    }
     public void commande(){
         List items=menu.getListe();
         String choix;
         String choix2;
         String nomItem;
         getItems();
         System.out.println("Choisissez un item par son numero");
         choix=lectureClavier();
         
         System.out.println("Combien?");
         choix2=lectureClavier();
         
     }
     public static boolean traitementClavier(String entree){
        boolean erreur = true;
        String choix = "";
        while (erreur)
        {
            System.out.println("Il est temps de bouger.\n w:Haut; a:Gauche; s:Bas; d:Droite; q: Sortie");
            choix = lectureClavier();
            System.out.println("");
            if (!(choix == null) && choix.length() == 1)
            {
                erreur = false;

            }
            else
            {
                System.out.println("Entrez une direction ou entrez q pour sortir.");
            }
        }
        return choix.toLowerCase().charAt(0);
     }
     
}
