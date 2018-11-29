package adaptor;

public class Weapon implements KnifeAction{

	@Override
	public void Stab() {
		System.out.println("Get stabbed.");
	}

	@Override
	public void Slash() {
		System.out.println("Slashing at you.");
	}
	
	

}
