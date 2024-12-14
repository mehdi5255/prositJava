import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
/*
        DepartementHashSet genDep = new DepartementHashSet();

        Departement dep1 = new Departement(1,"1",0);
        Departement dep2 = new Departement(2,"1",0);
        Departement dep3 = new Departement(3,"1",0);
        Departement dep4 = new Departement(4,"1",0);
        Departement dep5 = new Departement(5,"1",0);
        Departement dep6 = new Departement(6,"1",0);


        genDep.ajouterDepartement(dep2);
        genDep.ajouterDepartement(dep6);
        genDep.ajouterDepartement(dep3);
        genDep.ajouterDepartement(dep5);
        genDep.ajouterDepartement(dep1);
        genDep.ajouterDepartement(dep4);

        genDep.displayDepartement();

        TreeSet<Departement> sortedlist = genDep.trierDepartementById();
        System.out.println(sortedlist)
 */
        AffectationHashMap depHashset = new AffectationHashMap();
        Departement dep1 = new Departement(41,"1",0);
        Departement dep2 = new Departement(62,"2",0);

        Employe em1 = new Employe(2,"em","1","exmp",5);
        Employe em2 = new Employe(42,"emye","2","exmp",5);
        Employe em3 = new Employe(62,"nt","3","exmp",5);
        Employe em4 = new Employe(58,"exm","4","exmp",5);

        depHashset.ajouterEmployeDepartement(em1,dep1);
        depHashset.ajouterEmployeDepartement(em2,dep2);
        depHashset.ajouterEmployeDepartement(em3,dep2);
        depHashset.ajouterEmployeDepartement(em4,dep1);

        depHashset.afficherEmployesEtDepartements();
        System.out.println("-------------------------");
        depHashset.afficherDepartements();
        System.out.println("-------------------------");
        depHashset.afficherEmployes();
        System.out.println("-------------------------");
        System.out.println(depHashset.rechercherEmploye(em1));
        System.out.println(depHashset.rechercherDepartement(dep1));
        System.out.println("-------------------------");
        System.out.println(depHashset.trierMap());
        System.out.println("-------------------------");
        System.out.println("-------------------------");
        depHashset.supprimerEmploye(em1);
        depHashset.afficherEmployesEtDepartements();
        System.out.println(depHashset.rechercherEmploye(em1));
        System.out.println("-------------------------");
        depHashset.supprimerEmployeEtDepartement(em2,dep1);
        depHashset.afficherEmployesEtDepartements();
        System.out.println("-------------------------");
        depHashset.supprimerEmployeEtDepartement(em2,dep2);
        depHashset.afficherEmployesEtDepartements();
        System.out.println("-------------------------");
        depHashset.supprimerEmploye(em4);
        depHashset.afficherEmployesEtDepartements();
        System.out.println(depHashset.rechercherDepartement(dep1));
    }
}