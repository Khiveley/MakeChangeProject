import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		double price = 0.00;
		double cashReceived = 0.00;
		double cashOwed = 0.00;
		double change = 0.00;
		
		Double tenDollar = 10.0;
		Double fiveDollar = 5.0;
		Double dollar = 1.0;
		Double quarter = 0.25;
		Double dime = 0.10;
		Double nickel = 0.05;
		Double penny = 0.01;
		
		System.out.println("Hello! Looks like you're ready to checkout. What is the price of your item? ");
		price = keyboard.nextDouble();
		
		System.out.println("Our card reader is down. How much cash do you have? ");
		cashReceived = keyboard.nextDouble();
		cashOwed = cashReceived- price;
			if (cashReceived < price) {
		System.out.println("You'll need more money or you'll have to put the item back. ");	
			}
		else if (cashReceived > price) {
		System.out.println("Let me get you your change. I owe you " + "$" + cashOwed + ".");
		}
			double hamilton = (cashOwed)% tenDollar;
			if (tenDollar == (cashOwed - hamilton)) {
				System.out.println("You get one $10 bill. ");
			}
			double lincoln = (cashOwed)% fiveDollar;
			if (fiveDollar >= fiveDollar && hamilton != tenDollar) {
				System.out.println("You get one $5 bill. ");
			}
			double washington = (cashOwed % dollar)
			}
			coinWashington = dollar % quarter;
				if ()
//			double washington = (cashOwed)% dollar;
//			
//			if (lincoln >= dollar) {
//				int coin = (lincoln - washington) /100;
//				System.out.println("Here is " + coin + " $1 bill/s ");
//			}
//			}
//	if (dollar == (cashOwed - washington)) {
//		System.out.println("You get one $1 bill. ");
	}	
		
}
