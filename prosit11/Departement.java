import java.util.Objects;

public class Departement implements Comparable<Departement>{
    private int id;
    private String nomDep ;
    private int NbrEmploye;

    public Departement(int id, String nomDep, int nbrEmploye) {
        this.id = id;
        this.nomDep = nomDep;
        NbrEmploye = nbrEmploye;
    }

    public Departement() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomDep() {
        return nomDep;
    }

    public void setNomDep(String nomDep) {
        this.nomDep = nomDep;
    }

    public int getNbrEmploye() {
        return NbrEmploye;
    }

    public void setNbrEmploye(int nbrEmploye) {
        NbrEmploye = nbrEmploye;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Departement that = (Departement) o;
        return id == that.id && Objects.equals(nomDep, that.nomDep);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nomDep);
    }

    @Override
    public String toString() {
        return "Departement{" +
                "id=" + id +
                ", nomDep='" + nomDep + '\'' +
                ", NbrEmploye=" + NbrEmploye +
                '}';
    }

    public int compareTo(Departement o) {

        return id-o.getId();
    }
}
