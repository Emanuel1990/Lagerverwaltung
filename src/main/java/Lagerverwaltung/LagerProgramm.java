package Lagerverwaltung;

import java.util.Scanner;
import java.util.ArrayList;
public class LagerProgramm
{
    public static void main(String[] args){
       Lagerverwaltung lagerverwaltung = new Lagerverwaltung();
       BefehlListe befehlListe = new BefehlListe(lagerverwaltung);
       
       String befehl;
       Scanner scan = new Scanner(System.in);
       do{
           standardAusgabe();
           befehl = scan.nextLine();
           for(int i = 0; i < befehlListe.getBefehlListe().size(); i++){
               if(befehlListe.getBefehlListe().get(i).toString().equals(befehl))
               {
                   befehlListe.getBefehlListe().get(i).execute();
                   break;
               }else if(befehl.equals("hilfe"))
               {
                   System.out.println("Das sind alle gültigen Befehle");
                   for(int j = 0; j < befehlListe.getBefehlListe().size(); j++){
                       System.out.print(befehlListe.getBefehlListe().get(j).toString()+" ");
                   }
                   System.out.println("");
                   break;
               }else if(befehl.equals("beenden")){
                   System.out.println("Sie haben das Programm beendet");
                   break;
               }
               else if(befehlListe.getBefehlListe().size()== i + 1)
               {
                   System.out.println("Das ist kein gültiger Befehl");
                   break;
               }
            }
       }while(!befehl.equals("beenden"));
    }
    
    public static void wilkommenstext(){
        System.out.println("*****Lagerverwaltung*****");
        System.out.println("Was moechten Sie tun?");
    }
    
    public static void standardAusgabe(){
        System.out.println("Bitte geben Sie einen Befehl ein:");
        System.out.print(">");
    }
}

