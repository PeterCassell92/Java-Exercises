package src.car;
import src.car.components.*;

public class Car{
	public Engine engine = new Engine();
	public Wheel wheel1 = new Wheel();
	public Wheel wheel2 = new Wheel();
	public Wheel wheel3 = new Wheel();
	public Wheel wheel4 = new Wheel();

	//how would I initialize these wheels as Wheel[] list? need to work this out.
	public Door left = new Door(), right = new Door();
}