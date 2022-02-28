package gsm;

public class Display {
    private float size;
    private int colors;

    public Display() {
        this.size = 0;
        this.colors = 1;
    }

    public Display(float size, int colors) {
        this.size = size;
        this.colors = colors;
    }

    @Override
    public String toString() {
        return "Display{" +
                "size=" + size +
                ", colors=" + colors +
                '}';
    }
}

