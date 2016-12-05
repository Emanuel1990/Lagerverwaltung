package Lagerverwaltung;

public class Einlagern implements Command
{
    Lagerverwaltung lagerverwaltung;
    /**
     * Konstruktor f�r Objekte der Klasse Einlagern
     */
    public Einlagern(Lagerverwaltung lagerverwaltung)
    {
        this.lagerverwaltung = lagerverwaltung;
    }

    public void execute(){
        lagerverwaltung.einlagern();
    }
    
     public String toString(){
        return "einlagern";
    }
}

