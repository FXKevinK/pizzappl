package pizza;

public class Onions extends Pizzatoppings {

	private Pizza pizza;
	
	public Onions(Pizza pizza) {
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
		return pizza.getDescription() + ", with onions (3p)";
	}

}
