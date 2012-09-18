package ca.qc.bdeb.inf202;

import java.util.ArrayList;
import java.util.List;

/*
 * D'abord, à l'ouverture, le programme charge les fichiers, effectue le
 * renouvellement de son inventaire, et est prêt à être utilisé. Ensuite, il
 * demande à l'utilisateur ce qu'il veut faire. Si l'utilisateur veut faire une
 * commande, alors le programme lui demande quels items, et en quelle quantite,
 * produit ensuite une liste pour confirme, et envoie la commande a la facture
 * et reduit l'inventaire des ingredients . À chaque fois qu'un item est rajouté
 * à la commande, le programme se crée un tableau "bidon" dans lequel les
 * quantités diminuent, évitant ainsi de pouvoir commander des items alors
 * qu'ils ne reste pas assez d'ingrédiants pour les produire. Comme autre choix,
 * l'uttilisateur peut signaler une perte, alors elle est automatiquement
 * enlevée de l'inventaire et regarde si elle doit commander.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */
/**
 * Travail #2
 *
 * @author Martin Grégoire
 */
public class tp2
{

    //Code d'ouverture
    public static void main(String[] args)
    {

        String[] temp;
        temp = Fichiers.toString("ingredients.txt");

        for (int i = 0; i < temp.length; i++)
        {
            System.out.println(temp[i]);

        }
        System.out.println("------------------");
        Ingredients temp2 = new Ingredients("ingredients.txt");
        temp2.setQuantite("frites", 1000);
        System.out.println(temp2.getQuantite("frites", 0));
        System.out.println("---------------");
        List<String> temp3;
        temp3 = temp2.getNoms();
        for (int i = 0; i < temp3.size(); i++)
        {
            System.out.println(temp3.get(i));

        }
        System.out.println("-----------");
        Menu blabla = new Menu("menu.txt",temp2);
        System.out.println("-------------");
        blabla.test();
        System.out.println("---------");
        Choix.setIngredients(temp2);
        Choix.setMenu(blabla);
        Choix.getChoix();

    }

    /**
     * chargement des fichiers, attributtion des fiuchiers aux variables tels
     * qu'ingrédients, menus...
     */
    public static void ouverture()
    {
    }
   
}
