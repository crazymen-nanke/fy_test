import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class AppleFilter {

    public List<Apple> filter(List<Apple> apples, Predicate<Apple> applePredicate){

        ArrayList<Apple> data = new ArrayList<>();
        for (Apple apple : apples) {
            if(applePredicate.test(apple)){
                data.add(apple);
            }
        }
        return data;
    }
}
