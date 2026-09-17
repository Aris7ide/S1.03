import java.util.Objects;

public class Restaurant implements Comparable<Restaurant> {

    String name;
    int points;

    public Restaurant(String name, int points) {
        this.name = name;
        this.points = points;
    }

    @Override
    public int compareTo(Restaurant other) {
        int nameComparison = other.name.compareToIgnoreCase(this.name);

        if (nameComparison != 0) {
            return nameComparison;
        }

        return Integer.compare(this.points,other.points);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Restaurant other = (Restaurant) obj;

        return this.points == other.points && Objects.equals(this.name,other.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,points);
    }

    @Override
    public String toString() {
        return "El hotel " + name + " tiene " + points + " puntos.";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}
