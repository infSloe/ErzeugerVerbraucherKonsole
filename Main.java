
/**
 * 
 */
public class Main
{
    // Attribute
    private Puffer puffer;
    private Erzeuger erz; 
    private Thread erzeuger; 
    private Verbraucher verb;
    private Thread verbraucher;
    // Methoden

    public void gleichzeitig()
    {
        puffer = new Puffer();
        erz = new Erzeuger(puffer);
        verb = new Verbraucher(puffer);

        erzeuger = new Thread(erz);
        erzeuger.setName("Erzeuger");
        erzeuger.start();

        verbraucher = new Thread(verb);
        verbraucher.setName("Verbraucher");
        verbraucher.start();
    }

    public void erzeugerZuerst()
    {
        puffer = new Puffer();
        erz = new Erzeuger(puffer);
        verb = new Verbraucher(puffer);

        erzeuger = new Thread(erz);
        erzeuger.setName("Erzeuger");

        verbraucher = new Thread(verb);
        verbraucher.setName("Verbraucher");

        erzeuger.start();
        try{
            Thread.sleep(3000);
        }catch(Exception ex)
        {}
        verbraucher.start();
    }

    public void verbraucherZuerst()
    {
        puffer = new Puffer();
        erz = new Erzeuger(puffer);
        verb = new Verbraucher(puffer);

        erzeuger = new Thread(erz);
        erzeuger.setName("Erzeuger");

        verbraucher = new Thread(verb);
        verbraucher.setName("Verbraucher");

        verbraucher.start();
        try{
            Thread.sleep(4000);
        }catch(Exception ex)
        {}

        erzeuger.start();
    }

}
