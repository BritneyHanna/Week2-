
public class App2 {

	public static void main(String[] args) {
		
System.out.println("Question 1 What do each of the following Boolean expressions evaluate to?\n");
		
		System.out.println( true && false );
		System.out.println(true || false);
		System.out.println(false && false);
		System.out.println(true && (false || true));
		System.out.println(false || (true && false));
		System.out.println(false || 1 < 5);
		System.out.println(5 >= 4 && 1 > 3);
		System.out.println(10 < 4 || 1 > 4);
		System.out.println(12 >= 2 && 1 < 24);
		System.out.println("Hello".charAt(0) == 'h');
		
System.out.println("Question 2 In Eclipse, create the following Boolean variables and choose what values they hold: isHotOutside,isWeekday,hasMoneyInPocket\n");
		
        boolean isHotOutside = true;
		boolean isWeekday = true; 
		boolean hasMoneyInPocket = true;
		System.out.println("isHotOutside evaulates to " + isHotOutside );
		System.out.println("isWeekday evaulates to " + isWeekday);
		System.out.println("hasMoneyIn Pocket evaulates to " + hasMoneyInPocket + "\n");
System.out.println("3 Create the following variables (not boolean type, choose the best data type for the variable) costOfMilk,moneyInWallet,thirstLevel (on a scale on 1 to 10)\n");
	

		double costOfMilk = 2.50;
		double moneyInWallet = 100.00;
		int thirstLevel = 4;
		
System.out.println("The cost of milk is " +costOfMilk);		
System.out.println("The money in wallet is " + moneyInWallet);	
System.out.println("The Thirst Level is "+ thirstLevel + "\n");
System.out.println("Question 4 Using the variables you created above and Boolean operators, create variables for the following scenarios:shouldByIcecream,willGoSwimming,isAGoodDay,d.	willBuyMilk\n ");	
	

		
		boolean shouldBuyIcecream = isHotOutside  && hasMoneyInPocket;
		boolean willGoSwimming = isHotOutside || !isWeekday;
		boolean isAGoodDay = isHotOutside && hasMoneyInPocket || !isWeekday ;
		boolean willBuyMilk =isHotOutside && thirstLevel >=3 && moneyInWallet >= 2*costOfMilk;
		
System.out.println("shouldBuyIcecream meets all the conditions and evaulates to "+ shouldBuyIcecream );		
System.out.println("willGoSwimming meets all the conditions and evaulates to "+ willGoSwimming  );	
System.out.println("isAGoodDay meets all the conditions and evaulates to " + isAGoodDay);
System.out.println("willBuyMilk meets all the conditions and evaulates to " + willBuyMilk );


	}

}
