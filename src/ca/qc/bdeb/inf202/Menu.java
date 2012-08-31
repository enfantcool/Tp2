/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.qc.bdeb.inf202;

import java.util.HashMap;
import java.util.List;

/**
 * Opérations avec le menu
 *
 * @author Martin Grégoire
 */
public class Menu {

    /**
     * tableau 2d qui contient le menu, commencant par le nom de l'item et par
     * les ingrédients et le prix dans laa deuxieme dimension
     */
    protected HashMap<String,String> menu;
    /**
     * table de hashage contenant les prix des items
     */
    protected HashMap<String,Double> prix;

    /**
     * Met le menu sous forme de table de hashage dont la clé est le bnom de litem et la valeur étant la liste des ingrédients + le prix
     *
     * @param cheminfichier chemin du fichier donnant le menu
     */
    public Menu(String cheminFichier) {
        List<String> temp;
        temp = getListe(cheminFichier);
        triListe();
    }

    /**
     * Transforme la liste pour la mettre dans la table de hashage
     * @param cheminFichier chemin du fichier qui contient le menu
     * @return le fichier
     */
    protected List getListe(String cheminFichier) {
        return null;
    }

    /**
     * remet la liste venant du fichier en tableau 2d de type String
     */
    protected void triListe() {
    }
    /**
     * cherche le prix dun item
     * @param nomitem nom de litem
     * @param quantite quantite
     * @return prix
     */
    public double getPrix(String nomitem,int quantite){
        return 0;
    }
}
