package facade;

public class Dog implements Sound{

	@Override
	public void sound() {
		System.out.println("Dog goes bark.");
	}

}
