abstract class Vehicle {
    private String make;
    private String model;
    private int year;

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }
}

class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String make, String model, int year, int numberOfDoors) {
        super(make, model, year);
        this.numberOfDoors = numberOfDoors;
    }

    public void displayDetails() {
        System.out.printf("""
                Car Details:
                Make: %s
                Model: %s
                Year: %d
                Number of Doors: %d
                """, super.getMake(), super.getModel(), super.getYear(), this.numberOfDoors);
    }
}

public class Task13 {
    public static void main(String[] args) {
        Vehicle car1 = new Car("Toyota", "Camry", 2022, 4);
        ((Car)car1).displayDetails();
    }
}
