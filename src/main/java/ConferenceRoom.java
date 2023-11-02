import java.util.ArrayList;

public class ConferenceRoom extends Room{

    private String roomName;

    public ConferenceRoom(int capacity, String roomName) {
        super(capacity);
        this.roomName = roomName;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }
}
