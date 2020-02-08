package model;
import java.util.Objects;

public class Glasses implements Comparable<Glasses> {

    private String type;
    private int price;

    public Glasses(String type, int price) {
        this.type = type;
        this.price = price;
    }

    @Override
    public int compareTo(Glasses g) {
        return this.price - g.price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Glasses glasses = (Glasses) o;
        return price == glasses.price &&
                Objects.equals(type, glasses.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, price);
    }

    @Override
    public String toString() {
        return "Glass - type= " + type + " price= " + price;
    }
}
