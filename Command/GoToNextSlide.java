package command;

public class GoToNextSlide implements Command{
	
	DeviceActions act;
	
	public GoToNextSlide(DeviceActions newActs){
		
		act = newActs;
		
	}

	@Override
	public void execute() {
		
		act.nextSlide();
		
	}

	@Override
	public void undo() {
		
		act.prevSlide();
		
	}

}