/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.qc.bdeb.inf202;

import java.util.*;

/**
 * Opérations avec le menu
 *
 * @author Martin Grégoire
 */
public class Menu {

    /**
     * hashmap contenant le nom d'un item, ses ingrédients et leur quantité.
     * 
     */
    protected HashMap<String, HashMap<String, String>> menu;
    /**
     * hashmap contenant la liste d'ingrédients pour produire chaque item
     */
    protected HashMap<String,Set<String>> listeIngredients;
    /**
     * Listes des items pouvant être commandés
     */
    private List<String> items;
    /**
     * table de hashage contenant les prix des items
     */
    protected HashMap<String, String> prix;

    /**
     * Met le menu sous forme de table de hashage dont la clé est le bnom de
     * l'item et la valeur étant la liste des ingrédients + le prix
     *
     * @param cheminfichier chemin du fichier donnant le menu
     */
    public Menu(String cheminFichier) {
        List<String> temp;
        items = new ArrayList<>();
        prix = new HashMap<>();
        menu = new HashMap<>();
        listeIngredients=new HashMap<>();
        temp = getListe(cheminFichier);
        triListe(temp);
        setListeIngredients();
        Items.setPrix(prix);

    }

    /**
     * Transforme la liste pour la mettre dans la table de hashage
     *
     * @param cheminFichier chemin du fichier qui contient le menu
     * @return le fichier
     */
    protected final List getListe(String cheminFichier) {

        return Fichiers.readFile(cheminFichier);
    }

    /**
     * sépare la liste dans une liste contenant les noms des items et dans une
     * HashMap contenant le prix des items.
     */
    protected final void triListe(List<String> parcours) {
        String dernierItem = "";
        HashMap<String, String> table = new HashMap<String, String>();
        for (int i = 0; i < parcours.size(); i++) {
            char temp;
            temp = parcours.get(i).charAt(0);
            if (Character.isUpperCase(temp)) {
                dernierItem = parcours.get(i);
                items.add(dernierItem);

            } else if (Character.isDigit(temp)) {


                prix.put(dernierItem, parcours.get(i));
                menu.put(dernierItem, table);
                table = new HashMap<String, String>();
            } else {
                List<String> list = new ArrayList<String>();
                StringTokenizer decoupe = new StringTokenizer(parcours.get(i), ";");
                while (decoupe.hasMoreTokens()) {
                    list.add(decoupe.nextToken());
                }
                String premier = list.get(0);
                list.remove(0);
                table.put(premier, list.get(0));
                
            }

        }
    }
    /**
     * Attribue une liste d'ingrédients pour chaque items
     */
public void setListeIngredients(){
    for (String nom:items)
    {
       listeIngredients.put(nom,menu.get(nom).keySet()); 
    }
}
    /**
     * cherche le prix dun item
     *
     * @param nomitem nom de l'item
     * @param quantite quantite
     * @return prix
     */
    public double  getPrix(String nomItem, int quantite) {
        String temp = prix.get(nomItem);
        temp = temp.replace(',', '.');
        temp = temp.replace('$', ' ');
        temp = temp.trim();
        return (Double.parseDouble(temp) * quantite);
    }
/**
 * Done la quantité d'un ingédient d'un item
 * @param nomItem l'item à chercher
 * @param nomIngredient l'ingrédient à chercher
 * @return quantite de l'ingredient, en integer
 */
    public String getQuantite(String nomItem, String nomIngredient) {
        HashMap<String,String> table=new HashMap<String,String>();
        table=menu.get(nomItem);
        for (String out:table.keySet()) {
            System.out.println(out);
        }
        return (menu.get(nomItem).get(nomIngredient));
    }
/**
 * à enlever lorsque fini.
 */
    public void test() {
 
        for (String out : items) {
            System.out.println(out);
            System.out.println("------");
            for (String nom:listeIngredients.get(out))
            {
                System.out.println(nom);
            }
            System.out.println("----------");
        }
        System.out.println(getQuantite("Frite","frites"));
    }
}
