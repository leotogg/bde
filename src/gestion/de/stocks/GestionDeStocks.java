/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.de.stocks;

import java.time.LocalDate;
import java.time.Month;
import java.util.Date;

/**
 *
 * @author Léo Togg
 */
public class GestionDeStocks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        boolean verif;
//        Produit produit1 = new Produit();
//        Produit produit2 = new Produit();
//        produit1.reference = "abrico";
//        produit2.reference = "abrico";
//        produit1.enStock = 1;
//        produit2.enStock = 1;
//        System.out.println(verif= produit1.placerApres(produit2, produit1));
//        produit1.ajouterStock(3);
//        System.out.println(produit1.enStock);
//        produit2.ajouterStock(1);
//        System.out.println(produit2.enStock);
//        produit1.prixVente = 100;
//        produit1.calculPrix(13.8);
//        System.out.println(produit1.prixVente);
//        
        LocalDate date;
        date = LocalDate.of(2022, Month.MARCH, 12);
//        Boisson boisson = new Boisson(12,date);        
//        System.out.println(boisson.estAretirer());
//            int[] tab = new int[4];
//            tab[0] = 1;
//            tab[1] = 1;
//            tab[2] = 1;
//            tab[3] = 1;
//            System.out.print(tab);
//            tab += [2];
           Boisson boisson = new Boisson("designation",  "reference",10,1, 2, date);
           LigneFacturation lf = new LigneFacturation(1,10 );
           LigneFacturation[] produitsAchetes = new LigneFacturation[1];
           produitsAchetes[0] = lf;
           Facture facture = new Facture("mail",date,produitsAchetes,10 );
           Produit[] allProduits = new Produit[1];
           allProduits [0] = boisson;
           Facture[] allFactures = new Facture[1];
           allFactures [0] = facture;
           BDE bde = new BDE("nomBDE");
           System.out.println(boisson.getDate());
           
           System.out.println(boisson.getClass());
           System.out.println(bde.allProduits[0].getClass());
//           System.out.println(bde.allProduits[0].estAretirer(bde.allProduits[0]));
//           bde.listerRetraitProduits();
           
    }
    
}
