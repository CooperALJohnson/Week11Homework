import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.*;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {

    public static void main (String[]args) {
       List<Car> cars = getCar();
       cars.stream().map(Objects::toString).collect(Collectors.toList()).sort(Comparator.naturalOrder());
        System.out.println(cars);
    }

    private static List<Car> getCar() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Carola"));
        cars.add(new Car("Civic"));
        cars.add(new Car("WRX"));
        cars.add(new Car("Volt"));
        return cars;
    }
}
