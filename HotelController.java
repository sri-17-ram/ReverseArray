class HotelController {
    Room[] rooms;
    int count;
    HotelController(int size) {
        rooms = new Room[size];
        count = 0;
    }
    void addRoom(int roomNumber, String type) {
        rooms[count++] = new Room(roomNumber, type);
    }
    Room[] getRooms() {
        return rooms;
    }
    int getCount() {
        return count;
    }
    Room findRoom(int roomNumber) {
        for (int i = 0; i < count; i++) {
            if (rooms[i].roomNumber == roomNumber) {
                return rooms[i];
            }
        }
        return null;
    }
    String bookRoom(int roomNumber) {
        Room r = findRoom(roomNumber);
        if (r == null) return "Room Not Found";

        if (!r.booked) {
            r.booked = true;
            return "Room Booked Successfully";
        }
        return "Room Already Booked";
    }
    String checkoutRoom(int roomNumber) {
        Room r = findRoom(roomNumber);
        if (r == null) return "Room Not Found";
        if (r.booked) {
            r.booked = false;
            return "Room Checked Out Successfully";
        }
        return "Room was not booked";
    }
}
