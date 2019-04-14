/* Shows how to use other functions with arguments.
*/

class ch2ex4{
	public static void main(String [] args){
		String s = "Rogue";
		System.out.println(s.length()*2);
		ch2ex4 d = new ch2ex4();
		int p = d.mathtest(15);
	}
	public static int mathtest(int num1){
		int j = num1*5;
		System.out.println(j);
		return j;

	}
}