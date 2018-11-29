package decorator;

public class Cheese extends ContentDecorator{
	
	//implements Decorator class and adds a value to the parameters

	public Cheese(Sandwich newSand) {
		
		super(newSand);
		
		System.out.println("Add cheese");
		
	}
	
	public String getContents(){
		
		return sand.getContents() + ", Cheese";
		
	}
	
	public double getPrice(){
		
		return sand.getPrice() + 0.50;
		
	}

}
