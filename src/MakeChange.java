import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		// Constant Variables
		int tenDollar = 1000;
		int fiveDollar = 500;
		int dollar = 100;
		int quarter = 25;
		int dime = 10;
		int nickel = 5;
		int penny = 1;
		
		// Ask user to provide both the price of their item and how much cash on hand.
		System.out.println("Hello! Looks like you're ready to checkout. What is the price of your item? ");
		double price = keyboard.nextDouble();
		
		System.out.println("Our card reader is down. How much cash do you have? ");
		double cashReceived = keyboard.nextDouble();
		
		int cashOwed = (int)((cashReceived * 100) - (price * 100));
		double total = ((double)cashOwed / 100);
// Error handling		
			if (cashReceived < price) {
		System.out.println("You'll need more money or you'll have to put the item back. ");	
			}
		else if (cashReceived > price) {
		System.out.println("Let me get you your change. I owe you " + "$" + total + ".");
		}
		else {
			System.out.println("What luck! You have exactly the amount needed!");
		}
			int hamilton = (cashOwed)% tenDollar;
			if (tenDollar == (cashOwed - hamilton)) {
				System.out.println("You get 1 $10 bill. ");
			}
			int lincoln = hamilton % fiveDollar;
			if (hamilton >= fiveDollar && hamilton != tenDollar) {
				System.out.println("You get 1 $5 bill. ");
			}
			int washington = (cashOwed % dollar);
			if (lincoln >= dollar) {
				int v = (lincoln - washington) / 100;
				System.out.println("You get " + v + " $1 bill/s. ");
				}
			int coinWashington = washington % quarter;
			
			if (washington >= quarter) {

				int q = washington - coinWashington;
				q = q / quarter;
				System.out.println("You get " + q + " quarter/s ");
			}

			int roosevelt = coinWashington % dime;

			if (coinWashington >= dime) {

				int d = coinWashington - roosevelt;
				d = d / dime;
				System.out.println("You get " + d + " dime/s ");
			}
			
			int jefferson = roosevelt % nickel;

			if (roosevelt >= nickel) {

				int n = roosevelt - jefferson;
				n = n / nickel;
				System.out.println("You get " + n + " nickel/s ");
			}
			
			
			int coinLincoln = jefferson % penny;

			if (jefferson >= penny) {

				int p = jefferson - coinLincoln;
				p = p / penny;
				System.out.println("You get " + p + " penny/pennies ");
				
			}
			keyboard.close();
	}
}