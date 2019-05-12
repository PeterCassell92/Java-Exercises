package src.Data;

public class DataClass{
	protected static String s = "X Marks the spot!";
	protected static int[] x = {148, 534};
	
	//returns somewhat altered version of the co-ordinates
	public int[] getter(){
		int[] o = DataClass.x;
		o[0] = o[0] + 43;
		o[1] = o[1] - 54;

		System.out.println(DataClass.s);
		return o;
	}

}