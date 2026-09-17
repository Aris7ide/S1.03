import java.util.HashSet;
import java.util.Set;

public class Main {
    static void main(String[] args) {

        HashSet<Restaurant> listRest = new HashSet<>();

        listRest.add(new Restaurant("Sorbillo", 1));
        listRest.add(new Restaurant("Mama", 9));

        for (Restaurant r : listRest) {
            System.out.println(r.toString());
        }

        listRest.add(new Restaurant("Sorbillo", 1));
        listRest.add(new Restaurant("Sorbillo",5));
        listRest.add(new Restaurant("Sorbillo", 1));

        for (Restaurant r : listRest) {
            System.out.println(r.toString());
        }

    }
}
