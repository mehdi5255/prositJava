package set;

public class Departement implements Comparable<Departement> {

    private int id, nbrEmployes;
    private String nom;

    public Departement(int id, int nbrEmployes, String nom) {
        this.id = id;
        this.nbrEmployes = nbrEmployes;
        this.nom = nom;
    }

    public Departement() {
    }

    @Override
    public String toString() {
        return "Departement{" +
                "id=" + id +
                ", nbrEmployes=" + nbrEmployes +
                ", nom='" + nom + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNbrEmployes() {
        return nbrEmployes;
    }

    public void setNbrEmployes(int nbrEmployes) {
        this.nbrEmployes = nbrEmployes;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        if (o == this) return true;
        if (o instanceof Departement d)
            return d.id == id && d.nom.equals(nom);
        return false;
    }

    @Override
    public int hashCode() {
        int x = 34;
        x = 19 + id * x;
        x = 19 + nom.hashCode() * x;
        return x;
    }

    @Override
    public int compareTo(Departement o) {
        return id - o.id;
    }
}
