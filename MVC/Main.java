package mvc;

public class Main {

	public static void main(String[] args) {
		
		View view = new View();
		Model model = new Model();
		Controller cont = new Controller(view,model);
		view.setVisible(true);
		
	}

}
