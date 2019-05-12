//demonstrating this and implicit this.
class MyFeet{
	MyFeet(){
		this(44);
	}
	MyFeet(int s){
		System.out.println(s);
	}

	void methodOne(){
		this.methodTwo();
		methodTwo();
	}
	void methodTwo() {
		System.out.println("Doing the Dance!");
	}


}

public class ch4ex10{
	public static void main(String[] args){
		MyFeet a1 = new MyFeet();
		a1.methodOne();
	}

}

