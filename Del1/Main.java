public class Main {

    public static void main() {
        Building b = new Building("Lejlighed");

        Room r = new Room("Soveværelse");
        Room r2 = new Room("Stue");
        Room r3 = new Room("Badeværelse");

        b.addRoom(r);
        b.addRoom(r2);
        b.addRoom(r3);

        r.addLamp(new Lamp(60));
        r.addLamp(new Lamp(60));
        r.addLamp(new Lamp(100));
        r.addWindow(new Window(100, 100));

        r2.addLamp(new Lamp(60));
        r2.addLamp(new Lamp(60));
        r2.addWindow(new Window(100, 160));

        r3.addLamp(new Lamp(80));
        r3.addLamp(new Lamp(60));
        r3.addLamp(new Lamp(100));
        r3.addWindow(new Window(120, 100));

        b.printBuilding();
    }
}
