/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.qc.bdeb.inf202;

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
    protected String[] menu;

    /**
     * Met le menu sous forme de liste à partir du fichier
     *
     * @param cheminfichier chemin du fichier donnant le menu
     */
    public Menu(String cheminFichier) {
        List<String> temp;
        temp = getListe(cheminFichier);
        triListe();
    }

    /**
     *
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
}
