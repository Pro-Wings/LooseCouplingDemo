
public class Traveller {

//	Car c = new Car();
//	Bike b = new Bike();

	Vehicle v;

	public Traveller() //constructor injection
	{
		super();
	}
	
	public void setV(Vehicle v) //setter injection 
	{
		this.v = v;
	}

	public Traveller(Vehicle v) {
		super();
		this.v = v;
	}

	public void startJourney() {
		System.out.println("Journey staring...");
//		c.move();
//		b.move();
		v.move();
	}

}
