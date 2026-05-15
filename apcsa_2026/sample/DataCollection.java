import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class DataCollection {
    // int, double, boolean: 3/8 primitive data types
    // String (class)
    // Wrapper class
    // Customized class
    // ArrayList<MyClass>
    private ArrayList<Apple> aa;

    public DataCollection() {
        this.aa = new ArrayList<>();
    }

    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("data.dat");
        Scanner sc = new Scanner(f);

        DataCollection dc = new DataCollection();

        while (sc.hasNext()) {
            dc.aa.add(new Apple(sc.next(), sc.nextInt(), sc.nextDouble(),
                    sc.nextBoolean()));
            // String line = sc.nextLine();
            // String[] strs = line.split(" ");
            // dc.aa.add(new Apple(strs[0], Integer.parseInt(strs[1]),
            // Double.parseDouble(strs[2]),
            // Boolean.parseBoolean(strs[3])));
        }

        System.out.println(dc.aa.size());

    }
}
