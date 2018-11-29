package mvc;

import java.awt.event.ActionListener;
import javax.swing.*;

public class View extends JFrame{

	private JTextField first = new JTextField(10);
	private JTextField second = new JTextField(10);
	private JTextField ans = new JTextField(10);
	
	private String op = "+";
	private JLabel addLabel = new JLabel(op);
	
	private JButton solve = new JButton("=");
	private JButton addBut = new JButton("+");
	private JButton subBut = new JButton("-");
	private JButton multiBut = new JButton("*");
	private JButton divBut = new JButton("%");
	
	View(){
		
		JPanel panel = new JPanel();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,200);
		
		panel.add(first);
		//panel.add(addLabel);
		panel.add(second);
		panel.add(solve);
		panel.add(ans);
		panel.add(addBut);
		panel.add(subBut);
		panel.add(multiBut);
		panel.add(divBut);
		
		this.add(panel);
		
	}

	public int getFirstNumber() {
		return Integer.parseInt(first.getText());
	}

	public int getSecondNumber() {
		return Integer.parseInt(second.getText());
	}

	public int getAns() {
		return Integer.parseInt(ans.getText());
	}
	
	void addListener(ActionListener AL){
		solve.addActionListener(AL);
	}
	
	void addAddListener(ActionListener AL){
		addBut.addActionListener(AL);
	}
	
	void addSubListener(ActionListener AL){
		subBut.addActionListener(AL);
	}
	
	void addMultiListener(ActionListener AL){
		multiBut.addActionListener(AL);
	}
	
	void addDivListener(ActionListener AL){
		divBut.addActionListener(AL);
	}
	
	public void setAns(int an){
		ans.setText(Integer.toString(an));
	}
	
	void displayError(String error){
		JOptionPane.showMessageDialog(this, error);
	}
	
	String getOp(){
		return op;
	}
	
	void setOpAdd(){
		op = "+";
		addLabel = new JLabel("+");
	}
	
	void setOpSub(){
		op = "-";
		addLabel = new JLabel("-");
	}
	
	void setOpMulti(){
		op = "*";
		addLabel = new JLabel("*");
	}
	
	void setOpDiv(){
		op = "%";
		addLabel = new JLabel("%");
	}
	
}
