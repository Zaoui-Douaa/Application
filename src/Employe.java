import java.util.List;

public class Employe {
    private String nom;
    private int identifiant;

    public Employe(String nom, int identifiant) {
        this.nom = nom;
        this.identifiant = identifiant;
    }

    public String getNom() {
        return nom;
    }

    public int getIdentifiant() {
        return identifiant;
    }

    public void ajouterLivresBibliotheque(List<Livre> livres, Bibliotheque bibliotheque) {
        for (Livre livre : livres) {
            bibliotheque.ajouterLivre(livre);
        }
    }
}