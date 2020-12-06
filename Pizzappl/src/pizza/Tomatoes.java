package pizza;

public class Tomatoes extends Pizzatoppings {

	private Pizza pizza;
	
	public Tomatoes(Pizza pizza) {
		// TODO Auto-generated constructor stub
		this.pizza = pizza;
	}
	
	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return pizza.getPrice() + 1;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return pizza.getDescription() + ", with tomatoes (1p)";
	}

}
