import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Map map = new HashMap<>();
        List myList = new ArrayList<>();
        myList.add("a");
        myList.add("a");
        myList.add("a");
        System.out.println(myList.size());
        List myList2 =new ArrayList(myList);
        System.out.println(myList2.size());
        System.out.println("-------------------------");
        BigDecimal b1 = new BigDecimal(5);
        BigDecimal b2 = new BigDecimal(100);
        System.out.println(b1.divide(b2, 2, BigDecimal.ROUND_DOWN));
    }
}
