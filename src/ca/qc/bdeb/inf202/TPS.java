/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.qc.bdeb.inf202;

/**
 * Opérations reliées à la TPS
 * @author Martin Gregoire
 */
public class TPS {
    /**
     * numero de la tps
     */
    static protected String numero="1234567890";
    /**
     * valeur de le tps de type double
     */
    static protected double valeur=0;
    
    /**
     * 
     * retourne le numero de la tps
     */
    public static String getNumero(){
        return numero;
    }
    /**
     * Retourne la valeur de la tps
     * 
     */
    public static double getValeur(){
        return valeur;
    }
}
