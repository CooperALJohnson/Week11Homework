import java.util.ArrayList;
import java.util.List;

public class Car {
    private String carName;

    public Car(String car) {
        this.carName = car;
    }

    public String getCar() {
        return carName;
    }

    public void setCar(String car) {
        this.carName = car;
    }

    public String toString() {
        return carName + " Vehicle";
    }

    public static int compare(Car o1, Car o2){
        return o1.getCar().compareTo(o2.getCar());
    }

    //public static List<Car> cars = List.of(new Car("Carola"), new Car("Civic"), new Car("WRX"), new Car("Volt"));



}
