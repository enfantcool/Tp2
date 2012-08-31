/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.qc.bdeb.inf202;

import java.util.ArrayList;
import java.util.List;

/**
 * Operations sur les ingredients
 *
 * @author Martin Grégoire
 */
public class ingredients {

    /**
     * Contient la liste d'ingrédients.
     *
     */
    List<String> ingredients;

    /**
     * cree une liste d'ingrédients à partir du fichier
     *
     * @param cheminfichier chemin du fichier donnant la liste des ingédients
     */
    public ingredients(String cheminFichier) {
        ingredients=new ArrayList<String>();
        ingredients = getListe(cheminFichier);
    }

    /**
     * "prend" une quantite d'un ingredient et la met à jour.
     *
     * @param ingredient L'ingrédient à manipuler.
     * @param quantite La quantite a retirer.
     */
    public void setQuantite(String ingredient, int quantite) {
        
    }

    /**
     * retourne le contenu du fichier qui contient la liste des ingrédients
     *
     * @param cheminFichier chemin du fichier donnant la liste des ingédients
     */
    protected List getListe(String cheminFichier) {
        List<String> temp;
        temp=new ArrayList<String>();
        temp=Fichiers.readFile("ingredients.txt");
        return temp;
    }

    /**
     * retourne la quantite selon le choix
     *
     * @param ingredient l'ingredient à regarder
     * @param choix 0=inventaire,1=minimu,2=renouvelement
     * @return
     */
    public int getQuantite(String ingredient, int choix) {
        return 0;
    }
}
