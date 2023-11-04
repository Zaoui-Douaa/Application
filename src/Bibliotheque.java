import java.util.*;

public class Bibliotheque {
    private List<Livre> livresDisponibles;

    public Bibliotheque() {
        livresDisponibles = new ArrayList<>();
    }

    public void ajouterLivre(Livre livre) {
        livresDisponibles.add(livre);
    }

    public void emprunterLivre(Livre livre) {
        if (livresDisponibles.contains(livre)) {
            livresDisponibles.remove(livre);
            livre.emprunter();
            System.out.println("Livre emprunté : " + livre.getTitre());
        } else {
            System.out.println("Le livre n'est pas disponible dans la bibliothèque.");
        }
    }
//add comment
    public void retournerLivre(Livre livre) {
        if (livre.estEmprunte()) {
            livresDisponibles.add(livre);
            livre.retourner();
            System.out.println("Livre retourné : " + livre.getTitre());
        } else {
            System.out.println("Le livre n'est pas emprunté actuellement.");
        }
    }

    public void afficherLivresDisponibles() {
        System.out.println("Livres disponibles dans la bibliothèque :");
        for (Livre livre : livresDisponibles) {
            System.out.println(livre.getTitre());
        }
    }
}
