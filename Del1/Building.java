import java.util.ArrayList;

public class Building {
    private String name;
    private ArrayList<Room> rooms = new ArrayList<>();

    public Building(String name) {
        this.name = name;
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public int getTotalLampCount() {
        int total = 0;
        for (Room r : rooms) {
            total += r.getLampCount();
        }
        return total;
    }

    public int getTotalWattage() {
        int total = 0;
        for (Room r : rooms) {
            total += r.getTotalWattage();
        }
        return total;
    }

    public void printBuilding() {
        System.out.println("---- " + this.name + " ----");
        for (Room r : rooms) {
            r.printRoom();
        }
        System.out.println();
    }
}
