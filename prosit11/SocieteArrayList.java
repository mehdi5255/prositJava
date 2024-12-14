import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SocieteArrayList implements IGestion<Employe> {
    List<Employe> employes = new ArrayList<>();
    @Override
    public void ajouterEmploye(Employe employe) {
        employes.add(employe);
    }

    public boolean rechercherEmploye(String nom) {
        for (Employe e: employes) {
            if(e.getNom().equals(nom)) return true;
        }
        return false;
    }

    public boolean rechercherEmploye(Employe employe) {
        return employes.contains(employe);
    }

    public void supprimerEmploye(Employe employe) {
        employes.remove(employe);
    }

    public void displayEmploye() {
        System.out.println(employes);
    }

    public void trierEmployeParId() {
        Comparator<Employe> comp = new Comparator<Employe>() {
            @Override
            public int compare(Employe o1, Employe o2) {
                return o1.getID()-o2.getID();
            }
        };
        Collections.sort(employes,comp);
    }

    public void trierEmployeParNomDépartementEtGrade() {
        /*Comparator<Employe> comp = new Comparator<Employe>() {
            @Override
            public int compare(Employe o1, Employe o2) {
                if(!o1.getNomDep().equals(o2.getNomDep())){
                    return o1.getNomDep().compareTo(o2.getNomDep());
                }
                else{
                    return o1.getGrade()-o2.getGrade();
                }
            }
        };
        Collections.sort(employes,comp);
        */
        Comparator<Employe> compDep = new Comparator<Employe>() {
            @Override
            public int compare(Employe o1, Employe o2) {
                if(!o1.getNomDep().equals(o2.getNomDep())){
                    return o1.getNomDep().compareTo(o2.getNomDep());
                }
                return 0;
            }
        };
        Comparator<Employe> compGrade = new Comparator<Employe>() {
            @Override
            public int compare(Employe o1, Employe o2) {
                return o1.getGrade()-o2.getGrade();
            }
        };
        Collections.sort(employes,compGrade);
        Collections.sort(employes,compDep);
    }
}
