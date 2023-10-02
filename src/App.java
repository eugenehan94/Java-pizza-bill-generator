public class App {
    public static void main(String[] args) throws Exception {
        // Pizza basePizza = new Pizza(true);
        // basePizza.addExtraToppings();
        // basePizza.addExtraCheese();
        // basePizza.getBill();

        DeluxPizza dp = new DeluxPizza(true);
        dp.takeAway();
        dp.getBill();

    }
}
