/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.qc.bdeb.inf202;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Martin Grégoire
 */
public class Items
{

    private  static HashMap<String, String> prix;
    private  static List<String> noms;

    public  static Double getPrix(String nomItem)
    {
        String temp = prix.get(nomItem);
        temp = temp.replace(',', '.');
        temp = temp.replace('$', ' ');
        temp = temp.trim();
        return (Double.parseDouble(temp));
    }

    public static Double getPrix(String nomItem, Double quantite)
    {
        String temp = prix.get(nomItem);
        temp = temp.replace(',', '.');
        temp = temp.replace('$', ' ');
        temp = temp.trim();
        return (Double.parseDouble(temp) * quantite);
    }

    public static  void setPrix(HashMap<String, String> liste)
    {
        prix = liste;
    }
    public static void setNoms(HashMap<String, String> liste){
        noms=new ArrayList<>();
        for (String nom:liste.keySet())
        {
            noms.add(nom);
        }
    }
    public static List getNoms(){
        return noms;
    }
}
