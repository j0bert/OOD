package composite;

public class Thing  extends Component{
	
	String name;
	String description;
	int num;
	
	public Thing(String newName, String newDescription, int newNum){
	
		name = newName;
		description = newDescription;
		num = newNum;
		
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public int getNum() {
		return num;
	}
	
	public void displayInfo(){
		
		System.out.println("Name :" + getName() + "\n" + "Description :" + getDescription()
				+ "\n" + "Number: " + getNum() + "\n");
		
	}

}
