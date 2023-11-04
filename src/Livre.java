public class Livre {
    String nom ;
    int id ;
    String description;
    String titre ;

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Livre() {
    }

    public Livre(String nom, int id, String description) {
        this.nom = nom;
        this.id = id;
        this.description = description;
    }

    @Override
    public String toString() {
        return "livre{" +
                "nom='" + nom + '\'' +
                ", id=" + id +
                ", description='" + description + '\'' +
                '}';
    }

    public boolean estEmprunte() {
        return  true ;
    }

    public void retourner() {
    }

    public void emprunter() {
    }
}
