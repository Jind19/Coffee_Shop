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

        Beverage drinkCoffee = new Coffee(1.5);
        Beverage drinkTea = new Tea(1.99);

        //Coffee drinkBeverage = new Beverage("Coffee", 2.8); //Compile time error!

        Beverage[] menu = {beverage, coffee, tea};
        for (Beverage drink : menu){
            System.out.println("Now preparing: " + drink.getName());
            drink.prepare(); //Same method, different behavior!
            System.out.println("Price: $" + drink.getPrice() + "\n");
        }
    }
}
