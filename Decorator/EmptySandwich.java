package decorator;

public class EmptySandwich implements Sandwich{
	
	//Create most basic instance of object with parameters (here 'Contents' and 'cost')
	//that other functions then can build upon
	//implements interface

	@Override
	public String getContents() {
		return "Bread";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 1.00;
	}

}
