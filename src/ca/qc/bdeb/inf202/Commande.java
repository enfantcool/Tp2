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
public class Commande
{

    /**
     * Table de Hashage(?) contenant le nom d'un item et sa quantité
     */
    protected HashMap<String, Double> commande;

    /**
     * ajout un item a la commande
     *
     * @param nomitem nom de litem a ajouter
     */
    public Commande()
    {
        commande = new HashMap<>();
    }

    public void ajoutItem(String nomItem)
    {
        //if containskey(nomitem) then commande.put(nomitem,commande.get(nomitem)+1)
        if (commande.containsKey(nomItem))
        {
            commande.put(nomItem, commande.get(nomItem) + 1);
        }
        else
        {
            commande.put(nomItem, 1.00);
        }
    }

    public void ajoutItem(String nomItem, Double quantite)
    {
        if (commande.containsKey(nomItem))
        {
            commande.put(nomItem, commande.get(nomItem) + quantite);
        }
        else
        {
            commande.put(nomItem, quantite);
        }
    }

    /**
     * Reduit les ingredients dans l'inventaire et produit une facture
     */
    public void traiterCommande()
    {
        //for(1 à quantite d'un item) reduire la quantite dingredients dans linventaire par item
        //envoyer a la facture
    }

    public HashMap<String, Double> getCommande()
    {
        return commande;
    }
}
