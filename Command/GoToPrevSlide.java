package command;

public class GoToPrevSlide implements Command{
	
	DeviceActions act;
	
	public GoToPrevSlide(DeviceActions newActs){
		
		act = newActs;
		
	}

	@Override
	public void execute() {
		
		act.prevSlide();
		
	}

	@Override
	public void undo() {
		
		act.nextSlide();
		
	}

}