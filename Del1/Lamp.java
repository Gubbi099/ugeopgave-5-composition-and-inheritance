public class Lamp {
    private int watt;
    private boolean isOn;

    public Lamp(int watt) {
        this.watt = watt;
        this.isOn = false;
    }

    public void turnOn() {
        this.isOn = true;
    }

    public void turnOff() {
        this.isOn = false;
    }

    public void toggleState() {
        this.isOn = !this.isOn;
    }

    public int getWatt() {
        return this.watt;
    }

    @Override
    public String toString() {
        return "[LAMP] " + "(Watt: " + this.watt + ") " + "(Is On: " + this.isOn + ")";
    }
}
