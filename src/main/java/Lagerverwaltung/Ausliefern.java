package Lagerverwaltung;

public class Ausliefern implements Command
{
    Lagerverwaltung lagerverwaltung;
    public Ausliefern(Lagerverwaltung lagerverwaltung)
    {
        this.lagerverwaltung = lagerverwaltung;
    }

    public void execute(){
        lagerverwaltung.ausliefern();
    }
    
    public String toString(){
        return "ausliefern";
    }
}
