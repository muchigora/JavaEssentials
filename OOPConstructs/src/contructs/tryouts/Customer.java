package contructs.tryouts;

public class Customer {
	//Create / Declare Data fields / Variables here
	long customerId;
	String customerName;
	
	//Declare a Constructor
	//a constructor is a method with same name as class
	Customer(long customerId, String customerName){
		this.customerId = customerId;
		this.customerName = customerName;
	}
	
	//Declare method
	public void display() {
		System.out.println("Customer Id: " + customerId + "\n" + "Customer Name: " + customerName);
	}
	
	//This method may be created in a new class - a Tester Class
	public static void main(String[]args) {
		//Create or declare objects by invoking the constructor
		Customer customerObject = new Customer(1258635487645L, "John-Mark");
		customerObject.display();
		System.out.println();
		Customer customerObject1 = new Customer(1258635487646L, "Simbarashe");		
		customerObject1.display();
	}
	
}






