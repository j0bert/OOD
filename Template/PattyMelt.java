package template;

public class PattyMelt extends Sandwich{
	
	String[] meats = {"Beef"};
	String[] cheeses = {"American"};
	String[] conds = {"Mayonaise", "Ketchup"};

	@Override
	void addMeat() {
		System.out.println("Adding meat: ");
		for (String meat : meats){
			System.out.print(meat + " ");
		}
	}

	@Override
	void addCheese() {
		System.out.println("\nAdding cheese: ");
		for (String cheese : cheeses){
			System.out.print(cheese + " ");
		}
	}

	@Override
	void addVeg() {}

	@Override
	void addCond() {
		System.out.println("\nAdding condiments: ");
		for (String cond : conds){
			System.out.print(cond + " ");
		}
	}

}
