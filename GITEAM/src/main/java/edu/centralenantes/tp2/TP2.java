/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package edu.centralenantes.tp2;

/**
 *
 * @author hayta
 */
public class TP2 {

    public static void main(String[] args) {
        /*
        Point2D pa = new Point2D(1,2);
        Point2D pb = new Point2D(10,2);

        Personnage p1 = new Personnage("A",10,100,20,200,30,3000,pa);
        p1.affiche();
        
        Archer p2 = new Archer(10,"B",10,100,20,200,30,300,pb);
        p2.affiche();
        */
        World W = new World();
        W.creerMondeAlea();
        W.afficheWorld();
    }
}
