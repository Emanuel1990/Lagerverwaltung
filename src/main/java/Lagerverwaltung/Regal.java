package Lagerverwaltung;

import java.util.ArrayList;
public class Regal
{
    private ArrayList<ArrayList<Artikel>> reihen;
    private ArrayList<Artikel> spalten;
    private int anzahlReihen;
    private int anzahlSpalten;
    /**
     * Konstruktor für Objekte der Klasse Regal
     */
    public Regal(int anzahlReihen, int anzahlSpalten)
    {
        this.reihen = new ArrayList<ArrayList<Artikel>>(anzahlReihen);
        this.anzahlReihen = anzahlReihen;
        this.anzahlSpalten = anzahlSpalten;
        konfiguriereNeuesRegal(anzahlReihen, anzahlSpalten);
    }
    
    public void konfiguriereNeuesRegal(int anzahlReihen, int anzahlSpalten){
        for(int i = 0; i < anzahlReihen; i++){
           reihen.add(new ArrayList<Artikel>(anzahlSpalten));
       }
    }
    
    public void rekonfiguriereRegal(int anzahlReihen, int anzahlSpalten){
        
    }
    
    public String gibAlleArtikel(){
        String alleArtikelEigenschaften = "";
        for(int i = 0; i < reihen.size(); i++){
            ArrayList<Artikel> tempReihe = reihen.get(i);
            for(int j = 0; j < tempReihe.size();j++){
                Artikel tempSpalte = tempReihe.get(j);
                alleArtikelEigenschaften = alleArtikelEigenschaften + tempSpalte.toString();
            }
        }
        return alleArtikelEigenschaften;
    }
    
    /*
     * Fuegt Artikel in die erste Verfuegbare Spalte ein, die Reihe kann selbst gewählt werden.
     */
    public void einlagern(int welcheReihe, Artikel artikel){
        if(reihen.get(welcheReihe -1).equals(artikel))
        {
        }else{
            reihen.get(welcheReihe -1).add(artikel);
        }
    }
    
    public void ausliefern(String Artikelbezeichnung){
        for(int i = 0; i < reihen.size(); i++){
            ArrayList<Artikel> tempReihe = reihen.get(i);
            for(int j = 0; j < tempReihe.size(); j++){
                Artikel tempSpalte = tempReihe.get(j);
                if(tempSpalte.getArtikelbezeichnung().equals(Artikelbezeichnung)){
                    tempReihe.remove(j);
                }
            }
        }
    }
    
    public String gibStandort(String Artikelbezeichnung){
        String standort = "";
        for(int i = 0; i < reihen.size(); i++){
            for(int j = 0; j < reihen.get(i).size(); j++){
                if(reihen.get(i).get(j).getArtikelbezeichnung().equals(Artikelbezeichnung)){
                    standort = standort + "Reihe: " + (i + 1)+ " Spalte: " + (j+1);
                    break;
                }
            }
        }
        return standort;
    }
    
    public String gibArtikel(int reihe, int spalte){
        String artikel = "";
        for(int i = 0; i < reihen.size(); i++){
            for(int j = 0; j < reihen.get(i).size(); j++){
                if((reihe -1) == i && (spalte -1) == j){
                    artikel = artikel + reihen.get(i).get(j).toString();
                    break;
                }
            }
        }
        return artikel;
    }
    
    public void setAnzahlReihen(int anzahlReihen){
        this.anzahlReihen = anzahlReihen;
    }
    
    public void setAnzahlSpalten(int anzahlSpalten){
        this.anzahlSpalten = anzahlSpalten;
    }
    
    public int getAnzahlReihen(){
        return this.anzahlReihen;
    }
    
    public int getAnzahlSpalten(){
        return this.anzahlSpalten;
    }
}
