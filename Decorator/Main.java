package decorator;

public class Main {

	public static void main(String[] args) {
		
		Sandwich basic = new EmptySandwich();
		
		System.out.println(basic.getContents() + " cost: " + basic.getPrice());
		
		//When constructing object instance, each 'new' must
		//have same level or lower level 'new' inside it
		Sandwich ham = new Ham(new EmptySandwich());
		
		System.out.println(ham.getContents() + " cost: " + ham.getPrice());
		
		Sandwich cheese = new Cheese(new EmptySandwich());
		
		System.out.println(cheese.getContents() + " cost: " + cheese.getPrice());
		
		Sandwich hamAndCheese = new Ham(new Cheese(new EmptySandwich()));
		
		System.out.println(hamAndCheese.getContents() + " cost: " + hamAndCheese.getPrice());
		
		
		
	}

}
