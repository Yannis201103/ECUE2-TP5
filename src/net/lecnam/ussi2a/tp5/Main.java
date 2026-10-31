package net.lecnam.ussi2a.tp5;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // 1. Pas besoin de créer une bibliothèque pour lire sa capacité.
        System.out.println("Capacité maximale : " + Bibliotheque.CAPACITE_MAX);

        // 2. Créer trois auteurs.
        Auteur yannis = new Auteur("MOUCHARD", "Yannis", LocalDate.of(2003, 11, 20));
        Auteur jean = new Auteur("CLAUDE", "Jean", LocalDate.of(2000, 5, 15));
        Auteur viktor = new Auteur("DOD", "Viktor", LocalDate.of(1990, 8, 10));

        // 3. Créer quatre livres. Le premier n'a qu'un exemplaire.
        Livre livre1 = new Livre(yannis, "La coupe du monde", "9782253004226", 1);
        Livre livre2 = new Livre(jean, "La vida loca", "9780306406157", 3);
        Livre livre3 = new Livre(viktor, "Aujourd'hui pas demain", "9780131103627", 2);
        Livre livre4 = new Livre(yannis, "La vie c'est un classement", "9780201633610", 4);

        // 4. Ajouter les livres et essayer d'ajouter deux fois le même.
        Bibliotheque bibliotheque = new Bibliotheque();
        bibliotheque.ajouterLivre(livre1);
        bibliotheque.ajouterLivre(livre2);
        bibliotheque.ajouterLivre(livre3);
        bibliotheque.ajouterLivre(livre4);
        bibliotheque.ajouterLivre(livre1); // tentative d'ajout du même

        // 5. Afficher la liste des livres.
        bibliotheque.afficherLivres();

        // 6. Les erreurs sont affichées, mais le programme continue.
        try {
            new Livre(yannis, "ISBN incorrect", "123", 1);
        } catch (IllegalArgumentException e) {
            System.out.println("Erreur ISBN : " + e.getMessage());
        }

        try {
            Auteur auteurSansNom = new Auteur(null, "Prénom", LocalDate.of(1990, 1, 1));
            new Livre(auteurSansNom, "Livre sans auteur valide", "9782253004226", 1);
        } catch (IllegalArgumentException e) {
            System.out.println("Erreur auteur : " + e.getMessage());
        }

        // 7. Emprunter puis rendre le livre qui n'a qu'un exemplaire.
        bibliotheque.emprunter(livre1.getIsbn());
        bibliotheque.emprunter(livre1.getIsbn()); // devrait échouer
        bibliotheque.rendre(livre1.getIsbn());
        bibliotheque.emprunter(livre2.getIsbn());
        bibliotheque.afficherLivres();

        // 8. Essayer d'emprunter un ISBN absent de la bibliothèque.
        System.out.println("Emprunt d'un ISBN absent : "
                + bibliotheque.emprunter("9780000000002"));

        // 9. Rechercher un livre et l'afficher.
        Livre livreRecherche = bibliotheque.rechercherLivre("9780306406157");
        System.out.println("Livre recherché : " + livreRecherche);

        // 10. Les tentatives qui ont échoué ne doivent pas augmenter le compteur.
        System.out.println("Nombre de livres créés : " + Livre.getNbLivresCrees());
    }
}