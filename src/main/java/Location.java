import java.util.Objects;

public class Location {
    String placeName;

    public Location(String placeName) {
        this.placeName = placeName;
    }

    public String getPlaceName() {
        return placeName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Location)) return false;
        Location location = (Location) o;
        return Objects.equals(getPlaceName(), location.getPlaceName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPlaceName());
    }
}
