package pizza;

public class Ham extends Pizzatoppings {

	private Pizza pizza;
	
	public Ham(Pizza pizza) {
		// TODO Auto-generated constructor stub
		this.pizza = pizza;
	}
	
	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return pizza.getPrice() + 5;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return pizza.getDescription() + ", with tomatoes (5p)";
	}

}
