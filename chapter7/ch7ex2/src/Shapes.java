// experimenting with inheritance and Polymorphism.
class Shape{
	void draw(){}
	void erase(){}
	void shake(){
		System.out.println("Shake");
	}
}

class Circle extends Shape{
	void draw(){
		System.out.println("Circle.draw()");
	}
	void erase(){
		System.out.println("Circle.erase()");
	}
	void shake(){
		System.out.println("CircleShake");
	}
}

class Square extends Shape{
	void draw(){
		System.out.println("Square.draw()");
	}
	void erase(){
		System.out.println("Square.erase()");
	}
}
 class Triangle extends Shape{
 	void draw(){
 		System.out.println("Triangle.draw()");
 	}
 	void erase(){
 		System.out.println("Triangle.erase()");
 	}
 }

 class Pentagon extends Shape{
 	void draw(){
 		System.out.println("Pentagon.draw()");
 	}
 	void erase(){
 		System.out.println("Pentagon.erase()");
 	}
 }

 public class Shapes{
 	public static Shape randShape(){
 		switch((int)(Math.random() *4)){
			default:
			case 0: return new Circle();
			case 1: return new Square();
			case 2: return new Triangle();
			case 3: return new Pentagon();

		}
 	}

	public static void main (String[] args){
	 	Shape[] s = new Shape[9];
	 	//Fill up the array with shapes:
	 	for (int i=0; i< s.length; i++)
	 		s[i] = randShape();
	 	//MAke polymorphic method calls:
	 	for (int i=0; i< s.length; i++){
	 		s[i].draw();
	 		s[i].shake();
	 	}
	}
}
