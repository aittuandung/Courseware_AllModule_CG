import java.util.Comparator;

public class SortByDate implements Comparator<Human> {
    @Override
    public int compare(Human o1, Human o2){
        if (o1.getDate().compareTo(o2.getDate()) > 0) {
            return 1;
        } else {
            return -1;
        }
    }
}
