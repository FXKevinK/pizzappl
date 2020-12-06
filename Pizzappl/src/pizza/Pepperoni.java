package pizza;

public class Pepperoni extends Pizzatoppings {

	private Pizza pizza;
	
	public Pepperoni(Pizza pizza) {
		// TODO Auto-generated constructor stub
		this.pizza = pizza;
	}
	
	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return pizza.getPrice() + 4;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return pizza.getDescription() + ", with pepperoni (4p)";
	}

}
