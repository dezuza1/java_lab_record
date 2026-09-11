class Vehicle {
    String regNo;
    double dailyRate;

    Vehicle(String regNo, double dailyRate) {
        this.regNo = regNo;
        this.dailyRate = dailyRate;
    }

    double computeRent(int days) {
        return dailyRate * days;
    }
}

class Car extends Vehicle {
    int numDoors;

    Car(String regNo, double dailyRate, int numDoors) {
        super(regNo, dailyRate);
        this.numDoors = numDoors;
    }

    @Override
    double computeRent(int days) {
        return super.computeRent(days) + 200;
    }
}

public class vehicle_rent {
    public static void main(String[] args) {
        Car c = new Car("KL012345", 2500, 4);

        System.out.println("Registration No: " + c.regNo);
        System.out.println("Daily Rate: " + c.dailyRate);
        System.out.println("Number of Doors: " + c.numDoors);
        System.out.println("Rent for 3 days: " + c.computeRent(3));
    }
}