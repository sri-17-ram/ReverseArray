public class Main {
    public static void main(String[] args) {
        HotelController controller = new HotelController(10);
        HotelView view = new HotelView();
        controller.addRoom(101, "Single");
        controller.addRoom(102, "Double");
        controller.addRoom(201, "Suite");
        while (true) {
            view.showMenu();
            int choice = view.getChoice();
            switch (choice) {
                case 1:
                    view.displayRooms(controller.getRooms(), controller.getCount());
                    break;
                case 2:
                    int bookRoom = view.getRoomNumber("Enter room number to book: ");
                    view.showMessage(controller.bookRoom(bookRoom));
                    break;
                case 3:
                    int checkoutRoom = view.getRoomNumber("Enter room number to checkout: ");
                    view.showMessage(controller.checkoutRoom(checkoutRoom));
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}
