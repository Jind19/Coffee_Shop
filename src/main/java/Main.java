import com.example.coffee_system.Beverage;
import com.example.coffee_system.Coffee;
import com.example.coffee_system.Tea;

public class Main {

    public static void main(String[] args) {
        System.out.println( "Welcome to your Coffee shop!");
        Beverage beverage = new Beverage("Orange", 3.5);
        Coffee coffee = new Coffee(2.5);
        Tea tea = new Tea(1.99);
        beverage.prepare();
        coffee.prepare();
        tea.prepare();

        Beverage[] menu = {beverage, coffee, tea};
    }
}
