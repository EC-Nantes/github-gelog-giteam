/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.centralenantes.tp2;

import edu.centralenantes.tp2.Personnage;
import edu.centralenantes.tp2.Point2D;

/**
 *
 * @author hayta
 */
public class Archer extends Personnage {
    private int nbFleches;

    public Archer(int nbFleches, String n, int pVie, int dAtt, int pPar, int paAtt, int paPar, int dMax, Point2D p) {
        super(n, pVie, dAtt, pPar, paAtt, paPar, dMax, p);
        this.nbFleches = nbFleches;
    }

    public Archer(int nbFleches, Personnage a) {
        super(a);
        this.nbFleches = nbFleches;
    }

    public Archer() {
        super();
        this.nbFleches = nbFleches;
    }
    
    @Override
    public void affiche() {
        super.affiche(); // affiche les infos communes
        System.out.println("Nb de fleches : " + nbFleches);
    }
    
    
}
