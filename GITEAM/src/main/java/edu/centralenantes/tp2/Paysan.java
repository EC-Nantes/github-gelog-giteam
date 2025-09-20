/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.centralenantes.tp2;

import edu.centralenantes.tp2.Point2D;


public class Paysan extends Personnage {
    // =====================
    // Constructeurs
    // =====================

    // Constructeur complet
    public Paysan(String n, int pVie, int dAtt, int pPar, int paAtt, int paPar, int dMax, Point2D p) {
        super(n, pVie, dAtt, pPar, paAtt, paPar, dMax, p); // appel du constructeur parent
    }

    // Constructeur de recopie
    public Paysan(Paysan p) {
        super(p); // constructeur de recopie de Personnage
    }

    // Constructeur par défaut
    public Paysan() {
        super();
    }

   
}
