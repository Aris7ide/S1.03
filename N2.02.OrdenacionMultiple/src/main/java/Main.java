import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Main {
    static void main(String[] args) {

        HashSet<Restaurant> listRest = new HashSet<>();

        listRest.add(new Restaurant("Sorbillo", 1));
        listRest.add(new Restaurant("Mama", 9));
        listRest.add(new Restaurant("Rosita", 8));
        listRest.add(new Restaurant("Rosita", 2));
        listRest.add(new Restaurant("Nanni",5));
        listRest.add(new Restaurant("Tua madre", 6));

        List<Restaurant> listRestOrdered = new ArrayList<>(listRest);

        Collections.sort(listRestOrdered);

        for (Restaurant r : listRestOrdered) {
            System.out.println(r.toString());
        }


    }
}
