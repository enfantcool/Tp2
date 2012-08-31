/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.qc.bdeb.inf202;

import java.util.HashMap;

/**
 * opérations reliées à la commande d'items
 *
 * @author Martin Grégoire
 */
public class Commande {

    /**
     * Table de Hashage(?) contenant le nom d'un item et sa quantité
     */
    protected HashMap<String, Double> commande;
    /**
     * ajout un item a la commande
     * @param nomitem nom de litem a ajouter
     */
    public void ajoutItem(String nomitem){
        //if containskey(nomitem) then commande.put(nomitem,commande.get(nomitem)+1)
    }
    /**
     * Reduit els ingredients dans l'inventaire et produit un facture
     */
    public void traiterCommande(){
        //for(1 à quantite d'un item) reduire la quantite dingredients dans linventaire par item
        //envoyer a la facture
    }
}

