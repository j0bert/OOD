package command;

public class StartSlides implements Command{
	
	DeviceActions act;
	
	public StartSlides(DeviceActions newActs){
		
		act = newActs;
		
	}

	@Override
	public void execute() {
		
		act.start();
		
	}

	@Override
	public void undo() {
		
		act.pause();
		
	}

}
