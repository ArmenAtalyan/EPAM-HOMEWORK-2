package model;
import java.util.Objects;

public class Coffee implements Comparable<Coffee> {

    private String type;
    private int price;

    public Coffee(String type, int price) {
        this.type = type;
        this.price = price;
    }

    @Override
    public int compareTo(Coffee c) {
        return this.price - c.price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coffee coffee = (Coffee) o;
        return price == coffee.price &&
                type.equals(coffee.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, price);
    }

    @Override
    public String toString() {
        return "Coffee - type = " + type + " price = " + price;
    }
}
