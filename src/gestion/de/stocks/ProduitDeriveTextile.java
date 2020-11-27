/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.de.stocks;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author Léo Togg
 */
public class ProduitDeriveTextile extends Produit {
        private String couleur;
        private int taille;
        private int AnneeMiseEnStock;
    public ProduitDeriveTextile(String designation,double prixVente,int enStock, String couleur, int taille, int AnneeMiseEnStock){
        super(designation, prixVente, enStock);
        this.couleur = couleur;
        this.taille = taille;
        this.AnneeMiseEnStock = AnneeMiseEnStock;
        
    }
    public int getAnneeMiseEnStock(){
        return AnneeMiseEnStock;
    }
    public boolean estAretirer(){
        return false;
    }
//    public boolean estAretirer(){
//        LocalDate todayDate = LocalDate.now();        
//        int todayDateYear = todayDate.getYear();
//        return(todayDateYear > AnneeMiseEnStock + 4);
//    }
}

