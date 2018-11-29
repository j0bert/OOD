package template;

public abstract class Sandwich {
	
	final void makeSandwich(){
		
		sliceBread("Wheat");
		
		if(wantsMeat()){addMeat();}
		if(wantsCheese()){addCheese();}
		if(wantsVeg()){addVeg();}
		if(wantsCond()){addCond();}
		
		finishSand();
		
	}
	
	abstract void addMeat();
	abstract void addCheese();
	abstract void addVeg();
	abstract void addCond();
	
	public void sliceBread(String breadType){
		
		System.out.println("Sandwich is cut using " + breadType + " bread");
		
	}
	
	boolean wantsMeat(){return true;}
	boolean wantsCheese(){return true;}
	boolean wantsVeg(){return true;}
	boolean wantsCond(){return true;}
	
	public void finishSand(){
		
		System.out.println("\nEnjoy your sandwich!\n");
		
	}

}
