/**
 * Beschreiben Sie hier die Klasse BefehlListe.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */

package Lagerverwaltung;

import java.util.ArrayList;

public class BefehlListe
{
    private ArrayList<Command> befehlListe;
    public BefehlListe(Lagerverwaltung lagerverwaltung)
    {
        this.befehlListe = new ArrayList<Command>();
        erstelleBefehle(lagerverwaltung);
    }
    
    public void addBefehl(Command command){
        befehlListe.add(command);
    }
    
    public void erstelleBefehle(Lagerverwaltung lagerverwaltung){
       Command ausliefern = new Ausliefern(lagerverwaltung);
       Command einlagern = new Einlagern(lagerverwaltung);
       Command inhalt = new Inhalt(lagerverwaltung);
       Command position = new Position(lagerverwaltung);
       Command inventar = new Inventar(lagerverwaltung);
       Command regalHinzufuegen = new RegalHinzufuegen(lagerverwaltung);
       befehlListe.add(ausliefern);
       befehlListe.add(einlagern);
       befehlListe.add(inhalt);
       befehlListe.add(position);
       befehlListe.add(inventar);
       befehlListe.add(regalHinzufuegen);
    }
    
    public ArrayList<Command> getBefehlListe(){
        return this.befehlListe;
    }
    
}
