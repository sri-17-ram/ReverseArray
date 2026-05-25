import java.util.Scanner;
class HotelView {
    Scanner sc = new Scanner(System.in);
    void showMenu() {
        System.out.println("\n--- Hotel Management Menu ---");
        System.out.println("1. Display Rooms");
        System.out.println("2. Book Room");
        System.out.println("3. Checkout Room");
        System.out.println("4. Exit");
    }
    int getChoice() {
        System.out.print("Enter choice: ");
        return sc.nextInt();
    }
    int getRoomNumber(String msg) {
        System.out.print(msg);
        return sc.nextInt();
    }
    void displayRooms(Room[] rooms, int count) {
        System.out.println("\nRooms in Hotel:");
        for (int i = 0; i < count; i++) {
            System.out.println("Room " + rooms[i].roomNumber + " - " + rooms[i].type +
                    " - " + (rooms[i].booked ? "Booked" : "Available"));
        }
    }
    void showMessage(String msg) {
        System.out.println(msg);
    }
}
