/**
 * Die Klasse Verbraucher
 */
public class Verbraucher implements Runnable
{
    // Attribute
    private Puffer puffer;
    
    // Konstruktor
    public Verbraucher(Puffer puffer_)
    {
        puffer = puffer_;

    }

    // Methoden
    public void run()
    {
        for(int i = 0; i < 5; i ++)
        {
            String name = Thread.currentThread().getName();
            System.out.println("          "+ name +": möchte ein Element nehmen!");
            Element elem = puffer.entnehmen();
            if (elem != null) // habe ein Element bekommen!
            {
                int dauer = (int) (6 * Math.random())+1;  //Es dauert zwischen 1 und 10 Sekunden
                for (int j = dauer; j > 0; j--)
                {
                    try{
                        Thread.sleep(1000);
                    }catch(Exception ex)
                    {};
                }
                System.out.println("          "+ name +" hat es einsortiert");
            }

            try{
                Thread.sleep(1000);
            }catch(Exception ex)
            {};
        }
    }
}

