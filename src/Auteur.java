import java.util.ArrayList;
import java.util.List;

public class Auteur {
    private String nom;
    private List<Livre> livresEcrits;

    public Auteur(String nom) {
        this.nom = nom;
        this.livresEcrits = new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Livre> getLivresEcrits() {
        return livresEcrits;
    }

    public void ajouterLivre(Livre livre) {
        livresEcrits.add(livre);
    }

    @Override
    public String toString() {
        return "Auteur{" +
                "nom='" + nom + '\'' +
                ", livresEcrits=" + livresEcrits +
                '}';
    }
}
