import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Month> monthList = new ArrayList<>();

        monthList.add(new Month("January"));
        monthList.add(new Month("Febrauary"));
        monthList.add(new Month("March"));
        monthList.add(new Month("April"));
        monthList.add(new Month("May"));
        monthList.add(new Month("June"));
        monthList.add(new Month("July"));
        monthList.add(new Month("September"));
        monthList.add(new Month("October"));
        monthList.add(new Month("November"));
        monthList.add(new Month("December"));

        for (Month m : monthList) {
            System.out.println(m);
        }
    }
}
