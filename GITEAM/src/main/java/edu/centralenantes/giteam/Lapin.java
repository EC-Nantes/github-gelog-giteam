package edu.centralenantes.giteam;

import edu.centralenantes.giteam.Monstre;
import edu.centralenantes.giteam.Point2D;

public class Lapin extends Monstre {
    // =====================
    // Constructeurs
    // =====================

    // Constructeur complet
    public Lapin(int pVie, int dAtt, int pPar, int paAtt, int paPar, Point2D p) {
        super(pVie, dAtt, pPar, paAtt, paPar, p);
    }

    // Constructeur de recopie
    public Lapin(Lapin l) {
        super(l);
    }

    // Constructeur par défaut
    public Lapin() {
        super();
    }

   
}
