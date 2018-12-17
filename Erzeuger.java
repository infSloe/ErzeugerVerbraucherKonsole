
/**
 * Die Klasse Erzeuger
 */
public class Erzeuger implements Runnable
{
    // Attribute
    private Puffer puffer;

    // Konstruktor
    public Erzeuger(Puffer puffer_)
    {
        puffer = puffer_;

    }

    // Methoden    
    public void run()
    {
        for(int i = 0; i < 5; i ++)
        {
            String name = Thread.currentThread().getName();
            System.out.println(name + " stellt ein Element her.");
            for (int j = 3; j > 0; j--)
            {
                try{
                    Thread.sleep(1000);
                }catch(Exception ex)
                {};
            }
            System.out.println(name + " fügt das Element in den Puffer ein.");
            puffer.einfuegen(new Element());
            try{
                Thread.sleep(1000);
            }catch(Exception ex)
            {};
        }
    }

}

