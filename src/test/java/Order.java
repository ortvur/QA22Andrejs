public class Order {
    //----------------------------ATTRIBUTES---------------------------------------------------------------------------


    private double totalPrice;
    private double weight;
    private double volume;
    private int itemCount;
    private double width;
    private double height;
    private double derpth;
    private String adress;
    private boolean deliveryRequested;

    //---------------------------GETTERS/SETTERS------------------------------------------------------------------------

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public int getItemCount() {
        return itemCount;
    }

    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getDerpth() {
        return derpth;
    }

    public void setDerpth(double derpth) {
        this.derpth = derpth;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public boolean isDeliveryRequested() {
        return deliveryRequested;
    }

    public void setDeliveryRequested(boolean deliveryRequested) {
        this.deliveryRequested = deliveryRequested;
    }
}
