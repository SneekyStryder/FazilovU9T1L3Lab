public class Truck extends Vehicle {
    private int axles;
    private boolean hasTrailer;

    public Truck(String licensePlate, double tollFee, int passengers, int axles, boolean hasTrailer) {
        super(licensePlate, tollFee, passengers);
        this.axles = axles;
        this.hasTrailer = hasTrailer;
    }

    public void printTruck() {
        System.out.println("License Plate: " + getLicensePlate());
        System.out.println("Toll Fee: " + getTollFee());
        System.out.println("Passengers: " + getPassengers());
        System.out.println("Number of Axles: " + axles);
        System.out.println("Has Trailer: " + hasTrailer);
    }

    public boolean validateLicensePlate() {
        if (hasTrailer) {
            String licensePlate = getLicensePlate();
            String last2Chars = licensePlate.substring(licensePlate.length() - 2);
            boolean valid = (last2Chars.equals("MX") && axles > 4) || (last2Chars.equals("LX") && axles <= 4);
            return valid;
        }
        else {
            return true;
        }
    }
}