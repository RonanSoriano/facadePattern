package facadePattern;

class HouseKeeping implements HotelService {
    private String roomNumber;

    public HouseKeeping(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    @Override
    public void doService() {
        cleanRoom(roomNumber);
    }

    public void cleanRoom(String roomNumber) {
        System.out.println("Our Housekeeper will clean your room number " + roomNumber + "!");
    }
}