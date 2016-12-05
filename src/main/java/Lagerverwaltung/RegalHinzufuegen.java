package Lagerverwaltung;


public class RegalHinzufuegen implements Command
{
    Lagerverwaltung lagerverwaltung;
    public RegalHinzufuegen(Lagerverwaltung lagerverwaltung)
    {
       this.lagerverwaltung = lagerverwaltung;
    }

    public void execute()
    {
        lagerverwaltung.zusaetzlichesRegal();
    }
    
     public String toString(){
        return "regal+";
    }
}
