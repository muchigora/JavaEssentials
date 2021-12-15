package contructs.tryouts;

public class PizzaOrder {
	//Declare attributes / data fields
	int price;
	String size;
	int quantity;
	
	//Constructor
	PizzaOrder(String size, int quantity){
		this.size=size;
		this.quantity=quantity;
		
		if(this.size.equals("Regular"))
			this.price = 100;
		else if(this.size.equals("Medium"))
			this.price = 250;
		else
			this.price = 390;
		
	}
	
	//Methods
	public float calculateTotalPrice(PizzaOrder[] pizzaOrdered) {
		int totalPrice = 0;
		for(PizzaOrder pizzaOrder: pizzaOrdered) {
			totalPrice += pizzaOrder.price * pizzaOrder.quantity;
		}
		return 0.95f*totalPrice;
	}
	
	
	//Class tester
	public static void main(String[]args) {
		PizzaOrder p1 = new PizzaOrder("Medium", 4);
		PizzaOrder p2 = new PizzaOrder("Large", 2);
		PizzaOrder[] pizzaOrdered = {p1, p2};
		float totalCost = p1.calculateTotalPrice(pizzaOrdered);
		System.out.println("Your pizza is ready! Total bill is: " + totalCost);
	}
	

}
