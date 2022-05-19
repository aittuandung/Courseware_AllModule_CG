package resizeable;

public class Shape {
    private String color = "green";
    private boolean filler = true;

    private int x = 1;

    public Shape() {
    }

    public Shape(String color, boolean filler) {
        this.color = color;
        this.filler = filler;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFiller(boolean filler) {
        this.filler = filler;
    }

    public String getColor() {
        return color;
    }

    public boolean isFiller() {
        return filler;
    }

    @Override
    public String toString() {
        if (filler) {
            return "A Shape with color of " + color + "and filled";
        } else {
            return "A Shape with color of " + color + "and not filled";
        }
    }
    public void resize(double percent){
        x *= percent;
    }
}
