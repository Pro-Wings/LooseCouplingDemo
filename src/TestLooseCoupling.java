
public class TestLooseCoupling {
	
	public static void main(String[] args) {

		Car car = new Car();
		Bike bike = new Bike();
		Helicopter helicopter = new Helicopter();
		
		Traveller traveller = new Traveller();
		traveller.setV(helicopter);
		
		traveller.startJourney();
		
	}

}
