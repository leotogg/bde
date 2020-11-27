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
public class BDE {
    public Produit[] allProduits;
    private Facture[] allFactures; 
    private String nomBDE;
    public BDE(String nomBDE, Produit[] allProduits, Facture[] allFactures){
        this.nomBDE = nomBDE;
        this.allProduits = allProduits;
        this.allFactures = allFactures;
    }
    
    public Produit rechercher(String reference){
        for(int i = 0; i < this.allProduits.length; i++){
            if(allProduits[i].ref() == reference){
               return allProduits[i]; 
            }
        }
        return null;
    }
    
    
    public void ajouterStock(String reference, int nbExemplaires){
        Produit produitEnCours = rechercher(reference);
        produitEnCours.ajouterStock(nbExemplaires);
    }
    public void ajouterProduit (String designation, String reference,double prixVente,int enStock,float contenance, LocalDate dateLimiteBoisson){
        Boisson produit = new Boisson( designation,  reference, prixVente, enStock, contenance, dateLimiteBoisson);
    }
    public void ajouterProduit (String designation, String reference,double prixVente,int enStock){
        ProduitDerive produit = new ProduitDerive (designation, reference,prixVente,enStock);
    }
    public void ajouterProduit (String designation, String reference,double prixVente,int enStock, String couleur, int taille, int AnneeMiseEnStock){
        ProduitDeriveTextile produit = new ProduitDeriveTextile (designation, reference,prixVente,enStock, couleur, taille, AnneeMiseEnStock);
    }
//    public void listerRetraitProduits (){
//        for (int i = 0; i<this.allProduits.length; i++){
////            if(allProduits[i].estAretirer(allProduits[i])){
//             int AnneeMiseEnStock = allProduits[i].getAnneeMiseEnStock();
////            if(allProduits[i] instanceof Boisson){
////                if(allProduits[i].estAretirer(allProduits[i])){
////                
////            }
////            }
////                if(allProduits[i].estAretirer(allProduits[i]),this.){
//                
////            }          
//        }
//    }
}
