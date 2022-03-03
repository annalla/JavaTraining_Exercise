package gsm;

public class Display {
    private double size;
    private int colors;

    public Display() {
        this.size = 0;
        this.colors = 0;
    }

    public Display(double size, int colors) {
        this.size = size < 0 ? 0 : size;
        this.colors = colors < 0 ? 0 : colors;
    }

    @Override
    public String toString() {
        return "Display{" +
                "size=" + size +
                ", colors=" + colors +
                '}';
    }
}

