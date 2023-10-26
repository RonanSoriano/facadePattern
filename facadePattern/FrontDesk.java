package facadePattern;

class FrontDesk {
    public void assignService(HotelService service) {
        service.doService();
    }
}