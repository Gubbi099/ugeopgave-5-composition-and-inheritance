import java.util.ArrayList;

public class Room {
    private String name;
    private ArrayList<Lamp> lamps = new ArrayList<>();
    private ArrayList<Window> windows = new ArrayList<>();

    public Room(String name) {
        this.name = name;
    }

    public void addLamp(Lamp lamp) {
        lamps.add(lamp);
    }

    public void addWindow(Window window) {
        windows.add(window);
    }

    public int getLampCount() {
        return this.lamps.size();
    }

    public int getWindowCount() {
        return this.windows.size();
    }

    public int getTotalWattage() {
        int total = 0;
        for (Lamp l : lamps) {
            total += l.getWatt();
        }
        return total;
    }

    public int getTotalWindowArea() {
        int total = 0;
        for (Window w : windows) {
            total += w.getArea();
        }
        return total;
    }

    public void printRoom() {
        System.out.println("- " + this.name + " (" + this.getLampCount() + " lamper, " + this.getWindowCount() + " vinduer)");
        for (Window w : windows) {
            System.out.println(w);
        }

        for (Lamp l : lamps) {
            System.out.println(l);
        }
        System.out.println();
    }
}
