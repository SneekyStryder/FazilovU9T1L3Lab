public class Taxi extends Car {
    private double fareCollected;

    public Taxi(String licensePlate, double tollFee, int passengers, boolean isElectric, double fareCollected) {
        super(licensePlate, tollFee, passengers, isElectric);
        this.fareCollected = fareCollected;
    }

    public void printTaxi() {
        System.out.println("License: " + getLicensePlate());
        System.out.println("Toll Fee: " + getTollFee());
        System.out.println("Number of Passengers: " + getPassengers());
        System.out.println("Electric? " + isElectric());
        System.out.println("Discount Applied? " + isDiscountApplied());
        System.out.println("Total Fare Collected: " + fareCollected);
    }

    public void pickupRiders(int numRiders, double farePerRider) {
        int currentPassengers = getPassengers();
        setPassengers(currentPassengers + numRiders);
        double fareCost = numRiders * farePerRider;
        fareCollected += fareCost;

        if (getPassengers() >= 4 && !isDiscountApplied()) {
            setTollFee(getTollFee() * 0.5);
            setDiscountApplied(true);
        }
    }

    public double getFareCollected() {
        return fareCollected;
    }
}
