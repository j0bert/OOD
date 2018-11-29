package command;

public class Invoker {
	
	Command comm;
	
	public Invoker(Command newComm){
		
		comm = newComm;
		
	}
	
	public void goExecute(){
		comm.execute();
	}

	public void goUndo(){
		comm.undo();
	}
	
}
