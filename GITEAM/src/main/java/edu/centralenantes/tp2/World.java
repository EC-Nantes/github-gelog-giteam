package edu.centralenantes.tp2;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class World {
    public Archer robin;
    public Paysan peon;
    public Lapin bugs;
    
    
   
    private Set<Point2D> positionsOccupees;

    public World() {
        Point2D pa = new Point2D(0,0);
        robin = new Archer(50,"Robin",10,100,20,200,30,3000,pa);
        peon = new Paysan("Peon",10,100,20,200,30,30,pa);
        bugs = new Lapin(10,100,200,3,3000,pa);
        positionsOccupees = new HashSet<>(); // ⚡ initialisation obligatoire
    }

    // Génère une position aléatoire non occupée
    private Point2D positionAleatoire(Random rand) {
        Point2D p;
        do {
            int x = rand.nextInt(101); // entre 0 et 100
            int y = rand.nextInt(101);
            p = new Point2D(x, y);
        } while (positionsOccupees.contains(p));
        positionsOccupees.add(p);
        return p;
    }

    // Création d'un monde avec positions aléatoires
    public void creerMondeAlea() {
        Random rand = new Random();
        positionsOccupees.clear(); // on vide au cas où

        robin.setPos(positionAleatoire(rand));
        peon.setPos(positionAleatoire(rand));
        bugs.setPos(positionAleatoire(rand));
    }

    // Affichage du monde
    public void afficheWorld() {
        System.out.println("=== Monde WoE ===");
        robin.affiche();
        peon.affiche();
        bugs.afficheM();
    }
}
