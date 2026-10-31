package net.lecnam.ussi2a.tp5;

public class Isbn {

    private Isbn() {
        // Constructeur privé pour empêcher l'instanciation
    }

    public static boolean estValide(String isbn) {
        if (isbn == null || isbn.length() != 13) {
            return false;
        }
        int somme = 0;
        for (int i = 0; i < isbn.length(); i++) {
            char caractere = isbn.charAt(i);
            if (caractere < '0' || caractere > '9') {
                return false;
            }
            int chiffre = caractere - '0';
            somme += chiffre * (i % 2 == 0 ? 1 : 3);
        }
        return somme % 10 == 0;
    }
}