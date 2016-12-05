package Lagerverwaltung;

public class Position implements Command
{
    Lagerverwaltung lagerverwaltung;
    public Position(Lagerverwaltung lagerverwaltung)
    {
        this.lagerverwaltung = lagerverwaltung;
    }

    public void execute()
    {
       lagerverwaltung.gibStandort();
    }
    
     public String toString(){
        return "position";
    }
}
