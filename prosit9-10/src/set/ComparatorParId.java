package set;

import java.util.Comparator;

public class ComparatorParId implements Comparator<Departement> {
    @Override
    public int compare(Departement o1, Departement o2) {
        return o1.getId() - o2.getId();
    }
}
