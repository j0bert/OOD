package mvc;

import java.awt.event.*;

public class Controller {

	private View view;
	private Model model;
	
	public Controller(View view, Model model){
		this.view = view;
		this.model = model;
		this.view.addListener(new Listener());
		this.view.addAddListener(new AddListener());
		this.view.addSubListener(new SubListener());
		this.view.addMultiListener(new MultiListener());
		this.view.addDivListener(new DivListener());
	}
	
	class Listener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			int first, second = 0;
			
			try{
				first = view.getFirstNumber();
				second = view.getSecondNumber();
				
				if (view.getOp().equals("+")){
				model.add(first, second);}
				if (view.getOp().equals("-")){
				model.subtract(first, second);}
				if (view.getOp().equals("*")){
				model.multiply(first, second);}
				if (view.getOp().equals("%")){
				model.divide(first, second);}
				view.setAns(model.getAns());
				
			}
			
			catch (NumberFormatException x){
				
				System.out.println(x);
				view.displayError("Enter 2 integers");
			}
		}
		
	}
	
	class AddListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			view.setOpAdd();
		}
	}
	
	class SubListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			view.setOpSub();
		}
	}
	
	class MultiListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			view.setOpMulti();
		}
	}
	
	class DivListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			view.setOpDiv();
		}
	}
	
}
