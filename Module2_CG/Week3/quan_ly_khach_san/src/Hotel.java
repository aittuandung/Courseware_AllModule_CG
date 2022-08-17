public class Hotel {
    private String roomType;
    private double price;
    private String roomID;

    public Hotel(String fullName, String date, long idNumber) {
    }

    public Hotel(String roomType, double price, String roomID) {
        this.roomType = roomType;
        this.price = price;
        this.roomID = roomID;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getRoomID() {
        return roomID;
    }

    public void setRoomID(String roomID) {
        this.roomID = roomID;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "roomType='" + roomType + '\'' +
                ", price=" + price +
                ", roomID='" + roomID + '\'' +
                '}';
    }
}
