package composite;

import java.util.*;

public class Group extends Component{
	
	ArrayList components = new ArrayList();
	
	String groupName;
	String groupDescription;
	
	public Group(String newGroupName, String newDescription){
		
		groupName = newGroupName;
		groupDescription = newDescription;
		
	}
	public String getName() { return groupName;}
	public String getDescription() { return groupDescription;}
	
	public void add(Component newComp){
		
		components.add(newComp);
		
	}
	
	public void remove(Component newComp){
		
		components.remove(newComp);
		
	}
	
	public Component getComponent(int componentIndex){
		
		return (Component)components.get(componentIndex);
		
	}
	
	public void displayInfo(){
		
		System.out.println(getName() + " " + getDescription() + "\n");
		
		Iterator iter = components.iterator();
		
		while(iter.hasNext()){
			
			Component info = (Component) iter.next();
			info.displayInfo();
			
		}
		
	}

}
