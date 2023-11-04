public class livre {
    String nom ;
    int id ;
    String description;
    public livre() {
    }

    public livre(String nom, int id, String description) {
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
}
