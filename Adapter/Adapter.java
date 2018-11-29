package adaptor;

public class Adapter implements KnifeAction{
	
	Gun theGun;
	
	public Adapter(Gun newGun){
		theGun = newGun;
	}

	@Override
	public void Stab() {
		
		theGun.shoot();
		
	}

	@Override
	public void Slash() {
		
		theGun.aim();
		
	}

}
