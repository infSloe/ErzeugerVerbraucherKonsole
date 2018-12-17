import java.util.*;
/**
 * Die Klasse Puffer
 */
public class Puffer
{
    // Attribute
    private ArrayList<Element> liste;
    private int max = 3;

    // Konstruktor
    public Puffer()
    {
        liste = new ArrayList<Element>();
    }

    // Methoden
    public synchronized void einfuegen(Element elem)
    {
        if (liste.size()<max)
        {
            liste.add(elem);
            System.out.println("     Puffer: " + liste.size());
        }
        else
        {
            System.out.println("    Puffer ist voll!");
        }

    }

    public synchronized Element entnehmen()
    {
        int anzahl = liste.size();
        if (anzahl>0)
        {
            Element elem = liste.remove(anzahl-1);
            System.out.println("     Puffer: " + liste.size());
            return elem;

        }
        else
        {
            System.out.println("     Puffer ist leer!");
            return null;
        }
    }

}
