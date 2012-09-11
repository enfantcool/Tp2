/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.qc.bdeb.inf202;

import java.util.HashMap;

/**
 *
 * @author Martin Grégoire
 */
public class Items
{
    private static HashMap<String,String> prix;
    
    public static Double getPrix(String nomItem){
         String temp = prix.get(nomItem);
        temp = temp.replace(',', '.');
        temp = temp.replace('$', ' ');
        temp = temp.trim();
        return (Double.parseDouble(temp));
    }
        public static Double getPrix(String nomItem,Double quantite){
         String temp = prix.get(nomItem);
        temp = temp.replace(',', '.');
        temp = temp.replace('$', ' ');
        temp = temp.trim();
        return (Double.parseDouble(temp)*quantite);
    }
    public static void setPrix(HashMap<String,String> liste){
        prix=liste;
    }
}
