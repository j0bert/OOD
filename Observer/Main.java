package observer;

public class Main {

	public static void main(String[] args) {
		
		ItemChanger itemchanger = new ItemChanger();
		
		ItemObserver observer1 = new ItemObserver(itemchanger);
		
		itemchanger.setItemNum(124);
		itemchanger.setItemVal(6);
		
		System.out.println(itemchanger.getItemNum());
		System.out.println(itemchanger.getItemVal());
		
		ItemObserver observer2 = new ItemObserver(itemchanger);
		
		itemchanger.setItemNum(70);
		itemchanger.setItemVal(15);
		
		System.out.println(itemchanger.getItemNum());
		System.out.println(itemchanger.getItemVal());
		
	}

}
