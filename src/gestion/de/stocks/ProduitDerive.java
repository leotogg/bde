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
public class ProduitDerive extends Produit {
    public ProduitDerive(String designation, String reference,double prixVente,int enStock){
        super(designation, reference, prixVente, enStock);
    }
//    public boolean estAretirer(){
//        return false;
//    }
}
