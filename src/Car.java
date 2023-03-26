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
        System.out.println("Electric? " + isElectric());
        System.out.println("Discount Applied? " + discountApplied);
    }

    public boolean isElectric() {
        return electric;
    }

    public boolean isDiscountApplied() {
        return discountApplied;
    }

    public boolean dropOffPassengers(int numOut) {
        int currentPassengers = getPassengers();
        if (numOut < currentPassengers) {
            setPassengers(currentPassengers - numOut);
            return true;
        }
        else {
            return false;
        }
    }

    public void applyDiscount() {
        if (!discountApplied) {
            if (isElectric()) {
                double discountedFee = getTollFee() * 0.5;
                setTollFee(discountedFee);
                discountApplied = true;
            }
        }
    }

    public void setDiscountApplied(boolean discountApplied) {
        this.discountApplied = discountApplied;
    }
}