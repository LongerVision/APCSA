public class CupcakeMachine {
    private int nbOfCupcakesAvailable;
    private double priceOfEachCupcake;
    private int orderNumber;

    public CupcakeMachine(int totalNumber, double unitPrice) {
        nbOfCupcakesAvailable = totalNumber;
        priceOfEachCupcake = unitPrice;
        orderNumber = 1;
    }

    public String takeOrder(int units) {
        if (nbOfCupcakesAvailable >= units) {
            String res = "Order number " + orderNumber + ", cost $";
            res += priceOfEachCupcake * units;
            orderNumber++;
            nbOfCupcakesAvailable -= units;
            return res;
        } else
            return "Order cannot be filled";
    }

    public static void main(String[] args) {
        String info;
        CupcakeMachine c1 = new CupcakeMachine(10, 1.75);
        info = c1.takeOrder(2);
        System.out.println(info);
        info = c1.takeOrder(3);
        System.out.println(info);
        info = c1.takeOrder(10);
        System.out.println(info);
        info = c1.takeOrder(1);
        System.out.println(info);

        CupcakeMachine c2 = new CupcakeMachine(10, 1.5);
        info = c2.takeOrder(10);
        System.out.println(info);
    }
}
