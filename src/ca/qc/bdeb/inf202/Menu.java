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
     * tableau 2d qui contient le menu, commencant par le nom de l'item et par
     * les ingrédients et le prix dans laa deuxieme dimension
     */
    protected HashMap<String, HashMap<String, String>> menu;
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
     * litem et la valeur étant la liste des ingrédients + le prix
     *
     * @param cheminfichier chemin du fichier donnant le menu
     */
    public Menu(String cheminFichier) {
        List<String> temp;
        items = new ArrayList<String>();
        prix = new HashMap<String, String>();
        menu = new HashMap<String, HashMap<String, String>>();
        temp = getListe(cheminFichier);
        triListe(temp);
        for (String out : items) {
            System.out.println(out);
        }

    }

    /**
     * Transforme la liste pour la mettre dans la table de hashage
     *
     * @param cheminFichier chemin du fichier qui contient le menu
     * @return le fichier
     */
    protected List getListe(String cheminFichier) {

        return Fichiers.readFile(cheminFichier);
    }

    /**
     * sépare la liste dans une liste contenant les noms des items et dans une
     * HashMap contenant le prix des items.
     */
    protected void triListe(List<String> parcours) {
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
                System.out.println(dernierItem);
                for (String out:table.keySet()) {
                    System.out.println(out+";"+table.get(out)+"----------");
                }
                menu.put(dernierItem, table);
                System.out.println(menu.get(dernierItem).get("ketchup")+"88888888888");
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
     * cherche le prix dun item
     *
     * @param nomitem nom de l'item
     * @param quantite quantite
     * @return prix
     */
    public double getPrix(String nomItem, int quantite) {
        String temp = prix.get(nomItem);
        temp = temp.replace(',', '.');
        temp = temp.replace('$', ' ');
        temp = temp.trim();
        return (Double.parseDouble(temp) * quantite);
    }

    public String getQuantite(String nomIngredient, String nomItem) {
        System.out.println("------------000");
        HashMap<String,String> table=new HashMap<String,String>();
        table=menu.get(nomItem);
        for (String out:table.keySet()) {
            System.out.println(out);
        }
        return (menu.get(nomItem).get(nomIngredient));
    }

    public void test() {
 
        for (String out : items) {
            System.out.println(out);
            System.out.println(getPrix(out, 1));
        }
        System.out.println(getQuantite("frites","Frite"));
    }
}
