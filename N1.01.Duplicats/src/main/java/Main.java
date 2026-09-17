import java.util.*;

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
            System.out.println(m.toString());
        }
        System.out.println("\n");

        monthList.add(7,new Month("August"));

        for (Month m : monthList) {
            System.out.println(m.toString());
        }
        System.out.println("\n");

        Set<Month> monthListHash = new HashSet<>(monthList);
        monthList.add(8,new Month("August"));

        for (Month m : monthListHash) {
            System.out.println(m.toString());
        }
        System.out.println("\n");

        Iterator<Month> iterator = monthListHash.iterator();

        while (iterator.hasNext()) {
            Month month = iterator.next();
            System.out.println(month.toString());
        }

    }
}
