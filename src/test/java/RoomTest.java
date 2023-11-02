import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    Room room;
    Bedroom bedroom;
    Guest guest;
    Hotel hotel;
    ConferenceRoom conferenceRoom;



    @Before
    public void before(){
        bedroom = new Bedroom("11", RoomType.DOUBLE);
        guest = new Guest("Carl");
        conferenceRoom = new ConferenceRoom(100, "Mike Ritchie Room");
        hotel = new Hotel();
        hotel.addBedroom(bedroom);
        hotel.addConferenceRoom(conferenceRoom);
    }

    @Test
    public void getCapacity(){
        assertEquals(2, bedroom.getCapacity());
    }

    @Test
    public void checkIn(){
        bedroom.checkIn(guest);
        assertEquals(true , bedroom.getGuests().contains(guest));
    }

    @Test
    public void notCheckedIn(){
        assertEquals(false, bedroom.getGuests().contains(guest));
    }

    @Test
    public void addBedroom(){
        assertEquals(true, hotel.getBedrooms().contains(bedroom));
    }

//    @Test //should fail
//        public void addConferenceRoom(){
//        assertEquals(false, hotel.getConferenceRooms().contains(conferenceRoom));
//    }



}
