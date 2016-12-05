package Lagerverwaltung;


public class Inhalt implements Command
{
    Lagerverwaltung lagerverwaltung;
    public Inhalt(Lagerverwaltung lagerverwaltung)
    {
        this.lagerverwaltung = lagerverwaltung;
    }

    public void execute()
    {
        lagerverwaltung.gibArtikel();
    }
    
     public String toString(){
        return "inhalt";
    }
}
