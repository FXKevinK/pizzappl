package pizza;

public class main {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pizza pizza = new Pizzadough();
		
		pizza = new Cheese(pizza);
		pizza = new Tomatoes(pizza);
		pizza = new Pineapple(pizza);
		pizza = new Peppers(pizza);
		pizza = new Mushrooms(pizza);
		pizza = new Onions(pizza);
		pizza = new Pepperoni(pizza);
		pizza = new Ham(pizza);
		pizza = new Bacon(pizza);
		pizza = new Tuna(pizza);
		pizza = new Olives(pizza);
		pizza = new Chicken(pizza);
		
		System.out.println("Order: " + pizza.getDescription());
		System.out.println("Pizza Price: " + pizza.getPrice() + "p");
	}

}
