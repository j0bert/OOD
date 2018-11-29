package command;

public class PauseSlides implements Command{
	
	DeviceActions act;
	
	public PauseSlides(DeviceActions newActs){
		
		act = newActs;
		
	}

	@Override
	public void execute() {
		
		act.pause();
		
	}

	@Override
	public void undo() {
		
		act.start();
		
	}

}
