public class Bottle {
    private double capacity;
    private double remaining;

    public Bottle(double c) {
        this.capacity = c;
        this.remaining = c;
    }

    public double updateAmount(double c) {
        if ((remaining - c) / capacity < 0.25)
            remaining = capacity;
        else
            remaining -= c;
        return remaining;
    }

    public void printRemaining() {
        System.out.println(this.remaining);
    }

    public static void main(String[] args) {
        double amt;
        Bottle water = new Bottle(1000.0);

        amt = water.updateAmount(400.0);
        water.printRemaining();

        amt = water.updateAmount(100.0);
        water.printRemaining();

        amt = water.updateAmount(300.0);
        water.printRemaining();

        Bottle shampoo = new Bottle(40.0);

        amt = shampoo.updateAmount(30.0);
        shampoo.printRemaining();

        amt = shampoo.updateAmount(1.0);
        shampoo.printRemaining();
    }
}
