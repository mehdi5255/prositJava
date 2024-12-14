import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.*;

public class AffectationHashMap {
    Map<Employe,Departement> employeDep = new HashMap<>();

    void ajouterEmployeDepartement(Employe e, Departement d){
        employeDep.put(e,d);
    }
    void afficherEmployesEtDepartements(){
        for(Map.Entry<Employe,Departement> e : employeDep.entrySet()){
            System.out.println(e.getKey().getNom() + " " + e.getKey().getPrenom() + " is in the " + e.getValue().getNomDep()+ " Departement");
        }
    }

    void supprimerEmploye(Employe e){
        employeDep.remove(e);
    }
    void supprimerEmployeEtDepartement(Employe e, Departement d){
        Departement dep = employeDep.get(e);
        if(d.equals(dep)){
            supprimerEmploye(e);
        }
    }
    void afficherEmployes(){
        /*for(Employe e : employeDep.keySet()){
            System.out.println(e);
        }
         */
        Set<Employe> keys = employeDep.keySet();
        Iterator<Employe> it = keys.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
    void afficherDepartements(){
        /*for(Departement d : employeDep.values()){
            System.out.println(d);
        }*/
        Collection<Departement> values = employeDep.values();
        Iterator<Departement> it = values.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
    boolean rechercherEmploye (Employe e){
        return employeDep.containsKey(e);
    }
    boolean rechercherDepartement (Departement d){
        return employeDep.containsValue(d);
    }
    TreeMap<Employe, Departement> trierMap(){
       /* Comparator<Employe> c = new Comparator<Employe>() {
            @Override
            public int compare(Employe o1, Employe o2) {
                return o1.getID()- o2.getID();
            }
        };
        TreeMap<Employe, Departement> tree = new TreeMap<>(c);
        tree.putAll(employeDep);
        return tree;*/
        return new TreeMap<>(employeDep);
    }
}
