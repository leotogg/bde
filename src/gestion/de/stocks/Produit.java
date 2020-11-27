/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.de.stocks;

import java.time.LocalDate;

/**
 *
 * @author Léo Togg
 */
public class Produit {

    private String designation;
    private String reference;
    private double prixVente;
    private int enStock;
    
    public Produit(String designation,double prixVente,int enStock ){
        this.designation = designation;
//        this.reference = reference;
        this.prixVente = prixVente;
        this.enStock = enStock;
    }

    public boolean placerApres(Produit produit1, Produit produit2) {
        //retourne True si la reference de produit1 est plus grande que la refrence de produit2
        return produit1.reference.compareTo(produit2.reference) > 0;
    }

    public void ajouterStock(int enPlus) {
        enStock += enPlus;
    }

    public void retirerStock(int enMoins) {
        enStock += enMoins;
    }

    public void calculPrix(double reduction) {
        prixVente *= (1-(reduction/100));        
    }
    public String getref(){
        return reference;
    }
    
    public void reference(String lettre, int nb){
        reference = lettre + nb;
    }
    
    public boolean estAretirer(){
        return false;
    }  
//    public boolean estAretirer(Produit produit){
//        LocalDate todayDate = LocalDate.now();
//        LocalDate dateLimiteBoisson = produit.getDate();
//        return(todayDate.isAfter(dateLimiteBoisson));
//    }
    
//    public boolean estAretirer(ProduitDeriveTextile produit){    
//        LocalDate todayDate = LocalDate.now();
//        int todayDateYear = todayDate.getYear();
//        int AnneeMiseEnStock = produit.getAnneeMiseEnStock();
//        return(todayDateYear > AnneeMiseEnStock + 4);
//    }
                
    
    
}
