//demonstrating this and implicit this.
class MyFeet{
	void methodOne(){
		this.methodTwo();
		methodTwo();
	}
	void methodTwo() {
		System.out.println("Doing the Dance!");
	}


}

public class ch4ex9{
	public static void main(String[] args){
		MyFeet a1 = new MyFeet();
		a1.methodOne();
	}

}

