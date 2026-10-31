package net.lecnam.ussi2a.tp5;

/**
 * Code écrit par l'ancien stagiaire.
 */
public class Bibliotheque {
    private Livre[] livres = new Livre[100];
    private int nbLivres = 0;

    public boolean ajouterLivre(Livre livre) {
        if (livre == null || nbLivres >= livres.length) {
            return false;
        }

        for (int i = 0; i < nbLivres; i++) {
            if (livres[i].aLeMemeIsbnQue(livre)) {
                return false;
            }
        }

        livres[nbLivres] = livre;
        nbLivres++;
        return true;
    }

    public int getNbLivres() {
        return nbLivres;
    }

    public boolean estPleine() {
        return nbLivres >= livres.length;
    }

    public Livre rechercherLivre(String isbn) {
        for (int i = 0; i < nbLivres; i++) {
            if (livres[i].getIsbn().equals(isbn)) {
                return livres[i];
            }
        }
        return null;
    }

    public boolean emprunter(String isbn) {
        Livre livre = rechercherLivre(isbn);
        if (livre != null) {
            return livre.emprunter();
        }
        return false;
    }

    public String toString() {
        return "Bibliothèque avec " + nbLivres + " livre(s)";
    }

    public void afficherLivres() {
        System.out.println("--- " + nbLivres + " livre(s) dans la bibliothèque ---");
        for (int i = 0; i < nbLivres; i++) {
            System.out.println(livres[i]);
        }
    }
}
