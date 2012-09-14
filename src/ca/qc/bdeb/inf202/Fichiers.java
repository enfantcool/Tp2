package ca.qc.bdeb.inf202;

/**
 * opérations reliées à la lecture/écriture de fichiers
 *
 * @author Martin Grégoire
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * Gestion Des fichiers(Écriture/Lecture)
 *
 * @author Martin grégoire
 */
public class Fichiers
{//classe qui sert a charger ou sauvegarder un fichier

    /**
     * Lecture du fichier
     *
     * @param fileName nom du fichier à lire
     * @return File ou rien si le fichier est vide
     */
    public static List<String> readFile(String fileName)
    {//lit le fichier


        /**
         * Contient les données du fichier
         */
        List<String> fiche;
        String temp;

        fiche = new ArrayList<String>();
        try
        {
            /**
             * Permet la lecture du fichier
             */
            BufferedReader Fichelect = new BufferedReader(new FileReader(fileName));

            temp = Fichelect.readLine();
            while (temp != null)
            {
                fiche.add(temp);
                temp = Fichelect.readLine();
            }
            Fichelect.close();

        }
        catch (IOException e)
        {
            System.out.println("Fichier non trouvé");

        }



        return fiche;

    }

    /**
     *
     * @param fileName nom du fichier
     * @return longueur du fichier, ou -1 si vide ou non trouvé.
     */
    private static int longueur(String fileName)
    {//retourne la longueur du fichier
        try
        {
            BufferedReader Fichelect = new BufferedReader(new FileReader(fileName));
            int i = 0;
            while ((Fichelect.readLine()) != null)
            {
                i++;
            }
            Fichelect.close();
            return i;
        }
        catch (IOException e)
        {
            System.out.println("Fichier non trouvé");
            return -1;
        }


    }

    /**
     *
     * @param file
     * @param filePath
     * @throws FileNotFoundException
     */
    public static String[] toString(String nomfichier)
    {
        String[] temp;
        List<String> fichier;
        fichier = new ArrayList<String>();
        fichier = readFile(nomfichier);
        temp = new String[fichier.size()];
        temp = fichier.toArray(temp);
        return temp;

    }

    public static void writeFile(String[] file, String filePath) throws FileNotFoundException
    {//ecrit le contenu du String[] dans un fichier
        PrintWriter source = new PrintWriter(new FileOutputStream(filePath));
        for (int i = 0; i < file.length; i++)
        {
            source.println(file[i]);
        }
        source.close();
    }
}
