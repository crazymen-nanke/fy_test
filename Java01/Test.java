import java.util.ArrayList;
import java.util.Random;

public class Test {
    public static void main(String[] args) {

        ArrayList<Apple> apples = new ArrayList<>();
        int weights[] = {152, 150, 120, 158, 156};
        Color colors[] = {Color.GREEN, Color.RED};
        for (int i = 0; i < 10; i++) {
            Apple apple = new Apple(colors[new Random().nextInt(2)], weights[new Random().nextInt(5)]);
            apples.add(apple);
        }
        AppleFilter appleFilter = new AppleFilter();
        System.out.println(appleFilter.filter(apples,(Apple apple) ->
             apple.getColor().equals(Color.RED)
        ));
    }
}
