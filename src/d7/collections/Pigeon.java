package d7.collections;

import java.util.Objects;

public class Pigeon {
    private int age;

    public Pigeon(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pigeon pigeon = (Pigeon) o;
        return age == pigeon.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age);
    }
}
