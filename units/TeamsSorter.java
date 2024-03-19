package units;

import java.util.Comparator;

public class TeamsSorter implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return Integer.compare(o2.initiative, o1.initiative);
    }
}
