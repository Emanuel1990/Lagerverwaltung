/**
 * Beschreiben Sie hier die Klasse Artikel.
 * 
 * @author Emanuel Mair 
 * @version 2
 */

package Lagerverwaltung;

public class Artikel{
    private String artikelbezeichnung;
    private String artikelnummer;
    private String verpackungseinheit;
    private String preis;
    public Artikel(String artikelbezeichnung, String artikelnummer, String verpackungseinheit, String preis) {
        this.artikelbezeichnung = artikelbezeichnung;
        this.artikelnummer = artikelnummer;
        this.verpackungseinheit = verpackungseinheit;
        this.preis = preis;
    }
    
    public Artikel()
    {
    
    }

    public void setArtikelbezeichnung(String artikelbezeichnung) {
        this.artikelbezeichnung = artikelbezeichnung;
    }

    public void setArtikelnummer(String artikelnummer) {
        this.artikelnummer = artikelnummer;
    }

    public void setVerpackungseinheit(String verpackungseinheit) {
        this.verpackungseinheit = verpackungseinheit;
    }

    public void setPreis(String preis) {
        this.preis = preis;
    }

    public String getArtikelbezeichnung() {
        return this.artikelbezeichnung;
    }

    public String getArtikelnummer() {
        return this.artikelnummer;
    }

    public String getVerpackungseinheit() {
        return this.verpackungseinheit;
    }

    public String getPreis() {
        return this.preis;
    }
    
    public String toString(){
        return  "Bezeichnung: " + getArtikelbezeichnung() + "\n"+
                "Artikelnummer: " + getArtikelnummer() + "\n"+
                "Verpackungseinheit: " + getVerpackungseinheit() + "\n"+
                "Preis: " + getPreis() + "\n" +
                //lieferant.toString();
                "\n";            
    }
}