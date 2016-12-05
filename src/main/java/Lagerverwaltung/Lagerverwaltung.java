package Lagerverwaltung;

import java.util.Scanner;

public class Lagerverwaltung
{
    Lager lager = new Lager();
    
    public Lagerverwaltung(){
        initialisiereLager();
    }
    
    public Lager initialisiereLager()
    {
        Regal regal1, regal2, regal3;
        
        regal1 = new Regal(3, 10);
        regal2 = new Regal(3, 10);
        regal3 = new Regal(3, 10);
        lager.addRegal(regal1);
        lager.addRegal(regal2);
        lager.addRegal(regal3);
        
        lager.einlagern(1, 1, new Artikel("Laptop", "123","Stueck", "500"));
        lager.einlagern(1, 1, new Artikel("Schraube", "1","Stueck", "300"));
        lager.einlagern(1, 1, new Artikel("TV", "3","Stueck", "700"));

        return lager;
    }
    
    public void gibInventar(){
        System.out.println(lager.gibInventar());
    }
    
    public Artikel neuerArtikel(){
        Scanner scan = new Scanner(System.in);
        String eingabe;
        Artikel artikel = new Artikel();
        
        System.out.println("Geben Sie die Artikelbezeichnung ein:");
        eingabe = scan.nextLine();
        artikel.setArtikelbezeichnung(eingabe);
        System.out.println("Geben Sie die Artikelnummer ein:");
        eingabe = scan.nextLine();
        artikel.setArtikelnummer(eingabe);
        System.out.println("Geben Sie Verpackungseinheit ein:");
        eingabe = scan.nextLine();
        artikel.setVerpackungseinheit(eingabe);
        System.out.println("Geben Sie den Preis ein");
        eingabe = scan.nextLine();
        artikel.setPreis(eingabe);
        
        return artikel;
    }
    
    public void einlagern()
    {
        Scanner scan = new Scanner(System.in);
        int regalnummer;
        int welcheReihe;
        System.out.println("In welches Regal moechten Sie einlagern:");
        regalnummer = scan.nextInt();
        System.out.println("In welche Reihe moechten Sie einlagern:");
        welcheReihe = scan.nextInt();
        Artikel artikel = neuerArtikel();
        
        lager.einlagern(regalnummer,welcheReihe,artikel);
        System.out.println("Sie haben den Aritkel '" + artikel.getArtikelbezeichnung() + "' mit der Artikelnummer " + artikel.getArtikelnummer() +" erfolgreich eingelagert");
    }
    
    public void ausliefern(){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Geben Sie die Artikelbezeichnung ein:");
        String artikelbezeichnung = scan.nextLine();
        
        lager.ausliefern(artikelbezeichnung);
    }
    
    public void gibStandort(){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Geben Sie die Artikelbezeichnung ein:");
        String artikelbezeichnung = scan.nextLine();
        System.out.println(lager.gibStandort(artikelbezeichnung));
    }
    
    public void gibArtikel(){
        Scanner scan = new Scanner(System.in);
        int regal;
        int reihe;
        int spalte;
        
        System.out.println("Geben Sie die Regalnummer ein");
        regal = scan.nextInt();
        System.out.println("Geben Sie die Reihe ein");
        reihe = scan.nextInt();
        System.out.println("Geben Sie die Spalte ein");
        spalte = scan.nextInt();
        System.out.println(lager.gibArtikel(regal, reihe, spalte));
    }
    
    public void zusaetzlichesRegal(){
        Scanner scan = new Scanner(System.in);
        int reihen;
        int spalten;
        System.out.println("Geben Sie die Anzahl der Reihen ein");
        reihen = scan.nextInt();
        System.out.println("Geben Sie die Anzahl der Spalten ein");
        spalten = scan.nextInt();
        Regal regal = new Regal(reihen, spalten);
        lager.addRegal(regal);
    }
    
}
    

