
public class GreaterNumber {
	/*Problem Statement
	 * In the main method, ask the user to enter separately input two integers from 1 to 100.
	 * Store the user input into variables. Create a method that will take as parameters
	 * these two values and determine which one is the larger number. The method will 
	 * then return the larger of the two numbers and display the answer to the user.
	 * */

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.println("Enter a number from 1 - 100: ");
		int numOne = input.nextInt();
		System.out.println("Enter a number from 1 - 100: ");
		int numTwo = input.nextInt();
		
		System.out.println("The greater number between "+numOne+ " and "+numTwo+" is: ");
		System.out.println(greaterNumber(numOne, numTwo));

	}
	
	public static int greaterNumber(int a, int b) {
		if(a>b) return a;
		else if (b>a) return b;
		else return 0;
	}

}
