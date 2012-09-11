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
public class Facture {

    List<String> facture;
    HashMap<String, Double> prix;
    HashMap<String,Double> liste;
/**
 * valeur de la tps
 * @return 
 */
    public static int getTps() {
        return 0;
    }
    public Facture(Commande commande){
        facture=new ArrayList<>();
        for(String nom:prix.keySet()){
            facture.add("- "+nom+" Prix: "+(prix.get(nom)*liste.get(nom)));
            facture.add("Quantité: "+liste.get(nom));
        }
    }
public void setCommande(Commande commande){
    liste=commande.getCommande();
}
/**
 * valeur de la tvq
 * @return 
 */
    public static int getTvq() {
        return 0;
    }
    /**
     * date du jour
     */
    public static void getDate(){
        
    }
    /**
     * calcul du cout total
     * @return 
     */
    public static double calculCout(){
        return 0;
    }
    /**
     * ajuster le prix dun item dans la facture
     * @param nomitem nom de litem
     * @param cout cout de litem
     */
    public void setPrix(String nomitem,double cout){
        for (String nom:liste.keySet())
        {
            prix.put(nom,getPrix(nom)*liste.get(nom));
        }
    }
    /**
     * Chercher le prix dun item
     * @param nomitem nom de litem
     * @param quantite 
     */
 
    public  Double getPrix(String nomitem) {
        return Items.getPrix(nomitem);
    }

    /**
     * enregistre dans un fichier le dernier numéro de facture
     */
    public void setNumero() {
    }
    /**
     * cherche le dernier numero de facture
     */
    public void getNumero(){
        
    }
            
/**
 * Produit la facture et l'enregistre dans un fichier
 * @param facture 
 */
    protected void writeFacture(List facture) {
    }
}
