// Chapter 3 Exercise 8 explores use of Math.random() and Random Classes. This is a modified version of ex7 using an infinte while loop.

import java.util.Random;

public class ch3ex8{
	public static void main(String[] args){

		int boundary = (int)(1000*(Math.random())); // this is another method of getting an random int between 0 and 1000.
		System.out.println(boundary);
		Random f = new Random();
		int i=1;
		while (i != 0){
			
			int l = f.nextInt(1000); // this is one way using the Random class to get a random int between 0 and 1000.
			System.out.println(i);
			System.out.println(l);

			if (l > boundary){
				System.out.println("l is greater than the random boundary\n");
			}
			else if (l < boundary){
				System.out.println("l is lesser than the random boundary\n");
			}
			else{
				System.out.println("Exact Match. This is Highly Unlikely! \n");
			}
			i++;
			//

		}

	}
}