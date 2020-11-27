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
public class Facture {
    private String mail;
    private LocalDate EmissionFacture;
    private LigneFacturation[] produitsAchetes;
    private float montantTotal;
    public Facture(String mail,LocalDate EmissionFacture,LigneFacturation[] produitsAchetes,float montantTotal ){
        this.mail = mail;
        this.EmissionFacture = EmissionFacture;
        this.produitsAchetes = produitsAchetes;
        this.montantTotal = montantTotal;
    }

    
}
