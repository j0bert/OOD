package decorator;

abstract class ContentDecorator implements Sandwich {
	
	//abstract class that implements interface to create most basic instance of object type
	
	Sandwich sand;
	
	public ContentDecorator(Sandwich newSand){
		
		sand = newSand;
		
	}

	public String getContents(){
		
		return sand.getContents();
		
	}
	
	public double getPrice(){
		
		return sand.getPrice();
		
	}
	
}
