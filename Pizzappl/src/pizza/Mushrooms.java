package pizza;

public class Mushrooms extends Pizzatoppings {

	private Pizza pizza;
	
	public Mushrooms(Pizza pizza) {
		// TODO Auto-generated constructor stub
		this.pizza = pizza;
	}
	
	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return pizza.getPrice() + 3;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return pizza.getDescription() + ", with mushrooms (3p)";
	}

}
