package pizza;

public class Peppers extends Pizzatoppings {

	private Pizza pizza;
	
	public Peppers(Pizza pizza) {
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
		return pizza.getDescription() + ", with peppers (2p)";
	}

}
