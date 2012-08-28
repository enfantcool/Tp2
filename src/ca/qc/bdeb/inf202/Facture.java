/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.qc.bdeb.inf202;

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

    public static int getTps() {
        return 0;
    }

    public static int getTvq() {
        return 0;
    }
    public static void setPrix(double cout){
    //ajout prix a la cle dans la hashmap
    }
    public static void getPrix(String nomitem,int quantite) {
    }

    /**
     * enregistre dans un fichier le dernier numéro de facture
     */
    public void setNumero() {
    }

    protected void writeFacture(List facture) {
    }
}
