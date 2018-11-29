package composite;

public class Main {

	public static void main(String[] args) {
		
		Component thing1 = new Group("Food", "is what you eat");
		Component thing2 = new Group("Stairs", "are used to go up and down");
		Component thing3 = new Group("Computers", "are used to create awesome programs");
		
		Component things = new Group("All things", "Things 1, 2, & 3");
		
		things.add(thing1);
		
		thing1.add(new Thing("Sandwich", "Bread with stuff between", 100));
		thing1.add(new Thing("Orange", "Small orange fruit", 99));
		
		things.add(thing2);
		
		thing2.add(new Thing("Up", "Takes you up a floor", 98));
		thing2.add(new Thing("Down", "Takes you down a floor", 97));
		
		things.add(thing3);
		
		thing3.add(new Thing("Mac", "Created by Apple", 96));
		thing3.add(new Thing("PC", "Created by Windows", 95));
		
		ThingList newList = new ThingList(things);
		
		newList.getList();
		
	}

}
