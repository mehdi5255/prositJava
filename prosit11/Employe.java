import java.util.Objects;

public class Employe implements Comparable<Employe>{
    int ID;
    String nom;
    String prenom;
    String nomDep;
    int grade;

    public Employe(){}
    public Employe(int ID, String nom, String prenom, String nomDep, int grade){
        this.ID = ID;
        this.nom = nom;
        this.prenom = prenom;
        this.nomDep = nomDep;
        this.grade = grade;
    }

    @Override
    public boolean equals(Object obj){
        if(obj==null) return false;
        if(obj instanceof Employe){
            Employe other = (Employe)obj;
            return (ID==other.getID()&&nom.equals(other.getNom()));
        }
        return false;
    }

    @Override
    public String toString(){
        return "ID = " + ID + " / nom et prenom = " + nom + " " + prenom + " / dep = "+nomDep+" / grade = "+grade;
    }
    //getters
    public int getID(){return ID;}
    public String getNom(){return nom;}
    public String getPrenom(){return prenom;}
    public String getNomDep(){return nomDep;}
    public int getGrade(){return grade;}
    //setters
    public void setID(int ID){this.ID = ID;}
    public void setNom(String nom){this.nom = nom;}
    public void setPrenom(String prenom){this.prenom = prenom;}
    public void setNomDep(String nomDep){this.nomDep = nomDep;}
    public void setGrade(int grade){this.grade = grade;}

    @Override
    public int compareTo(Employe o) {
        return ID-o.getID();
    }
}
