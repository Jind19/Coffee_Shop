import com.example.coffee_system.Beverage;

public class Main {

    public static void main(String[] args) {
        System.out.println( "Welcome to your Coffee shop!");
        Beverage beverage1 = Beverage.createBeverage("latte", 0);
        System.out.println(beverage1.getName());
        System.out.println(beverage1.getPrice());

    }
}
