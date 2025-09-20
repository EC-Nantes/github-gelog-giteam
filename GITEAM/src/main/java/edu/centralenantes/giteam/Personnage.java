/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.centralenantes.giteam;

import edu.centralenantes.giteam.Point2D;

/**
 *
 * @author hayta
 */
public class Personnage {
    private String nom;
    private int ptVie;
    private int degAtt;
    private int ptPar;
    private int pageAtt;
    private int pagePar;
    private int distAttMax;
    private Point2D pos;
    
    
    public Personnage(String n, int pVie, int dAtt, int pPar, int paAtt, int paPar, int dMax, Point2D p){
        this.nom = n;
        this.ptVie = pVie;
        this.degAtt = dAtt;
        this.ptPar = pPar;
        this.pageAtt = paAtt;
        this.pagePar = paPar;
        this.distAttMax = dMax;
        this.pos = p;
    }
    public Point2D clonep(Point2D p){
        return new Point2D(p.getX(),p.getY());
    }
    public Personnage(Personnage perso){
        this.nom = perso.nom;
        this.ptVie = perso.ptVie;
        this.degAtt = perso.degAtt;
        this.ptPar = perso.ptPar;
        this.pageAtt = perso.pageAtt;
        this.pagePar = perso.pagePar;
        this.distAttMax = perso.distAttMax;
        this.pos = clonep(perso.pos); 
    }

// Constructeur par défaut
    public Personnage() {
        this.nom = "Inconnu";
        this.ptVie = 100;
        this.degAtt = 10;
        this.ptPar = 5;
        this.pageAtt = 1;
        this.pagePar = 1;
        this.distAttMax = 1;
        this.pos = new Point2D(0, 0);
    }
    
    public String getNom(){
        return nom;
    }
    

    // Getters et Setters
    public void setNom(String n){
        this.nom = n;
    }


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

    public int getDistAttMax() {
        return distAttMax;
    }

    public void setDistAttMax(int distAttMax) {
        this.distAttMax = distAttMax;
    }

    public Point2D getPos() {
        return pos;
    }

    public void setPos(Point2D pos) {
        this.pos = pos;
    }

    // Méthode de déplacement (exemple simple : décaler de dx, dy)
    public void deplace(int dx, int dy) {
        this.pos.setPosition(this.pos.getX() + dx, this.pos.getY() + dy);
    }

    // Méthode d'affichage
    public void affiche() {
        System.out.println("Nom: " + nom);
        System.out.println("Points de Vie: " + ptVie);
        System.out.println("Degats d'Attaque: " + degAtt);
        System.out.println("Points de Parade: " + ptPar);
        System.out.println("Page Attaque: " + pageAtt);
        System.out.println("Page Parade: " + pagePar);
        System.out.println("Distance Attaque Max: " + distAttMax);
        System.out.println("Position: (" + pos.getX() + ", " + pos.getY() + ")");
    }
}