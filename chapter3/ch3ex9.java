//Chapter 3 Exercise 9 uses nested loops to find all the prime numbers from 1 to 100.
//I have chosen to use 'break' to make the program more efficient so that it stops working on a number as soon as it is shown not to be prime.

public class ch3ex9{

	public static void main(String[] args){

		for (int i =1 ; i<=100; i++){
			boolean isprime = true;
			for (int x=1; x < i; x++){
				if (i % x ==0 && x != 1){
					isprime = false;
					break;
				}

			}
			if (isprime == true)
				System.out.println(i + " is a prime number");
			else if (isprime == false)
				System.out.println( i + " is not a prime number");
		}
	}
}