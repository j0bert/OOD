package observer;

public class ItemObserver implements Observer{

	private int itemNum;
	private int itemVal;
	
	public static int observerTracker = 0;
	
	private int ObserverID;
	
	//create instance of class that creates observer list
	private Subject itemChanger;
	
	//constructor that creates and adds observer to list and increases list counter
	public ItemObserver(Subject itemChanger){
		
		this.itemChanger = itemChanger;
		
		this.ObserverID = ++observerTracker;
		
		itemChanger.add(this);
		
	}
	
	//actually updates parameter values in object
	@Override
	public void update(int itemNum, int itemVal) {
		
		this.itemNum = itemNum;
		this.itemVal = itemVal;
		
	}
	
}
