package facade;

public class Facade {
	
	private Sound dog;
	private Sound cat;
	private Sound cow;
	
	public Facade(){
		dog = new Dog();
		cat = new Cat();
		cow = new Cow();
	}
	
	public void dogSound(){
		dog.sound();
	}
	
	public void catSound(){
		cat.sound();
	}
	
	public void cowSound(){
		cow.sound();
	}

}
