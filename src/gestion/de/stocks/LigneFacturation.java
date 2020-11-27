/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.de.stocks;

/**
 *
 * @author Léo Togg
 */
public class LigneFacturation {
    private int nbAchete;
    private float prixTotal;
    public LigneFacturation(int nbAchete,float prixTotal ){
        this.nbAchete = nbAchete;
        this.prixTotal = prixTotal;
    }
}

