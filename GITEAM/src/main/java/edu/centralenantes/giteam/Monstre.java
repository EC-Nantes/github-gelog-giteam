package edu.centralenantes.giteam;

import edu.centralenantes.giteam.Point2D;

public class Monstre {
    // =====================
    // Attributs
    // =====================
    private int ptVie;
    private int degAtt;
    private int ptPar;
    private int pageAtt;
    private int pagePar;
    private Point2D pos;

    // =====================
    // Constructeurs
    // =====================
    public Point2D clonep(Point2D p){
        return new Point2D(p.getX(),p.getY());}
    
    // Constructeur complet
    public Monstre(int pVie, int dAtt, int pPar, int paAtt, int paPar, Point2D p) {
        this.ptVie = pVie;
        this.degAtt = dAtt;
        this.ptPar = pPar;
        this.pageAtt = paAtt;
        this.pagePar = paPar;
        this.pos = p;
    }

    // Constructeur de recopie
    public Monstre(Monstre m) {
        this.ptVie = m.ptVie;
        this.degAtt = m.degAtt;
        this.ptPar = m.ptPar;
        this.pageAtt = m.pageAtt;
        this.pagePar = m.pagePar;
        this.pos = clonep(m.pos);
    }

    // Constructeur par défaut
    public Monstre() {
        this.ptVie = 10;
        this.degAtt = 2;
        this.ptPar = 1;
        this.pageAtt = 0;
        this.pagePar = 0;
        this.pos = new Point2D();
    }

    // =====================
    // Getters et Setters
    // =====================

    public int getPtVie() {
        return ptVie;
    }

    public void setPtVie(int ptVie) {
        this.ptVie = ptVie;
    }

    public int getDegAtt() {
        return degAtt;
    }

    public void setDegAtt(int degAtt) {
        this.degAtt = degAtt;
    }

    public int getPtPar() {
        return ptPar;
    }

    public void setPtPar(int ptPar) {
        this.ptPar = ptPar;
    }

    public int getPageAtt() {
        return pageAtt;
    }

    public void setPageAtt(int pageAtt) {
        this.pageAtt = pageAtt;
    }

    public int getPagePar() {
        return pagePar;
    }

    public void setPagePar(int pagePar) {
        this.pagePar = pagePar;
    }

    public Point2D getPos() {
        return pos;
    }

    public void setPos(Point2D pos) {
        this.pos = pos;
    }

    // =====================
    // Méthodes
    // =====================

    public void deplace() {
        // Exemple de déplacement aléatoire de -1 à +1
        int dx = (int) (Math.random() * 3) - 1;
        int dy = (int) (Math.random() * 3) - 1;
        pos.translate(dx, dy);
    }

    public void afficheM() {
        System.out.println("Monstre :");
        System.out.println("  PV = " + ptVie);
        System.out.println("  Attaque = " + degAtt);
        System.out.println("  Parade = " + ptPar);
        System.out.println("  Position = " + pos.affiche());
    }
}
