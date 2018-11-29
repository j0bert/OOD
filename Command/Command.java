package command;

public interface Command {
	
	//commands must implements command interface
	
	public void execute();
	
	//allows commands to be undone
	
	public void undo();

}
