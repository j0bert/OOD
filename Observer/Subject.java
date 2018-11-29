package observer;
public interface Subject{
	
	//ObserverAdder interface that contains basic methods, along with the 'update' method
	//that uses the Observer interface
	
	public void add(Observer X);
	public void subtract(Observer X);
	public void update();
	
}