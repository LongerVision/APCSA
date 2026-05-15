public class Apple {
    private String type;
    private int color;
    private double weight;
    private boolean isLocal;

    public Apple(String t, int c, double w, boolean b) {
        this.type = t;
        this.color = c;
        this.weight = w;
        this.isLocal = b;
    }

    // accessors
    public String getType() {
        return this.type;
    }

    public int getColor() {
        return this.color;
    }

    public double geWeight() {
        return this.weight;
    }

    public boolean getIsLocal() {
        return this.isLocal;
    }
}
