package observer;
import java.util.ArrayList;

public class ItemChanger implements Subject{
	
	//concrete class that implements ObserverAdder interface
	//create list of all observer objects

	private ArrayList<Observer> observers;
	private int itemNum;
	private int itemVal;
	
	//constructor that creates observer list
	public ItemChanger(){
		
		observers = new ArrayList<Observer>();
		
	}
	
	//adds observer to list
	@Override
	public void add(Observer X) {
		
		observers.add(X);
		
	}

	//removes observer from list
	@Override
	public void subtract(Observer X) {
		
		int observerIndex = observers.indexOf(X);
		
		observers.remove(observerIndex);
		
	}

	//creates for loop that, for each observer type in the list, update object parameters
	@Override
	public void update() {
		
		for(Observer observer : observers){
			observer.update(itemNum, itemVal);
		}

	}

	public void setItemNum(int newItemNum){
		
		this.itemNum = newItemNum;
		update();
		
	}
	
	public void setItemVal(int newItemVal){
		
		this.itemVal = newItemVal;
		update();
	}

	public int getItemNum() {
		return itemNum;
	}

	public int getItemVal() {
		return itemVal;
	}
	
	
	
}
