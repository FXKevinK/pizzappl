package pizza;

public class Pineapple extends Pizzatoppings {

	private Pizza pizza;
	
	public Pineapple(Pizza pizza) {
		// TODO Auto-generated constructor stub
		this.pizza = pizza;
	}
	
	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return pizza.getPrice() + 2;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return pizza.getDescription() + ", with pineapple (2p)";
	}

}
