package Basics.ch2;

import java.util.Objects;

public class pairs {
    private int value1, value2;
    public pairs(int value1, int value2) {
        this.value1 = value1;
        this.value2 = value2;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        pairs pairs = (pairs) o;
        return value1 == pairs.value1 && value2 == pairs.value2;
    }
    @Override
    public int hashCode() {
        return Objects.hash(value1, value2);
    }

    @Override
    public String toString() {
        return "pairs{" +
                "value1=" + value1 +
                ", value2=" + value2 +
                '}';
    }

}
