/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.qc.bdeb.inf202;

/**
 * Opérations sur la tvQ
 *
 * @author Martin Grégoire
 */
public class TVQ
{

    /**
     * numero de la tvq
     */
    static protected String numero = "0987654321";
    /**
     * valeur de le tvq de type double
     */
    static protected double valeur = 0.095;

    /**
     *
     * retourne le numero de la tvq
     */
    static public String getNumero()
    {
        return numero;
    }

    /**
     * Retourne la valeur de la tvq
     *
     */
    static public double getValeur()
    {
        return valeur;
    }
}
