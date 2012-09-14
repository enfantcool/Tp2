/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.qc.bdeb.inf202;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Création d'une facture
 *
 * @author Martin Grégoire
 */
public class Facture
{

    List<String> facture;
    HashMap<String, Double> prix;
    HashMap<String, Double> liste;
    static TPS tps;
    static TVQ tvq;

    /**
     * valeur de la tps
     *
     * @return
     */
    public static void setTps()
    {
        tps = new TPS();
    }

    public Facture(Commande commande)
    {
        setCommande(commande);
        setPrix();
        Double sousTotal = sousTotal();
        facture = new ArrayList<>();
        for (String nom : prix.keySet())
        {
            facture.add("- " + nom + " Prix: " + (prix.get(nom) * liste.get(nom)));
            facture.add("Quantité: " + liste.get(nom));
        }
        facture.add(sousTotal.toString());
    }

    public void setCommande(Commande commande)
    {
        liste = commande.getCommande();
    }

    /**
     * valeur de la tvq
     *
     * @return
     */
    public static double getTvq()
    {
        return TVQ.getValeur();
    }

    /**
     * date du jour
     */
    public static void getDate()
    {
    }

    /**
     * calcul du cout total
     *
     * @return
     */
    public double calculCout()
    {

        return (sousTotal() * tps.getValeur() * getTvq());
    }

    public double sousTotal()
    {
        double tempTotal = 0;
        for (String nom : liste.keySet())
        {
            tempTotal = tempTotal + getPrix(nom);
        }
        return tempTotal;
    }

    /**
     * ajuster le prix dun item dans la facture
     *
     * @param nomitem nom de litem
     * @param cout cout de litem
     */
    public void setPrix()
    {
        for (String nom : liste.keySet())
        {
            prix.put(nom, getPrix(nom) * liste.get(nom));
        }
    }

    /**
     * Chercher le prix dun item
     *
     * @param nomitem nom de litem
     * @param quantite
     */
    public Double getPrix(String nomitem)
    {
        return Items.getPrix(nomitem);
    }

    public Double getPrix(String nomitem, Double quantite)
    {
        return Items.getPrix(nomitem, quantite);
    }

    /**
     * enregistre dans un fichier le dernier numéro de facture
     */
    public void setNumero()
    {
    }

    /**
     * cherche le dernier numero de facture
     */
    public void getNumero()
    {
    }

    /**
     * Produit la facture et l'enregistre dans un fichier
     *
     * @param facture
     */
    protected void writeFacture(List facture)
    {
    }
}
