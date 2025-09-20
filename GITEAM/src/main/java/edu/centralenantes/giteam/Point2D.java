/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.centralenantes.giteam;

/**
 *
 * @author hayta
 */
public class Point2D {
    // Attributs privés
    private int x;
    private int y;

    // =====================
    // Constructeurs
    // =====================

    // Constructeur sans paramètre (par défaut)
    public Point2D() {
        this.x = 0;
        this.y = 0;
    }

    // Constructeur avec deux paramètres
    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Constructeur de recopie (copie un autre Point2D)
    public Point2D(Point2D p) {
        this.x = p.x;
        this.y = p.y;
    }

    // =====================
    // Accesseurs et mutateurs
    // =====================
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    // Modifier les deux coordonnées en une seule méthode
    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // =====================
    // Méthodes de comportement
    // =====================

    // Translation du point
    public void translate(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }

    // Affichage du point sous la forme [x ; y]
    public String affiche() {
        return "(" + x + " ; " + y + ")";
    }


    // Calcul de la distance entre deux points
    public float distance(Point2D p) {
        int dx = this.x - p.x;
        int dy = this.y - p.y;
        return (float) Math.sqrt(dx * dx + dy * dy);
    }
    
    public Point2D clonep(Point2D p){
        return new Point2D(p.getX(),p.getY());
    }
}
