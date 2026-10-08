public class Window {
    private int widthCm;
    private int heightCm;

    public Window(int widthCm, int heightCm) {
        this.widthCm = widthCm;
        this.heightCm = heightCm;
    }

    public int getArea() {
        return this.widthCm * this.heightCm;
    }

    @Override
    public String toString() {
        return "[WINDOW] (Width: " + this.widthCm + ") (Height: " + this.heightCm + ") (Area: " + this.getArea() + ")";
    }
}
