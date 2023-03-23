public class Car extends Vehicle {
    private boolean electric;
    private boolean discountApplied;

    public Car(String licensePlate, double tollFee, int passengers, boolean electric) {
        super(licensePlate, tollFee, passengers);
        this.electric = electric;
        discountApplied = false;   // default value
    }

    public void printCar() {
        System.out.println("License: " + getLicensePlate());
        System.out.println("Toll Fee: " + getTollFee());
        System.out.println("Number of Passengers: " + getPassengers());
        if (electric == true) {
            System.out.println("Is Electric");
        }
        else {
            System.out.println("Not Electric");
        }
        if (discountApplied == true) {
            System.out.println("Discount is Applied");
        }
        else {
            System.out.println("No Discount");
        }
    }
}