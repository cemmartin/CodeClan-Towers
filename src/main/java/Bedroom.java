import java.util.ArrayList;

public class Bedroom extends Room{

    private String roomNumber;

    private RoomType roomType;

    public Bedroom(String roomNumber, RoomType roomType) {
        super(roomType.getCapacity()); //
        this.roomNumber = roomNumber;
        this.roomType = roomType;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }
}
