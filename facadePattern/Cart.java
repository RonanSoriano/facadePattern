package facadePattern;

class Cart implements HotelService {
    private Integer numberOfCarts;

    public Cart(Integer numberOfCarts) {
        this.numberOfCarts = numberOfCarts;
    }

    @Override
    public void doService() {
        requestCart(numberOfCarts);
    }

    public void requestCart(Integer numberOfCarts) {
        System.out.println(numberOfCarts + " requested luggage carts confirmed!");
    }
}