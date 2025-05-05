package apcsa_2021;

public class CombinedTable {
    private SingleTable table1;
    private SingleTable table2;

    public CombinedTable(SingleTable t1, SingleTable t2) {
        this.table1 = t1;
        this.table2 = t2;
    }

    public boolean canSeat(int s) {
        if (this.table1.getNumSeats() + this.table2.getNumSeats() - 2 >= s)
            return true;

        return false;
    }

    public double getDesirability() {
        if (this.table1.getHeight() == this.table2.getHeight())
            return (this.table1.getViewQuality() + this.table2.getViewQuality()) / 2.0;

        return (this.table1.getViewQuality() + this.table2.getViewQuality()) / 2.0 - 10.0;
    }

    public static void main(String[] args) {
        SingleTable t1 = new SingleTable(4, 60.0, 74);
        SingleTable t2 = new SingleTable(8, 70.0, 74);
        SingleTable t3 = new SingleTable(12, 75.0, 76);

        CombinedTable c1 = new CombinedTable(t1, t2);
        System.out.println(c1.canSeat(9));
        System.out.println(c1.canSeat(11));
        System.out.println(c1.getDesirability());

        CombinedTable c2 = new CombinedTable(t2, t3);
        System.out.println(c2.canSeat(18));
        System.out.println(c2.getDesirability());
        t2.setViewQuality(80);
        System.out.println(c2.getDesirability());
    }
}
