/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package onitama_thievon;

import java.util.ArrayList;

/**
 *
 * @author thiev
 */
public class Joueur {
    
    String prenom;
    String nom;
    private int equipe;
    ArrayList<Pion> reservePions = new ArrayList<Pion>();
    
    
    public Joueur(String name, String surname, int team) {
        prenom = name;
        nom = surname;
        equipe = team;
    }
    
    public int avoirEquipe() {
        return equipe;
    }
    
    public void AffecterEquipe(int a) {
        equipe = a;
    }
    
    public void recupererPion(Pion p) {
        reservePions.add(p);
    }
    
    
    
    @Override
    public String toString() {
        return prenom + " " + nom;
    }

}
    
