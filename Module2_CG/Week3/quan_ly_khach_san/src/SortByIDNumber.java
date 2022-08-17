import java.util.Comparator;

public class SortByIDNumber implements Comparator<Human> {
    @Override
    public int compare(Human o1, Human o2) {
        if (o1.getIdNumber() > o2.getIdNumber()) {
            return 1;
        } else {
            return -1;
        }
    }
}
