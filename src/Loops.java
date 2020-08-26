
public class Loops {

	public static void main(String[] args) {
		System.out.println("Question 5a a.	A while loop that prints all even numbers from 0 to 100\n" );
		int evenNumber = 0;
		while (evenNumber <= 100) {System.out.println(evenNumber); evenNumber +=2;}
		
System.out.println("Question 5b b.	A while loop that prints every 3rd number going backwards from 100 until we reach 0\n" );		
		int countBackwards = 100; 
		while (countBackwards >= 0) {System.out.println(countBackwards); countBackwards -=3;
		while (countBackwards ==1) {System.out.println(countBackwards);countBackwards -=1; }
		}		

System.out.println("Question 5c c.	A for loop that prints every other number from 1 to 100\n"); 
	
	for (int number=1;number <= 100;number +=2) {System.out.println(number);}
	
	
		
System.out.println("Question 5d d.	A for loop that prints every number from 0 to 100, but if the number is divisible by 3, it prints “Hello” instead of the number, and if the number is divisible by 5, it prints “World” instead of the number, and if it is divisible by both 3 and 5, it prints “HelloWorld” instead of the number.\n");		

	for (int number =0 ; number <= 100; number ++ ) {if (number %3 >0 && number%5>0)System.out.println(number);   if (number %5 ==0 && number%3==0)System.out.println("Hello World");if (number %3 ==0 && number%5>0)System.out.println("Hello");if (number %5 ==0 && number%3>0)System.out.println("World");}	

	
	
	

	}

}
