package Lagerverwaltung;

import java.util.ArrayList;
public class Lager
{
    private ArrayList<Regal> alleRegale;
    /**
     * Konstruktor für Objekte der Klasse Lager
     */
    public Lager()
    {
        this.alleRegale = new ArrayList<Regal>();
    }
    
    public String gibInventar()
    {
        String inventar = "";
        for(int i = 0; i < alleRegale.size(); i++){
            inventar = inventar + alleRegale.get(i).gibAlleArtikel();
        }
        return inventar;
    }
    
    public void einlagern(int welchesRegal, int welcheReihe, Artikel artikel){
        do{
            alleRegale.get(welchesRegal -1).einlagern(welcheReihe, artikel);
            if(welchesRegal > alleRegale.size()){
                System.out.println("So viele Regale haben wir nicht. Geben Sie einen niedereren Wert ein.");
            }
        }while(welchesRegal > alleRegale.size());
    }
    
    public void ausliefern(String Artikelbezeichnung)
    {
        for(int i = 0; i < alleRegale.size(); i++){
            alleRegale.get(i).ausliefern(Artikelbezeichnung);
        }
    }
    
    public String gibStandort(String Artikelbezeichnung){
        String standort = "";
        for(int i = 0; i < alleRegale.size(); i++){
            standort = standort + alleRegale.get(i).gibStandort(Artikelbezeichnung);
        }
        return standort;
    }
   
    public String gibArtikel(int regal, int reihe, int spalte){
        regal = regal -1;
        return alleRegale.get(regal).gibArtikel(reihe,spalte);
    }
    
    public void addRegal(Regal regal){
        alleRegale.add(regal);
    }
    
    public void removeRegal(Regal regal){
        alleRegale.remove(regal);
    }
}
