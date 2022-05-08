import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.*;
import java.util.Arrays;
public class SortLambda {

    public static void main(String[]args){
        List <Car> cars = getCar();
       // Comparator <Car> Lambda = (Cars, (c1, c2)) -> c1.compareTo(c2);
        cars.sort(Comparator.comparing(Car::getCar));
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



    //cars.sort(Comparator.comparing(c -> c.getCar()));

    //public static List<Car> cars = List.of(new Car("Carola"), new Car("Civic"), new Car("WRX"), new Car("Volt"));



}
