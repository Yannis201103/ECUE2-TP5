package net.lecnam.ussi2a.tp5;

/**
 * Code écrit par l'ancien stagiaire.
 */
public class Livre {
    private Auteur auteur;
    private String titre;
    private final String isbn;
    private int nbExemplaires;
    private int nbDisponibles;

    public Livre(Auteur auteur, String titre, String isbn, int nbExemplaires) {
        if (auteur == null) {
            throw new IllegalArgumentException("Le nom de l'auteur est obligatoire");
        }
        if (titre == null || titre.isBlank()) {
            throw new IllegalArgumentException("Le titre est obligatoire");
        }
        if (nbExemplaires < 1) {
            throw new IllegalArgumentException("Le nombre d'exemplaires doit être positif");
        }
        if (nbDisponibles < 0 || nbDisponibles > nbExemplaires) {
            throw new IllegalArgumentException("Le nombre de livres disponibles est invalide");
        }
        this.auteur = auteur;
        this.titre = titre;
        this.isbn = isbn;
        this.nbExemplaires = nbExemplaires;
        this.nbDisponibles = nbExemplaires;
    }

    public void setTitre(String titre) {
        if (titre == null || titre.isBlank()) {
            throw new IllegalArgumentException("Le titre est obligatoire");
        }
        this.titre = titre;
    }

    public boolean estDisponible() {
        return nbDisponibles > 0 && nbDisponibles <= nbExemplaires;
    }

    public boolean emprunter() {
        if (estDisponible()) {
            nbDisponibles--;
            return true;
        }
        return false;
    }

    public boolean rendre() {
        if (nbDisponibles < nbExemplaires) {
            nbDisponibles++;
            return true;
        }
        return false;
    }

    public boolean aLeMemeIsbnQue(Livre autre) {
        return this.isbn.equals(autre.isbn);
    }

    public String getIsbn() {
        return isbn;
    }

    public String toString() {
        return "[" + isbn + "] " + titre + " - " + auteur
                + " - " + nbDisponibles + "/" + nbExemplaires + " disponible(s)";
    }
}
