import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		Double price = 0.0;
		Double cashReceived = 0.0;
//		Double tenDollar = 10.0;
//		Double fiveDollar = 5.0;
//		Double dollar = 1.0;
//		Double quarter = 0.25;
//		Double dime = 0.10;
//		Double nickel = 0.05;
//		Double penny = 0.01.
		
		System.out.println("Hello! Looks like you're ready to checkout. What is the price of your item? ");
		price = keyboard.nextDouble();
		
		System.out.println("Our card reader is down. How much cash do you have? ");
		cashReceived = keyboard.nextDouble();
			if (cashReceived < price) {
		System.out.println("You'll need more money or you'll have to put the item back. ");	
			}
		else if (cashReceived > price) {
			System.out.println("Let me get you your change. ");

	}

}
