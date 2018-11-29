package adaptor;

public class Main {

	public static void main(String[] args) {
		
		Weapon knife = new Weapon();
		
		Gun theGun = new Gun();
		
		KnifeAction weaponAdapter = new Adapter(theGun);
		
		System.out.println("Gun");
		
		theGun.aim();
		
		theGun.shoot();
		
		System.out.println("Knife");
		
		knife.Slash();
		
		knife.Stab();
		
		System.out.println("Adapter");
		
		weaponAdapter.Slash();
		weaponAdapter.Stab();
		
	}

}
