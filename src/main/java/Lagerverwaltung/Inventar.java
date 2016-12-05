package Lagerverwaltung;

public class Inventar implements Command
{
    Lagerverwaltung lagerverwaltung;
    
    public Inventar(Lagerverwaltung lagerverwaltung){
        this.lagerverwaltung = lagerverwaltung;
    }
    
    public void execute(){
        lagerverwaltung.gibInventar();
    }
    
     public String toString(){
        return "inventar";
    }
}


