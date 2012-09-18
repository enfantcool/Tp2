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
private static Ingredients ingredients;
private static  Menu menu;

    public static void setIngredients(Ingredients ingredients)
    {
        ingredients = ingredients;
    }

    public static void setMenu(Menu menu)
    {
        menu = menu;
    }
    /**
     * afficher les choix du menu, prendre une commande, signaler une perte,
     * sortir une facture, quitter le porgramme
     */
    public static void affChoix()
    {
        System.out.println("1- Prendre une commande;\n2- Signaler une perte;\n3- Afficher une facture;\n4- Quitter le programme.");
    }

    /**
     * Prendre et effectuer les actions selon les choix de l'utillisateur
     */
    public static void getChoix()
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
    public static void getItems(){
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
     public static void commande(){
         getItems();
         
         
     }
     
}
