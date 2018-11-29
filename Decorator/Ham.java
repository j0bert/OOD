package decorator;

public class Ham extends ContentDecorator{
	
	//implements Decorator class and adds a value to the parameters

	public Ham(Sandwich newSand) {
		
		super(newSand);
		
		System.out.println("Add Ham");
		
	}
	
	public String getContents(){
		
		return sand.getContents() + ", Ham";
		
	}
	
	public double getPrice(){
		
		return sand.getPrice() + 1.50;
		
	}

}
