
import java.util.ArrayList;
import java.util.List;
public class Emprunteur {
    private String nom;
    private int identifiantUnique;
    private List<Livre> livresEmpruntes;

    public Emprunteur(String nom, int identifiantUnique) {
        this.nom = nom;
        this.identifiantUnique = identifiantUnique;
        this.livresEmpruntes = new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }

    public int getIdentifiantUnique() {
        return identifiantUnique;
    }

    public List<Livre> getLivresEmpruntes() {
        return livresEmpruntes;
    }

    public void emprunterLivre(Livre livre) {
        livresEmpruntes.add(livre);
    }

    public void rendreLivre(Livre livre) {
        livresEmpruntes.remove(livre);
    }

    @Override
    public String toString() {
        return "Personne [nom=" + nom + ", identifiantUnique=" + identifiantUnique + ", livresEmpruntes=" + livresEmpruntes + "]";
    }
}
