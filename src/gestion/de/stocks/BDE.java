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
    private int nbProd;
    private int nblotb = 0;
    private int nblotd = 0;
    private int nblott = 0;
    
    public BDE(String nomBDE){
        Produit[] allProduits = new Produit[100];
        Facture[] allFactures = new Facture[1000];
        this.nomBDE = nomBDE;
        this.allProduits = allProduits;
        this.allFactures = allFactures;
        this.nbProd = 0;
        
    }
    
    public Produit rechercher(String reference){
        for(int i = 0; i < this.allProduits.length; i++){
            if(allProduits[i].getref() == reference){
               return allProduits[i]; 
            }
        }
        return null;
    }
    
    
    public void ajouterStock(String reference, int nbExemplaires){
        Produit produitEnCours = rechercher(reference);
        produitEnCours.ajouterStock(nbExemplaires);
    }
    public void ajouterProduit (String designation,double prixVente,int enStock,float contenance, LocalDate dateLimiteBoisson){
        Boisson produit = new Boisson( designation, prixVente, enStock, contenance, dateLimiteBoisson);
        int index = this.nbProd + 1;
        produit.reference("B",nblotb);
        nblotb ++;
        for (int i = index; i > 0; i --){
            if(produit.placerApres(produit, allProduits[i-1])){                
                allProduits[i] = produit;
            }
        }
        this.nbProd += 1;
        
    }
    public void ajouterProduit (String designation,double prixVente,int enStock){
        ProduitDerive produit = new ProduitDerive (designation,prixVente,enStock);
        int index = this.nbProd + 1;
        produit.reference("D",nblotd);
        nblotd ++;
        for (int i = index; i > 0; i --){
            if(produit.placerApres(produit, allProduits[i-1])){                
                allProduits[i] = produit;
            }
        }
        this.nbProd += 1;
    }
    public void ajouterProduit (String designation, double prixVente,int enStock, String couleur, int taille, int AnneeMiseEnStock){
        ProduitDeriveTextile produit = new ProduitDeriveTextile (designation,prixVente,enStock, couleur, taille, AnneeMiseEnStock);
        int index = this.nbProd + 1;
        produit.reference("T",nblott);
        nblott ++;
        for (int i = index; i > 0; i --){
            if(produit.placerApres(produit, allProduits[i-1])){                
                allProduits[i] = produit;
            }
        }
        this.nbProd += 1;
    }
    public void listerRetraitProduits (){
        Produit[] produitRetire = new Produit[100];
        int nbretire =0;
        for (int i = 0; i<this.allProduits.length; i++){
            if(allProduits[i].estAretirer()){
                allProduits[i] = null;
                produitRetire[nbretire] = allProduits[i];
            }          
        }
        Produit[] temp = new Produit[100];
        int compt = 0;
        for (int i = 0; i<this.allProduits.length; i++){
            if (allProduits[i] != null){
                temp[compt] = allProduits[i];
                compt ++;
            }
        }
        allProduits = temp;
        nbProd = compt;
        for (int i = 0; i<nbretire; i++){
            System.out.println(produitRetire[i]);
        }
    }
}

