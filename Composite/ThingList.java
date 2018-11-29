package composite;

public class ThingList{
	
	Component list;
	
	public ThingList(Component newList){
		
		list = newList;
		
	}
	
	public void getList(){
		
		list.displayInfo();
		
	}

}
