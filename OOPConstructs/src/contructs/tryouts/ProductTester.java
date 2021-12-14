package contructs.tryouts;

public class ProductTester {

	public static void main(String[] args) {
		Product myProd1 = new Product();	//declare new product
		myProd1.setProductId(1001);			//set variables with values
		myProd1.setPrice(400);
		myProd1.setStock(6);
		myProd1.displayDetails();			//call methods
		System.out.println(); 				//skipping a line
		
		Product myProd2 = new Product();
		myProd2.setProductId(1002);
		myProd2.setPrice(350);
		myProd2.setStock(3);
		myProd2.displayDetails(10);
		System.out.println();
		
		Product myProd3 = new Product();
		myProd3.setProductId(1002);
		myProd3.setPrice(250);
		myProd3.setStock(0);
		myProd3.displayDetails(10);
		System.out.println();

	}

}
