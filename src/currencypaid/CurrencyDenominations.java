package currencypaid;

import java.util.Scanner;

public class CurrencyDenominations {
		
public static void main (String args []) {

	Scanner sc = new Scanner(System.in);

	System.out.println("Enter the size of currency denominations: ");
	int array = sc.nextInt();
	int [] currency = new int[array];
	
	System.out.println("Enter the currency denominations value: ");
	int n = sc.nextInt();
	for(int i = 0; i < array; i++) {
		currency[i] = sc.nextInt();
	}	
	System.out.println("Enter the amount you want to pay: ");
	int amt = sc.nextInt();

	int[] numcurrency = new int[array];
	
	
}
}	 
