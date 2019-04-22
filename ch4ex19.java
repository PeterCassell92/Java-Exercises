// demonstrating initalizing arrays.
import java.util.Random;

public class ch4ex19{
	public static double[][] arrayinit(int i, int j){
		System.out.println("method called");
		double[][] a1 = new double[i][j];
		Random rand = new Random();
		for ( int y=0 ; y < j; y++){
			for (int x = 0; x<i ; x++){
				a1[x][y] = rand.nextDouble();
			}
		}
		return a1;
	}

	public static void main(String[] args){
		double[][] arraytest;
		arraytest = arrayinit(2,5);

		System.out.println(arraytest[0][1]);
		System.out.println(arraytest[0][2]);


	}

}