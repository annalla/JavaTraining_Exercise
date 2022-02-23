public class Display {
    private int size;
    private int colors;

    public Display() {
        this.size = 0;
        this.colors = 1;
    }

    public Display(int size, int colors) {
        this.size = size;
        this.colors = colors;
    }

    @Override
    public String toString() {
        return String.format("size:%d\tnumber of colors:%d",size,colors);
    }
}
