/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.de.stocks;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author Léo Togg
 */
public class Boisson extends Produit {
    
    private float contenance;
    private LocalDate dateLimiteBoisson;    
    
    public Boisson(String designation,double prixVente,int enStock,float contenance, LocalDate dateLimiteBoisson){
        super(designation, prixVente, enStock);
        this.dateLimiteBoisson = dateLimiteBoisson;
        this.contenance = contenance;          
    }
    public LocalDate getDate(){
        return this.dateLimiteBoisson;
    }
    
    public boolean estAretirer(){
        LocalDate todayDate = LocalDate.now();
        return(todayDate.isAfter(this.dateLimiteBoisson));
    }    
    
}
