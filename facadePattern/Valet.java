package facadePattern;

class Valet implements HotelService {
    private String plateNumber;

    public Valet(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    @Override
    public void doService() {
        pickUpVehicle(plateNumber);
    }

    public void pickUpVehicle(String plateNumber) {
        System.out.println("Our Valet is picking up your vehicle with plate number " + plateNumber + "!");
    }
}