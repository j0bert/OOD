package template;

public class Panini extends Sandwich{
	
	String[] meats = {"Ham","Turkey"};
	String[] cheeses = {"Provolone"};
	String[] veggies = {"Lettuce", "Tomato"};
	

	@Override
	public void addMeat() {
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
	void addVeg() {
		System.out.println("\nAdding vegetables: ");
		for (String veg : veggies){
			System.out.print(veg + " ");
		}
	}

	@Override
	void addCond() {}

}
