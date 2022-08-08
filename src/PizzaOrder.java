import java.util.ArrayList;
import java.util.List;

public class PizzaOrder {

    private List <Pizza> pizzaList = new ArrayList<>();

    public void addPizza (Pizza pizza) {
        pizzaList.add(pizza);
    }
    
    public int calcTotalPrice(){
        int totalPrice = 0;
        for (Pizza pizza : pizzaList) {
            totalPrice += pizza.calcPrice();
        }
        System.out.println(totalPrice);
        return totalPrice;
    }

}
