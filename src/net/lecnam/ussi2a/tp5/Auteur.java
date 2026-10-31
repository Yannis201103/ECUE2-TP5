package net.lecnam.ussi2a.tp5;

import java.time.LocalDate;
import java.time.Period;

/**
 * Code écrit par l'ancien stagiaire.
 * Il "marche"... à peu près.
 */
public class Auteur {
    private String nom;
    private String prenom;
    private LocalDate dateNaissance;

    public Auteur(String nom, String prenom, LocalDate dateNaissance) {
        if (nom == null || nom.isBlank()) {
            throw new IllegalArgumentException("Le nom est obligatoire");
        }
        if (dateNaissance == null || dateNaissance.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("La date de naissance est obligatoire et ne peut pas être dans le futur");
        }
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
    }

     public String getAge() {
        return Integer.toString(Period.between(dateNaissance, LocalDate.now()).getYears());
    }

    public String toString() {
        return prenom + " " + nom + " (" + getAge() + " ans)";
    }

    public Object getNom() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getNom'");
    }
}
