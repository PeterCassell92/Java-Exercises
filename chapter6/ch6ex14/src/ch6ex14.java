// building off car.java from the book. Adding service method to Engine and calling it. I also decided to test my knowledge of packages and break down the original file into multiple packages with public classes.
//I did learn that for classes within a named package to be able to see each other, you must call javac from above that directory.
import src.car.Car;
public class ch6ex14{
	public static void main(String[] args){
		Car car = new Car();
		car.left.window.rollup();
		car.wheel1.inflate(72);
		car.engine.service();
	}
}
