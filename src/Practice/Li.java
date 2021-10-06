package Practice;

import java.util.ArrayList;
import java.util.List;

public class Li {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList();
        list.add(10);
        list.add(30);
        list.add(50);
        list.add(100);

        int removeVal = list.remove(3);
        System.out.println("removeVal : " + removeVal);
        for(int i=0; i< list.size(); i++) {
            System.out.printf("(%d) - %d\n", i, list.get(i));
        }

    }
}
